package stepsDefinitions.steps_balanceSheetLiabilities.steps_bsl_loans;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetLiabilities.loans.LoanAnalysis;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_BSL_LoanAnalysis extends BaseTest {
    @And("^I have navigated to the Loans Analysis Table Section for BSL$")
    public void iHaveNavigatedToTheLoansAnalysisTableSectionForBSL() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSL_MENU_OPTION.Loans, NavigationMenuBar.BSL_TAB_SUBMENU_OPTIONS.LoanAnalysis);
        hardAssertion.assertTrue(loanAnalysis.isHeaderPresentAndDisplayed(), "Failed to display the Header for BSL Loans Analysis page");
    }

    @And("^I enter in row Withing One Year and all columns with \"([^\"]*)\" in BSL Loan Analysis$")
    public void iEnterInRowWithingOneYearAndAllColumnsWithInBSLLoanAnalysis(String arg0) {
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.WithinOneYear, LoanAnalysis.ColumnConstant.DfEGroup,arg0);
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.WithinOneYear, LoanAnalysis.ColumnConstant.OtherGovernment,arg0);
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.WithinOneYear, LoanAnalysis.ColumnConstant.Other,arg0);
    }

    @Then("^I must see the value in row Within One Year and column Total is \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheValueInRowWithinOneYearAndColumnTotalIsInBSLLoanAnalysis(String arg0) {
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.WithinOneYear, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Between two and five years and all columns with \"([^\"]*)\"in BSL Loan Analysis$")
    public void iEnterInRowBetweenTwoAndFiveYearsAndAllColumnsWithInBSLLoanAnalysis(String arg0) {
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.BetweenTwoAndFiveYears, LoanAnalysis.ColumnConstant.DfEGroup,arg0);
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.BetweenTwoAndFiveYears, LoanAnalysis.ColumnConstant.OtherGovernment,arg0);
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.BetweenTwoAndFiveYears, LoanAnalysis.ColumnConstant.Other,arg0);
    }

    @Then("^I must see the value in row Between two and five years and column Total is \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheValueInRowBetweenTwoAndFiveYearsAndColumnTotalIsInBSLLoanAnalysis(String arg0)  {
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.BetweenTwoAndFiveYears, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row After more than five years and all columns with \"([^\"]*)\"in BSL Loan Analysis$")
    public void iEnterInRowAfterMoreThanFiveYearsAndAllColumnsWithInBSLLoanAnalysis(String arg0) {
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.AfterMoreThanFiveYears, LoanAnalysis.ColumnConstant.DfEGroup,arg0);
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.AfterMoreThanFiveYears, LoanAnalysis.ColumnConstant.OtherGovernment,arg0);
        loanAnalysis.setValueInFieldByRowNameAndColumnName(LoanAnalysis.RowConstants.AfterMoreThanFiveYears, LoanAnalysis.ColumnConstant.Other,arg0);
    }

    @Then("^I must see the value in row After more than five years and column Total is \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheValueInRowAfterMoreThanFiveYearsAndColumnTotalIsInBSLLoanAnalysis(String arg0)  {
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.AfterMoreThanFiveYears, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the row Total and all columns are \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheRowTotalAndAllColumnsAreInBSLLoanAnalysis(String arg0) {
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.DfEGroup),arg0);
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.OtherGovernment),arg0);
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.Other),arg0);
    }

    @Then("^I must see the row Total and column Total is \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheRowTotalAndColumnTotalIsInBSLLoanAnalysis(String arg0) {
        hardAssertion.assertEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the value in row Within One Year and column Total is NOT \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheValueInRowWithinOneYearAndColumnTotalIsNOTInBSLLoanAnalysis(String arg0){
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.WithinOneYear, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the value in row Between two and five years and column Total is NOT \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheValueInRowBetweenTwoAndFiveYearsAndColumnTotalIsNOTInBSLLoanAnalysis(String arg0){
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.BetweenTwoAndFiveYears, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the value in row After more than five years and column Total is NOT \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheValueInRowAfterMoreThanFiveYearsAndColumnTotalIsNOTInBSLLoanAnalysis(String arg0){
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.AfterMoreThanFiveYears, LoanAnalysis.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the row Total and all columns are NOT \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheRowTotalAndAllColumnsAreNOTInBSLLoanAnalysis(String arg0){
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.DfEGroup),arg0);
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.OtherGovernment),arg0);
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.Other),arg0);
    }

    @Then("^I must see the row Total and column Total is NOT \"([^\"]*)\"in BSL Loan Analysis$")
    public void iMustSeeTheRowTotalAndColumnTotalIsNOTInBSLLoanAnalysis(String arg0){
        hardAssertion.assertNotEquals(loanAnalysis.getValueByRowNameAndColumnName(LoanAnalysis.RowConstants.Total, LoanAnalysis.ColumnConstant.Total),arg0);
    }
}