package stepsDefinitions.steps_bsa_intangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.balanceSheetAssets.intangibleFixedAssets.IFA_AmortisationPeriods;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_IFA_AmortiationPeriods extends BaseTest{


    @And("^I navigate to BSA Intangible Fixed Assets Amortisation Periods page$")
    public void iNavigateToBSAIntangibleFixedAssetsAmortisationPeriodsPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.IntangibelFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.AmortisationPeriods);
        hardAssertion.assertTrue(ifa_amortisationPeriods.isPageHeaderPresentAndDisplayedInIFAAmortisationPeriodsPage(), "Failed to display the Header for IFA Amortisation Periods page");
    }

    @And("^I enter in row Single period or minimum of range  and columns with  \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInRowSinglePeriodOrMinimumOfRangeAndColumnsWithAnd(String arg0, String arg1) {
        ifa_amortisationPeriods.setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(IFA_AmortisationPeriods.rowName.SinglePeriodObjectOrMinimumOfRange, IFA_AmortisationPeriods.columnName.Software,arg0);
        ifa_amortisationPeriods.setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(IFA_AmortisationPeriods.rowName.SinglePeriodObjectOrMinimumOfRange, IFA_AmortisationPeriods.columnName.Other,arg0);
    }

    @And("^I enter in row Maximum of range and columns with  \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInRowMaximumOfRangeAndColumnsWithAnd(String arg0, String arg1) {
        ifa_amortisationPeriods.setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(IFA_AmortisationPeriods.rowName.MaximumOfRange, IFA_AmortisationPeriods.columnName.Software,arg0);
        ifa_amortisationPeriods.setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(IFA_AmortisationPeriods.rowName.MaximumOfRange, IFA_AmortisationPeriods.columnName.Other,arg0);
    }

    @And("^I enter in row Reducing balance rate and columns with  \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInRowReducingBalanceRateAndColumnsWithAnd(String arg0, String arg1) {
        ifa_amortisationPeriods.setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(IFA_AmortisationPeriods.rowName.ReducingBalanceRate, IFA_AmortisationPeriods.columnName.Software,arg0);
        ifa_amortisationPeriods.setValueByRowNameAndColumnNameInIFAAmortisationPeriodsPage(IFA_AmortisationPeriods.rowName.ReducingBalanceRate, IFA_AmortisationPeriods.columnName.Other,arg0);
    }
}
