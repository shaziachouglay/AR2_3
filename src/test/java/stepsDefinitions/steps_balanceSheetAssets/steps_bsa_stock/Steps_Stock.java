package stepsDefinitions.steps_balanceSheetAssets.steps_bsa_stock;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.balanceSheetAssets.stock.Stock;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_Stock extends BaseTest {
    @And("^I navigate to BSA Stock page$")
    public void iNavigateToBSAStockPage() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.Stock);
        hardAssertion.assertTrue(stock.isHeaderPresentAndDisplayedForBSA_StockPage(), "Failed to display the Header for Stock page");
    }

    @And("^I enter value in field Stock with \"([^\"]*)\"$")
    public void iEnterValueInFieldStockWith(String arg0) {
        stock.setValueInInputFieldByLabelNameInBSA_StockPage(Stock.BSA_Stock_Label.Stock,arg0);
    }

    @And("^I click on the Save And Next button in Stock Page$")
    public void iClickOnTheSaveAndNextButtonInStockPage() {
        stock.clickOnSaveAndNextInBSA_StockPage();
    }
}
