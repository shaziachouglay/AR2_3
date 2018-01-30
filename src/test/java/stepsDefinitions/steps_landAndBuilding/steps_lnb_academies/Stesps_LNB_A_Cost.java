package stepsDefinitions.steps_landAndBuilding.steps_lnb_academies;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Stesps_LNB_A_Cost extends BaseTest {


    @And("^I have navigated to the Academies Cost Page$")
    public void iHaveNavigatedToTheAcademiesCostPage() {

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.Academies, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Cost );
        hardAssertion.assertTrue(academies_cost.isHeaderPresentAndDisplayedForAUC_CostPage(), "Failed to display the Header for LNB Academies Cost page");

    }
}
