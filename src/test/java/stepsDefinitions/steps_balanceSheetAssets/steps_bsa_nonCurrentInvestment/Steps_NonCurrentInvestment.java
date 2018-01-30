package stepsDefinitions.steps_balanceSheetAssets.steps_bsa_nonCurrentInvestment;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_NonCurrentInvestment extends BaseTest {
    @And("^I navigate to BSA Non Non Current Investment page$")
    public void iNavigateToBSANonNonCurrentInvestmentPage(){
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.NonCurrentInvestments);
        hardAssertion.assertTrue(nonCurrentInvestment.isHeaderPresentAndDisplayedForBSA_NonCurrentInvestment(), "Failed to display the Header for Current Investment Page");
        hardAssertion.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.BalanceSheetAssets), "Balance Sheet Assets not displayed in Navigation Panel");

    }

    @And("^I enter in row Original prior year closing balance  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Original prior year closing balance  and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowOriginalPriorYearClosingBalanceAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Adjustments made to opening balance  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Adjustments made to opening balance and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Additions  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowAdditionsAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Additions and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowAdditionsAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Transferred in on conversion local authority  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowTransferredInOnConversionLocalAuthorityAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Transferred in on conversion local authority and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowTransferredInOnConversionLocalAuthorityAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Transferred in on conversion elsewhere  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowTransferredInOnConversionElsewhereAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Transferred in on conversion elsewhere and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowTransferredInOnConversionElsewhereAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Transferred in on existing academies joining the trust  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowTransferredInOnExistingAcademiesJoiningTheTrustAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Transferred in on existing academies joining the trust and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Transferred out on existing academies leaving the trust  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Transferred out on existing academies leaving the trust and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Disposals  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowDisposalsAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Disposals and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowDisposalsAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Impairments  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowImpairmentsAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Impairments and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowImpairmentsAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Reclassification from non Non Current asset investments  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowReclassificationFromNonNonCurrentAssetInvestmentsAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Reclassification from non Non Current asset investments and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowReclassificationFromNonNonCurrentAssetInvestmentsAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Reclassification to non Non Current asset investments  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowReclassificationToNonNonCurrentAssetInvestmentsAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Reclassification to non Non Current asset investments and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowReclassificationToNonNonCurrentAssetInvestmentsAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Reclassification within Non Current asset investments  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowReclassificationWithinNonCurrentAssetInvestmentsAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Reclassification within Non Current asset investments and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowReclassificationWithinNonCurrentAssetInvestmentsAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I enter in row Period end fair value gain loss  and all Columns with \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iEnterInRowPeriodEndFairValueGainLossAndAllColumnsWithInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row Period end fair value gain loss and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowPeriodEndFairValueGainLossAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }

    @And("^I must see row At close of period  and all Columns is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeRowAtCloseOfPeriodAndAllColumnsIsInBSANonCurrentInvestment(String arg0){

    }

    @Then("^I must see the row At close of period and column Total is \"([^\"]*)\" in BSA  Non Current Investment$")
    public void iMustSeeTheRowAtCloseOfPeriodAndColumnTotalIsInBSANonCurrentInvestment(String arg0){

    }
}
