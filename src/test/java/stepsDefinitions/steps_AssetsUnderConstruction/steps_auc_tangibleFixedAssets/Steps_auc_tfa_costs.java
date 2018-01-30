package stepsDefinitions.steps_AssetsUnderConstruction.steps_auc_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.assetUnderConstruction.auc_TangibleFixedAssets.AUC_TFA_Cost;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_auc_tfa_costs extends BaseTest{


    @When("^I navigate to Asset Under Construction Tangible Fixed Assets Cost page$")
    public void iNavigateToAssetUnderConstructionTangibleFixedAssetsCostPage() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.TangibelFixedAssets);
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.TangibelFixedAssets, NavigationMenuBar.AUC_TAB_SUBMENU_OPTIONS.Cost );
        hardAssertion.assertTrue(auc_tfa_cost.isHeaderPresentAndDisplayedForAUC_CostPage(), "Failed to display the Header for AUC TFA Cost page");
    }


    @And("^I enter in row Original prior year closing balance as submitted in the Accounts Return and all columns with \"([^\"]*)\"$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Original prior year closing balance as submitted in the Accounts Return and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Adjustments made to opening balance and all columns with \"([^\"]*)\"$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Additions funded from Free Schools Priority Schools Building programme and all columns with \"([^\"]*)\"$")
    public void iEnterInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Additions funded from Free Schools Priority Schools Building programme and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Additions funded from other DFEESFA capital grant and all columns with \"([^\"]*)\"$")
    public void iEnterInRowAdditionsFundedFromOtherDFEESFACapitalGrantAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Additions funded from other DFEESFA capital grant and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdditionsFundedFromOtherDFEESFACapitalGrantAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Additions Others and all columns with \"([^\"]*)\"$")
    public void iEnterInRowAdditionsOthersAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Additions Others and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdditionsOthersAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Transferred in on conversion local authority and all columns with \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnConversionLocalAuthorityAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred in on conversion local authority and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredInOnConversionLocalAuthorityAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Transferred in on conversion elsewhere and all columns with \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnConversionElsewhereAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred in on conversion elsewhere and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredInOnConversionElsewhereAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredInOnConversionElsewhere, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Transferred in on existing academies joining the trust and all columns with \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnExistingAcademiesJoiningTheTrustAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred in on existing academies joining the trust and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Transferred out on existing academies leaving the trust and all columns with \"([^\"]*)\"$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred out on existing academies leaving the trust and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Donations DFEESFA and all columns with \"([^\"]*)\"$")
    public void iEnterInRowDonationsDFEESFAAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Donations DFEESFA and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowDonationsDFEESFAAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Donations Non DFEESFA and all columns with \"([^\"]*)\"$")
    public void iEnterInRowDonationsNonDFEESFAAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Donations Non DFEESFA and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowDonationsNonDFEESFAAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Disposals and all columns with \"([^\"]*)\"$")
    public void iEnterInRowDisposalsAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Disposals and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowDisposalsAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Revaluations and all columns with \"([^\"]*)\"$")
    public void iEnterInRowRevaluationsAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Revaluations and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowRevaluationsAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter in row Reclassifications and all columns with \"([^\"]*)\"$")
    public void iEnterInRowReclassificationsAndAllColumnsWith(String arg0) {
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.ComputerEquipment,arg0);
        auc_tfa_cost.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Reclassifications and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowReclassificationsAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see in row Total closing balance and all columns with \"([^\"]*)\"$")
    public void iSeeInRowTotalClosingBalanceAndAllColumnsWith(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery),arg0);
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment),arg0);
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.ComputerEquipment),arg0);
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction),arg0);
    }

    @Then("^I see the value in row Total closing balance and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalClosingBalanceAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Original prior year closing balance as submitted in the Accounts Return and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturnAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdjustmentMadeToOpeningBalance, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Additions funded from Free Schools Priority Schools Building programme and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Additions funded from other DFEESFA capital grant and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdditionsFundedFromOtherDFEESFACapitalGrantAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Additions Others and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowAdditionsOthersAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.AdditionsOther, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred in on conversion local authority and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredInOnConversionLocalAuthorityAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred in on conversion elsewhere and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredInOnConversionElsewhereAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredInOnConversionLocalAuthority, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred in on existing academies joining the trust and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred out on existing academies leaving the trust and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Donations DFEESFA and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowDonationsDFEESFAAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.DonationDFEESFA, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Donations Non DFEESFA and column Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowDonationsNonDFEESFAAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.DonationsNonDFEESFA, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Disposals and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowDisposalsAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.Disposals, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Revaluations and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowRevaluationsAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.Revaluations, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Reclassifications and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowReclassificationsAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.Reclassifications, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Total closing balance and column Total is not\"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalClosingBalanceAndColumnTotalIsNot(String arg0) {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see in row Total closing balance and all columns are not  \"([^\"]*)\"$")
    public void iSeeInRowTotalClosingBalanceAndAllColumnsAreNot(String arg0)  {
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.LeaseholdImprovements),arg0);
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.PlantAndMachinery),arg0);
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.FurnitureAndEquipment),arg0);
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.ComputerEquipment),arg0);
        hardAssertion.assertNotEquals(auc_tfa_cost.getValueByRowNameAndColumnName(AUC_TFA_Cost.RowConstants.TotalClosingBalance, AUC_TFA_Cost.ColumnConstant.AssetsUnderConstruction),arg0);
    }
}
