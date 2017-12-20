package stepsDefinitions.steps_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.staffAndTrustees.OffPayrollArrangements;

public class Steps_OffPayrollArrangements extends BaseTest {



    @And("^I navigate to Off Payroll Arrangements page$")
    public void iNavigateToOffPayrollArrangementsPage() throws Throwable {

        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.OffPayroll);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(offPayroll.isHeaderPresentAndDisplayedForOffPayrollArrangementsPage());

    }

    @And("^I enter value in row Trustee off-payroll arrangements and column one with \"([^\"]*)\" and column two with \"([^\"]*)\"$")
    public void iEnterValueInRowTrusteeOffPayrollArrangementsAndColumnOneWithAndColumnTwoWith(String arg0, String arg1) throws Throwable {
        offPayroll.setValueInTableByRowNameAndColumnNameInOffPayrollArrangementsPage(OffPayrollArrangements.RowNames.TrusteeOffPayrollArrangements, OffPayrollArrangements.ColumnNames.one,arg0);
        offPayroll.setValueInTableByRowNameAndColumnNameInOffPayrollArrangementsPage(OffPayrollArrangements.RowNames.TrusteeOffPayrollArrangements, OffPayrollArrangements.ColumnNames.two,arg1);
    }

    @And("^I enter value in row Other off-payroll arrangements and column one with \"([^\"]*)\" and column two with \"([^\"]*)\"$")
    public void iEnterValueInRowOtherOffPayrollArrangementsAndColumnOneWithAndColumnTwoWith(String arg0, String arg1) throws Throwable {
        offPayroll.setValueInTableByRowNameAndColumnNameInOffPayrollArrangementsPage(OffPayrollArrangements.RowNames.OtherOffPayrollArrangements, OffPayrollArrangements.ColumnNames.one,arg0);
        offPayroll.setValueInTableByRowNameAndColumnNameInOffPayrollArrangementsPage(OffPayrollArrangements.RowNames.OtherOffPayrollArrangements, OffPayrollArrangements.ColumnNames.two,arg1);
    }

    @Then("^I see the value in row total and column one with \"([^\"]*)\" and column two with \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalAndColumnOneWithAndColumnTwoWith(String arg0, String arg1) throws Throwable {
        hardAssertion.assertEquals(arg0,offPayroll.getValueFromTableByRowNameAndColumnName(OffPayrollArrangements.RowNames.Total, OffPayrollArrangements.ColumnNames.one));
        hardAssertion.assertEquals(arg1,offPayroll.getValueFromTableByRowNameAndColumnName(OffPayrollArrangements.RowNames.Total, OffPayrollArrangements.ColumnNames.two));
    }

    @Then("^I see the value in row total and column one with NOT \"([^\"]*)\" and column two with NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalAndColumnOneWithNOTAndColumnTwoWithNOT(String arg0, String arg1) throws Throwable {
        hardAssertion.assertNotEquals(arg0,offPayroll.getValueFromTableByRowNameAndColumnName(OffPayrollArrangements.RowNames.Total, OffPayrollArrangements.ColumnNames.one));
        hardAssertion.assertNotEquals(arg1,offPayroll.getValueFromTableByRowNameAndColumnName(OffPayrollArrangements.RowNames.Total, OffPayrollArrangements.ColumnNames.two));
    }
}
