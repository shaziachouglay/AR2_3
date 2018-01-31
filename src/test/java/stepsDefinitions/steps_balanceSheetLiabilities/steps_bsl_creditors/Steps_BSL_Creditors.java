package stepsDefinitions.steps_balanceSheetLiabilities.steps_bsl_creditors;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;
import stepsDefinitions.standigData_steps.StandingDataForDev;

import static pageObjects.balanceSheetLiabilities.creditors.Creditors.ColumnConstant.CreditorLessThan1Year;
import static pageObjects.balanceSheetLiabilities.creditors.Creditors.ColumnConstant.CreditorsMoreTha1Year;
import static pageObjects.balanceSheetLiabilities.creditors.Creditors.RowConstants.*;



public class Steps_BSL_Creditors extends BaseTest {

    private StandingDataForDev standingDataForDev = new StandingDataForDev();

    @Given("^I am on Balance Sheet Liabilities$")
    public void iAmOnBalanceSheetLiabilities() {
        standingDataForDev.iAmOnDevEnvironmentAsPreparer();
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.BalanceSheetLiabilities);
    }

    @And("^I have navigated to the Creditors Section for BSL$")
    public void iHaveNavigatedToTheCreditorsSectionForBSL() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSL_MENU_OPTION.Creditors);
        hardAssertion.assertTrue(creditors.isHeaderPresentAndDisplayed(), "Failed to display the Header for BSL Creditors page");
    }

    @And("^I enter value in row Bank Overdraft and column Creditors less than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowBankOverdraftAndColumnCreditorsLessThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(BankOverdraft, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Loans and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowLoansAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(Loans, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Loans and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowLoansAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(Loans, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Trade Creditor and column Creditors less than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowTradeCreditorAndColumnCreditorsLessThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(TradeCreditor, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row VAT payable and column Creditors less than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowVATPayableAndColumnCreditorsLessThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(VATPayable, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Other taxation and social security and column Creditors less than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowOtherTaxationAndSocialSecurityAndColumnCreditorsLessThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(OtherTaxationAndSocialSecurity, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Other creditors and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowOtherCreditorsAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(OtherCreditor, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Other creditors and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowOtherCreditorsAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(OtherCreditor, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Corporation tax and column Creditors less than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowCorporationTaxAndColumnCreditorsLessThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(CorporationTax, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Unused holiday accrual and column Creditors less than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowUnusedHolidayAccrualAndColumnCreditorsLessThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(UnusedHolidayAccrual, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Other accruals and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowOtherAccrualsAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(OtherAccruals, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Other accruals and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowOtherAccrualsAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(OtherAccruals, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Deferred income capital grants DFE and ESFA and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeCapitalGrantsDFEAndESFAAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeCapitalGrantsDFEAndESFA, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Deferred income capital grants DFE and ESFA and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeCapitalGrantsDFEAndESFAAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeCapitalGrantsDFEAndESFA, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Deferred income Other Capital Grants and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeOtherCapitalGrantsAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeOtherCapitalGrants, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Deferred income Other Capital Grants and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeOtherCapitalGrantsAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeOtherCapitalGrants, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeRevenueGrantsDFEAndESFAAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeRevenueGrantsDFEandESFA, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Deferred income revenue grants DFE and ESFA and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeRevenueGrantsDFEAndESFAAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeRevenueGrantsDFEandESFA, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Deferred income Other Revenue Grants and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeOtherRevenueGrantsAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeOtherRevenueGrants, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Deferred income Other Revenue Grants and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeOtherRevenueGrantsAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeOtherRevenueGrants, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Deferred income Other and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeOtherAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeOther, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Deferred income Other and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowDeferredIncomeOtherAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(DeferredIncomeOther, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Finance leases and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowFinanceLeasesAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(FinanceLeases, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Finance leases and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowFinanceLeasesAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(FinanceLeases, CreditorsMoreTha1Year, arg0);
    }

    @And("^I enter value in row Imputed finance lease of on balance sheet PFI contracts and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowImputedFinanceLeaseOfOnBalanceSheetPFIContractsAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(ImputedFinanceLeaseOfOnBalanceSheetPFIContracts, CreditorLessThan1Year, arg0);
    }

    @And("^I enter value in row Imputed finance lease of on-balance sheet PFI contracts and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iEnterValueInRowImputedFinanceLeaseOfOnBalanceSheetPFIContractsAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0) {
        creditors.setValueInFieldByRowNameAndColumnName(ImputedFinanceLeaseOfOnBalanceSheetPFIContracts, CreditorsMoreTha1Year, arg0);
    }

    @Then("^I see value in row Total and column Creditors less then one year with \"([^\"]*)\" in creditors Page$")
    public void iSeeValueInRowTotalAndColumnCreditorsLessThenOneYearWithInCreditorsPage(String arg0){
        hardAssertion.assertEquals(creditors.getValueByRowNameAndColumnName(Total,CreditorLessThan1Year),arg0);
    }

    @Then("^I see value in row Total and column Creditors more than one year with \"([^\"]*)\" in creditors Page$")
    public void iSeeValueInRowTotalAndColumnCreditorsMoreThanOneYearWithInCreditorsPage(String arg0){
        hardAssertion.assertEquals(creditors.getValueByRowNameAndColumnName(Total,CreditorsMoreTha1Year),arg0);
    }

    @Then("^I see value in row Total and column Creditors less then one year is not  \"([^\"]*)\" in creditors Page$")
    public void iSeeValueInRowTotalAndColumnCreditorsLessThenOneYearIsNotInCreditorsPage(String arg0){
        hardAssertion.assertNotEquals(creditors.getValueByRowNameAndColumnName(Total,CreditorLessThan1Year),arg0);
    }

    @Then("^I see value in row Total and column Creditors more than one year is not  \"([^\"]*)\" in creditors Page$")
    public void iSeeValueInRowTotalAndColumnCreditorsMoreThanOneYearIsNotInCreditorsPage(String arg0){
        hardAssertion.assertNotEquals(creditors.getValueByRowNameAndColumnName(Total,CreditorsMoreTha1Year),arg0);
    }
}