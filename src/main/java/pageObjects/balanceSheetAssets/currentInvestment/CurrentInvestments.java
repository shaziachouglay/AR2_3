package pageObjects.balanceSheetAssets.currentInvestment;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class CurrentInvestments extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement currentInvestment_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Current investments')]")
    WebElement currentInvestment_header;


    public String pageName= "Current investments";
    public enum rowNames{
        OriginalPriorYearClosingBalance,AdjustmentsMadeToOpeningBalance,Additions,TransferredInOnConversionLocalAuthority, TransferredInOnConversionElsewhere, TransferredInOnExistingAcademiesJoiningTheTrust, TransferredOutOnExistingAcademiesLeavingTheTrust, Disposal,
        Impairments, ReclassificationFromCurrentAssetInvestment, ReclassificationToCurrentAssetInvestment,ReclassificationWithinCurrentAssetInvestment, PeriodEndFairvalueGain, AtTheCloseOfPeriod
    }

    public enum columnName{
        Subsidaries, InvestmentPropertyAtCost,ShareBondsAtCost, OtherInvestments,InvestmentPropertyAtFV,ManagedFunds, CashDeposits, ShareBondsAtFVListed,OtherInvestmentAtFV,Total
    }

    public void setValueInFieldByRowNameAndColumnName(rowNames rowName, columnName columnName,String inputValue){
        String extractedText="nothing extracted";
        int rowIncrementer=0;
        int rowCount=rowIncrementer+0;

        int columnIncrementer=0;
        int columnNumber = columnIncrementer+0;

        switch (rowName){

            case OriginalPriorYearClosingBalance:                   rowCount=3;
                break;
            case AdjustmentsMadeToOpeningBalance:                   rowCount=4;
                break;
            case Additions:                                         rowCount=5;
                break;
            case TransferredInOnConversionLocalAuthority:           rowCount=6;
                break;
            case TransferredInOnConversionElsewhere:                rowCount=7;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:   rowCount=8;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:  rowCount=9;
                break;
            case Disposal:                                          rowCount=10;
                break;
            case Impairments:                                       rowCount=11;
                break;
            case ReclassificationFromCurrentAssetInvestment:        rowCount=12;
                break;
            case ReclassificationToCurrentAssetInvestment:          rowCount=13;
                break;
            case ReclassificationWithinCurrentAssetInvestment:      rowCount= 14;
                break;
            case PeriodEndFairvalueGain:                            rowCount=15;
                break;
            case AtTheCloseOfPeriod:                                rowCount=16;
                break;
        }

        switch (columnName){

            case Subsidaries:                                       columnNumber=1;
                break;
            case InvestmentPropertyAtCost:                          columnNumber=2;
                break;
            case ShareBondsAtCost:                                  columnNumber=3;
                break;
            case OtherInvestments:                                  columnNumber=4;
                break;
            case InvestmentPropertyAtFV:                            columnNumber=5;
                break;
            case ManagedFunds:                                      columnNumber=6;
                break;
            case CashDeposits:                                      columnNumber=7;
                break;
            case ShareBondsAtFVListed:                              columnNumber=8;
                break;
            case OtherInvestmentAtFV:                               columnNumber=9;
                break;
            case Total:                                             columnNumber=10;
                break;
        }try {
            waitForAjax();
            WebElement tableElement = currentInvestment_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnNumber + "]//div/input"));
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






    public String getValueInTableByRowAndColumnNameIn_CurrentInvestment(rowNames rowName, columnName columnName){
        int rowCount= 0;
        int columnCount = 0;
        String extractedText = "";
        int incrementer = -1;

        switch (rowName){

            case OriginalPriorYearClosingBalance:                   rowCount=3;
                break;
            case AdjustmentsMadeToOpeningBalance:                   rowCount=4;
                break;
            case Additions:                                         rowCount=5;
                break;
            case TransferredInOnConversionLocalAuthority:           rowCount=6;
                break;
            case TransferredInOnConversionElsewhere:                rowCount=7;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:   rowCount=8;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:  rowCount=9;
                break;
            case Disposal:                                          rowCount=10;
                break;
            case Impairments:                                       rowCount=11;
                break;
            case ReclassificationFromCurrentAssetInvestment:        rowCount=12;
                break;
            case ReclassificationToCurrentAssetInvestment:          rowCount=13;
                break;
            case ReclassificationWithinCurrentAssetInvestment:      rowCount= 14;
                break;
            case PeriodEndFairvalueGain:                            rowCount=15;
                break;
            case AtTheCloseOfPeriod:                                rowCount=16;
                break;
        }

        switch (columnName){

            case Subsidaries:                                       columnCount=1;
                break;
            case InvestmentPropertyAtCost:                          columnCount=2;
                break;
            case ShareBondsAtCost:                                  columnCount=3;
                break;
            case OtherInvestments:                                  columnCount=4;
                break;
            case InvestmentPropertyAtFV:                            columnCount=5;
                break;
            case ManagedFunds:                                      columnCount=6;
                break;
            case CashDeposits:                                      columnCount=7;
                break;
            case ShareBondsAtFVListed:                              columnCount=8;
                break;
            case OtherInvestmentAtFV:                               columnCount=9;
                break;
            case Total:                                             columnCount=10;
                break;
        }
        try {

            WebElement tableElement = currentInvestment_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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

    public boolean isHeaderPresentAndDisplayedForBSA_CurrentInvestment(){
        return isPageHeaderPresentAndDisplayed(currentInvestment_header,pageName);
    }

}
