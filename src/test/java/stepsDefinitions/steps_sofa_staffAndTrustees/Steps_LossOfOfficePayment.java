package stepsDefinitions.steps_sofa_staffAndTrustees;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.staffAndTrustees.LossOfOfficePayments;


public class Steps_LossOfOfficePayment extends BaseTest {


    @When("^I have navigated to Loss Of Office Payments section$")
    public void iHaveNavigatedToLossOfOfficePaymentsSection() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.StaffAndTrustees, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.LossofOfficePayments);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA));
        hardAssertion.assertTrue(officePayments.isHeaderPresentAndDisplayedForLossOfOfficePaymentsPage());
    }


    @When("^I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsServingAtYearEndAndColumnAccountingOfficeNumberOfPaymentWithAValueOf(String arg0) throws Throwable {

        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntServingAtYEarEnd, LossOfOfficePayments.ColumnNames.AccOfficer_NumberOfPayments, arg0);
    }

    @And("^I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsServingAtYearEndAndColumnAccountingOfficeValueOfPaymentWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntServingAtYEarEnd, LossOfOfficePayments.ColumnNames.AccOfficerValueOfPayments,arg0);
    }

    @When("^I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsServingAtYearEndAndColumnOtherTrusteesNumberOfPaymentWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntServingAtYEarEnd, LossOfOfficePayments.ColumnNames.OtherTrustees_NumberOfPayments,arg0);
    }

    @And("^I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsServingAtYearEndAndColumnOtherTrusteesValueOfPaymentWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntServingAtYEarEnd, LossOfOfficePayments.ColumnNames.OtherTrustees_ValueOfPayments,arg0);
    }

    @And("^I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of \"([^\"]*)\"$")
    public void iSelectValueInROWLossOfOfficePaymentsServingAtYearEndWithADropDownValueOf(String arg0) throws Throwable {
        officePayments.selectValueFromDropDownListByRowNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntServingAtYEarEnd,arg0);
    }

    @When("^I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsLeftDuringTheYearAndColumnAccountingOfficeNumberOfPaymentsWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntLeftDuringTheYear, LossOfOfficePayments.ColumnNames.AccOfficer_NumberOfPayments,arg0);
    }

    @And("^I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsLeftDuringTheYearAndColumnAccountingOfficeValueOfPaymentWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntLeftDuringTheYear, LossOfOfficePayments.ColumnNames.AccOfficerValueOfPayments,arg0);
    }

    @When("^I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsLeftDuringTheYearAndColumnOtherTrusteesNumberOfPaymentsWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntLeftDuringTheYear, LossOfOfficePayments.ColumnNames.OtherTrustees_NumberOfPayments,arg0);
    }

    @And("^I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of \"([^\"]*)\"$")
    public void iEnterValueInROWLossOfOfficePaymentsLeftDuringTheYearAndColumnOtherTrusteesValueOfPaymentWithAValueOf(String arg0) throws Throwable {
        officePayments.setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntLeftDuringTheYear, LossOfOfficePayments.ColumnNames.OtherTrustees_ValueOfPayments,arg0);
    }

    @And("^I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of \"([^\"]*)\"$")
    public void iSelectValueInROWLossOfLossOfOfficePaymentsLeftDuringTheYearWithADropDownValueOf(String arg0) throws Throwable {
        officePayments.selectValueFromDropDownListByRowNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.LossOfOfficePayemntLeftDuringTheYear,arg0);
    }

    @Then("^I see the value in row Total and column Accounting Office Number Of Payments is \"([^\"]*)\" and value of Payments is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalAndColumnAccountingOfficeNumberOfPaymentsIsAndValueOfPaymentsIs(String arg0, String arg1) throws Throwable {
        hardAssertion.assertEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.AccOfficer_NumberOfPayments));
        hardAssertion.assertEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.AccOfficerValueOfPayments));

    }

    @Then("^I see the value in row Total and column Other Trustees Number Of Payments is \"([^\"]*)\" abd value of payment is \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalAndColumnOtherTrusteesNumberOfPaymentsIsAbdValueOfPaymentIs(String arg0, String arg1) throws Throwable {
        hardAssertion.assertEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.OtherTrustees_NumberOfPayments));
        hardAssertion.assertEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.OtherTrustees_ValueOfPayments));
    }

    @Then("^I see the value in row Total and column Accounting Office Number Of Payments is NOT \"([^\"]*)\" and value of Payments is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalAndColumnAccountingOfficeNumberOfPaymentsIsNOTAndValueOfPaymentsIsNOT(String arg0, String arg1) throws Throwable {
        hardAssertion.assertNotEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.AccOfficer_NumberOfPayments));
        hardAssertion.assertNotEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.AccOfficerValueOfPayments));

    }

    @Then("^I see the value in row Total and column Other Trustees Number Of Payments is NOT \"([^\"]*)\" abd value of payment is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInRowTotalAndColumnOtherTrusteesNumberOfPaymentsIsNOTAbdValueOfPaymentIsNOT(String arg0, String arg1) throws Throwable {
        hardAssertion.assertNotEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.OtherTrustees_NumberOfPayments));
        hardAssertion.assertNotEquals(arg0,officePayments.getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(LossOfOfficePayments.RowNames.Total, LossOfOfficePayments.ColumnNames.OtherTrustees_ValueOfPayments));

    }
}
