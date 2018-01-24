package stepsDefinitions.steps_lnb_landAndBuildingsTotal;

import baseTest.BaseTest;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.landAndBuildings.landAndBuildingsTotal.LBT_Impairments.LabelConstant.*;

public class Steps_LNB_LNBT_Impairments extends BaseTest{

    @Then("^I see I have navigated to the land and Buildings Total Impairments page$")
    public void iSeeIHaveNavigatedToTheLandAndBuildingsTotalImpairmentsPage(){
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.LandAndBuildingsTotal, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Imparments );
        hardAssertion.assertTrue(lbt_impairments.isHeaderPresentAndDisplayed(), "Failed to display the Header for LNBT Depreciation page");
    }

    @Then("^I see all the fields in LNBT Impairments page are populated with \"([^\"]*)\"$")
    public void iSeeAllTheFieldsInLNBTImpairmentsPageArePopulatedWith(String arg0){

        hardAssertion.assertEquals(lbt_impairments.getValueFromInputFieldByLabelName(OriginalPriorYearClosingbalance),arg0);
        hardAssertion.assertEquals(lbt_impairments.getValueFromInputFieldByLabelName(AdjustmentMadeToOpeningbalance),arg0);
        hardAssertion.assertEquals(lbt_impairments.getValueFromInputFieldByLabelName(ChargedInPeriod),arg0);
        hardAssertion.assertEquals(lbt_impairments.getValueFromInputFieldByLabelName(ReleasedInPeriod),arg0);
        hardAssertion.assertEquals(lbt_impairments.getValueFromInputFieldByLabelName(TransferredOutOnExistingAcademiesLeavingTheTrust),arg0);
    }

    @Then("^I see the filed Transferred in on existing Academies leaving the Trust and al columns with \"([^\"]*)\"in Academies Impairments$")
    public void iSeeTheFiledTransferredInOnExistingAcademiesLeavingTheTrustAndAlColumnsWithInAcademiesImpairments(String arg0) throws Throwable {
        hardAssertion.assertEquals(lbt_impairments.getValueFromInputFieldByLabelName(TransferredInOnExistingAcademiesLeavingTheTrust),arg0);
    }
}
