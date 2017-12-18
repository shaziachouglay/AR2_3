package stepsDefinitions.stpes_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.staffAndTrustees.RelatedPartyTransactions_TrusteeRemuneration;



public class Steps_RelatedPartyTransactions extends BaseTest {

    @Then("^I navigate to Related Party Transactions section$")
    public void iNavigateToRelatedPartyTransactionsSection() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.RelatedpartyTransactions);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(relatedParty.isHeaderPresentAndDisplayedForRelatedPartyTransactionsPage());
    }


    @And("^I click on Add instance button$")
    public void iClickOnAddInstanceButton() {
        relatedParty.addNewInstance();
    }

    @And("^I select a value \"([^\"]*)\" from the drop down menu for row number \"([^\"]*)\"$")
    public void iSelectAValueFromTheDropDownMenuForRowNumber(String arg0, String arg1) throws Throwable {
        relatedParty.selectDropDownValueInTableByRowNumber(arg0, arg1);
    }

    @And("^I enter value in Number paid as Trustees with \"([^\"]*)\" for row number \"([^\"]*)\"$")
    public void iEnterValueInNumberPaidAsTrusteesWithForRowNumber(String arg0, String arg1) throws Throwable {
        relatedParty.setValueInTableByRowNumberAndColumnName(Integer.parseInt(arg1), RelatedPartyTransactions_TrusteeRemuneration.ColumnNames.NumberPaidAsTrustees,arg0 );
    }

    @And("^I enter value in Number paid as Staff with \"([^\"]*)\" for row number \"([^\"]*)\"$")
    public void iEnterValueInNumberPaidAsStaffWithForRowNumber(String arg0, String arg1) throws Throwable {
        relatedParty.setValueInTableByRowNumberAndColumnName(Integer.parseInt(arg1),RelatedPartyTransactions_TrusteeRemuneration.ColumnNames.NumberPaidAsStaff,arg0);
    }

    @Then("^I can see the Row named Total value for Paid as Trustees is \"([^\"]*)\"$")
    public void iCanSeeTheRowNamedTotalValueForPaidAsTrusteesIs(String arg0) throws Throwable {
        Assert.assertEquals(arg0,relatedParty.getValueFromTotalsByColumnName(RelatedPartyTransactions_TrusteeRemuneration.ColumnNames.NumberPaidAsTrustees));
    }

    @Then("^I can see the Row named Total value for Paid as Staff is \"([^\"]*)\"$")
    public void iCanSeeTheRowNamedTotalValueForPaidAsStaffIs(String arg0) throws Throwable {
        Assert.assertEquals(arg0, relatedParty.getValueFromTotalsByColumnName(RelatedPartyTransactions_TrusteeRemuneration.ColumnNames.NumberPaidAsStaff));
    }

    @And("^I click on add instance number of times \"([^\"]*)\" Related Party Transactions Page$")
    public void iClickOnAddInstanceNumberOfTimesRelatedPartyTransactionsPage(String arg0) throws Throwable {
        relatedParty.addMultipleInstances(Integer.parseInt(arg0));
    }

    @Then("^I see the number of instances present are \"([^\"]*)\" in Related Party Transactions Page$")
    public void iSeeTheNumberOfInstancesPresentAreInRelatedPartyTransactionsPage(String arg0) throws Throwable {
        Assert.assertEquals(Integer.parseInt(arg0),relatedParty.getNumberOfInstances());
    }

    @And("^I click on remove link for instance \"([^\"]*)\" in Related Party Transactions Page$")
    public void iClickOnRemoveLinkForInstanceInRelatedPartyTransactionsPage(String arg0) throws Throwable {
        relatedParty.removeMultipleInstances(Integer.parseInt(arg0));

    }

    @Then("^I see the number of instances present are \"([^\"]*)\" in numberOfInstancesToBeAdded$")
    public void iSeeTheNumberOfInstancesPresentAreInNumberOfInstancesToBeAdded(String arg0) throws Throwable {
        Assert.assertEquals(Integer.parseInt(arg0),relatedParty.getNumberOfInstances());
    }

    @Then("^I can see the Row named Total value for Paid as Trustees is not \"([^\"]*)\"$")
    public void iCanSeeTheRowNamedTotalValueForPaidAsTrusteesIsNot(String arg0) throws Throwable {
        Assert.assertNotEquals(arg0,relatedParty.getValueFromTotalsByColumnName(RelatedPartyTransactions_TrusteeRemuneration.ColumnNames.NumberPaidAsTrustees));
    }

    @Then("^I can see the Row named Total value for Paid as Staff is not \"([^\"]*)\"$")
    public void iCanSeeTheRowNamedTotalValueForPaidAsStaffIsNot(String arg0) throws Throwable {
        Assert.assertNotEquals(arg0, relatedParty.getValueFromTotalsByColumnName(RelatedPartyTransactions_TrusteeRemuneration.ColumnNames.NumberPaidAsStaff));
    }
}
