package stepsDefinitions.steps_sofa_provisionOfBoardingActivities;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.provisionOfBoardingActivities.ProvisionOfBoardingActivitesExpenditure;

public class Steps_ProvisionOfBoardingActivitiesExpenditure extends BaseTest{

    @And("^I have navigates to the Provision Of Activities Expenditure page$")
    public void iHaveNavigatesToTheProvisionOfActivitiesExpenditurePage() throws Throwable {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.ProvisionOfBoardingActivities, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.Expenditure);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(expenditure.isHeaderPresentAndDisplayedForBoardingActivitiesExpenditurePage());
    }

    @And("^I enter value in field Direct Staff Pay with \"([^\"]*)\"$")
    public void iEnterValueInFieldDirectStaffPayWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.DirectStaffPayCosts,arg0);
    }

    @And("^I enter value in field Direct Costs for Goods and Services  with \"([^\"]*)\"$")
    public void iEnterValueInFieldDirectCostsForGoodsAndServicesWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.DirectCostsForGoodsAndServices,arg0);
    }

    @And("^I enter value in field Other Direct Costs with \"([^\"]*)\"$")
    public void iEnterValueInFieldOtherDirectCostsWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.OtherDirectCosts,arg0);
    }

    @Then("^I see the value in field Total Direct Cost is \"([^\"]*)\"$")
    public void iSeeTheValueInFieldTotalDirectCostIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,expenditure.getValueFromFieldByLabelInProvisionOfBoardignActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.TotalDirectCosts));
    }

    @And("^I enter value in field Indirect Costs for Staff Pay with \"([^\"]*)\"$")
    public void iEnterValueInFieldIndirectCostsForStaffPayWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.IndirectCostsForStaffPay,arg0);
    }

    @And("^I enter value in field Indirect Costs for Utilities with \"([^\"]*)\"$")
    public void iEnterValueInFieldIndirectCostsForUtilitiesWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.IndirectCostsForUtilities,arg0);
    }

    @And("^I enter value in field Indirect Costs for Maintenance of Premises with \"([^\"]*)\"$")
    public void iEnterValueInFieldIndirectCostsForMaintenanceOfPremisesWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.IndirectCostsForMaintenanceOfPremises,arg0);
    }

    @And("^I enter value in field Indirect Costs for Depreciation with \"([^\"]*)\"$")
    public void iEnterValueInFieldIndirectCostsForDepreciationWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.IndirectCostsForDepreciation,arg0);
    }

    @And("^I enter value in field Indirect Costs for Amortisation with \"([^\"]*)\"$")
    public void iEnterValueInFieldIndirectCostsForAmortisationWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.IndirectCostsForAmortisation,arg0);
    }

    @And("^I enter value in field Indirect Costs for Impairment with \"([^\"]*)\"$")
    public void iEnterValueInFieldIndirectCostsForImpairmentWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.IndirectCostsForImpairment,arg0);
    }

    @And("^I enter value in field Other Indirect Costs with \"([^\"]*)\"$")
    public void iEnterValueInFieldOtherIndirectCostsWith(String arg0) throws Throwable {
        expenditure.setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.OtherIndirectCosts,arg0);
    }

    @Then("^I see the value in field Total Indirect Costs is \"([^\"]*)\"$")
    public void iSeeTheValueInFieldTotalIndirectCostsIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(arg0,expenditure.getValueFromFieldByLabelInProvisionOfBoardignActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.TotalIndirectCosts));
    }

    @Then("^I see the value in field Total Direct Cost is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInFieldTotalDirectCostIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,expenditure.getValueFromFieldByLabelInProvisionOfBoardignActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.TotalDirectCosts));
    }

    @Then("^I see the value in field Total Indirect Costs is NOT \"([^\"]*)\"$")
    public void iSeeTheValueInFieldTotalIndirectCostsIsNOT(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(arg0,expenditure.getValueFromFieldByLabelInProvisionOfBoardignActivitiesExpenditurePage(ProvisionOfBoardingActivitesExpenditure.ProvisionOfBoardingActiviteisExpenditureLabelConstants.TotalIndirectCosts));
    }
}
