package pageObjects.balanceSheetAssets.intangibleFixedAssets;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class IFA_AmortisationPeriods extends CommonMethods {
    public String pageName ="Amortisation periods";

    @FindBy(xpath = "//div[@class='opa-screen-title'][contains(.,'Amortisation periods')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement bodyElement;

    public boolean isPageHeaderPresentAndDisplayedInIFAAmortisationPeriodsPage(){
        return isPageHeaderPresentAndDisplayed(pageHeader,pageName);
    }


    public enum rowName{
        SinglePeriodObjectOrMinimumOfRange,
        MaximumOfRange,
        ReducingBalanceRate
    }

    public enum columnName{
        Software,
        Other
    }

    public void setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(rowName rowName, columnName columnName, String inputValue){

        int rowCount=0;
        int rowIncrementer=0;
        int columnCount=0;
        int columnIncrementer=0;

        switch (rowName){

            case SinglePeriodObjectOrMinimumOfRange: rowCount=rowIncrementer+1;
                break;
            case MaximumOfRange:rowCount=rowIncrementer+2;
                break;
            case ReducingBalanceRate:rowCount=rowIncrementer+4;
                break;
        }

        switch (columnName){

            case Software: columnCount=columnIncrementer+1;
                break;
            case Other:columnCount=columnIncrementer+2;
                break;
        }
        try {
            waitForAjax();
            WebElement tableElement = bodyElement.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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
        info("The value set in row : "+ rowName+ " and column : "+columnName+" is : "+inputValue+" in "+pageName);
    }


    public String getValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(rowName rowName, columnName columnName){
        String extractedText="no text extracted";
        int rowCount=0;
        int rowIncrementer=0;
        int columnCount=0;
        int columnIncrementer=0;

        switch (rowName){

            case SinglePeriodObjectOrMinimumOfRange: rowCount=rowIncrementer+1;
                break;
            case MaximumOfRange:rowCount=rowIncrementer+2;
                break;
            case ReducingBalanceRate:rowCount=rowIncrementer+4;
                break;
        }

        switch (columnName){

            case Software: columnCount=columnIncrementer+1;
                break;
            case Other:columnCount=columnIncrementer+2;
                break;
        }

        try {
            WebElement tableElement = bodyElement.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement,Keys.TAB);
            explicitWait(500);
            waitForJStoLoad();
            waitForElementToBeVisible(tableElement); waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
            info("The extracted value from row : "+ rowName+ " and column : "+columnName+" is : "+extractedText);
        }
        catch (NoSuchElementException nsee){
            warn("NoSuchElementException Occurred in"+pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return extractedText;
    }
}

