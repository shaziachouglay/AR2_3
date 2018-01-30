package stepsDefinitions.steps_landAndBuilding.steps_lnb_landAndBuildingsTotal;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.landAndBuildings.landAndBuildingsTotal.LBT_Cost;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_LNB_LNBT_Cost extends BaseTest {

    @And("^I have navigated to the Land and Buildings Total Cost Page$")
    public void iHaveNavigatedToTheLandAndBuildingsTotalCostPage() {

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.LandAndBuildingsTotal, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Cost );
        hardAssertion.assertTrue(academies_cost.isHeaderPresentAndDisplayedForAUC_CostPage(), "Failed to display the Header for LNBT Cost page");

    }

    @Then("^I see all the labels are populated with \"([^\"]*)\"$")
    public void iSeeAllTheLabelsArePopulatedWith(String arg0) throws Throwable {
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.OriginalPriorYearClosingbalance), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.AdjustmentMadeToOpeningbalance), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.AdditionsFundedFromFreeSchoolsProritySchoolBuildingProgramme), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.AdditionsFundedFromOtherDFEandESFACapitalGransts), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.Additions), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.TransferredInOnConversionLocalAuthority), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.TransferredInOnConversionElsewhere), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.TransferredInOnExistingAcademiesJoiningTheTrust), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.TransferredOutOnExitingAcademiesLeavingTheTrust), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.DonationsDFEESFA), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.DonationsNonDFEESFA), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.Disposals), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.Revaluations), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.Reclassifications), arg0);
    }

    @Then("^I see the filed At the Close of period is now \"([^\"]*)\"$")
    public void iSeeTheFiledAtTheCloseOfPeriodIsNow(String arg0) throws Throwable {
        //hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelNameInDonationsPage(LBT_Cost.LabelConstant.AtCloseOfPeriod), arg0);
        hardAssertion.assertEquals(lbt_cost.getValueFromInputFieldByLabelName(LBT_Cost.LabelConstant.AtCloseOfPeriod), arg0);
    }
}
