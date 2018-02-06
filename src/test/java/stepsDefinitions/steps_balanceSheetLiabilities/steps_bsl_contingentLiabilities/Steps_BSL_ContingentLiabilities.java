package stepsDefinitions.steps_balanceSheetLiabilities.steps_bsl_contingentLiabilities;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.balanceSheetLiabilities.contingentLiabilities.ContingentLiabilities.ColumnConstant.*;
import static pageObjects.balanceSheetLiabilities.contingentLiabilities.ContingentLiabilities.RowConstants.*;

public class Steps_BSL_ContingentLiabilities extends BaseTest{
    @And("^I have navigated to the Contingent Liabilities BSL$")
    public void iHaveNavigatedToTheContingentLiabilitiesBSL() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSL_MENU_OPTION.ContingentLiabilities);
        hardAssertion.assertTrue(contingentLiabilities.isHeaderPresentAndDisplayed(), "Failed to display the Header for BSL Contingent Liabilities  page");
    }

    @And("^I enter value in row At Start of Period and all columns with \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iEnterValueInRowAtStartOfPeriodAndAllColumnsWithInBSLContingentLiabilities(String arg0) {
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AtStartOfPeriod, PremiseIssues,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AtStartOfPeriod, PotentialPrepaymentsOfGransts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AtStartOfPeriod, DisputedInvoices,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AtStartOfPeriod, ContractTerminationCosts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AtStartOfPeriod, UnrecoveredFees,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AtStartOfPeriod, Other,arg0);
    }

    @Then("^I see the value in row At Start of period and column total is \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowAtStartOfPeriodAndColumnTotalIsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtStartOfPeriod, Total),arg0);
    }

    @And("^I enter value in row Adjustments made to opening balance and all columns with \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iEnterValueInRowAdjustmentsMadeToOpeningBalanceAndAllColumnsWithInBSLContingentLiabilities(String arg0) {
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, PremiseIssues,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, PotentialPrepaymentsOfGransts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, DisputedInvoices,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, ContractTerminationCosts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, UnrecoveredFees,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, Other,arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column total is \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, Total),arg0);
    }

    @And("^I enter value in row Liabilities crystallised in year and all columns with \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iEnterValueInRowLiabilitiesCrystallisedInYearAndAllColumnsWithInBSLContingentLiabilities(String arg0) {
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(LiabilitiesCrystallisedInYear, PremiseIssues,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(LiabilitiesCrystallisedInYear, PotentialPrepaymentsOfGransts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(LiabilitiesCrystallisedInYear, DisputedInvoices,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(LiabilitiesCrystallisedInYear, ContractTerminationCosts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(LiabilitiesCrystallisedInYear, UnrecoveredFees,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(LiabilitiesCrystallisedInYear, Other,arg0);
    }

    @Then("^I see the value in row Liabilities crystallised in year and column total is \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowLiabilitiesCrystallisedInYearAndColumnTotalIsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(LiabilitiesCrystallisedInYear, Total),arg0);
    }

    @And("^I enter value in row Increase in period and all columns with \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iEnterValueInRowIncreaseInPeriodAndAllColumnsWithInBSLContingentLiabilities(String arg0) {
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(IncreaseInPeriod, PremiseIssues,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(IncreaseInPeriod, PotentialPrepaymentsOfGransts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(IncreaseInPeriod, DisputedInvoices,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(IncreaseInPeriod, ContractTerminationCosts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(IncreaseInPeriod, UnrecoveredFees,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(IncreaseInPeriod, Other,arg0);
    }

    @Then("^I see the value in row Increase in period and column total is \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowIncreaseInPeriodAndColumnTotalIsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(IncreaseInPeriod, Total),arg0);
    }

    @And("^I enter value in row Obligations expired in period and all columns with \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iEnterValueInRowObligationsExpiredInPeriodAndAllColumnsWithInBSLContingentLiabilities(String arg0) {
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(ObligationsExpiredInPeriod, PremiseIssues,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(ObligationsExpiredInPeriod, PotentialPrepaymentsOfGransts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(ObligationsExpiredInPeriod, DisputedInvoices,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(ObligationsExpiredInPeriod, ContractTerminationCosts,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(ObligationsExpiredInPeriod, UnrecoveredFees,arg0);
        contingentLiabilities.setValueInFieldByRowNameAndColumnName(ObligationsExpiredInPeriod, Other,arg0);
    }

    @Then("^I see the value in row Obligations expired in period and column total is \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowObligationsExpiredInPeriodAndColumnTotalIsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(ObligationsExpiredInPeriod, Total),arg0);
    }

    @Then("^I see value in row At end of period and all columns with \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeValueInRowAtEndOfPeriodAndAllColumnsWithInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, PremiseIssues),arg0);
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, PotentialPrepaymentsOfGransts),arg0);
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, DisputedInvoices),arg0);
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, ContractTerminationCosts),arg0);
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, UnrecoveredFees),arg0);
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, Other),arg0);
    }

    @Then("^I see the value in row At end of period and column total is \"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowAtEndOfPeriodAndColumnTotalIsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, Total),arg0);
    }

    @Then("^I see the value in row At Start of period and column total is NOT\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowAtStartOfPeriodAndColumnTotalIsNOTInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtStartOfPeriod, Total),arg0);
    }

    @Then("^I see the value in row Adjustments made to opening balance and column total is NOT\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowAdjustmentsMadeToOpeningBalanceAndColumnTotalIsNOTInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AdjustmentsMadePriorToOpeningBalance, Total),arg0);
    }

    @Then("^I see the value in row Liabilities crystallised in year and column total is NOT\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowLiabilitiesCrystallisedInYearAndColumnTotalIsNOTInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(LiabilitiesCrystallisedInYear, Total),arg0);
    }

    @Then("^I see the value in row Increase in period and column total is NOT\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowIncreaseInPeriodAndColumnTotalIsNOTInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(IncreaseInPeriod, Total),arg0);
    }

    @Then("^I see the value in row Obligations expired in period and column total is NOT\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowObligationsExpiredInPeriodAndColumnTotalIsNOTInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(ObligationsExpiredInPeriod, Total),arg0);
    }

    @Then("^I see value in row At end of period and all columns with NOTs\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeValueInRowAtEndOfPeriodAndAllColumnsWithNOTsInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, PremiseIssues),arg0);
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, PotentialPrepaymentsOfGransts),arg0);
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, DisputedInvoices),arg0);
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, ContractTerminationCosts),arg0);
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, UnrecoveredFees),arg0);
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, Other),arg0);
    }

    @Then("^I see the value in row At end of period and column total is NOT\"([^\"]*)\" in BSL Contingent Liabilities$")
    public void iSeeTheValueInRowAtEndOfPeriodAndColumnTotalIsNOTInBSLContingentLiabilities(String arg0) {
        hardAssertion.assertNotEquals(contingentLiabilities.getValueByRowNameAndColumnName(AtEndOfPeriod, Total),arg0);
    }
}
