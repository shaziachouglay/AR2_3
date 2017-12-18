package stepsDefinitions.steps_sofa_capitalGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.sofa.capitalGrants.CapitalGrantsOther.CapitalGrantsOtherLabelConstants.*;


public class Steps_CapitalGrantsOther extends BaseTest {

    @When("^I navigate to Other Capital Grants page$")
    public void iNavigateToOtherCapitalGrantsPage() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.CapitalGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.Other);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(otherCapitalGrants.isHeaderPresentAndDisplayedForCapitalOtherPage(), "Failed to display the Header for Capital Grants Other page");
    }
    @And("^I have navigated to the Other page$")
    public void iHaveNavigatedToTheOtherPage() throws Throwable {
//        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.CapitalGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.Other);
//        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
//        hardAssertion.assertTrue(otherCapitalGrants.isHeaderPresentAndDisplayedForCapitalOtherPage(), "Failed to display the Header for Capital Grants Other page");

    }
    @And("^I enter value in Local Authority Capital Grant with \"([^\"]*)\"$")
    public void iEnterValueInLocalAuthorityCapitalGrantWith(String arg0) throws Throwable {
            otherCapitalGrants.setValueInInputFieldByFiedsetNameInOtherCapitalGranstsPage(LocalAuthorityCapitalGrants, arg0);
    }

    @And("^I enter value in Other Government Capital Grants with \"([^\"]*)\"$")
    public void iEnterValueInOtherGovernmentCapitalGrantsWith(String arg0) throws Throwable {
            otherCapitalGrants.setValueInInputFieldByFiedsetNameInOtherCapitalGranstsPage(OtherGovernmentCapitalGrants , arg0);
    }

    @And("^I enter value in Non-Government Capital Grants with \"([^\"]*)\"$")
    public void iEnterValueInNonGovernmentCapitalGrantsWith(String arg0) throws Throwable {
        otherCapitalGrants.setValueInInputFieldByFiedsetNameInOtherCapitalGranstsPage(NonGovernmentCapitalGrants , arg0);
    }

    @Then("^I can see the value populated in the Total field to be \"([^\"]*)\"$")
    public void iCanSeeTheValuePopulatedInTheTotalFieldToBe(String arg0) throws Throwable {
        Assert.assertEquals(arg0,otherCapitalGrants.getValueFromFieldByFieldsetInOtherCapitalGrantsPage(Total));
    }

    @Then("^I can see the value populated in the Total field is NOT \"([^\"]*)\"$")
    public void iCanSeeTheValuePopulatedInTheTotalFieldIsNOT(String arg0) throws Throwable {
        Assert.assertNotEquals(arg0,otherCapitalGrants.getValueFromFieldByFieldsetInOtherCapitalGrantsPage(Total));
    }
}
