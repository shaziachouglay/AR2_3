package pageObjects.balanceSheetLiabilities.creditors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.landAndBuildings.landAndBuildingsTotal.LBT_Depreciation;
import utilityClasses.CommonMethods;

public class Creditors extends CommonMethods{


    private String pageName="LNB Totals Cost ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Creditors')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{

        BankOverdraft("Bank overdraft"),Loans("Loans"), TradeCreditor("Trade Creditor"), VATPayable("VAT payable"),
        OtherTaxationAndSocialSecurity("Other taxation and social security "), OtherCreditor("Other creditors"),
        CorporationTax("Corporation tax"), UnusedHolidayAccrual("Unused holiday accrual"),OtherAccruals("Other accruals"),
        DeferredIncomeCapitalGrantsDFEAndESFA("Deferred income - capital grants DFE and ESFA"),
        FinanceLeases("Finance leases"), ImputedFinanceLeaseOfOnBalanceSheetPFIContracts("Imputed finance lease of on-balance sheet PFI contracts"),
        Total("Total");

        final String stringvalue;
        LabelConstants(String s){
            this.stringvalue = s;
        }

        public String toString(){
            return stringvalue;
        }
    }

    public String getValueFromInputFieldByLabelName(LBT_Depreciation.LabelConstant label){
        return getValueFromInputFieldByParentElementAndLabelName(page_body, label.toString());
    }

    public void setValueInFieldByLabelName(LabelConstants lableName, String inputValue){
        setValueInInputFieldByLabelName(page_body,lableName.toString(),inputValue);
        info("Value set in field name : "+lableName+" with :"+ inputValue);
    }

}
