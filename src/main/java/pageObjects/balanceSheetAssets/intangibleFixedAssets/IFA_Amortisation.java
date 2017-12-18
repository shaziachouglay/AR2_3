package pageObjects.balanceSheetAssets.intangibleFixedAssets;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class IFA_Amortisation extends CommonMethods {

    public String pageName ="Amortisation";

    @FindBy(xpath = "//div[@class='opa-screen-title'][contains(.,'Amortisation')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement bodyElement;

    public boolean isPageHeaderPresentAndDisplayedInIFAAmortisationPage(){
        return isPageHeaderPresentAndDisplayed(pageHeader,pageName);
    }


    public enum rowName{
        OriginalPriorYearClosingBalance,
        AdjustmentsMadeToOpeningBalance,
        ChargedInPeriod,
        EliminatedOnDisposal,
        TransferredInOnExistingAcademiesJoiningTheTrust,
        TransferredOutOnExistingAcademiesLeavingTheTrust,
        Revaluations,
        Reclassifications,
        AtCloseOfPeriod
    }

    public enum columnName{
        Software,
        Other,
        Total
    }

    public void setValueByRowNameAndColumnNameInIFAAmortisationPage(rowName rowName,columnName columnName, String inputValue){

        int rowCount=0;
        int rowIncrementer=2;
        int columnCount=0;
        int columnIncrementer=0;

        switch (rowName){

            case OriginalPriorYearClosingBalance: rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:rowCount=rowIncrementer+2;
                break;
            case ChargedInPeriod:rowCount=rowIncrementer+3;
                break;
            case EliminatedOnDisposal:rowCount=rowIncrementer+4;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:rowCount=rowIncrementer+5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:rowCount=rowIncrementer+6;
                break;
            case Revaluations:rowCount=rowIncrementer+7;
                break;
            case Reclassifications:rowCount=rowIncrementer+8;
                break;
            case AtCloseOfPeriod:rowCount=rowIncrementer+9;
                break;
        }

        switch (columnName){

            case Software: columnCount=columnIncrementer+1;
                break;
            case Other:columnCount=columnIncrementer+2;
                break;
            case Total:columnCount=columnIncrementer+3;
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


    public String getValueByRowNameAndColumnNameInIFAAmortisationPage(rowName rowName,columnName columnName){
        String extractedText="no text extracted";
        int rowCount=0;
        int rowIncrementer=2 ;
        int columnCount=0;
        int columnIncrementer=0;

        switch (rowName){

            case OriginalPriorYearClosingBalance: rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:rowCount=rowIncrementer+2;
                break;
            case ChargedInPeriod:rowCount=rowIncrementer+3;
                break;
            case EliminatedOnDisposal:rowCount=rowIncrementer+4;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:rowCount=rowIncrementer+5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:rowCount=rowIncrementer+6;
                break;
            case Revaluations:rowCount=rowIncrementer+7;
                break;
            case Reclassifications:rowCount=rowIncrementer+8;
                break;
            case AtCloseOfPeriod:rowCount=rowIncrementer+9;
                break;
        }

        switch (columnName){

            case Software: columnCount=columnIncrementer+1;
                break;
            case Other:columnCount=columnIncrementer+2;
                break;
            case Total:columnCount=columnIncrementer+3;
                break;
        }
        try {
            //cleanAndRebuildElement(bodyElement);
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
