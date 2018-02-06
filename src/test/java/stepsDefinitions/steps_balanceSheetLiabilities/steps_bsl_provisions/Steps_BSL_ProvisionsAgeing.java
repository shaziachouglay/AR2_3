package stepsDefinitions.steps_balanceSheetLiabilities.steps_bsl_provisions;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetLiabilities.provisions.ProvisionsAgeing;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_BSL_ProvisionsAgeing extends BaseTest {
    @And("^I have navigated to the Provisions Ageing Section for BSL$")
    public void iHaveNavigatedToTheProvisionsAgeingSectionForBSL() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSL_MENU_OPTION.Provisions, NavigationMenuBar.BSL_TAB_SUBMENU_OPTIONS.ProvisionsAgeing);
        hardAssertion.assertTrue(provisionsAgeing.isHeaderPresentAndDisplayed(), "Failed to display the Header for BSL Provisions Movement page");

    }

    @And("^I enter value in field Within one year with \"([^\"]*)\" in BSL Provisions Ageing$")
    public void iEnterValueInFieldWithinOneYearWithInBSLProvisionsAgeing(String arg0) {
        provisionsAgeing.setValueInFieldByRowNameAndColumnName(ProvisionsAgeing.RowConstants.WithinOneYear, ProvisionsAgeing.ColumnConstant.Provisions,arg0);
    }

    @And("^I enter value in field Between two and five years with \"([^\"]*)\" in BSL Provisions Ageing$")
    public void iEnterValueInFieldBetweenTwoAndFiveYearsWithInBSLProvisionsAgeing(String arg0) {
        provisionsAgeing.setValueInFieldByRowNameAndColumnName(ProvisionsAgeing.RowConstants.BetweenTwoAndFiveYears, ProvisionsAgeing.ColumnConstant.Provisions,arg0);
    }

    @And("^I enter value in field MOre than five years with \"([^\"]*)\" in BSL Provisions Ageing$")
    public void iEnterValueInFieldMOreThanFiveYearsWithInBSLProvisionsAgeing(String arg0) {
        provisionsAgeing.setValueInFieldByRowNameAndColumnName(ProvisionsAgeing.RowConstants.MoreThanFiveYears, ProvisionsAgeing.ColumnConstant.Provisions,arg0);
    }

    @Then("^I see the field total is \"([^\"]*)\" in BSL Provisions Ageing$")
    public void iSeeTheFieldTotalIsInBSLProvisionsAgeing(String arg0) {
        hardAssertion.assertEquals(provisionsAgeing.getValueByRowNameAndColumnName(ProvisionsAgeing.RowConstants.Total, ProvisionsAgeing.ColumnConstant.Provisions),arg0);
    }

    @Then("^I see the field total is NOT \"([^\"]*)\" in BSL Provisions Ageing$")
    public void iSeeTheFieldTotalIsNOTInBSLProvisionsAgeing(String arg0) {
        hardAssertion.assertNotEquals(provisionsAgeing.getValueByRowNameAndColumnName(ProvisionsAgeing.RowConstants.Total, ProvisionsAgeing.ColumnConstant.Provisions),arg0);
    }
}