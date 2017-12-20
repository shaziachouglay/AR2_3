package stepsDefinitions.steps_auc_capitalGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.assetUnderConstruction.auc_CapitalGranst.AUC_CapitalGranst;
import pageObjects.navigationPanel.NavigationMenuBar;
import stepsDefinitions.standigData_steps.StandingDataForDev;

public class Steps_auc_capitalGrants extends BaseTest {

    private StandingDataForDev standingDataForDev = new StandingDataForDev();

    @Given("^I am on Asset Under Construction$")
    public void iAmOnAssetUnderConstruction() {
        standingDataForDev.iAmOnDevEnvironmentAsPreparer();
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.AssetUnderConstruction);
    }

    @And("^I have navigated to the Capital Grants Section for AUC$")
    public void iHaveNavigatedToTheCapitalGrantsSectionForAUC() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.CapitalGrants);
        hardAssertion.assertTrue(auc_capitalGranst.isHeaderPresentAndDisplayedForCapitalGrantsAUCPage(), "Failed to display the Header for AUC Capital Grants page");
    }

    @And("^I enter in field Condition Improvement Fund with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldConditionImprovementFundWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.ConditionImprovementFund,arg0);
    }

    @And("^I enter in field MAT School Condition Allowance with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldMATSchoolConditionAllowanceWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.MATsSchoolConditionAllowance,arg0);
    }

    @And("^I enter in field Priority School Building Programme  with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldPrioritySchoolBuildingProgrammeWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.PrioritySchoolBuildingProgramme,arg0);
    }

    @And("^I enter in field Devolved Formula Capital Grant with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldDevolvedFormulaCapitalGrantWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.DevolvedFormulaCapitalGrant,arg0);
    }

    @And("^I enter in field Centrally Managed Programme Free Schools with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldCentrallyManagedProgrammeFreeSchoolsWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.CentrallyManagedProgrammeFreeSchools,arg0);
    }

    @And("^I enter in field Continuing Commitments Building Schools for the Future with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldContinuingCommitmentsBuildingSchoolsForTheFutureWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.ContinuingCommitmentsBuildingSchoolsForTheFuture,arg0);
    }

    @And("^I enter in field Schools Sponsorship Development Fund with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldSchoolsSponsorshipDevelopmentFundWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.SchoolsSponsorshipDevelopmentFund,arg0);
    }

    @And("^I enter in field Other with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldOtherWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.Other,arg0);
    }

    @And("^I enter in field Local Authority Capital Grants with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldLocalAuthorityCapitalGrantsWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.LocalAuthorityCapitalGrnats,arg0);
    }

    @And("^I enter in field Other Government Capital Grants  with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldOtherGovernmentCapitalGrantsWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.OtherGovernmentCapitalGrants,arg0);
    }

    @And("^I enter in field Non-Government Capital Grants with \"([^\"]*)\" in AUC$")
    public void iEnterInFieldNonGovernmentCapitalGrantsWithInAUC(String arg0) {
        auc_capitalGranst.setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.NonGovernmentCapitalGrants,arg0);
    }

    @And("^I must see  field Total with \"([^\"]*)\" in AUC$")
    public void iMustSeeFieldTotalWithInAUC(String arg0) {
        hardAssertion.assertEquals(auc_capitalGranst.getValueFromFieldByFieldsetInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.Total),arg0);
    }

    @And("^I must see  field Total is NOT \"([^\"]*)\" in AUC$")
    public void iMustSeeFieldTotalIsNOTInAUC(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(auc_capitalGranst.getValueFromFieldByFieldsetInCapitalGrantsAUCPage(AUC_CapitalGranst.CapitalGrantsAUCLabelConstants.Total),arg0);
    }
}
