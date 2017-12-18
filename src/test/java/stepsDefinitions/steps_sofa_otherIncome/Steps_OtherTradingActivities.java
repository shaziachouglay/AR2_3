package stepsDefinitions.steps_sofa_otherIncome;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.otherIncome.OtherIncome_OtherTradingActivities;

/**
 * Created by Aniket Wadkar on 12/06/2017.
 */
public class Steps_OtherTradingActivities extends BaseTest {

    @And("^I have navigated to Other Trading Activities section$")
    public void iHaveNavigatedToOtherTradingActivitiesSection() {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.OtherIncome, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.OtherTrading);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(otherIncome_otherTradingActivities.isHeaderPresentAndDisplayedForOtherIncomeOtherTradingActivitiesPage());
    }

    @And("^I enter value in field Hire of Facilities with \"([^\"]*)\"$")
    public void iEnterValueInFieldHireOfFacilitiesWith(String arg0) {
    otherIncome_otherTradingActivities.setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.HireOfFacilities,arg0);
    }

    @And("^I enter value in field Catering Income with \"([^\"]*)\"$")
    public void iEnterValueInFieldCateringIncomeWith(String arg0) {
        otherIncome_otherTradingActivities.setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.CateringIncome,arg0);
    }

    @And("^I enter value in field rental Income with \"([^\"]*)\"$")
    public void iEnterValueInFieldRentalIncomeWith(String arg0) {
        otherIncome_otherTradingActivities.setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.RentalIncome,arg0);
    }

    @And("^I enter value in field Recieipts from Supply Teacher Insurance Claims with \"([^\"]*)\"$")
    public void iEnterValueInFieldRecieiptsFromSupplyTeacherInsuranceClaimsWith(String arg0) {
        otherIncome_otherTradingActivities.setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.ReceiptsFromSupplyTeacherInsuranceClaims,arg0);
    }

    @And("^I enter value in field risk Protection Arrangements Claims with \"([^\"]*)\"$")
    public void iEnterValueInFieldRiskProtectionArrangementsClaimsWith(String arg0) {
        otherIncome_otherTradingActivities.setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.RiskProtectionArrangementClaims,arg0);
    }

    @And("^I enter value in field Others with \"([^\"]*)\"$")
    public void iEnterValueInFieldOthersWith(String arg0) {
        otherIncome_otherTradingActivities.setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.Other,arg0);
    }

    @Then("^I see value in field Total is now \"([^\"]*)\" in Other Trading Activities page$")
    public void iSeeValueInFieldTotalIsNowInOtherTradingActivitiesPage(String arg0) {
        hardAssertion.assertEquals(otherIncome_otherTradingActivities.getValueFromInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.Total),arg0);
    }

    @Then("^I see value in field Total is NOT \"([^\"]*)\" in Other Trading Activities page$")
    public void iSeeValueInFieldTotalIsNOTInOtherTradingActivitiesPage(String arg0) {
        hardAssertion.assertNotEquals(otherIncome_otherTradingActivities.getValueFromInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherIncome_OtherTradingActivities.OtherTradingActivitiesLabelConstants.Total),arg0);
    }
}
