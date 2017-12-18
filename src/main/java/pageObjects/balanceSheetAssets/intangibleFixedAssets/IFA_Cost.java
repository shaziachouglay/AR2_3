package pageObjects.balanceSheetAssets.intangibleFixedAssets;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class IFA_Cost extends CommonMethods {

    public String pageName ="Cost";

    @FindBy(xpath = "//div[@class='opa-screen-title'][contains(.,'Cost')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement bodyElement;

    public boolean isPageHeaderPresentAndDisplayedInIFACostPage(){
        return isPageHeaderPresentAndDisplayed(pageHeader,pageName);
    }


    public enum rowName{
        OriginalPriorYearClosingBalance,
        AdjustmentsMadeToOpeningBalance,
        Additions,
        TransferredInOnConversionLocalAuthority,
        TransferredInOnConversionElsewhere,
        TransferredInOnExistingAcademiesJoiningTheTrust,
        TransferredOutOnExistingAcademiesLeavingTheTrust,
        Donations,
        Disposals,
        Revaluations,
        Reclassifications,
        AtCloseOfPeriod
    }

    public enum columnName{
        Software,
        Other,
        Total
    }

    public void setValueByRowNameAndColumnNameInIFACostPage(rowName rowName,columnName columnName,String inputValue){
        int rowIncrementer = 2;
        int rowCount= 0;

        int columnIncrementer= 0;
        int columnCount= 0;

        switch(rowName){

            case OriginalPriorYearClosingBalance:                                   rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:                                   rowCount=rowIncrementer+2;
                break;
            case Additions:                                                         rowCount=rowIncrementer+3;
                break;
            case TransferredInOnConversionLocalAuthority:                           rowCount=rowIncrementer+4;
                break;
            case TransferredInOnConversionElsewhere:                                rowCount=rowIncrementer+5;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                   rowCount=rowIncrementer+6;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                  rowCount=rowIncrementer+7;
                break;
            case Donations:                                                         rowCount=rowIncrementer+8;
                break;
            case Disposals:                                                         rowCount=rowIncrementer+9;
                break;
            case Revaluations:rowCount=rowIncrementer+10;
                break;
            case Reclassifications:rowCount=rowIncrementer+11;
                break;
            case AtCloseOfPeriod:rowCount=rowIncrementer+12;
                break;
        }

        switch(columnName){

            case Software:                                                          columnCount= columnIncrementer+1;
                break;
            case Other:                                                             columnCount= columnIncrementer+2;
                break;
            case Total:                                                             columnCount= columnIncrementer+3;
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


    public String getValueByRowNameAndColumnNameInIFACostPage(rowName rowName,columnName columnName){
        String extractedText="Nothing extracted";
        int rowIncrementer = 2 ;
        int rowCount= 0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(rowName){


            case OriginalPriorYearClosingBalance:                   rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:                   rowCount=rowIncrementer+2;
                break;
            case Additions:                                         rowCount=rowIncrementer+3;
                break;
            case TransferredInOnConversionLocalAuthority:           rowCount=rowIncrementer+4;
                break;
            case TransferredInOnConversionElsewhere:                rowCount=rowIncrementer+5;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:   rowCount=rowIncrementer+6;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:  rowCount=rowIncrementer+7;
                break;
            case Donations:                                         rowCount=rowIncrementer+8;
                break;
            case Disposals:                                         rowCount=rowIncrementer+9;
                break;
            case Revaluations:rowCount=rowIncrementer+10;
                break;
            case Reclassifications:rowCount=rowIncrementer+11;
                break;
            case AtCloseOfPeriod:rowCount=rowIncrementer+12;
                break;
        }

        switch(columnName){

            case Software:                                          columnCount=columnIncrementer+1;
                break;
            case Other:                                             columnCount=columnIncrementer+2;
                break;
            case Total:                                             columnCount=columnIncrementer+3;
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