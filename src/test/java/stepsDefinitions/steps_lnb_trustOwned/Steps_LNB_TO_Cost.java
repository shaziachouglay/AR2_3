package stepsDefinitions.steps_lnb_trustOwned;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.landAndBuildings.trustOwned.TO_Cost;
import pageObjects.navigationPanel.NavigationMenuBar;
import stepsDefinitions.standigData_steps.StandingDataForDev;

public class Steps_LNB_TO_Cost extends BaseTest {

    private StandingDataForDev standingDataForDev = new StandingDataForDev();

    @Given("^I am on Land and Buildings Section$")
    public void iAmOnLandAndBuildingsSection(){
        standingDataForDev.iAmOnDevEnvironmentAsPreparer();
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.LandAndBuildings);
    }

    @Then("^I see the value in row At close of period and column Totals is NOT\"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I have navigated to the Trust Owned Cost Page$")
    public void iHaveNavigatedToTheTrustOwnedCostPage(){
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.TrustOwned);
        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.LNB_TAB_MENU_OPTIONS.TrustOwned, NavigationMenuBar.LNB_TAB_SUBMENU_OPTIONS.Cost );
        hardAssertion.assertTrue(to_cost.isHeaderPresentAndDisplayedForAUC_CostPage(), "Failed to display the Header for LNB Trust Owned Cost page");
    }

    @And("^I enter value in row Original prior year closing balance  and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowOriginalPriorYearClosingBalanceAndAllColumnWithInLNB_TO_C(String arg0) {
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Original prior year closing balance  and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAndColumnTotalsIsInLNB_TO_C(String arg0) {
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndAllColumnWithInLNB_TO_C(String arg0) {
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdjustmentMadeToOpeningBalance, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdjustmentMadeToOpeningBalance, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdjustmentMadeToOpeningBalance, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdjustmentMadeToOpeningBalance, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalsIsInLNB_TO_C(String arg0) {
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdjustmentMadeToOpeningBalance, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Additions funded from Free Schools Priority Schools Building programme and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndAllColumnWithInLNB_TO_C(String arg0) {
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Additions funded from Free Schools Priority Schools Building programme  and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndColumnTotalsIsInLNB_TO_C(String arg0) {
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Additions funded from other DFE and ESFA capital grant and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowAdditionsFundedFromOtherDFEAndESFACapitalGrantAndAllColumnWithInLNB_TO_C(String arg0) {
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Additions funded from other DFE and ESFA capital grant and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdditionsFundedFromOtherDFEAndESFACapitalGrantAndColumnTotalsIsInLNB_TO_C(String arg0) {
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Additions and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowAdditionsAndAllColumnWithInLNB_TO_C(String arg0) {
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsOther, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsOther, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsOther, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsOther, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Additions and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdditionsAndColumnTotalsIsInLNB_TO_C(String arg0) {
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsOther, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred in on conversion local authority and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowTransferredInOnConversionLocalAuthorityAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionLocalAuthority, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionLocalAuthority, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionLocalAuthority, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionLocalAuthority, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred in on conversion local authority and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredInOnConversionLocalAuthorityAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionLocalAuthority, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred in on conversion elsewhere and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowTransferredInOnConversionElsewhereAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionElsewhere, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionElsewhere, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionElsewhere, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionElsewhere, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred in on conversion elsewhere and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredInOnConversionElsewhereAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionElsewhere, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred in on existing Academies joining the Trust and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred in on existing Academies joining the Trust and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Transferred out on existing Academies leaving the Trust and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Transferred out on existing Academies leaving the Trust and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Donations DFE and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowDonationsDFEAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationDFEESFA, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationDFEESFA, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationDFEESFA, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationDFEESFA, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Donations DFE and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowDonationsDFEAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.DonationDFEESFA, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Donations non DFEand all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowDonationsNonDFEandAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationsNonDFEESFA, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationsNonDFEESFA, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationsNonDFEESFA, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.DonationsNonDFEESFA, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Donations non DFE and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowDonationsNonDFEAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.DonationsNonDFEESFA, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Disposals and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowDisposalsAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Disposals, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Disposals, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Disposals, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Disposals, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Disposals and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowDisposalsAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.Disposals, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Revaluations and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowRevaluationsAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Revaluations, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Revaluations, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Revaluations, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Revaluations, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Revaluations and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowRevaluationsAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.Revaluations, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I enter value in row Reclassifications and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iEnterValueInRowReclassificationsAndAllColumnWithInLNB_TO_C(String arg0){
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Reclassifications, TO_Cost.ColumnConstant.FreeholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Reclassifications, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Reclassifications, TO_Cost.ColumnConstant.LeaseholdImprovements,arg0);
        to_cost.setValueInFieldByRowNameAndColumnName(TO_Cost.RowConstants.Reclassifications, TO_Cost.ColumnConstant.AssetsUnderConstruction,arg0);
    }

    @Then("^I see the value in row Reclassifications and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowReclassificationsAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.Reclassifications, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I see value in row At close of period and all column with \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeValueInRowAtCloseOfPeriodAndAllColumnWithInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.LeaseholdImprovements),arg0);
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.AssetsUnderConstruction),arg0);

    }

    @Then("^I see the value in row At close of period and column Totals is \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAtCloseOfPeriodAndColumnTotalsIsInLNB_TO_C(String arg0){
        hardAssertion.assertEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred in on conversion local authority and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredInOnConversionLocalAuthorityAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred in on conversion elsewhere and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredInOnConversionElsewhereAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnConversionElsewhere, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred in on existing Academies joining the Trust and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredInOnExistingAcademiesJoiningTheTrust, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Transferred out on existing Academies leaving the Trust and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.TransferredOutOnExistingAcademiesLeavingTheTrust, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Donations DFE and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowDonationsDFEAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.DonationDFEESFA, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Donations non DFE and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowDonationsNonDFEAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.DonationsNonDFEESFA, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Disposals and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowDisposalsAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.Disposals, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Revaluations and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowRevaluationsAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.Revaluations, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Reclassifications and column Totals is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowReclassificationsAndColumnTotalsIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.Reclassifications, TO_Cost.ColumnConstant.Total),arg0);
    }

    @And("^I see value in row At close of period and all column is NOT \"([^\"]*)\" in LNB_TO_C$")
    public void iSeeValueInRowAtCloseOfPeriodAndAllColumnIsNOTInLNB_TO_C(String arg0){
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.FreeholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.LeaseholdLandAndBuildings),arg0);
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.LeaseholdImprovements),arg0);
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AtCloseOfPeriod, TO_Cost.ColumnConstant.AssetsUnderConstruction),arg0);
    }

    @Then("^I see the value in row Original prior year closing balance  and column Totals is NOT\"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowOriginalPriorYearClosingBalanceAndColumnTotalsIsNOTInLNB_TO_C(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column Totals is NOT\"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalsIsNOTInLNB_TO_C(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdjustmentMadeToOpeningBalance, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Additions funded from Free Schools Priority Schools Building programme  and column Totals is NOT\"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgrammeAndColumnTotalsIsNOTInLNB_TO_C(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Additions funded from other DFE and ESFA capital grant and column Totals is NOT\"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdditionsFundedFromOtherDFEAndESFACapitalGrantAndColumnTotalsIsNOTInLNB_TO_C(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsFundedFromOtherDFEESFACapitalGrants, TO_Cost.ColumnConstant.Total),arg0);
    }

    @Then("^I see the value in row Additions and column Totals is NOT\"([^\"]*)\" in LNB_TO_C$")
    public void iSeeTheValueInRowAdditionsAndColumnTotalsIsNOTInLNB_TO_C(String arg0) throws Throwable {
        hardAssertion.assertNotEquals(to_cost.getValueByRowNameAndColumnName(TO_Cost.RowConstants.AdditionsOther, TO_Cost.ColumnConstant.Total),arg0);
    }
}
