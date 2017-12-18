package stepsDefinitions.steps_sofa_capitalGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.sofa.capitalGrants.CapitalGrantsDfEGroup.CapitalGrantsDFEGroupLabelConstants.*;

public class Steps_CapitalGrantsDfEGroup extends BaseTest{


    @And("^I have navigated to the Capital Grants Section$")
    public void iHaveNavigatedToTheCapitalGrantsSection() throws Throwable {
        info("Blank functionality : embedded with the sub tab menu method. ");
    }

    @And("^I have navigated to the DfE Group page$")
    public void iHaveNavigatedToTheDfEGroupPage() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.CapitalGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.DfEGroup);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(dfeGroup.isHeaderPresentAndDisplayedForCapitalGrantsDfEESFAPage(), "Failed to display the Header for DfE Group0 page");
    }

    @When("^I enter value in field National College for Teaching and Leadership with \"([^\"]*)\"$")
    public void iEnterValueInFieldNationalCollegeForTeachingAndLeadershipWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(NationalCollegeForTeachingAndLeadership, arg0);
    }

    @And("^I enter value in field Standards and Testing Agency with \"([^\"]*)\"$")
    public void iEnterValueInFieldStandardsAndTestingAgencyWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(StandardsAndTestingAgency,arg0);
    }

    @And("^I enter value in field Equality and Human Rights Commission with \"([^\"]*)\"$")
    public void iEnterValueInFieldEqualityAndHumanRightsCommissionWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(EqualityAndHumanRightsCommission,arg0);
    }

    @And("^I enter value in field Office of the Children's Commissioner with \"([^\"]*)\"$")
    public void iEnterValueInFieldOfficeOfTheChildrenSCommissionerWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(OfficeOfTheChildrensCommissioner,arg0);
    }

    @And("^I enter value in field Skills Funding Agency with \"([^\"]*)\"$")
    public void iEnterValueInFieldSkillsFundingAgencyWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(SkillsFundingAgency,arg0);
    }

    @Then("^I see the value in field Total is \"([^\"]*)\" in family capital grants page$")
    public void iSeeTheValueInFieldTotalIsInFamilyCapitalGrantsPage(String arg0) throws Throwable {

        Assert.assertEquals(arg0, dfeGroup.getValueFromFieldByFieldsetInFamilyCapitalGrantsPage(Total));
    }

    @Then("^I see the value in field Total is NOT \"([^\"]*)\" in family capital grants page$")
    public void iSeeTheValueInFieldTotalIsNOTInFamilyCapitalGrantsPage(String arg0) throws Throwable {
        Assert.assertNotEquals(arg0, dfeGroup.getValueFromFieldByFieldsetInFamilyCapitalGrantsPage(Total));
    }


    @And("^I enter value in field Student Loan Company with \"([^\"]*)\"$")
    public void iEnterValueInFieldStudentLoanCompanyWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(StudentLoanCompany,arg0);
    }

    @And("^I enter value in field Higher Education Funding Council for England \"([^\"]*)\"$")
    public void iEnterValueInFieldHigherEducationFundingCouncilForEngland(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(HigherEducationFundingCouncilforEngland,arg0);
    }

    @And("^I enter value in field Office for Fair Access with \"([^\"]*)\"$")
    public void iEnterValueInFieldOfficeForFairAccessWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(OfficeforFairAccess,arg0);
    }

    @And("^I enter value in field Engineering Construction Industry Training Board \"([^\"]*)\"$")
    public void iEnterValueInFieldEngineeringConstructionIndustryTrainingBoard(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(EngineeringConstructionIndustryTrainingBoard,arg0);
    }

    @And("^I enter value in field Construction Industry Training Board with \"([^\"]*)\"$")
    public void iEnterValueInFieldConstructionIndustryTrainingBoardWith(String arg0) throws Throwable {
        dfeGroup.setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(ConstructionIndustryTrainingBoard,arg0);
    }
}
