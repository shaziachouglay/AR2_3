package stepsDefinitions.steps_sofa_revenueGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.revenueGrants.RevenueGrantsOther;


public class Steps_RevenueGrantsOther extends BaseTest {

    @When("^I navigate to the Other Revenue Grants page$")
    public void iNavigateToTheOtherRevenueGrantsPage() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.RevenueGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.Other);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(revenueGrantsOther.isHeaderPresentAndDisplayedForRevenueGrantsOtherPage());
    }

    @And("^I enter the value in Local Authority- Special Educational Needs with \"([^\"]*)\"$")
    public void iEnterTheValueInLocalAuthoritySpecialEducationalNeedsWith(String arg0) throws Throwable {
        revenueGrantsOther.setValueInInputFieldByFiedsetNameInOtherRevenueGranstsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.LocalAuthoritySpecialEducationalNeeds , arg0);
    }

    @And("^I enter the value in Local Authority-Early Years with \"([^\"]*)\"$")
    public void iEnterTheValueInLocalAuthorityEarlyYearsWith(String arg0) throws Throwable {
        revenueGrantsOther.setValueInInputFieldByFiedsetNameInOtherRevenueGranstsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.LocalAuthorityEarlyYears , arg0);
    }

    @And("^I enter the value in Other Local Authority Revenue Grants with \"([^\"]*)\"$")
    public void iEnterTheValueInOtherLocalAuthorityRevenueGrantsWith(String arg0) throws Throwable {
        revenueGrantsOther.setValueInInputFieldByFiedsetNameInOtherRevenueGranstsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.OtherLocalAuthorityRevenueGrants , arg0);
    }

    @And("^I enter the value in Other Government Revenue Grants with \"([^\"]*)\"$")
    public void iEnterTheValueInOtherGovernmentRevenueGrantsWith(String arg0) throws Throwable {
        revenueGrantsOther.setValueInInputFieldByFiedsetNameInOtherRevenueGranstsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.OtherGovernmentRevenueGrants, arg0);
    }

    @And("^I enter the value in Non-Government-Revenue Grants with \"([^\"]*)\"$")
    public void iEnterTheValueInNonGovernmentRevenueGrantsWith(String arg0) throws Throwable {
        revenueGrantsOther.setValueInInputFieldByFiedsetNameInOtherRevenueGranstsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.NonGovernmentRevenueGrants , arg0);
    }

    @And("^I see the totals field is now populated with \"([^\"]*)\"$")
    public void iSeeTheTotalsFieldIsNowPopulatedWith(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,revenueGrantsOther.getValueFromFieldByFieldsetInOtherRevenueGrantsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.Total));
    }

    @And("^I see the totals field is NOT populated with \"([^\"]*)\"$")
    public void iSeeTheTotalsFieldIsNOTPopulatedWith(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,revenueGrantsOther.getValueFromFieldByFieldsetInOtherRevenueGrantsPage(RevenueGrantsOther.RevenueGrantsOtherLabelConstants.Total));
    }
}
