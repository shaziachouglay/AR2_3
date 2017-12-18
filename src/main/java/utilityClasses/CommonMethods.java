package utilityClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * If you handle more than one application through a single framework then have your Common Methods names by Application Names.
 * When you provide inheritance for the application will be through its commonMethod class and not through Page.java.
 * Page.java will provide inheritance to the common methods only and to no other class.
 */
public class CommonMethods extends Page {


    @FindBy(xpath = "//input[@class='button']")
    WebElement saveAndNextButton;

    @FindBy(xpath = "//span[@class='opa-help']")
    List<WebElement> helpElement;

    @FindBy(xpath = "//span[@class='opa-popup-error']//h3[@class='error-message'][contains(.,'All financial data must be entered in')]")
    List<WebElement> financilaDataRangeError;

    @FindBy(xpath = "//span[@class='opa-popup-error']//h3[@class='error-message'][contains(.,'Invalid number format')]")
    List<WebElement> invalidNumberFormatError;

    @FindBy(xpath = "//span[@class='opa-popup-error']//h3[@class='error-message'][contains(.,'The input value must be a positive number between 0 and 999999')]")
    List<WebElement> positiveInputValueError;

    /**
     * clicks on the save and next button.
     */
    public void clickOnSaveAndNextButtonInPage(){
        scrollToElement(saveAndNextButton);
        cleanAndRebuildElement(saveAndNextButton);
        clickElementWithJS2(saveAndNextButton);

        explicitWait(500);
    }

    protected boolean isPageHeaderPresentAndDisplayed(WebElement element, String pageName){
        waitForPageLoadToComplete();
        cleanAndRebuildElement(element);
        waitForElementToBeVisibleloop(element);
        boolean isPresentAndDisplayed = isElementPresentAndDisplayed(element);
        info("The Header displayed status for "+pageName+" is : "+isPresentAndDisplayed);
        return isPresentAndDisplayed;
    }

    public void setValueInInputFieldByLabelName(WebElement parentElement, String labelName, String inputValue){
        try{
            cleanAndRebuildElement(parentElement);
            WebElement element = parentElement.findElement(By.xpath(".//div/label[contains(.,'"+labelName+"')]/../..//input"));
            cleanAndRebuildElement(element);
            setValueInElementInputJS(element, inputValue);
            info("Set value in label :"+labelName+" with value "+inputValue);
            hitKeyboardButton(element, Keys.TAB);

        }catch(StaleElementReferenceException sere) {
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred while setting value in label name " + labelName);
        }
    }

    public String getValueFromInputFieldByParentElementAndLabelName(WebElement parentElement , String labelName ){
        String text = null;
        try {
            waitForAjax();
            WebElement element = parentElement.findElement(By.xpath(".//div/label[contains(text(),'" + labelName + "')]/../..//input"));
            cleanAndRebuildElement(element);
            text = getElementAttributeValueWithRetry(element, "value");
            logger.info("\nThe Value extracted from the "+labelName+" input box is ' "+ text+" '.");
        }
        catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred while extracting value from label : "+ labelName);
        }
        catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred while extracting value from label : "+ labelName);
        } catch (InterruptedException e) {
            e.printStackTrace();
            warn("Ajax request was interrupted");
        }
        return text;
    }

    public int getNumberOfHelpButtonsOnPage(String pageName){
        return getElementCount(helpElement, " Help Links " , pageName);
    }

    public int getAllFinancialDataRangeInPage(String pageName){
        explicitWait(500);
        return getElementCount(financilaDataRangeError," Number Format Errors Triggered " ,pageName);
    }

    public int getInvalidNumberFormatErrorsInPage(String pageName){
        waitForPageLoadToComplete();
        return getElementCount(invalidNumberFormatError, " Invalid number format error ! ", pageName);
    }

    public int getErrorsTheInputVAluMustBeaPositiveNumber(){
        waitForPageLoadToComplete();
        return getElementCount(positiveInputValueError,"Input Value Must be a Positive Number");
    }
}