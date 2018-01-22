package stepsDefinitions.steps_lnb_academies;

import baseTest.BaseTest;
import cucumber.api.java.en.And;

import static pageObjects.navigationPanel.NavigationMenuBar.LNB_TAB_MENU_OPTIONS.Academies;
import static pageObjects.navigationPanel.NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Depreciation;

public class Stesps_LNB_A_Depreciation extends BaseTest{
    @And("^I have navigated to the Academies Depreciation Page$")
    public void iHaveNavigatedToTheAcademiesDepreciationPage(){

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(Academies, Depreciation );
        hardAssertion.assertTrue(academies_depriciation.isHeaderPresentAndDisplayed(), "Failed to display the Header for LNB Academies Depreciation page");
    }
}
