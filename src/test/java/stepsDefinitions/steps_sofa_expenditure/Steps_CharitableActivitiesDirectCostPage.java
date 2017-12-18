package stepsDefinitions.steps_sofa_expenditure;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.expenditure.CharitableActivities_DirectCosts;

public class Steps_CharitableActivitiesDirectCostPage extends BaseTest{

    @When("^I navigate to Charitable Activities Direct Cost Page$")
    public void iNavigateToCharitableActivitiesDirectCostPage() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.Expenditure, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.CharitableActivitiesDirectCost);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(charitableActivities_directCosts.isHeaderPresentAndDisplayedForCharitableActivitiesDirectCostPage());
    }

    @Then("^I enter value in Teaching and Educational Support Staff with \"([^\"]*)\"$")
    public void iEnterValueInTeachingAndEducationalSupportStaffWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.TeachingEducationalSupportStaff,arg0);
    }

    @And("^I enter value in Staff Expenses with \"([^\"]*)\"$")
    public void iEnterValueInStaffExpensesWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.StaffExpenses,arg0);
    }

    @And("^I enter value in Other Staff Costs with \"([^\"]*)\"$")
    public void iEnterValueInOtherStaffCostsWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.OtherStaffCosts,arg0);
    }

    @And("^I enter value in Depreciation with \"([^\"]*)\"$")
    public void iEnterValueInDepreciationWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.Depreciation,arg0);
    }

    @And("^I enter value in Amortisation with \"([^\"]*)\"$")
    public void iEnterValueInAmortisationWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.Amortisation,arg0);
    }

    @And("^I enter value in Impairment wit \"([^\"]*)\"$")
    public void iEnterValueInImpairmentWit(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.Impairment,arg0);
    }

    @And("^I enter value in Educational Supplies with \"([^\"]*)\"$")
    public void iEnterValueInEducationalSuppliesWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.EducationalSupplies,arg0);
    }

    @And("^I enter value in Examination Fees with \"([^\"]*)\"$")
    public void iEnterValueInExaminationFeesWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.ExaminationFees,arg0);
    }

    @And("^I enter value in Staff Related Insurance with \"([^\"]*)\"$")
    public void iEnterValueInStaffRelatedInsuranceWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.StaffRelatedInsurance,arg0);
    }

    @And("^I enter value in Technology Costs with \"([^\"]*)\"$")
    public void iEnterValueInTechnologyCostsWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.TechnologyCosts,arg0);
    }

    @And("^I enter value in Educational Consultancy with \"([^\"]*)\"$")
    public void iEnterValueInEducationalConsultancyWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.EducationalConsultancy,arg0);
    }

    @And("^I enter value in Other Direct Costs with \"([^\"]*)\"$")
    public void iEnterValueInOtherDirectCostsWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.OtherDirectCosts,arg0);
    }

    @Then("^I can see the Total field is now populated with \"([^\"]*)\"$")
    public void iCanSeeTheTotalFieldIsNowPopulatedWith(String arg0) throws Throwable {
        hardAssertion.assertEquals(charitableActivities_directCosts.getValueFromInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.Total),arg0);
    }

    @And("^I enter value in field National Apprenticehip Levey expenditure with \"([^\"]*)\"$")
    public void iEnterValueInFieldNationalApprenticehipLeveyExpenditureWith(String arg0) throws Throwable {
        charitableActivities_directCosts.setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.NotionalApprenticeshipLevyExpenditure,arg0);
    }

    @Then("^I can see the Total field is NOT populated with \"([^\"]*)\" in Charitable Activities Direct Cost Page$")
    public void iCanSeeTheTotalFieldIsNOTPopulatedWithInCharitableActivitiesDirectCostPage(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(charitableActivities_directCosts.getValueFromInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivities_DirectCosts.CharitableActivitiesDirectCostLabelNames.Total),arg0);
    }
}
