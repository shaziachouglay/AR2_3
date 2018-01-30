package stepsDefinitions.steps_balanceSheetAssets.steps_bsa_currentInvestment;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetAssets.currentInvestment.CurrentInvestments;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_CurrentInvestment extends BaseTest {
    @And("^I navigate to BSA Current Investment page$")
    public void iNavigateToBSATangibleFixedAssetsCurrentInvestmentPage() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.CurrentInvestment);
        hardAssertion.assertTrue(currentInvestments.isHeaderPresentAndDisplayedForBSA_CurrentInvestment(), "Failed to display the Header for Current Investment Page");
        hardAssertion.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.BalanceSheetAssets), "Balance Sheet Assets not displayed in Navigation Panel");

    }

    @And("^I enter in row Original prior year closing balance  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Original prior year closing balance  and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowOriginalPriorYearClosingBalanceAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.OriginalPriorYearClosingBalance, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Adjustments made to opening balance  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Adjustments made to opening balance and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AdjustmentsMadeToOpeningBalance, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Additions  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowAdditionsAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Additions and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowAdditionsAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.Additions, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred in on conversion local authority  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowTransferredInOnConversionLocalAuthorityAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Transferred in on conversion local authority and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowTransferredInOnConversionLocalAuthorityAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.TransferredInOnConversionLocalAuthority, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred in on conversion elsewhere  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowTransferredInOnConversionElsewhereAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Transferred in on conversion elsewhere and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowTransferredInOnConversionElsewhereAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.TransferredInOnConversionElsewhere, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred in on existing academies joining the trust  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowTransferredInOnExistingAcademiesJoiningTheTrustAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Transferred in on existing academies joining the trust and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.TransferredInOnExistingAcademiesJoiningTheTrust, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred out on existing academies leaving the trust  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Transferred out on existing academies leaving the trust and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.TransferredOutOnExistingAcademiesLeavingTheTrust, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Disposals  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowDisposalsAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Disposals and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowDisposalsAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.Disposal, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Impairments  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowImpairmentsAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Impairments and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowImpairmentsAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.Impairments, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Reclassification from non current asset investments  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowReclassificationFromNonCurrentAssetInvestmentsAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Reclassification from non current asset investments and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowReclassificationFromNonCurrentAssetInvestmentsAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.ReclassificationFromCurrentAssetInvestment, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Reclassification to non current asset investments  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowReclassificationToNonCurrentAssetInvestmentsAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Reclassification to non current asset investments and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowReclassificationToNonCurrentAssetInvestmentsAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.ReclassificationToCurrentAssetInvestment, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Reclassification within current asset investments  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowReclassificationWithinCurrentAssetInvestmentsAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.Subsidaries,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.InvestmentPropertyAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.ShareBondsAtCost,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.OtherInvestments,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Reclassification within current asset investments and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowReclassificationWithinCurrentAssetInvestmentsAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.ReclassificationWithinCurrentAssetInvestment, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I enter in row Period end fair value gain loss  and all Columns with \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iEnterInRowPeriodEndFairValueGainLossAndAllColumnsWithInBSATFACurrentInvestment(String arg0) {
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.PeriodEndFairvalueGain, CurrentInvestments.columnName.InvestmentPropertyAtFV,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.PeriodEndFairvalueGain, CurrentInvestments.columnName.ManagedFunds,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.PeriodEndFairvalueGain, CurrentInvestments.columnName.CashDeposits,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.PeriodEndFairvalueGain, CurrentInvestments.columnName.ShareBondsAtFVListed,arg0);
        currentInvestments.setValueInFieldByRowNameAndColumnName(CurrentInvestments.rowNames.PeriodEndFairvalueGain, CurrentInvestments.columnName.OtherInvestmentAtFV,arg0);
    }

    @Then("^I must see the row Period end fair value gain loss and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowPeriodEndFairValueGainLossAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.PeriodEndFairvalueGain, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I must see row At close of period  and all Columns is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeRowAtCloseOfPeriodAndAllColumnsIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.Subsidaries),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.InvestmentPropertyAtCost),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.ShareBondsAtCost),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.OtherInvestments),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.InvestmentPropertyAtFV),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.ManagedFunds),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.CashDeposits),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.ShareBondsAtFVListed),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.OtherInvestmentAtFV),arg0);
    }

    @Then("^I must see the row At close of period and column Total is \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeTheRowAtCloseOfPeriodAndColumnTotalIsInBSATFACurrentInvestment(String arg0) {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.Total),arg0);
    }

    @And("^I must see row At close of period  and all Columns is \"([^\"]*)\" and \"([^\"]*)\" in BSA TFA Current Investment$")
    public void iMustSeeRowAtCloseOfPeriodAndAllColumnsIsAndInBSATFACurrentInvestment(String arg0, String arg1)  {
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.Subsidaries),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.InvestmentPropertyAtCost),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.ShareBondsAtCost),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.OtherInvestments),arg0);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.InvestmentPropertyAtFV),arg1);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.ManagedFunds),arg1);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.CashDeposits),arg1);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.ShareBondsAtFVListed),arg1);
        hardAssertion.assertEquals(currentInvestments.getValueInTableByRowAndColumnNameIn_CurrentInvestment(CurrentInvestments.rowNames.AtTheCloseOfPeriod, CurrentInvestments.columnName.OtherInvestmentAtFV),arg1);
    }
}
