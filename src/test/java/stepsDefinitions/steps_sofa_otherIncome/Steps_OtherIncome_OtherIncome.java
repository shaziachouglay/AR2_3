package stepsDefinitions.steps_sofa_otherIncome;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.otherIncome.OtherIncome_OtherIncome;


public class Steps_OtherIncome_OtherIncome extends BaseTest {

    @When("^I navigate to the Other Income Page$")
    public void iNavigateToTheOtherIncomePage() {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.OtherIncome, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.OtherIncome);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(otherIncome_otherIncome.isHeaderPresentAndDisplayedForOtherIncomeOtherIncomePage());
    }

    @And("^I enter the value in Academies with \"([^\"]*)\"$")
    public void iEnterTheValueInAcademiesWith(String arg0) {
    otherIncome_otherIncome.setValueInInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.Academies,arg0);
    }

    @And("^I enter the value in Government Sources - Non Grant with \"([^\"]*)\"$")
    public void iEnterTheValueInGovernmentSourcesNonGrantWith(String arg0) {
    otherIncome_otherIncome.setValueInInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.GovernmentSourcesNonGrant,arg0);
    }

    @And("^I enter the value inNon-Government Revenue with \"([^\"]*)\"$")
    public void iEnterTheValueInNonGovernmentRevenueWith(String arg0) {
        otherIncome_otherIncome.setValueInInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.NonGovernmentRevenue,arg0);
    }

    @Then("^I can see the Total field is now \"([^\"]*)\"$")
    public void iCanSeeTheTotalFieldIsNow(String arg0) {
        hardAssertion.assertEquals(otherIncome_otherIncome.getValueFromInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.Total),arg0);
    }

    @Then("^I can see the Total field is NOT \"([^\"]*)\"$")
    public void iCanSeeTheTotalFieldIsNOT(String arg0) {
        hardAssertion.assertEquals(otherIncome_otherIncome.getValueFromInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.Total),arg0);
    }

    @And("^I enter the value in Notional Apprenticeship Levy Income with \"([^\"]*)\"$")
    public void iEnterTheValueInNotionalApprenticeshipLevyIncomeWith(String arg0) {
        otherIncome_otherIncome.setValueInInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.NotionalApprenticeshipLevyIncome,arg0);
    }

    @And("^I enter value in field Investmen income Interest with \"([^\"]*)\" in Other Income$")
    public void iEnterValueInFieldInvestmenIncomeInterestWithInOtherIncome(String arg0) {
        otherIncome_otherIncome.setValueInInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.InvestmentIncomeInterest,arg0);
    }

    @Then("^I can see the Total field is NOT \"([^\"]*)\" in Other Income page$")
    public void iCanSeeTheTotalFieldIsNOTInOtherIncomePage(String arg0) {
        hardAssertion.assertNotEquals(otherIncome_otherIncome.getValueFromInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncome_OtherIncome.OtherIncomeLabelNames.Total),arg0);
    }
}
