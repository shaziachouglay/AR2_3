package stepsDefinitions.steps_bsa_tangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.balanceSheetAssets.tangibleFixedAssets.TFA_DepriciationPeriodsPerAccountingPolicies;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_TFA_DepriciationPeriodsPerAccountingPolicies extends BaseTest {
    @And("^I navigate to BSA Tangible Fixed Assets Depreciation periods per accounting policies page$")
    public void iNavigateToBSATangibleFixedAssetsDepreciationPeriodsPerAccountingPoliciesPage(){

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.TangibleFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.DepriciationPeriodsPerAcountingPolicies);
        hardAssertion.assertTrue(tfa_depriciationPeriodsPerAccountingPolicies.isPageHeaderPresentAndDisplayedInTFADepreciationPeriodsPerAccountingPoliciesPage(), "Failed to display the Header for TFA Depreciation Periods Per Acounting Policies page");

    }

    @And("^I enter in row Single period or minimum of range  and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Depriciation periods per accounting policies page$")
    public void iEnterInRowSinglePeriodOrMinimumOfRangeAndColumnsInBSATFADepriciationPeriodsPerAccountingPoliciesPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6){
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.LeaseholdImprovements,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.PlantAndMachinery,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.ComputerEquipment,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.SinglePeriodOrMinimumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.MotorVehicles,arg0);

    }

    @And("^I enter in row Maximum of range and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Depriciation periods per accounting policies page$")
    public void iEnterInRowMaximumOfRangeAndColumnsInBSATFADepriciationPeriodsPerAccountingPoliciesPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6){
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.LeaseholdImprovements,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.PlantAndMachinery,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.ComputerEquipment,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.MaximumOfRange, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.MotorVehicles,arg0);
    }

    @And("^I enter in row Reducing balance rate and columns \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in BSA TFA Depriciation periods per accounting policies page$")
    public void iEnterInRowReducingBalanceRateAndColumnsInBSATFADepriciationPeriodsPerAccountingPoliciesPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6){
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.FreeholdLandAndBuildings,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.LeaseholdLandAndBuildings,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.LeaseholdImprovements,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.PlantAndMachinery,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.FurnitureAndEquipment,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.ComputerEquipment,arg0);
        tfa_depriciationPeriodsPerAccountingPolicies.setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(TFA_DepriciationPeriodsPerAccountingPolicies.rowName.ReducingBalanceRate, TFA_DepriciationPeriodsPerAccountingPolicies.columnName.MotorVehicles,arg0);
    }
}
