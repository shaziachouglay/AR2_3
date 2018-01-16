package stepsDefinitions.steps_auc_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.assetUnderConstruction.auc_TangibleFixedAssets.AUC_TFA_Impairments;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.assetUnderConstruction.auc_TangibleFixedAssets.AUC_TFA_Impairments.RowConstants.*;

public class Steps_auc_tfa_impairments extends BaseTest {
    @When("^I navigate to Asset Under Construction Tangible Fixed Assets Impairments page$")
    public void iNavigateToAssetUnderConstructionTangibleFixedAssetsImpairmentsPage() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.TangibelFixedAssets);
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.TangibelFixedAssets, NavigationMenuBar.AUC_TAB_SUBMENU_OPTIONS.Imparments);
        hardAssertion.assertTrue(auc_tfa_impairments.isHeaderPresentAndDisplayed(), "Failed to display the Header for AUC TFA Impairments page");
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with \"([^\"]*)\" Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings, arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings, arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements, arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery, arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment, arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment, arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnAUCWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction, arg0);
    }

    @Then("^I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.Total), arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Freehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings, arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings, arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements, arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery, arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment, arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment, arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnAUCWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction, arg0);
    }

    @Then("^I must see the row Adjustments made to opening balance and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.Total), arg0);
    }

    @And("^I enter value in row Charged in period and column Freehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings, arg0);
    }

    @And("^I enter value in row Charged in period and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings, arg0);
    }

    @And("^I enter value in row Charged in period and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements, arg0);
    }

    @And("^I enter value in row Charged in period and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery, arg0);
    }

    @And("^I enter value in row Charged in period and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment, arg0);
    }

    @And("^I enter value in row Charged in period and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment, arg0);
    }

    @And("^I enter value in row Charged in period and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowChargedInPeriodAndColumnAUCWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction, arg0);
    }

    @Then("^I must see the row Charged in period and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowChargedInPeriodAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.Total), arg0);
    }

    @And("^I enter value in row Released in period and column Freehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Released in period and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Released in period and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements,arg0);
    }

    @And("^I enter value in row Released in period and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery,arg0);
    }

    @And("^I enter value in row Released in period and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment,arg0);
    }

    @And("^I enter value in row Released in period and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment,arg0);
    }

    @And("^I enter value in row Released in period and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowReleasedInPeriodAndColumnAUCWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction,arg0);
    }

    @Then("^I must see the row Released in period and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowReleasedInPeriodAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements,arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery,arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment,arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment,arg0);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnAUCWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction,arg0);
    }

    @Then("^I must see the row Transferred in on existing academies joining the trust and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements,arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery,arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment,arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment,arg0);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnAUCWithImpairmentsPage(String arg0) {
        auc_tfa_impairments.setValueInFieldByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction,arg0);
    }

    @Then("^I must see the row Transferred out on existing academies leaving the trust and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Total closing balance and column Freehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnFreeholdLandAndBuildingWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings),arg0);
    }

    @Then("^I see value in row Total closing balance and column Leasehold Land and Building with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnLeaseholdLandAndBuildingWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings),arg0);
    }

    @Then("^I see value in row Total closing balance and column Leasehold Improvements with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnLeaseholdImprovementsWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements),arg0);
    }

    @Then("^I see value in row Total closing balance and column Plant and Machinery with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnPlantAndMachineryWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery),arg0);
    }

    @Then("^I see value in row Total closing balance and column Furniture and Equipment with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnFurnitureAndEquipmentWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment),arg0);
    }

    @Then("^I see value in row Total closing balance and column Computer Equipment with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnComputerEquipmentWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment),arg0);
    }

    @Then("^I see value in row Total closing balance and column AUC with \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnAUCWithImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction),arg0);
    }

    @Then("^I must see the row Total closing balance and column Total is \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowTotalClosingBalanceAndColumnTotalIsImpairmentsPage(String arg0) {
        hardAssertion.assertEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is not \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnTotalIsNotImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Impairments.ColumnConstant.Total), arg0);
    }

    @Then("^I must see the row Adjustments made to opening balance and column Total is not \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsNotImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Impairments.ColumnConstant.Total), arg0);
    }

    @Then("^I must see the row Charged in period and column Total is not \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowChargedInPeriodAndColumnTotalIsNotImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(AUC_TFA_Impairments.RowConstants.ChargedInPeriod, AUC_TFA_Impairments.ColumnConstant.Total), arg0);
    }

    @Then("^I must see the row Released in period and column Total is not \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowReleasedInPeriodAndColumnTotalIsNotImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(RelasedInPeriod, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the row Transferred in on existing academies joining the trust and column Total is not \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIsNotImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @Then("^I must see the row Transferred out on existing academies leaving the trust and column Total is not \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsNotImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }

    @Then("^I see value in row Total closing balance and column Freehold Land and Building is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnFreeholdLandAndBuildingIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.FreeholdLandAndBuildings),arg0);
    }

    @Then("^I see value in row Total closing balance and column Leasehold Land and Building is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnLeaseholdLandAndBuildingIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.LeaseholdLandAndBuildings),arg0);
    }

    @Then("^I see value in row Total closing balance and column Leasehold Improvements is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnLeaseholdImprovementsIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.LeaseholdImprovements),arg0);
    }

    @Then("^I see value in row Total closing balance and column Plant and Machinery is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnPlantAndMachineryIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.PlantAndMachinery),arg0);
    }

    @Then("^I see value in row Total closing balance and column Furniture and Equipment is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnFurnitureAndEquipmentIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.FurnitureAndEquipment),arg0);
    }

    @Then("^I see value in row Total closing balance and column Computer Equipment is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnComputerEquipmentIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.ComputerEquipment),arg0);
    }

    @Then("^I see value in row Total closing balance and column AUC is NOT  \"([^\"]*)\"Impairments Page$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnAUCIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.AssetUnderConstruction),arg0);
    }

    @Then("^I must see the row Total closing balance and column Total is NOT \"([^\"]*)\"Impairments Page$")
    public void iMustSeeTheRowTotalClosingBalanceAndColumnTotalIsNOTImpairmentsPage(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_impairments.getValueByRowNameAndColumnName(TotalClosingBalance, AUC_TFA_Impairments.ColumnConstant.Total),arg0);
    }
}