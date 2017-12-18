package stepsDefinitions.stpes_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.staffAndTrustees.AverageStaffNumbers;


public class Steps_AverageStaffNumbers extends BaseTest {

    @When("^I navigate to Average Staff Numbers$")
    public void iNavigateToAverageStaffNumbers()  {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.AverageStaffNumbers);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(averageStaffNumbers.isHeaderPresentAndDisplayedForAverageStaffNumberPage());
    }

    @And("^I enter value in row Teachers and column PE with \"([^\"]*)\" and column TIS with \"([^\"]*)\"$")
    public void iEnterValueInRowTeachersAndColumnPEWithAndColumnTISWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.Teachers, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.Teachers, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I must see the Total Value for row  Teachers to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowTeachersToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Teachers, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row Management and column PE with \"([^\"]*)\" and column TIS with \"([^\"]*)\"$")
    public void iEnterValueInRowManagementAndColumnPEWithAndColumnTISWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.Management, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.Management, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I must see the Total Value for row Management to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowManagementToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0, averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Management, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row Administration and support and column PE with \"([^\"]*)\" and column TE with \"([^\"]*)\"$")
    public void iEnterValueInRowAdministrationAndSupportAndColumnPEWithAndColumnTEWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.AdministrationSupport, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.AdministrationSupport, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I must see the Total Value for row Administration and Support to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowAdministrationAndSupportToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.AdministrationSupport,  AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I must see the Total value for column PE with \"([^\"]*)\" and TIS with \"([^\"]*)\" and Total with \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForColumnPEWithAndTISWithAndTotalWith(String arg0, String arg1, String arg2) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Total, AverageStaffNumbers.ColumnNames.PermanentlyEmployed));
        hardAssertion.assertEquals(arg1,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Total, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff));
        hardAssertion.assertEquals(arg2,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Total, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row PEGA Accounting office and column Male with \"([^\"]*)\" and femalae with \"([^\"]*)\"$")
    public void iEnterValueInRowPEGAAccountingOfficeAndColumnMaleWithAndFemalaeWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_AccountingOfficer, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_AccountingOfficer, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I see the value in row PEGA Accounting Officer and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGAAccountingOfficerAndColumnTotalIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_AccountingOfficer, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row PEGA Staff who Serve as Trustees and column Male with \"([^\"]*)\" and column Female  with \"([^\"]*)\"$")
    public void iEnterValueInRowPEGAStaffWhoServeAsTrusteesAndColumnMaleWithAndColumnFemaleWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_StaffWhoServeAsTrustees, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_StaffWhoServeAsTrustees, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I must see the Total value for row PEGA Staff who serve as Trustees to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowPEGAStaffWhoServeAsTrusteesToBe(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_StaffWhoServeAsTrustees, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row PEGA Teachers and column Male with \"([^\"]*)\" and femalae with \"([^\"]*)\"$")
    public void iEnterValueInRowPEGATeachersAndColumnMaleWithAndFemalaeWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_Teachers, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_Teachers, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I see the value in row PEGA Teachers and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGATeachersAndColumnTotalIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Teachers, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row PEGA Management and column Male with \"([^\"]*)\" and femalae with \"([^\"]*)\"$")
    public void iEnterValueInRowPEGAManagementAndColumnMaleWithAndFemalaeWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_Management, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_Management, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);

    }

    @Then("^I see the value in row PEGA Management and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGAManagementAndColumnTotalIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Management, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter value in row PEGA Administration and support  and column Male with \"([^\"]*)\" and femalae with \"([^\"]*)\"$")
    public void iEnterValueInRowPEGAAdministrationAndSupportAndColumnMaleWithAndFemalaeWith(String arg0, String arg1) throws Throwable {
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_AdministrationAndSupport, AverageStaffNumbers.ColumnNames.PermanentlyEmployed,arg0);
        averageStaffNumbers.setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(AverageStaffNumbers.RowNames.PEGA_AdministrationAndSupport, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff,arg1);
    }

    @Then("^I see the value in row PEGA Administration and support  and column Total is \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGAAdministrationAndSupportAndColumnTotalIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_AdministrationAndSupport, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the value in row PEGA Total and column male wit \"([^\"]*)\" and female with \"([^\"]*)\" and total with \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGATotalAndColumnMaleWitAndFemaleWithAndTotalWith(String arg0, String arg1, String arg2) throws Throwable {
        hardAssertion.assertEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Total, AverageStaffNumbers.ColumnNames.PermanentlyEmployed));
        hardAssertion.assertEquals(arg1,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Total, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff));
        hardAssertion.assertEquals(arg2,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Total, AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I enter  value in row Days lost to Sickness with \"([^\"]*)\"$")
    public void iEnterValueInRowDaysLostToSicknessWith(String arg0) throws Throwable {
        averageStaffNumbers.setValueInDaysLostToSickness(arg0);
    }

    @Then("^I click on the next$")
    public void iClickOnTheNext() throws Throwable {

    }

    @Then("^I must see the Total Value for row  Teachers NOT to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowTeachersNOTToBe(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Teachers, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I must see the Total Value for row Management NOT to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowManagementNOTToBe(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0, averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Management, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I must see the Total Value for row Administration and Support NOT to be \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowAdministrationAndSupportNOTToBe(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.AdministrationSupport,  AverageStaffNumbers.ColumnNames.Total));
    }

    @And("^I must see the Total value for column PE is NOT \"([^\"]*)\" and TIS is NOT \"([^\"]*)\" and Total with \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForColumnPEIsNOTAndTISIsNOTAndTotalWith(String arg0, String arg1, String arg2) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Total, AverageStaffNumbers.ColumnNames.PermanentlyEmployed));
        hardAssertion.assertNotEquals(arg1,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Total, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff));
        hardAssertion.assertNotEquals(arg2,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.Total, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the value in row PEGA Accounting Officer and column Total is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGAAccountingOfficerAndColumnTotalIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_AccountingOfficer, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I must see the Total value for row PEGA Staff who serve as Trustees is NOT \"([^\"]*)\"$")
    public void iMustSeeTheTotalValueForRowPEGAStaffWhoServeAsTrusteesIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_StaffWhoServeAsTrustees, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the value in row PEGA Teachers and column Total is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGATeachersAndColumnTotalIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Teachers, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the value in row PEGA Management and column Total is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGAManagementAndColumnTotalIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Management, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the value in row PEGA Administration and support  and column Total is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGAAdministrationAndSupportAndColumnTotalIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_AdministrationAndSupport, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the value in row PEGA Total and column male is NOT \"([^\"]*)\" and female is NOT \"([^\"]*)\" and total with \"([^\"]*)\"$")
    public void iSeeTheValueInRowPEGATotalAndColumnMaleIsNOTAndFemaleIsNOTAndTotalWith(String arg0, String arg1, String arg2) throws Throwable {
        hardAssertion.assertNotEquals(arg0,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Total, AverageStaffNumbers.ColumnNames.PermanentlyEmployed));
        hardAssertion.assertNotEquals(arg1,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Total, AverageStaffNumbers.ColumnNames.TemporaryOrInterimStaff));
        hardAssertion.assertNotEquals(arg2,averageStaffNumbers.getValueFromTableByRowNameAndColumnName(AverageStaffNumbers.RowNames.PEGA_Total, AverageStaffNumbers.ColumnNames.Total));
    }

    @Then("^I see the number of errors starting stating The input value must be a positive number are \"([^\"]*)\"$")
    public void iSeeTheNumberOfErrorsStartingStatingTheInputValueMustBeAPositiveNumberAre(String arg0) {
        hardAssertion.assertEquals(averageStaffNumbers.getErrorsTheInputVAluMustBeaPositiveNumber(),Integer.parseInt(arg0));
    }
}
