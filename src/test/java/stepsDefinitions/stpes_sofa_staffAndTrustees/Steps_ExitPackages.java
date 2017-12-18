package stepsDefinitions.stpes_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.staffAndTrustees.ExitPackages_NonCivilServiceSchemes;

public class Steps_ExitPackages extends BaseTest {



    @And("^I navigate to Exit Package Non Civil Service Scheme  section$")
    public void iNavigateToExitPackageNonCivilServiceSchemeSection()  {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.ExitpackagesNon);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(exitPackage.isHeaderPresentAndDisplayedForExitPackages_NonCivilServiceSchemesPage());
    }

    @And("^I select drop down band value with \"([^\"]*)\"$")
    public void iSelectDropDownBandValueWith(String arg0)  {
        exitPackage.selectDropDownOptionByRowNumber(1 , arg0);
    }

    @And("^I enter value in Row one and column name  Number of Compulsory Redundancies with \"([^\"]*)\"$")
    public void iEnterValueInRowOneAndColumnNameNumberOfCompulsoryRedundanciesWith(String arg0)  {
        exitPackage.setValueInTableByRowNumberAndColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.NumberOfCompulsoryRedundancies ,1,arg0);
    }

    @And("^I enter value in Row one and column name  value of Compulsory Redundancies Contractual wih \"([^\"]*)\"$")
    public void iEnterValueInRowOneAndColumnNameValueOfCompulsoryRedundanciesContractualWih(String arg0)  {
        exitPackage.setValueInTableByRowNumberAndColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfCompulsoryRedundanciesContractual, 1, arg0);
    }

    @And("^I enter value in Row one and column name  value of Compulsory Redundancies Non Contractual with \"([^\"]*)\"$")
    public void iEnterValueInRowOneAndColumnNameValueOfCompulsoryRedundanciesNonContractualWith(String arg0)  {
        exitPackage.setValueInTableByRowNumberAndColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfCompulsoryRedundanciesNonContractual,1,arg0);
    }

    @And("^I enter value in Row one and column name Number of Other Agreed Departures with \"([^\"]*)\"$")
    public void iEnterValueInRowOneAndColumnNameNumberOfOtherAgreedDeparturesWith(String arg0)  {
        exitPackage.setValueInTableByRowNumberAndColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.NumberOfOtherAgreedDepartures,1,arg0);
    }

    @And("^I enter value in row one and column name value of other Agreed Departures Contractual with \"([^\"]*)\"$")
    public void iEnterValueInRowOneAndColumnNameValueOfOtherAgreedDeparturesContractualWith(String arg0)  {
        exitPackage.setValueInTableByRowNumberAndColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfOtherAgreedDepartureContractual,1,arg0);
    }

    @And("^I enter value in row one and column name value of other Agreed Departures Non Contractual with \"([^\"]*)\"$")
    public void iEnterValueInRowOneAndColumnNameValueOfOtherAgreedDeparturesNonContractualWith(String arg0)  {
        exitPackage.setValueInTableByRowNumberAndColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfOtherAgreedDepartureNonContractual,1,arg0);
    }

    @Then("^I can see the botton TOTAL row value for column name Number of Compulsory Redundancies is now \"([^\"]*)\"$")
    public void iCanSeeTheBottonTOTALRowValueForColumnNameNumberOfCompulsoryRedundanciesIsNow(String arg0)  {
        hardAssertion.assertEquals(arg0,exitPackage.getValueFromBottomTotalsRowByColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.NumberOfCompulsoryRedundancies));
    }

    @Then("^I can see the botton TOTAL row value for column name value of Compulsory Redundancies Contractual is now \"([^\"]*)\"$")
    public void iCanSeeTheBottonTOTALRowValueForColumnNameValueOfCompulsoryRedundanciesContractualIsNow(String arg0)  {
        hardAssertion.assertEquals(arg0,exitPackage.getValueFromBottomTotalsRowByColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfCompulsoryRedundanciesNonContractual));
    }

    @Then("^I can see the botton TOTAL row value for column name value of Compulsory Redundancies Non Contractual is now \"([^\"]*)\"$")
    public void iCanSeeTheBottonTOTALRowValueForColumnNameValueOfCompulsoryRedundanciesNonContractualIsNow(String arg0)  {
        hardAssertion.assertEquals(arg0 , exitPackage.getValueFromBottomTotalsRowByColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfCompulsoryRedundanciesNonContractual));
    }

    @Then("^I can see the botton TOTAL row value for column name Other Agreed Departures is now \"([^\"]*)\"$")
    public void iCanSeeTheBottonTOTALRowValueForColumnNameOtherAgreedDeparturesIsNow(String arg0)  {
        hardAssertion.assertEquals(arg0 , exitPackage.getValueFromBottomTotalsRowByColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.NumberOfOtherAgreedDepartures));
    }

    @Then("^I can see the botton TOTAL row value for column name value of other Agreed Departures Contractual is now \"([^\"]*)\"$")
    public void iCanSeeTheBottonTOTALRowValueForColumnNameValueOfOtherAgreedDeparturesContractualIsNow(String arg0)  {
        hardAssertion.assertEquals(arg0 , exitPackage.getValueFromBottomTotalsRowByColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfOtherAgreedDepartureContractual));
    }

    @Then("^I can see the botton TOTAL row valie for column name value of other Agreed Departures Non Contractual is now \"([^\"]*)\"$")
    public void iCanSeeTheBottonTOTALRowValieForColumnNameValueOfOtherAgreedDeparturesNonContractualIsNow(String arg0)  {
        hardAssertion.assertEquals(arg0 , exitPackage.getValueFromBottomTotalsRowByColumnNameInExitPackages(ExitPackages_NonCivilServiceSchemes.ColumnNames.ValueOfOtherAgreedDepartureNonContractual));
        exitPackage.explicitWait(5000);
    }

    @When("^I click on add instance number of times \"([^\"]*)\"$")
    public void iClickOnAddInstanceNumberOfTimes(String arg0)  {
        exitPackage.addMultipleInstances(Integer.parseInt(arg0));
    }

    @Then("^I see the number of instances present are \"([^\"]*)\"$")
    public void iSeeTheNumberOfInstancesPresentAre(String arg0)  {
        hardAssertion.assertEquals(Integer.parseInt(arg0), exitPackage.getNumberOFInstances());
    }

    @And("^I click the remove instance button \"([^\"]*)\"$")
    public void iClickTheRemoveInstanceButton(String arg0)  {
        exitPackage.removeInstance();
    }

    @Then("^I see the number of intsances are \"([^\"]*)\"$")
    public void iSeeTheNumberOfIntsancesAre(String arg0)  {
        hardAssertion.assertEquals(Integer.parseInt(arg0),exitPackage.getNumberOFInstances());
    }
}
