package stepsDefinitions.steps_bsa_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetAssets.tangibleFixedAssets.TFA_Cost;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_TFA_Cost extends BaseTest{
    @And("^I navigate to BSA Tangible Fixed Assets Cost page$")
    public void iNavigateToBSATangibleFixedAssetsCostPage()  {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.TangibleFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.Cost);
        hardAssertion.assertTrue(tfa_cost.isPageHeaderPresentAndDisplayedInTFACostPage(), "Failed to display the Header for TFA Cost page");
    }

    @And("^I enter in row Original prior year closing balance  and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Original prior year closing balance is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowOriginalPriorYearClosingBalanceIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Adjustments made to opening balance and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Adjustments made to opening balance is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdjustmentsMadeToOpeningBalanceIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Additions funded from Free Schools Priority Schools Building programme and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Additions funded from Free Schools Priority Schools Building programme is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Additions funded from other DFE and ESFA EFA capital grant and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowAdditionsFundedFromOtherDFEAndESFAEFACapitalGrantAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Additions funded from other DFE and ESFA EFA capital grant is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdditionsFundedFromOtherDFEAndESFAEFACapitalGrantIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Additions Other and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowAdditionsOtherAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Additions Other is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdditionsOtherIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred in on conversion local authority and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowTransferredInOnConversionLocalAuthorityAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.AssetsUnderConstruction,arg0);


    }

    @Then("^I must see the total for row Transferred in on conversion local authority is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredInOnConversionLocalAuthorityIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred in on conversion elsewhere and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowTransferredInOnConversionElsewhereAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Transferred in on conversion elsewhere is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredInOnConversionElsewhereIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred in on existing academies joining the trust and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Transferred in on existing academies joining the trust is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredInOnExistingAcademiesJoiningTheTrustIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Transferred out on existing academies leaving the trust and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Transferred out on existing academies leaving the trust is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredOutOnExistingAcademiesLeavingTheTrustIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Donations DFEESFA and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowDonationsDFEESFAAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Donations DFEESFA is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowDonationsDFEESFAIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Donations non DFEESFA and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowDonationsNonDFEESFAAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Donations non DFEESFA is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowDonationsNonDFEESFAIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Disposals and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowDisposalsAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Disposals is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowDisposalsIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Revaluations and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowRevaluationsAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Revaluations is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowRevaluationsIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I enter in row Reclassifications and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iEnterInRowReclassificationsAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.FreeholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.LeaseholdImprovements,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.PlantAndMachinery,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.FurnitureAndEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.ComputerEquipment,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.MotorVehicles,arg0);
        tfa_cost.setValueInFieldByRowNameAndColumnNameInTFACostpage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.AssetsUnderConstruction,arg0);

    }

    @Then("^I must see the total for row Reclassifications is \"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowReclassificationsIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I see  row At Close of Period and column values  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iSeeRowAtCloseOfPeriodAndColumnValuesInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.PlantAndMachinery),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.FurnitureAndEquipment),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.ComputerEquipment),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.MotorVehicles),arg0);
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.AssetsUnderConstruction),arg0);

    }

    @Then("^I see the total for row At Close of Period is \"([^\"]*)\" in Cost page$")
    public void iSeeTheTotalForRowAtCloseOfPeriodIsInCostPage(String arg0)  {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Original prior year closing balance is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowOriginalPriorYearClosingBalanceIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.OriginalPriorYearClosingBalance, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Adjustments made to opening balance is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdjustmentsMadeToOpeningBalanceIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Additions funded from Free Schools Priority Schools Building programme is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Additions funded from other DFE and ESFA EFA capital grant is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdditionsFundedFromOtherDFEAndESFAEFACapitalGrantIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdditionsFundedFromOtherDFEAndESFACapitalGrant, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Additions Other is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowAdditionsOtherIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AdditionsOther, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Transferred in on conversion local authority is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredInOnConversionLocalAuthorityIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredInOnConversionLocalAuthority, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Transferred in on conversion elsewhere is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredInOnConversionElsewhereIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredInOnConversionElsewhere, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Transferred in on existing academies joining the trust is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredInOnExistingAcademiesJoiningTheTrustIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Transferred out on existing academies leaving the trust is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowTransferredOutOnExistingAcademiesLeavingTheTrustIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Donations DFEESFA is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowDonationsDFEESFAIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.DonationsDFEAndESFAEFA, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Donations non DFEESFA is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowDonationsNonDFEESFAIsNOTInCostPage(String arg0) {
        hardAssertion.assertEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.DonationsNonDFEAndESFAEFA, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Disposals is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowDisposalsIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.Disposals, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Revaluations is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowRevaluationsIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.Revaluations, TFA_Cost.columnName.Total),arg0);
    }

    @Then("^I must see the total for row Reclassifications is NOT\"([^\"]*)\" in Cost page$")
    public void iMustSeeTheTotalForRowReclassificationsIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.Reclassifications, TFA_Cost.columnName.Total),arg0);
    }

    @And("^I see  row At Close of Period and column values  are NOT\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" in Cost page$")
    public void iSeeRowAtCloseOfPeriodAndColumnValuesAreNOTInCostPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.LeaseholdImprovements),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.PlantAndMachinery),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.FurnitureAndEquipment),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.ComputerEquipment),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.MotorVehicles),arg0);
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.AssetsUnderConstruction),arg0);
    }

    @Then("^I see the total for row At Close of Period is NOT\"([^\"]*)\" in Cost page$")
    public void iSeeTheTotalForRowAtCloseOfPeriodIsNOTInCostPage(String arg0) {
        hardAssertion.assertNotEquals(tfa_cost.getValueByRowNameAndColumnNameInTFACostPage(TFA_Cost.rowName.AtCloseOfPeriod, TFA_Cost.columnName.Total),arg0);
    }
}
