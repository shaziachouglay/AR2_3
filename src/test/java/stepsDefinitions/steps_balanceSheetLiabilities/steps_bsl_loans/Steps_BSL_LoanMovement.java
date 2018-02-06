package stepsDefinitions.steps_balanceSheetLiabilities.steps_bsl_loans;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetLiabilities.loans.LoanMovementTable;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_BSL_LoanMovement extends BaseTest {
    @And("^I have navigated to the Loans Movement Table Section for BSL$")
    public void iHaveNavigatedToTheLoansMovementTableSectionForBSL() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSL_MENU_OPTION.Loans);
        hardAssertion.assertTrue(loanMovementTable.isHeaderPresentAndDisplayed(), "Failed to display the Header for BSL Loans Movement page");
    }

    @And("^I enter value in row Original prior year closing balance and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.OriginalPriorYearClosingBalance, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.OriginalPriorYearClosingBalance, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.OriginalPriorYearClosingBalance, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Original prior year closing balance and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowOriginalPriorYearClosingBalanceAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.OriginalPriorYearClosingBalance, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Adjustments made in relation to the opening balance and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowAdjustmentsMadeInRelationToTheOpeningBalanceAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.AdjustmentsMadeInRelationToTheOpeningBalance, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.AdjustmentsMadeInRelationToTheOpeningBalance, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.AdjustmentsMadeInRelationToTheOpeningBalance, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Adjustments made in relation to the opening balance and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowAdjustmentsMadeInRelationToTheOpeningBalanceAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.AdjustmentsMadeInRelationToTheOpeningBalance, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row New borrowings and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowNewBorrowingsAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.NewBorrowings, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.NewBorrowings, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.NewBorrowings, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row New Borrowings and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowNewBorrowingsAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.NewBorrowings, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Transferred in on existing academies joining the trust and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred in on conversion and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowTransferredInOnConversionAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnConversion, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnConversion, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnConversion, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Transferred in on conversion and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowTransferredInOnConversionAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnConversion, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Transferred out on existing academies leaving the trust and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Repayment of borrowings and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowRepaymentOfBorrowingsAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.RepaymentOfBorrowings, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.RepaymentOfBorrowings, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.RepaymentOfBorrowings, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Repayment of borrowings and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowRepaymentOfBorrowingsAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.RepaymentOfBorrowings, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Interest charged and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iEnterValueInRowInterestChargedAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.INterestCharged, LoanMovementTable.ColumnConstant.DfEGroup,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.INterestCharged, LoanMovementTable.ColumnConstant.OtherGovernment,arg0);
        loanMovementTable.setValueInFieldByRowNameAndColumnName(LoanMovementTable.RowConstants.INterestCharged, LoanMovementTable.ColumnConstant.Other,arg0);
    }

    @Then("^I see value in row Interest charged and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowInterestChargedAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.INterestCharged, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I see value in row Closing balance and all columns with \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowClosingBalanceAndAllColumnsWithInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.DfEGroup),arg0);
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.OtherGovernment),arg0);
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.Other),arg0);
    }

    @Then("^I see value in row Closing balance and Totals column is \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowClosingBalanceAndTotalsColumnIsInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Original prior year closing balance and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowOriginalPriorYearClosingBalanceAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.OriginalPriorYearClosingBalance, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Adjustments made in relation to the opening balance and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowAdjustmentsMadeInRelationToTheOpeningBalanceAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.AdjustmentsMadeInRelationToTheOpeningBalance, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row New Borrowings and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowNewBorrowingsAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.NewBorrowings, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Transferred in on existing academies joining the trust and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Transferred in on conversion and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowTransferredInOnConversionAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredInOnConversion, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Transferred out on existing academies leaving the trust and Totals column is NOT \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Repayment of borrowings and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowRepaymentOfBorrowingsAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.RepaymentOfBorrowings, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Interest charged and Totals column is NOT\"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowInterestChargedAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.INterestCharged, LoanMovementTable.ColumnConstant.Total),arg0);
    }

    @And("^I see value in row Closing balance and all columns is NOT \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowClosingBalanceAndAllColumnsIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.DfEGroup),arg0);
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.OtherGovernment),arg0);
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.Other),arg0);

    }

    @Then("^I see value in row Closing balance and Totals column is NOT \"([^\"]*)\" in BSL Loan Movement page$")
    public void iSeeValueInRowClosingBalanceAndTotalsColumnIsNOTInBSLLoanMovementPage(String arg0) {
        hardAssertion.assertNotEquals(loanMovementTable.getValueByRowNameAndColumnName(LoanMovementTable.RowConstants.ClosingBalance, LoanMovementTable.ColumnConstant.Total),arg0);
    }
}