package stepsDefinitions.steps_lnb_academies;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.landAndBuildings.academies.Academies_Impairments.ColumnConstant.*;
import static pageObjects.landAndBuildings.academies.Academies_Impairments.RowConstants.*;

public class Steps_LNB_A_Impairments extends BaseTest {
    @And("^I have navigated to the Academies Impiarments Page$")
    public void iHaveNavigatedToTheAcademiesImpiarmentsPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.Academies, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Imparments);
        hardAssertion.assertTrue(to_impairments.isHeaderPresentAndDisplayed(), "Failed to display the Header for LNB Academies Impairments page");
    }

    @And("^I enter value in row Original prior year closing balance  and al columns with \"([^\"]*)\" in Academies Impairments$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAndAlColumnsWithInAcademiesImpairments(String arg0) {
        academies_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, FreeholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, LeaseholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, LeaseholdImprovements,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(OriginalPriorYearClosingBalance, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Original prior year closing balance and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(OriginalPriorYearClosingBalance,Total),arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and al columns with \"([^\"]*)\"in Academies Impairments$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndAlColumnsWithInAcademiesImpairments(String arg0) {
        academies_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, FreeholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, LeaseholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, LeaseholdImprovements,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(AdjustmentMadeToOpeningBalance, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(AdjustmentMadeToOpeningBalance,Total),arg0);
    }

    @And("^I enter value in row Charged in Period and al columns with \"([^\"]*)\"in Academies Impairments$")
    public void iEnterValueInRowChargedInPeriodAndAlColumnsWithInAcademiesImpairments(String arg0) {
        academies_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, FreeholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, LeaseholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, LeaseholdImprovements,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(ChargedInPeriod, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Charged in period and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowChargedInPeriodAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(ChargedInPeriod,Total),arg0);
    }

    @And("^I enter value in row Released in period and al columns with \"([^\"]*)\"in Academies Impairments$")
    public void iEnterValueInRowReleasedInPeriodAndAlColumnsWithInAcademiesImpairments(String arg0) {
        academies_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, FreeholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, LeaseholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, LeaseholdImprovements,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(ReleasedInPeriod, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Released in Period and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowReleasedInPeriodAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(ReleasedInPeriod,Total),arg0);
    }

    @And("^I enter value in row Transferred out on existing Academies leaving the Trust and al columns with \"([^\"]*)\"in Academies Impairments$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAlColumnsWithInAcademiesImpairments(String arg0) {
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, FreeholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, LeaseholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, LeaseholdImprovements,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Transferred out on existing Academies leaving the Trust and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @And("^I enter value in row Transferred in on existing Academies leaving the Trust and al columns with \"([^\"]*)\"in Academies Impairments$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesLeavingTheTrustAndAlColumnsWithInAcademiesImpairments(String arg0) {
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesLeavingTheTrust, FreeholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesLeavingTheTrust, LeaseholdLandAndBuildings,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesLeavingTheTrust, LeaseholdImprovements,arg0);
        academies_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesLeavingTheTrust, AssetUnderContruction,arg0);
    }

    @Then("^I see the value in row Transferred in on existing Academies leaving the Trust and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowTransferredInOnExistingAcademiesLeavingTheTrustAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(TransferredInOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @Then("^I see the value in row At Close of period and all columns is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndAllColumnsIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,AssetUnderContruction),arg0);
    }

    @Then("^I see the value in row At Close of period and column Total is \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndColumnTotalIsInAcademiesImpairments(String arg0) {
        hardAssertion.assertEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,Total),arg0);
    }

    @Then("^I see the value in row Original prior year closing balance and column Total is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAndColumnTotalIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(OriginalPriorYearClosingBalance,Total),arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Total is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(AdjustmentMadeToOpeningBalance,Total),arg0);
    }

    @Then("^I see the value in row Charged in period and column Total is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowChargedInPeriodAndColumnTotalIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(ChargedInPeriod,Total),arg0);
    }

    @Then("^I see the value in row Released in Period and column Total is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowReleasedInPeriodAndColumnTotalIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(ReleasedInPeriod,Total),arg0);
    }

    @Then("^I see the value in row Transferred in on existing Academies leaving the Trust and column Total is NOT\"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowTransferredInOnExistingAcademiesLeavingTheTrustAndColumnTotalIsNOTInAcademiesImpairments(String arg0)  {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(TransferredInOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @Then("^I see the value in row Transferred out on existing Academies leaving the Trust and column Total is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust,Total),arg0);
    }

    @Then("^I see the value in row At Close of period and all columns is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndAllColumnsIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,FreeholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,LeaseholdImprovements),arg0);
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,AssetUnderContruction),arg0);
    }

    @Then("^I see the value in row At Close of period and column Total is NOT \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndColumnTotalIsNOTInAcademiesImpairments(String arg0) {
        hardAssertion.assertNotEquals(academies_impairments.getValueByRowNameAndColumnName(AtCloseOfPeriod,Total),arg0);
    }
}
