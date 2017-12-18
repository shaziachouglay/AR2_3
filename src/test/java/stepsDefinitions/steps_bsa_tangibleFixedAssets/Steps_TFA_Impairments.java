package stepsDefinitions.steps_bsa_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetAssets.tangibleFixedAssets.TFA_Impairments;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_TFA_Impairments extends BaseTest {
    @And("^I navigate to BSA Tangible Fixed Assets Impairments page$")
    public void iNavigateToBSATangibleFixedAssetsImpairmentsPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.TangibleFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.Imparments);
        hardAssertion.assertTrue(tfa_impairments.isPageHeaderPresentAndDisplayedInTFAImpairmentPage(), "Failed to display the Header for TFA Impairments page");
    }

    @And("^I enter value in row Original prior year closing balance  and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.FreeholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.LeaseholdImprovements,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.PlantAndMachinery,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.FurnitureAndEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.ComputerEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.MotorVehicles,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I see value in row Original prior year closing balance  and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowOriginalPriorYearClosingBalanceAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.OriginalPriorYearClosingBalance, TFA_Impairments.columnName.Total),arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.FreeholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.LeaseholdImprovements,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.PlantAndMachinery,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.FurnitureAndEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.ComputerEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.MotorVehicles,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.AssetsUnderConstruction,arg0);
    }

    @Then("^I see value in row Adjustments made to opening balance and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.AdjustmentsMadeToOpeningBalance, TFA_Impairments.columnName.Total),arg0);
    }

    @And("^I enter value in row Charged in period and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iEnterValueInRowChargedInPeriodAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.FreeholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.LeaseholdImprovements,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.PlantAndMachinery,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.FurnitureAndEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.ComputerEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.MotorVehicles,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.AssetsUnderConstruction,arg0);
    }

    @Then("^I see value in row Charged in period and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowChargedInPeriodAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ChargedInPeriod, TFA_Impairments.columnName.Total),arg0);
    }

    @And("^I enter value in row Released in period and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.FreeholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.LeaseholdImprovements,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.PlantAndMachinery,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.FurnitureAndEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.ComputerEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.MotorVehicles,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.AssetsUnderConstruction,arg0);
    }

    @Then("^I see value in row Released in period and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowReleasedInPeriodAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ReleasedInPeriod, TFA_Impairments.columnName.Total),arg0);
    }

    @And("^I enter value in row Transferred in on existing Academies joining the Trust and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.FreeholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.LeaseholdImprovements,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.PlantAndMachinery,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.FurnitureAndEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.ComputerEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.MotorVehicles,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.AssetsUnderConstruction,arg0);
    }

    @Then("^I see value in row Transferred in on existing Academies joining the Trust and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Impairments.columnName.Total),arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.FreeholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.LeaseholdImprovements,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.PlantAndMachinery,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.FurnitureAndEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.ComputerEquipment,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.MotorVehicles,arg0);
        tfa_impairments.setValueByRowNameAndColumnNameInImpairmentPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.AssetsUnderConstruction,arg0);
    }

    @Then("^I see value in row Transferred out on existing academies leaving the trust and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Impairments.columnName.Total),arg0);
    }

    @And("^I see value in row Closing Balance and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowClosingBalanceAndColumnsInBSATFAImpairmentsPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.PlantAndMachinery),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.FurnitureAndEquipment),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.ComputerEquipment),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.MotorVehicles),arg0);
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.AssetsUnderConstruction),arg0);

    }

    @Then("^I see value in row Closing Balance and column total as \"([^\"]*)\" in BSA TFA Impairments page$")
    public void iSeeValueInRowClosingBalanceAndColumnTotalAsInBSATFAImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(tfa_impairments.getValueByRowNameAndColumnNameInTFAImpairmentsPage(TFA_Impairments.rowName.ClosingBalance, TFA_Impairments.columnName.Total),arg0);
    }
}
