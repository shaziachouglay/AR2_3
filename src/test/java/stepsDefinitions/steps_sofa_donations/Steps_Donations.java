package stepsDefinitions.steps_sofa_donations;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.donations.Donations;
import stepsDefinitions.standigData_steps.StandingDataForDev;

public class Steps_Donations extends BaseTest{

    public StandingDataForDev standingDataForDev = new StandingDataForDev();

    @Given("^I am in Pre Production Environment as Test User$")
    public void iAmInPreProductionEnvironmentAsTestUser() {
        info("This step is not implemented , Working in Dev Environment");
    }

    @Given("^I am on SoFA section$")
    public void iAmOnSoFASection() {
        standingDataForDev.iAmOnDevEnvironmentAsPreparer();
    }

    @When("^I navigate to Donations section$")
    public void iNavigateToDonationsSection() {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.Donations);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(donations.isHeaderPresentAndDisplayedForDonationsPage(), "Failed to display the Header for Donations page");
    }

    @Then("^I enter value in Donated Fixed Assets with \"([^\"]*)\"$")
    public void iEnterValueInDonatedFixedAssetsWith(String arg0) {
        donations.setValueInInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.DonatedFixedAssets,arg0);
        donations.setValueInInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.DonatedFixedAssets,arg0);
    }

    @Then("^I enter value in Fixed Assets Donated with \"([^\"]*)\"$")
    public void iEnterValueInFixedAssetsDonatedWith(String arg0) {
        donations.setValueInInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.DonatedFixedAssetsNonDEFandESFA,arg0);
    }

    @Then("^I enter value in Donated Intangible Assets with \"([^\"]*)\"$")
    public void iEnterValueInDonatedIntangibleAssetsWith(String arg0) {
        donations.setValueInInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.DonatedIntangibleAssets,arg0);
    }

    @Then("^I enter value in Other Donations Capital with \"([^\"]*)\"$")
    public void iEnterValueInOtherDonationsCapitalWith(String arg0) {
        donations.setValueInInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.OtherDonationsCapital,arg0);
    }

    @Then("^I enter value in Other Donations Revenue \"([^\"]*)\"$")
    public void iEnterValueInOtherDonationsRevenue(String arg0) {
        donations.setValueInInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.OtherDonationsRevenue,arg0);
    }

    @Then("^I see the Total Capital field is populated with \"([^\"]*)\"$")
    public void iSeeTheTotalCapitalFieldIsPopulatedWith(String arg0) {
        hardAssertion.assertEquals(donations.getValueFromInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.TotalCapital), arg0);
    }

    @And("^I see the Total Revenue field is populated with \"([^\"]*)\"$")
    public void iSeeTheTotalRevenueFieldIsPopulatedWith(String arg0) {
        hardAssertion.assertEquals(donations.getValueFromInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.TotalRevenue),arg0);
    }

    @And("^I see the Total field is populated with \"([^\"]*)\"$")
    public void iSeeTheTotalFieldIsPopulatedWith(String arg0) {
        hardAssertion.assertEquals(donations.getValueFromInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.Total),arg0);
    }

    @And("^I see the Total field is not populated with \"([^\"]*)\"$")
    public void iSeeTheTotalFieldIsNotPopulatedWith(String arg0) {
        hardAssertion.assertNotEquals(donations.getValueFromInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.Total),arg0);
    }

    @Then("^I wait for page to load$")
    public void iWaitForPageToLoad() {
        donations.waitForPageLoadToComplete();

    }

    @Then("^I see the number of errors starting with  All financial data must be entered are \"([^\"]*)\"$")
    public void iSeeTheNumberOfErrorsStartingWithAllFinancialDataMustBeEnteredAre(String arg0) {
        hardAssertion.assertEquals(donations.getAllFinancialDataRangeInPage(donations.pageName),Integer.parseInt(arg0));
    }

    @Then("^I see see the number of help link present on the page are \"([^\"]*)\"$")
    public void iSeeSeeTheNumberOfHelpLinkPresentOnThePageAre(String arg0) {
        hardAssertion.assertEquals(donations.getNumberOfHelpButtonsOnPage(donations.pageName),Integer.parseInt(arg0));
    }

    @And("^I click on the Save And Next button in Donations page$")
    public void iClickOnTheSaveAndNextButtonInDonationsPage() {
        donations.clickOnSaveAndNextInDonationsPage();
    }

    @Then("^I see I have not navigated from Donations page$")
    public void iSeeIHaveNotNavigatedFromDonationsPage() {
        donations.isHeaderPresentAndDisplayedForDonationsPage();
    }

    @Then("^I see the number of errors starting with  Invalid Number Format are \"([^\"]*)\"$")
    public void iSeeTheNumberOfErrorsStartingWithInvalidNumberFormatAre(String arg0) {
        hardAssertion.assertEquals(donations.getInvalidNumberFormatErrorsInPage(donations.pageName),Integer.parseInt(arg0));
    }

    @Then("^I see the Total Capital field is not populated with \"([^\"]*)\"$")
    public void iSeeTheTotalCapitalFieldIsNotPopulatedWith(String arg0)  {
        hardAssertion.assertNotEquals(donations.getValueFromInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.TotalCapital), arg0);
    }

    @And("^I see the Total Revenue field is not populated with \"([^\"]*)\"$")
    public void iSeeTheTotalRevenueFieldIsNotPopulatedWith(String arg0)  {
        hardAssertion.assertNotEquals(donations.getValueFromInputFieldByLabelNameInDonationsPage(Donations.DonationsPageLabelConstants.TotalRevenue),arg0);
    }
}
