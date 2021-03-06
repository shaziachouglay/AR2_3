package utilityClasses;

import customExceptions.IncorrectReferenceException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
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

    protected void setValueInInputFieldByLabelName(WebElement parentElement, String labelName, String inputValue){
        try{
            cleanAndRebuildElement(parentElement);
            // The below line was changed in AR2 . leaving this for debugging.
            WebElement element = parentElement.findElement(By.xpath(".//div/label[contains(.,'"+labelName+"')]/../..//input"));
//            WebElement element = parentElement.findElement(By.xpath(".//div[contains(.,'"+labelName+"')]/../..//input"));
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

    /**
     *
     * @param page_body is the parent element for the Page
     * @param rowCount  is the count / number of the row to point
     * @param columnCount is the count / number of the column to point
     * @param inputValue is the value to be set in the input field
     * @param pageName is the name of the page operation to be carried out, reference to the class variable PageName
     */
    public void setValueByRowNumberAndColumnNumber(WebElement page_body, String rowCount, String columnCount, String inputValue,String pageName){

        try {
            waitForAjax();
            WebElement tableElement = page_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            waitForElementToBeVisible(tableElement);
            cleanAndRebuildElement(tableElement);
            setValueInElementInputJS(tableElement, inputValue);
            hitKeyboardButton(tableElement, Keys.TAB);
            explicitWait(150);
        }
        catch (StaleElementReferenceException sere){
            warn("StaleElementReferenceException Occurred in"+pageName);
            takeScreenshot();
            sere.printStackTrace();
        }
        catch (NoSuchElementException nsee){
            warn("NoSuchElementException Occurred in"+pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * @param page_body is the parent element of the page
     * @param rowCount is the row count of the table
     * @param columnCount is the column count of the table
     * @param pageName is the page name where the operation is carried out. use class variable pageName.
     * @return the extracted text from the webElement.
     */
    protected String getValueByRowNumberAndColumnNumber(WebElement page_body, String rowCount, String columnCount, String pageName){
        String extractedText = "Undefined !!  ";
        try {

            WebElement tableElement = page_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement,Keys.TAB);
            explicitWait(500);
            waitForJStoLoad();
            waitForElementToBeVisible(tableElement); waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
        }
        catch (NoSuchElementException nsee){
            warn("NoSuchElementException Occurred in"+pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return extractedText;
    }


    public String getValueFromInputFieldByParentElementAndLabelName(WebElement parentElement , String labelName ){
        String text = null;
        try {
            waitForAjax();
            waitForJStoLoad();
            explicitWait(5000);
            WebElement element = parentElement.findElement(By.xpath(".//div[contains(.,'" + labelName + "')]//div/input"));
            cleanAndRebuildElement(element);
            text = getElementAttributeValueWithRetry(element, "value");
            info("\nThe Value extracted from the "+labelName+" input box is ' "+ text+" '.");
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

    public ArrayList<WebElement> getPageReferenceWebElements(String sheetName, String pageType) throws Exception {



        ArrayList<WebElement> pageReferenceElementList = new ArrayList<>();

         for(String s : ExcelApachePOI.getDataFromExcel(sheetName)){

             WebElement element= null;
//             try{
                if(pageType.equalsIgnoreCase("Label")){
                    element = getDriver().findElement(By.xpath("//div/label[contains(.,\""+s+"\")]"));
                }

                else if (pageType.equalsIgnoreCase("Table")){
                    try {
                        element = getDriver().findElement(By.xpath("//th/div[contains(.,\"" + s + "\")]\n"));
                    }catch (NoSuchElementException nsee){
                        throw new IncorrectReferenceException(nsee);
                    }
                }

                pageReferenceElementList.add(element);
//            }catch (NoSuchElementException nsee){
//                nsee.printStackTrace();
//                info(nsee.getMessage());
//            }catch (Exception e){
//                info(e.getMessage());
//                e.printStackTrace();
//            }
         }
         info("\nExtracted Reference Values from the page are: ");
         for(String s: ExcelApachePOI.getDataFromExcel(sheetName)){
             info("\n"+s);
         }
         return pageReferenceElementList;
    }

    /**
     *
     * @param sheetName is the sheet name from the csv / excel file where the reference label comes from.
     * @return the boolean status if all the reference number against the correct label names have been displayed.
     * @throws IOException throws IO as it s reading form a file. This exception has been declared by this method and is passed down from its calling method.
     * @throws InterruptedException this is when the AJAX Call is checked for completion and throws and Interrupted Exception which is declared.
     */
    public boolean isPageReferencesPresentAndDisplayedByPageName(String sheetName,String pageType) throws Exception {

         boolean isPresentAndDispalyed = false;

         ArrayList<Boolean> displayedReferenceList  = new ArrayList<>();

        /**
         * iterating over the list of WebElements and adding to the list of Boolean.
         */
         for(WebElement e: getPageReferenceWebElements(sheetName, pageType)){
            waitForJStoLoad();
            waitForAjax();
            isPresentAndDispalyed = isElementPresentAndDisplayed(e);
            info("The displayed status of the element is : "+isPresentAndDispalyed);
            displayedReferenceList.add(isPresentAndDispalyed);
         }

        /**
         * iterating over the List of Boolean and checking for false values.
         */
        for(boolean b : displayedReferenceList){
                if(b==false){
                   isPresentAndDispalyed = false;
                    break;
                }
         }
         return isPresentAndDispalyed;
    }
}