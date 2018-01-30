package stepsDefinitions.steps_landAndBuilding.steps_lnb_landAndBuildingsTotal;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.landAndBuildings.landAndBuildingsTotal.LBT_Depreciation.LabelConstant.*;

public class Steps_LNB_LNBT_Depreciation extends BaseTest {
    @And("^I have navigated to the Land and Buildings Total Depreciation Page$")
    public void iHaveNavigatedToTheLandAndBuildingsTotalDepreciationPage() {

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.LandAndBuildingsTotal, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Depreciation );
        hardAssertion.assertTrue(lbt_depreciation.isHeaderPresentAndDisplayed(), "Failed to display the Header for LNBT Depreciation page");
    }

    @Then("^I see all the fields are populated with \"([^\"]*)\" in LNBT Depreciation Page$")
    public void iSeeAllTheFieldsArePopulatedWithInLNBTDepreciationPage(String arg0) {

        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(OriginalPriorYearClosingbalance),arg0);
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(AdjustmentMadeToOpeningbalance),arg0);
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(ChargedInPeriod),arg0);
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(EliminatedOnDisposal),arg0);
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(TransferredOutOnExistingAcademiesLeavingTheTrust),arg0);
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(Revaluations),arg0);
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(Reclassifications),arg0);
    }

    @Then("^I must see the value for field TransferredInOnExistingAcademiesJoiningTheTrust is \"([^\"]*)\"$")
    public void iMustSeeTheValueForFieldTransferredInOnExistingAcademiesJoiningTheTrustIs(String arg0) throws Throwable {
        hardAssertion.assertEquals(lbt_depreciation.getValueFromInputFieldByLabelName(TransferredInOnExistingAcademiesJoiningTheTrust),arg0);
    }
}
