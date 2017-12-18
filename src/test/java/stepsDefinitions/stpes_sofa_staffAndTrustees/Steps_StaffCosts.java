package stepsDefinitions.stpes_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.staffAndTrustees.StaffCosts;


public class Steps_StaffCosts extends BaseTest {



    @When("^I navigate to Staff Costs section$")
    public void iNavigateToStaffCostsSection() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.StaffCosts);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(staffCosts.isHeaderPresentAndDisplayedForStaffCostsPage());
    }

    @And("^I enter value in row wages and salaries WS and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowWagesAndSalariesWSAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.WagesAndSalaries , StaffCosts.ColumnValue.PermanantlyEmployed, arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.WagesAndSalaries, StaffCosts.ColumnValue.TemporaryInterimStaff, arg1);
    }

    @Then("^I can see the Total Value for row  wages and salaries WS to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowWagesAndSalariesWSToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.WagesAndSalaries));
    }

    @And("^I enter value in row Social Security Costs SSC  and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowSocialSecurityCostsSSCAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.SocailSecurityCost , StaffCosts.ColumnValue.PermanantlyEmployed ,arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.SocailSecurityCost , StaffCosts.ColumnValue.TemporaryInterimStaff , arg1);
    }

    @Then("^I can see the Total Value for row SSC to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowSSCToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.SocailSecurityCost));
    }

    @And("^I enter value in row Pension Costs PC  and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowPensionCostsPCAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.PensionCost , StaffCosts.ColumnValue.PermanantlyEmployed , arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.PensionCost , StaffCosts.ColumnValue.TemporaryInterimStaff, arg1);
    }

    @Then("^I can see the Total Value for row PC to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowPCToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.PensionCost));
    }

    @And("^I enter value in row Agency Staff Costs ASC  and TE with \"([^\"]*)\"$")
    public void iEnterValueInRowAgencyStaffCostsASCAndTEWith(String arg0) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.AgencyStaffCost , StaffCosts.ColumnValue.TemporaryInterimStaff , arg0);
    }

    @Then("^I can see the Total Value for row ASC to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowASCToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.AgencyStaffCost));
    }

    @And("^I enter value in row Redundancy payment RP  and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowRedundancyPaymentRPAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.RedundancyPayments , StaffCosts.ColumnValue.PermanantlyEmployed, arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.RedundancyPayments , StaffCosts.ColumnValue.TemporaryInterimStaff , arg1);
    }

    @Then("^I can see the Total Value for row RP to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowRPToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.RedundancyPayments));
    }

    @And("^I enter value in row Severance Payments SP  and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowSeverancePaymentsSPAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.SeverancePayments , StaffCosts.ColumnValue.PermanantlyEmployed , arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.SeverancePayments , StaffCosts.ColumnValue.TemporaryInterimStaff, arg1);
    }

    @Then("^I can see the Total Value for row SP to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowSPToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.SeverancePayments));
    }

    @And("^I enter value in row Other Restructuring Costs ORC  and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowOtherRestructuringCostsORCAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.OtherRestructuringCost , StaffCosts.ColumnValue.PermanantlyEmployed , arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.OtherRestructuringCost , StaffCosts.ColumnValue.TemporaryInterimStaff , arg1);
    }

    @Then("^I can see the Total Value for row ORC to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowORCToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0 , staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.OtherRestructuringCost));
    }

    @And("^I enter value in row Less Recoveries of Staff Costs LR  and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowLessRecoveriesOfStaffCostsLRAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation , StaffCosts.ColumnValue.PermanantlyEmployed , arg0);
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation , StaffCosts.ColumnValue.TemporaryInterimStaff , arg1);
    }

    @Then("^I can see the Total Value for row LR to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowLRToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0 , staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation));
    }

    @Then("^I can see the Final Total Column for Column PE to be \"([^\"]*)\"  Column TE to be \"([^\"]*)\" and column total to be \"([^\"]*)\"$")
    public void iCanSeeTheFinalTotalColumnForColumnPEToBeColumnTEToBeAndColumnTotalToBe(String arg0, String arg1, String arg2) throws Throwable {
        hardAssertion.assertEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.PermanantlyEmployed , StaffCosts.RowValue.Total));
        hardAssertion.assertEquals(arg1,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.TemporaryInterimStaff , StaffCosts.RowValue.Total));
        hardAssertion.assertEquals(arg2,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.Total));
        staffCosts.explicitWait(5000);
    }


    @And("^I enter value in row Apprenticeship Levey and column Permenantly Employed with \"([^\"]*)\"$")
    public void iEnterValueInRowApprenticeshipLeveyAndColumnPermenantlyEmployedWith(String arg0) throws Throwable {
        staffCosts.setValueInColumnInputFieldBasedOnRowValueInStaffCosts(StaffCosts.RowValue.ApprenticeshipLevy, StaffCosts.ColumnValue.PermanantlyEmployed,arg0);
    }

    @Then("^I see the value in row Apprenticeship Levey and column  Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowApprenticeshipLeveyAndColumnTotalIs(String arg0) throws Throwable {
       hardAssertion.assertEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total, StaffCosts.RowValue.ApprenticeshipLevy));
    }

    @Then("^I can see the Total Value for row  wages and salaries WS to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowWagesAndSalariesWSToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.WagesAndSalaries));
    }

    @Then("^I can see the Total Value for row SSC to be  not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowSSCToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.SocailSecurityCost));
    }

    @Then("^I see the value in row Apprenticeship Levey and column  Total is not \"([^\"]*)\"$")
    public void iSeeTheValueInRowApprenticeshipLeveyAndColumnTotalIsNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total, StaffCosts.RowValue.ApprenticeshipLevy));
    }

    @Then("^I can see the Total Value for row PC to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowPCToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.PensionCost));
    }

    @Then("^I can see the Total Value for row ASC to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowASCToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.AgencyStaffCost));
    }

    @Then("^I can see the Total Value for row RP to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowRPToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.RedundancyPayments));
    }

    @Then("^I can see the Total Value for row SP to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowSPToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.SeverancePayments));
    }

    @Then("^I can see the Total Value for row ORC to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowORCToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0 , staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.OtherRestructuringCost));
    }

    @Then("^I can see the Total Value for row LR to be not \"([^\"]*)\"$")
    public void iCanSeeTheTotalValueForRowLRToBeNot(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0 , staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation));
    }

    @Then("^I can see the Final Total Column for Column PE to be not \"([^\"]*)\"  Column TE to be not \"([^\"]*)\" and column total to be not \"([^\"]*)\"$")
    public void iCanSeeTheFinalTotalColumnForColumnPEToBeNotColumnTEToBeNotAndColumnTotalToBeNot(String arg0, String arg1, String arg2) throws Throwable {
        hardAssertion.assertNotEquals(arg0, staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.PermanantlyEmployed , StaffCosts.RowValue.Total));
        hardAssertion.assertNotEquals(arg1,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.TemporaryInterimStaff , StaffCosts.RowValue.Total));
        hardAssertion.assertNotEquals(arg2,staffCosts.getValueFromColumnBasedOnRowValueInStaffCosts(StaffCosts.ColumnValue.Total , StaffCosts.RowValue.Total));
    }
}
