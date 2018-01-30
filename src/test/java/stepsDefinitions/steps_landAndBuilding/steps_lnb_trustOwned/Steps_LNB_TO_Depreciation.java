package stepsDefinitions.steps_landAndBuilding.steps_lnb_trustOwned;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.landAndBuildings.trustOwned.TO_Depreciation.ColumnConstant.*;
import static pageObjects.landAndBuildings.trustOwned.TO_Depreciation.RowConstants.*;

public class Steps_LNB_TO_Depreciation extends BaseTest {
    @And("^I have navigated to the Trust Owned Depreciation Page$")
    public void iHaveNavigatedToTheTrustOwnedDepreciationPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.TrustOwned, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Depreciation);
        hardAssertion.assertTrue(to_depreciation.isHeaderPresentAndDisplayed(), "Failed to display the Header for LNB Trust Owned Depreciation page");
    }

    @And("^I enter in row Original prior year closing balance  and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Original prior year closing balance  and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowOriginalPriorYearClosingBalanceAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(OriginalPriorYearClosingBalance, Total),arg0);
    }

    @And("^I enter in row Adjustments made to opening balance and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Adjustments made to opening balance and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, Total),arg0);
    }

    @And("^I enter in row Charged in period and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowChargedInPeriodAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Charged in period and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowChargedInPeriodAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(ChargedInPeriod, Total),arg0);
    }

    @And("^I enter in row Eliminated on disposal and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowEliminatedOnDisposalAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(EliminatedOnDisposal, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(EliminatedOnDisposal, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(EliminatedOnDisposal, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Eliminated on disposal and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowEliminatedOnDisposalAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(EliminatedOnDisposal, Total),arg0);
    }

    @And("^I enter in row Transferred out on existing Academies leaving the Trust and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Transferred out on existing Academies leaving the Trust and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, Total),arg0);
    }

    @And("^I enter in row Revaluations and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowRevaluationsAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(Revaluations, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(Revaluations, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(Revaluations, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Revaluations and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowRevaluationsAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(Revaluations, Total),arg0);
    }

    @And("^I enter in row Reclassifications and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowReclassificationsAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(Reclassifications, FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(Reclassifications, LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(Reclassifications, LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Reclassifications and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowReclassificationsAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(Reclassifications,Total),arg0);
    }

    @Then("^I see in row At close of period and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeInRowAtCloseOfPeriodAndAllColumnWithInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod, FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod, LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod, LeaseholdImprovements),arg0);
    }

    @Then("^I see value in row At close of period and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowAtCloseOfPeriodAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod,Total),arg0);
    }

    @Then("^I see value in row Original prior year closing balance  and column Total is NOT \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowOriginalPriorYearClosingBalanceAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(OriginalPriorYearClosingBalance,Total),arg0);
    }

    @Then("^I see value in row Adjustments made to opening balance and column Total is NOT \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(AdjustmentMadeToOpeningBalance,Total),arg0);
    }

    @Then("^I see value in row Charged in period and column Total is NOT \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowChargedInPeriodAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(ChargedInPeriod,Total),arg0);
    }

    @Then("^I see value in row Eliminated on disposal and column Total is NOT\"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowEliminatedOnDisposalAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(EliminatedOnDisposal,Total),arg0);
    }

    @Then("^I see value in row Transferred out on existing Academies leaving the Trust and column Total is NOT\"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @Then("^I see value in row Revaluations and column Total is NOT\"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowRevaluationsAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(Revaluations,Total),arg0);
    }

    @Then("^I see value in row Reclassifications and column Total is NOT\"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowReclassificationsAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(Reclassifications,Total),arg0);
    }

    @Then("^I see in row At close of period and all column are NOT \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeInRowAtCloseOfPeriodAndAllColumnAreNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod,FreeholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdImprovements),arg0);
    }

    @Then("^I see value in row At close of period and column Total is NOT \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowAtCloseOfPeriodAndColumnTotalIsNOTInTO_DepreciationPage(String arg0) {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(AtCloseOfPeriod,Total),arg0);
    }

    @And("^I enter in row Transferred out on existing Academies joining the Trust and all column with \"([^\"]*)\" in TO_Depreciation page$")
    public void iEnterInRowTransferredOutOnExistingAcademiesJoiningTheTrustAndAllColumnWithInTO_DepreciationPage(String arg0) {
        to_depreciation.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust,FreeholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust,LeaseholdLandAndBuildings,arg0);
        to_depreciation.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust,LeaseholdImprovements,arg0);
    }

    @Then("^I see value in row Transferred out on existing Academies joining the Trust and column Total is \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesJoiningTheTrustAndColumnTotalIsInTO_DepreciationPage(String arg0) {
        hardAssertion.assertEquals(to_depreciation.getValueByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust,Total),arg0);
    }

    @Then("^I see value in row Transferred out on existing Academies joining the Trust and column Total is NOT \"([^\"]*)\" in TO_Depreciation page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesJoiningTheTrustAndColumnTotalIsNOTInTO_DepreciationPage(String arg0)  {
        hardAssertion.assertNotEquals(to_depreciation.getValueByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust,Total),arg0);
    }
}