package stepsDefinitions.steps_auc_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.assetUnderConstruction.auc_TangibleFixedAssets.AUC_TFA_Depreciation;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_auc_tfa_depriciation extends BaseTest{
    @When("^I navigate to Asset Under Construction Tangible Fixed Assets Depriciaton page$")
    public void iNavigateToAssetUnderConstructionTangibleFixedAssetsDepriciatonPage() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.TangibelFixedAssets);
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.TangibelFixedAssets, NavigationMenuBar.AUC_TAB_SUBMENU_OPTIONS.Depriciation );
        hardAssertion.assertTrue(auc_tfa_depreciation.isHeaderPresentAndDisplayed(), "Failed to display the Header for AUC TFA Depreciation page");
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnFreeholdLandAndBuildingWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.FreeholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnLeaseholdLandAndBuildingWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.LeaseholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnLeaseholdImprovementsWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.LeaseholdImprovements,arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnPlantAndMachineryWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.PlantAndMachinery,arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnFurnitureAndEquipmentWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.FurnitureAndEquipment,arg0);
    }

    @And("^I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnComputerEquipmentWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.ComputerEquipment,arg0);
    }

    @Then("^I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnTotalIs(String arg0) {
    hardAssertion.assertEquals(auc_tfa_depreciation.getValueByRowNameAndColumnName(AUC_TFA_Depreciation.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Depreciation.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnFreeholdLandAndBuildingWith(String arg0) {
        auc_tfa_depreciation.setValueInFieldByRowNameAndColumnNameInAUC_TFA_DepreciationPage(AUC_TFA_Depreciation.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Depreciation.ColumnConstant.FreeholdLandAndBuildings,arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Adjustments made to opening balance and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Adjustments made to opening balance and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Adjustments made to opening balance and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Adjustments made to opening balance and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Adjustments made to opening balance and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIs(String arg0) {

    }

    @And("^I enter value in row Charged in period and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowChargedInPeriodAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Charged in period and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowChargedInPeriodAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Charged in period and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowChargedInPeriodAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Charged in period and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowChargedInPeriodAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Charged in period and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowChargedInPeriodAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Charged in period and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowChargedInPeriodAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Charged in period and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowChargedInPeriodAndColumnTotalIs(String arg0) {

    }

    @And("^I enter value in row Eliminated on disposal and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Eliminated on disposal and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Eliminated on disposal and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Eliminated on disposal and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Eliminated on disposal and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Eliminated on disposal and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Eliminated on disposal and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowEliminatedOnDisposalAndColumnTotalIs(String arg0) {

    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Transferred in on existing academies joining the trust and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIs(String arg0) {

    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Transferred out on existing academies leaving the trust and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIs(String arg0) {

    }

    @And("^I enter value in row Revaluations and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowRevaluationsAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Revaluations and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowRevaluationsAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Revaluations and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowRevaluationsAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Revaluations and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowRevaluationsAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Revaluations and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowRevaluationsAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Revaluations and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowRevaluationsAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Revaluations and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowRevaluationsAndColumnTotalIs(String arg0) {

    }

    @And("^I enter value in row Reclassifications and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowReclassificationsAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Reclassifications and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iEnterValueInRowReclassificationsAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @And("^I enter value in row Reclassifications and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iEnterValueInRowReclassificationsAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @And("^I enter value in row Reclassifications and column Plant and Machinery with \"([^\"]*)\"$")
    public void iEnterValueInRowReclassificationsAndColumnPlantAndMachineryWith(String arg0) {

    }

    @And("^I enter value in row Reclassifications and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowReclassificationsAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @And("^I enter value in row Reclassifications and column Computer Equipment with \"([^\"]*)\"$")
    public void iEnterValueInRowReclassificationsAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Reclassifications and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowReclassificationsAndColumnTotalIs(String arg0) {

    }

    @Then("^I see value in row Total closing balance and column Freehold Land and Building with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnFreeholdLandAndBuildingWith(String arg0) {

    }

    @Then("^I see value in row Total closing balance and column Leasehold Land and Building with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnLeaseholdLandAndBuildingWith(String arg0) {

    }

    @Then("^I see value in row Total closing balance and column Leasehold Improvements with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnLeaseholdImprovementsWith(String arg0) {

    }

    @Then("^I see value in row Total closing balance and column Plant and Machinery with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnPlantAndMachineryWith(String arg0) {

    }

    @Then("^I see value in row Total closing balance and column Furniture and Equipment with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnFurnitureAndEquipmentWith(String arg0) {

    }

    @Then("^I see value in row Total closing balance and column Computer Equipment with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalClosingBalanceAndColumnComputerEquipmentWith(String arg0) {

    }

    @Then("^I must see the row Total closing balance and column Total is \"([^\"]*)\"$")
    public void iMustSeeTheRowTotalClosingBalanceAndColumnTotalIs(String arg0) {

    }
}
