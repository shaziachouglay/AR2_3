package stepsDefinitions.steps_bsa_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import customExceptions.NoTextExtractedException;
import pageObjects.balanceSheetAssets.tangibleFixedAssets.TFA_Depriciation;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_TFA_Depriciation extends BaseTest{
    @And("^I navigate to BSA Tangible Fixed Assets Depreciation page$")
    public void iNavigateToBSATangibleFixedAssetsDepreciationPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.TangibleFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.Depriciation);
        hardAssertion.assertTrue(tfa_depriciation.isPageHeaderPresentAndDisplayedInTFADepreciationPage(), "Failed to display the Header for TFA Depreciation page");
    }

    @And("^I enter value in row Original prior year closing balance  and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.OriginalPriorYearClosingBalance, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Adjustments made to opening balance and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {

        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AdjustmentsMadeToOpeningBalance, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Charged in period and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowChargedInPeriodAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {

        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.ChargedInPeriod, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Eliminated on disposal and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowEliminatedOnDisposalAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.EliminatedOnDisposal, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Transferred in on existing academies joining the trust and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Transferred out on existing academies leaving the trust and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {

        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Revaluations and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowRevaluationsAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.Revaluations, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I enter value in row Reclassifications and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iEnterValueInRowReclassificationsAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {

        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.LeaseholdImprovements,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.PlantAndMachinery,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.ComputerEquipment,arg0);
        tfa_depriciation.setValueByRowNameAndColumnNameInDepriciationPage(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.MotorVehicles,arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.Reclassifications, TFA_Depriciation.columnName.Total),arg7);
    }

    @And("^I see value in row At close of period and column \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I see total column as \"([^\"]*)\" in TFA depriciation page$")
    public void iSeeValueInRowAtCloseOfPeriodAndColumnAndISeeTotalColumnAsInTFADepriciationPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws NoTextExtractedException {

        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.PlantAndMachinery),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.FurnitureAndEquipment),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.ComputerEquipment),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.MotorVehicles),arg0);
        hardAssertion.assertEquals(tfa_depriciation.getValueByRowNameAndColumnName(TFA_Depriciation.rowName.AtCloseOfPeriod, TFA_Depriciation.columnName.Total),arg7);
    }
}
