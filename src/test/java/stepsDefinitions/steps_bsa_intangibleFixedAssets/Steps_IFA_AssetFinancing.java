package stepsDefinitions.steps_bsa_intangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetAssets.intangibleFixedAssets.IFA_AssetFinancing;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_IFA_AssetFinancing extends BaseTest{
    @And("^I navigate to IFA Asset Financing page$")
    public void iNavigateToIFAAssetFinancingPage() {
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.IntangibelFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.AssetFinancing);
        hardAssertion.assertTrue(ifa_assetFinancing.isPageHeaderPresentAndDisplayedInIFAAssetFinancingPage(), "Failed to display the Header for IFA Asset Financing page");
    }

    @And("^I enter in row Owned and columns \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterInRowOwnedAndColumns(String arg0, String arg1) {
        ifa_assetFinancing.setValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.Owned, IFA_AssetFinancing.columnName.Software,arg0);
        ifa_assetFinancing.setValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.Owned, IFA_AssetFinancing.columnName.Other,arg1);
    }

    @Then("^I must see row Owned and columm Total is \"([^\"]*)\"$")
    public void iMustSeeRowOwnedAndColummTotalIs(String arg0) {
        hardAssertion.assertEquals(ifa_assetFinancing.getValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.Owned, IFA_AssetFinancing.columnName.Total),arg0);
    }

    @And("^I enter in row Finance leased and columns \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterInRowFinanceLeasedAndColumns(String arg0, String arg1) {
        ifa_assetFinancing.setValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.FinanceLeased, IFA_AssetFinancing.columnName.Software,arg0);
        ifa_assetFinancing.setValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.FinanceLeased, IFA_AssetFinancing.columnName.Other,arg0);
    }

    @Then("^I must see row Finance leased and columm Total is \"([^\"]*)\"$")
    public void iMustSeeRowFinanceLeasedAndColummTotalIs(String arg0) {
        hardAssertion.assertEquals(ifa_assetFinancing.getValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.FinanceLeased, IFA_AssetFinancing.columnName.Total),arg0);
    }

    @And("^I enter in row On balance sheet PFI contracts  and columns \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterInRowOnBalanceSheetPFIContractsAndColumns(String arg0, String arg1) {
        ifa_assetFinancing.setValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.OnBalanceSheetPFIContracts, IFA_AssetFinancing.columnName.Software,arg0);
        ifa_assetFinancing.setValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.OnBalanceSheetPFIContracts, IFA_AssetFinancing.columnName.Other,arg0);
    }

    @Then("^I must see row On balance sheet PFI contracts  and columm Total is \"([^\"]*)\"$")
    public void iMustSeeRowOnBalanceSheetPFIContractsAndColummTotalIs(String arg0) {
        hardAssertion.assertEquals(ifa_assetFinancing.getValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.OnBalanceSheetPFIContracts, IFA_AssetFinancing.columnName.Total),arg0);
    }

    @And("^I must see in row Closing Net Book Value and columns are \"([^\"]*)\" \"([^\"]*)\"$")
    public void iMustSeeInRowClosingNetBookValueAndColumnsAre(String arg0, String arg1) {
        hardAssertion.assertEquals(ifa_assetFinancing.getValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.ClosingNetBookValue, IFA_AssetFinancing.columnName.Software),arg0);
        hardAssertion.assertEquals(ifa_assetFinancing.getValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.ClosingNetBookValue, IFA_AssetFinancing.columnName.Other),arg1);
    }

    @Then("^I must see row Closing Net Book Value and columm Total is \"([^\"]*)\"$")
    public void iMustSeeRowClosingNetBookValueAndColummTotalIs(String arg0) {
        hardAssertion.assertEquals(ifa_assetFinancing.getValueByRowNameAndColumnNameInIFAAssetFinancingPage(IFA_AssetFinancing.rowName.ClosingNetBookValue, IFA_AssetFinancing.columnName.Total),arg0);
    }
}
