package pageObjects.balanceSheetAssets.debtors;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Debtors extends CommonMethods {

    public String pageName = "Debtors";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement debtors_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Debtors')]")
    WebElement debtors_header;

    public enum BSA_DebtorsRowLabels {
        TradeDebtorsBeforeDabDebt, BadDebt, AccuredCapitalGrantDEESFA, AccruedCapitalgrantOther, AccruedRevenueGrantOther,AccruedRevenueGrantOtherDFEESFA, Prepayments, AccruedIncome, VATRecoverable, PFIpayments, OtherDebtors,
        Total
    }

    public enum BSA_DebtorsColumnLabels{
        AmountDueWithin1Year, AmountDueAfter1Year
    }

    public void setValueByRowNameAndColumnNameInBSADebtorsPage(BSA_DebtorsRowLabels row ,BSA_DebtorsColumnLabels column,  String inputValue){


        int rowIncrementer= 0;
        int rowCount = 0+rowIncrementer;

        int columnIncrementer=0;
        int columnCount = 0+columnIncrementer;

        switch (row){

            case TradeDebtorsBeforeDabDebt: rowCount=2;
                break;
            case BadDebt:                   rowCount=3;
                break;
            case AccuredCapitalGrantDEESFA: rowCount=4;
                break;
            case AccruedCapitalgrantOther:  rowCount=5;
                break;
            case AccruedRevenueGrantOtherDFEESFA: rowCount =6;
                break;
            case AccruedRevenueGrantOther:  rowCount=7;
                break;
            case Prepayments:               rowCount=8;
                break;
            case AccruedIncome:             rowCount=9;
                break;
            case VATRecoverable:            rowCount=10;
                break;
            case PFIpayments:               rowCount=11;
                break;
            case OtherDebtors:              rowCount=12;
                break;
            case Total:                     rowCount=13;
                break;
        }

        switch(column){

            case AmountDueWithin1Year:      columnCount=2;
                break;
            case AmountDueAfter1Year:        columnCount=3;
                break;
        }

        try {
            waitForAjax();
            WebElement tableElement = debtors_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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
        info("The value set in row : "+ row+ " and column : "+column+" is : "+inputValue+" in "+pageName);
    }



    public String getValueByRowNameAndColumnNameInBSADebtorsPage(BSA_DebtorsRowLabels row ,BSA_DebtorsColumnLabels column){
        String extractedText= "";
        int rowIncrementer= 0;
        int rowCount = 0+rowIncrementer;

        int columnIncrementer=0;
        int columnCount = 0+columnIncrementer;

        switch (row){

            case TradeDebtorsBeforeDabDebt: rowCount=2;
                break;
            case BadDebt:                   rowCount=3;
                break;
            case AccuredCapitalGrantDEESFA: rowCount=4;
                break;
            case AccruedCapitalgrantOther:  rowCount=5;
                break;
            case AccruedRevenueGrantOtherDFEESFA: rowCount =6;
                break;
            case AccruedRevenueGrantOther:  rowCount=7;
                break;
            case Prepayments:               rowCount=8;
                break;
            case AccruedIncome:             rowCount=9;
                break;
            case VATRecoverable:            rowCount=10;
                break;
            case PFIpayments:               rowCount=11;
                break;
            case OtherDebtors:              rowCount=12;
                break;
            case Total:                     rowCount=13;
                break;
        }

        switch(column){

            case AmountDueWithin1Year:      columnCount=2;
                break;
            case AmountDueAfter1Year:        columnCount=3;
                break;
        }


        try {

            WebElement tableElement = debtors_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement,Keys.TAB);
            explicitWait(500);
            waitForJStoLoad();
            waitForElementToBeVisible(tableElement); waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
            info("The extracted value from row : "+ row+ " and column : "+column+" is : "+extractedText);
        }
        catch (NoSuchElementException nsee){
            warn("NoSuchElementException Occurred in"+pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return extractedText;
    }


    public void clickOnSaveAndNextInBSA_DebtorsPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForBSA_DebtorsPage(){
        return isPageHeaderPresentAndDisplayed(debtors_header,pageName);
    }


}
