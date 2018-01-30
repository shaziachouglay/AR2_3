package stepsDefinitions.steps_AssetsUnderConstruction.steps_auc_donations;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.assetUnderConstruction.auc_Donations.AUC_Donations;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_auc_donations extends BaseTest{

    @And("^I have navigated to the Donations Section for AUC$")
    public void iHaveNavigatedToTheDonationsSectionForAUC() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.Donations);
        hardAssertion.assertTrue(auc_donations.isHeaderPresentAndDisplayedForDonationsAUCPage(), "Failed to display the Header for AUC Donations page");
    }

    @And("^I enter value in field Donations Fixed Assets with \"([^\"]*)\" in AUC$")
    public void iEnterValueInFieldDonationsFixedAssetsWithInAUC(String arg0) {
        auc_donations.setValueInInPutFieldByFieldsetNameInDonationsAUCPage(AUC_Donations.DonationsAUCLabelConstants.DonationFixedAssets,arg0);
    }

    @And("^I enter value in filed Fixed Assets Donated by the DFEESFA with \"([^\"]*)\" in AUC$")
    public void iEnterValueInFiledFixedAssetsDonatedByTheDFEESFAWithInAUC(String arg0) {
        auc_donations.setValueInInPutFieldByFieldsetNameInDonationsAUCPage(AUC_Donations.DonationsAUCLabelConstants.FixedAssetsDonatedByTheDFEESFA,arg0);
    }

    @And("^I enter value in filed Donated Intangible Assets with \"([^\"]*)\" in AUC$")
    public void iEnterValueInFiledDonatedIntangibleAssetsWithInAUC(String arg0) {
        auc_donations.setValueInInPutFieldByFieldsetNameInDonationsAUCPage(AUC_Donations.DonationsAUCLabelConstants.DonatedIntangibleAssets,arg0);
    }

    @And("^I enter value in field Other Donations with \"([^\"]*)\" in AUC$")
    public void iEnterValueInFieldOtherDonationsWithInAUC(String arg0) {
        auc_donations.setValueInInPutFieldByFieldsetNameInDonationsAUCPage(AUC_Donations.DonationsAUCLabelConstants.OtherDonations,arg0);
    }

    @Then("^I must see the field Total is \"([^\"]*)\" in AUC$")
    public void iMustSeeTheFieldTotalIsInAUC(String arg0) {
    hardAssertion.assertEquals(auc_donations.getValueFromFieldByFieldsetInDonationsAUCPage(AUC_Donations.DonationsAUCLabelConstants.Total),arg0);
    }

    @Then("^I must see the field Total is NOT \"([^\"]*)\" in AUC$")
    public void iMustSeeTheFieldTotalIsNOTInAUC(String arg0)  {
        hardAssertion.assertNotEquals(auc_donations.getValueFromFieldByFieldsetInDonationsAUCPage(AUC_Donations.DonationsAUCLabelConstants.Total),arg0);
    }
}
