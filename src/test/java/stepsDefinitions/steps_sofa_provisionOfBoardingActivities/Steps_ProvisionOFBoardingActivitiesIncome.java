package stepsDefinitions.steps_sofa_provisionOfBoardingActivities;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.provisionOfBoardingActivities.ProvisionOfBoardingActivities_Income;

public class Steps_ProvisionOFBoardingActivitiesIncome extends BaseTest {

    @And("^I have navigates to the Provision Of Activities Income page$")
    public void iHaveNavigatesToTheProvisionOfActivitiesIncomePage() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.ProvisionOfBoardingActivities, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.Income);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(income.isHeaderPresentAndDisplayedForBoardingActivitiesIncomePage());
    }

    @And("^I input value in field with fieldset Fee Income with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetFeeIncomeWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.FeeIncome,arg0);
    }

    @And("^I input value in field with fieldset Grants - DfE/EFA with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetGrantsDfEEFAWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsDfEEFA, arg0);
    }

    @And("^I input value in field with Grants - National College for Teaching and Learning NCTL with \"([^\"]*)\"$")
    public void iInputValueInFieldWithGrantsNationalCollegeForTeachingAndLearningNCTLWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsNationalCollegeForTeachingAndLearning,arg0);
    }

    @And("^I input value in field with fieldset Grants - Standards and Teaching Agency STA with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetGrantsStandardsAndTeachingAgencySTAWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsStandardsAndTeachingAgency,arg0);
    }

    @And("^I input value in field with fieldset Grants - Skills Funding Agency SFA with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetGrantsSkillsFundingAgencySFAWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsSkillsFundingAgency,arg0);
    }

    @And("^I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetGrantsEqualityAndHumanRightsCommissionEHRCWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsEqualityAndHumanRightsCommission,arg0);
    }

    @And("^I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetGrantsOfficeOfTheChildrenSCommissionerOCCWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsOfficeOfTheChildrensCommissioner,arg0);
    }

    @And("^I input value in field with fieldset Grants-Other Government  with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetGrantsOtherGovernmentWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.GrantsOtherGovernment,arg0);
    }

    @And("^I input value in field with fieldset Other Income with \"([^\"]*)\"$")
    public void iInputValueInFieldWithFieldsetOtherIncomeWith(String arg0) throws Throwable {
        income.setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.OtherIncome,arg0);
    }

    @Then("^I see the input value in field with fieldset Total with \"([^\"]*)\"$")
    public void iSeeTheInputValueInFieldWithFieldsetTotalWith(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,income.getValueFromFieldByLabelInProvisionOfBoardignActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.Total));
    }

    @Then("^I see the input value in field with fieldset Total is NOT with \"([^\"]*)\"$")
    public void iSeeTheInputValueInFieldWithFieldsetTotalIsNOTWith(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,income.getValueFromFieldByLabelInProvisionOfBoardignActivitiesIncomePage(ProvisionOfBoardingActivities_Income.ProvisionOfBoardingActivitiesIncomeLabelConstants.Total));
    }
}
