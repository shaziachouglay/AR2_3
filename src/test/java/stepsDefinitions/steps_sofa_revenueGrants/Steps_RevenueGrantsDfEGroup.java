package stepsDefinitions.steps_sofa_revenueGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.revenueGrants.RevenueGrantsDfEGroup;


public class Steps_RevenueGrantsDfEGroup extends BaseTest{

    @And("^I have navigated to the Revenue Grants DFE Group Page$")
    public void iHaveNavigatedToTheRevenueGrantsDFEGroupPage()  {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.RevenueGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.DfEGroup);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(revenueGrantsDfEGroup.isHeaderPresentAndDisplayedForRevenueGrantsDfEGroupPage());
    }

    @When("^I enter value in field National College for Teaching and Leadership with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldNationalCollegeForTeachingAndLeadershipWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.NationalCollegeForTeachingAndLeadership,arg0);
    }

    @And("^I enter value in field Standards and Testing Agency with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldStandardsAndTestingAgencyWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.StandardsAndTestingAgency,arg0);
    }

    @And("^I enter value in field Equality and Human Rights Commission with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldEqualityAndHumanRightsCommissionWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.EqualityAndHumanRightsCommission,arg0);
    }

    @And("^I enter value in field Office of the Children's Commissioner with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldOfficeOfTheChildrenSCommissionerWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.OfficeOfTheChildrensCommissioner,arg0);
    }

    @And("^I enter value in field Student Loan Company with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldStudentLoanCompanyWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.StudentLoanCompany,arg0);
    }

    @And("^I enter value iin field Higher Education Funding Council for England with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueIinFieldHigherEducationFundingCouncilForEnglandWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.HigherEducationFundingCouncilforEngland,arg0);
    }

    @And("^I enter value in field office for Fair Affairs with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldOfficeForFairAffairsWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.OfficeforFairAccess,arg0);
    }

    @And("^I enter value in field Engineering Construction industry with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldEngineeringConstructionIndustryWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.EngineeringConstructionIndustryTrainingBoard,arg0);
    }

    @And("^I enter value in field Construction Industry Training Board with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldConstructionIndustryTrainingBoardWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.ConstructionIndustryTrainingBoard,arg0);
    }

    @And("^I enter value in field Skills Funding Agency with \"([^\"]*)\" in revenue grants dfe group$")
    public void iEnterValueInFieldSkillsFundingAgencyWithInRevenueGrantsDfeGroup(String arg0) {
        revenueGrantsDfEGroup.setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.SkillsFundingAgency,arg0);
    }

    @Then("^I see the value in field Total is \"([^\"]*)\" in family capital grants page in revenue grants dfe group$")
    public void iSeeTheValueInFieldTotalIsInFamilyCapitalGrantsPageInRevenueGrantsDfeGroup(String arg0) {
        Assert.assertEquals(arg0,revenueGrantsDfEGroup.getValueFromFieldByFieldsetInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.Total));
    }

    @Then("^I see the value in field Total is NOT \"([^\"]*)\" in family capital grants page in revenue grants dfe group$")
    public void iSeeTheValueInFieldTotalIsNOTInFamilyCapitalGrantsPageInRevenueGrantsDfeGroup(String arg0) {
        Assert.assertNotEquals(arg0,revenueGrantsDfEGroup.getValueFromFieldByFieldsetInRevenueGrantsDfEGroupPage(RevenueGrantsDfEGroup.RevenueGrantsDFEGroupLabelConstants.Total));
    }


}
