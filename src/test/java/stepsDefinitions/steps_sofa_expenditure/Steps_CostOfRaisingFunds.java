package stepsDefinitions.steps_sofa_expenditure;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.expenditure.CostOfRaisingFunds;


public class Steps_CostOfRaisingFunds extends BaseTest{



    @And("^I have navigated to Cost Of Raising Funds section$")
    public void iHaveNavigatedToCostOfRaisingFundsSection() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.Expenditure, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.CostOfRaisingFunds);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(costOfRaisingFunds.isHeaderPresentAndDisplayedForCostOfRaisingFundsPage());
    }

    @When("^I enter value in Pay Cost with \"([^\"]*)\"$")
    public void iEnterValueInPayCostWith(String arg0) throws Throwable {
        costOfRaisingFunds.setValueInInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFunds.CostOfRaisingFundsLabelNames.PayCosta,arg0);
    }

    @When("^I enter value in Premise Costs with \"([^\"]*)\"$")
    public void iEnterValueInPremiseCostsWith(String arg0) throws Throwable {
        costOfRaisingFunds.setValueInInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFunds.CostOfRaisingFundsLabelNames.PremiseCosts,arg0);
    }

    @When("^I enter value in Other \"([^\"]*)\"$")
    public void iEnterValueInOther(String arg0) throws Throwable {
        costOfRaisingFunds.setValueInInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFunds.CostOfRaisingFundsLabelNames.Other,arg0);
    }

    @Then("^I see the value of Totals in Cost Of Raising Funds is \"([^\"]*)\"$")
    public void iSeeTheValueOfTotalsInCostOfRaisingFundsIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(costOfRaisingFunds.getValueFromInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFunds.CostOfRaisingFundsLabelNames.Total),arg0);
    }

    @Then("^I see the value of Totals in Cost Of Raising Funds is NOT \"([^\"]*)\" in Cost of Raising Funds$")
    public void iSeeTheValueOfTotalsInCostOfRaisingFundsIsNOTInCostOfRaisingFunds(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(costOfRaisingFunds.getValueFromInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFunds.CostOfRaisingFundsLabelNames.Total),arg0);
    }
}
