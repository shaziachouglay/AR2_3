package pageObjects.balanceSheetLiabilities.creditors;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Creditors extends CommonMethods{


    private String pageName="BSL Creditors";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Creditors')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public void setValueInFieldByRowNameAndColumnName(RowConstants row, ColumnConstant column, String inputValue){

        int rowIncrementer=0;
        int rowCount=0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(row){

            case BankOverdraft:
                rowCount= rowIncrementer+1;
                break;
            case Loans:
                rowCount= rowIncrementer+2;
                break;
            case TradeCreditor:
                rowCount= rowIncrementer+3;
                break;
            case VATPayable:
                rowCount= rowIncrementer+4;
                break;
            case OtherTaxationAndSocialSecurity:
                rowCount= rowIncrementer+5;
                break;
            case OtherCreditor:
                rowCount= rowIncrementer+6;
                break;
            case CorporationTax:
                rowCount= rowIncrementer+7;
                break;
            case UnusedHolidayAccrual:
                rowCount= rowIncrementer+8;
                break;
            case OtherAccruals:
                rowCount= rowIncrementer+9;
                break;
            case DeferredIncomeCapitalGrantsDFEAndESFA:
                rowCount= rowIncrementer+10;
                break;
            case DeferredIncomeOtherCapitalGrants:
                rowCount= rowIncrementer+11;
                break;
            case DeferredIncomeRevenueGrantsDFEandESFA:
                rowCount= rowIncrementer+12;
                break;
            case DeferredIncomeOtherRevenueGrants:
                rowCount= rowIncrementer+13;
                break;
            case DeferredIncomeOther:
                rowCount= rowIncrementer+14;
                break;
            case FinanceLeases:
                rowCount= rowIncrementer+15;
                break;
            case ImputedFinanceLeaseOfOnBalanceSheetPFIContracts:
                rowCount= rowIncrementer+16;
                break;
            case Total:
                rowCount= rowIncrementer+17;
                break;
        }

        switch (column){


            case CreditorLessThan1Year:
                columnCount=columnIncrementer+1;
                break;
            case CreditorsMoreTha1Year:
                columnCount=columnIncrementer+2;
                break;
        }

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
        info("The value set in row : "+ row+ " and column : "+column+" is : "+inputValue+" in "+pageName);

    }

    public String getValueByRowNameAndColumnName(RowConstants row, ColumnConstant column){
        String extractedText = "Not Text Extracted !";
        int rowIncrementer=0;
        int rowCount=0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(row){

            case BankOverdraft:
                rowCount= rowIncrementer+1;
                break;
            case Loans:
                rowCount= rowIncrementer+2;
                break;
            case TradeCreditor:
                rowCount= rowIncrementer+3;
                break;
            case VATPayable:
                rowCount= rowIncrementer+4;
                break;
            case OtherTaxationAndSocialSecurity:
                rowCount= rowIncrementer+5;
                break;
            case OtherCreditor:
                rowCount= rowIncrementer+6;
                break;
            case CorporationTax:
                rowCount= rowIncrementer+7;
                break;
            case UnusedHolidayAccrual:
                rowCount= rowIncrementer+8;
                break;
            case OtherAccruals:
                rowCount= rowIncrementer+9;
                break;
            case DeferredIncomeCapitalGrantsDFEAndESFA:
                rowCount= rowIncrementer+10;
                break;
            case DeferredIncomeOtherCapitalGrants:
                rowCount= rowIncrementer+11;
                break;
            case DeferredIncomeRevenueGrantsDFEandESFA:
                rowCount= rowIncrementer+12;
                break;
            case DeferredIncomeOtherRevenueGrants:
                rowCount= rowIncrementer+13;
                break;
            case DeferredIncomeOther:
                rowCount= rowIncrementer+14;
                break;
            case FinanceLeases:
                rowCount= rowIncrementer+15;
                break;
            case ImputedFinanceLeaseOfOnBalanceSheetPFIContracts:
                rowCount= rowIncrementer+16;
                break;
            case Total:
                rowCount= rowIncrementer+17;
                break;
        }

        switch (column){


            case CreditorLessThan1Year:
                columnCount=columnIncrementer+1;
                break;
            case CreditorsMoreTha1Year:
                columnCount=columnIncrementer+2;
                break;
        }
        try {

            WebElement tableElement = page_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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


    public enum RowConstants{

        BankOverdraft,Loans, TradeCreditor, VATPayable,
        OtherTaxationAndSocialSecurity, OtherCreditor,
        CorporationTax, UnusedHolidayAccrual,OtherAccruals,
        DeferredIncomeCapitalGrantsDFEAndESFA,
        DeferredIncomeOtherCapitalGrants,
        DeferredIncomeRevenueGrantsDFEandESFA, DeferredIncomeOtherRevenueGrants, DeferredIncomeOther,
        FinanceLeases, ImputedFinanceLeaseOfOnBalanceSheetPFIContracts,
        Total;
    }


    public enum ColumnConstant{
        CreditorLessThan1Year, CreditorsMoreTha1Year;
    }

}
