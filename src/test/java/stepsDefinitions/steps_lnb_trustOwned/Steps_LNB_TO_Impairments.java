package stepsDefinitions.steps_lnb_trustOwned;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.landAndBuildings.trustOwned.TO_Impairments.ColumnConstant.*;
import static pageObjects.landAndBuildings.trustOwned.TO_Impairments.RowConstants.*;

public class Steps_LNB_TO_Impairments extends BaseTest {
    @And("^I have navigated to the Trust Owned Impiarments Page$")
    public void iHaveNavigatedToTheTrustOwnedImpiarmentsPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.TrustOwned, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Imparments);
        hardAssertion.assertTrue(to_impairments.isHeaderPresentAndDisplayed(), "Failed to display the Header for LNB Trust Owned Impairments page");
    }

    @And("^I enter value in row Original prior year closing balance  and al columns with \"([^\"]*)\" in Trust Owned Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAndAlColumnsWithInTrustOwnedImpairmentsPage(String arg0) {
        to_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, FreeholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, LeaseholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, LeaseholdImprovements,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Original prior year closing balance and column Total is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAndColumnTotalIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(OriginalPriorYearClosingBalance,Total),arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and al columns with \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndAlColumnsWithInTrustOwnedImpairmentsPage(String arg0) {
        to_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, FreeholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, LeaseholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, LeaseholdImprovements,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Total is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(AdjustmentMadeToOpeningBalance,Total),arg0);
    }

    @And("^I enter value in row Charged in Period and al columns with \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndAlColumnsWithInTrustOwnedImpairmentsPage(String arg0) {
        to_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, FreeholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, LeaseholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, LeaseholdImprovements,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Charged in period and column Total is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowChargedInPeriodAndColumnTotalIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(ChargedInPeriod,Total),arg0);
    }

    @And("^I enter value in row Released in period and al columns with \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndAlColumnsWithInTrustOwnedImpairmentsPage(String arg0) {
        to_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, FreeholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, LeaseholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, LeaseholdImprovements,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Released in Period and column Total is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowReleasedInPeriodAndColumnTotalIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(ReleasedInPeriod,Total),arg0);
    }

    @And("^I enter value in row Transferred out on existing Academies leaving the Trust and al columns with \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAlColumnsWithInTrustOwnedImpairmentsPage(String arg0) {
        to_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, FreeholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, LeaseholdLandAndBuildings,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, LeaseholdImprovements,arg0);
        to_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Transferred out on existing Academies leaving the Trust and column Total is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @Then("^I see the value in row At Close of period and all columns is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndAllColumnsIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,AssetUnderContruction),arg0);
    }

    @Then("^I see the value in row At Close of period and column Total is \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndColumnTotalIsInTrustOwnedImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,Total),arg0);
    }

    @Then("^I see the value in row Original prior year closing balance and column Total is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAndColumnTotalIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(OriginalPriorYearClosingBalance,Total),arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Total is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(AdjustmentMadeToOpeningBalance,Total),arg0);
    }

    @Then("^I see the value in row Charged in period and column Total is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowChargedInPeriodAndColumnTotalIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(ChargedInPeriod,Total),arg0);
    }

    @Then("^I see the value in row Released in Period and column Total is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowReleasedInPeriodAndColumnTotalIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(ReleasedInPeriod,Total),arg0);
    }

    @Then("^I see the value in row Transferred out on existing Academies leaving the Trust and column Total is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @Then("^I see the value in row At Close of period and all columns is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndAllColumnsIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,FreeholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdImprovements),arg0);
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,AssetUnderContruction),arg0);
    }

    @Then("^I see the value in row At Close of period and column Total is NOT \"([^\"]*)\"in Trust Owned Impairments Page$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndColumnTotalIsNOTInTrustOwnedImpairmentsPage(String arg0){
        hardAssertion.assertNotEquals(to_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,Total),arg0);
    }
}
