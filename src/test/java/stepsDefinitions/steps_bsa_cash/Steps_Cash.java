package stepsDefinitions.steps_bsa_cash;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.balanceSheetAssets.cash.Cash;
import pageObjects.navigationPanel.NavigationMenuBar;
import stepsDefinitions.standigData_steps.StandingDataForDev;

public class Steps_Cash extends BaseTest{

    public StandingDataForDev standingDataForDev = new StandingDataForDev();

    @Given("^I am on Balance Sheet Asset Section$")
    public void iAmOnBalanceSheetAssetSection()  {

        standingDataForDev.iAmOnDevEnvironmentAsPreparer();
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.BalanceSheetAssets);
    }

    @When("^I navigate to BSA Cash page$")
    public void iNavigateToBSACashPage() {

        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.Cash);
        hardAssertion.assertTrue(cash.isHeaderPresentAndDisplayedForBSA_CashPage(), "Failed to display the Header for Cash page");
        hardAssertion.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.BalanceSheetAssets), "Balance Sheet Assets not displayed in Navigation Panel");

    }

    @And("^I enter value in field Cash Balance \"([^\"]*)\"$")
    public void iEnterValueInFieldCashBalance(String arg0) {
        cash.setValueInInputFieldByLabelNameInBSA_CashPage(Cash.BSA_Cash_Label.CashBalance,arg0);
        cash.setValueInInputFieldByLabelNameInBSA_CashPage(Cash.BSA_Cash_Label.CashBalance,arg0);
    }

    @And("^I click on the Save And Next button in Cash Page$")
    public void iClickOnTheSaveAndNextButtonInCashPage() {
        cash.clickOnSaveAndNextInBSA_CashPage();
    }
}
