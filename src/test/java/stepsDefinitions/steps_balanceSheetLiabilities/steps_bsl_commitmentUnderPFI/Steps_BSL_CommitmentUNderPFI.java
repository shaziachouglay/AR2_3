package stepsDefinitions.steps_balanceSheetLiabilities.steps_bsl_commitmentUnderPFI;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetLiabilities.commitmentUnderPFI.ComitmentUnderPFI;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.balanceSheetLiabilities.commitmentUnderPFI.ComitmentUnderPFI.ColumnConstant.*;
import static pageObjects.balanceSheetLiabilities.commitmentUnderPFI.ComitmentUnderPFI.ColumnConstant.Total;
import static pageObjects.balanceSheetLiabilities.commitmentUnderPFI.ComitmentUnderPFI.RowConstants.*;


public class Steps_BSL_CommitmentUNderPFI extends BaseTest {

    @And("^I have navigated to the Commitment Under PFI BSL$")
    public void iHaveNavigatedToTheCommitmentUnderPFIBSL() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSL_MENU_OPTION.CommitmentUnderPFI);
        hardAssertion.assertTrue(commitmentUnderPFI.isHeaderPresentAndDisplayed(), "Failed to display the Header for BSL Commitment Under PFI page");
    }

    @And("^I enter value in row Not later than one year and all columns with \"([^\"]*)\"$")
    public void iEnterValueInRowNotLaterThanOneYearAndAllColumnsWith(String arg0) {
        commitmentUnderPFI.setValueInFieldByRowNameAndColumnName(NoLaterThanOneYEar, OffBalanceSheets,arg0);
        commitmentUnderPFI.setValueInFieldByRowNameAndColumnName(NoLaterThanOneYEar, OnBalanceSheets,arg0);
    }

    @Then("^I see value in row Not later than one year and column Total is \"([^\"]*)\"$")
    public void iSeeValueInRowNotLaterThanOneYearAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(NoLaterThanOneYEar, Total),arg0);
    }

    @And("^I enter value in row Later than one year but not later than five years  and all columns with \"([^\"]*)\"$")
    public void iEnterValueInRowLaterThanOneYearButNotLaterThanFiveYearsAndAllColumnsWith(String arg0) {
        commitmentUnderPFI.setValueInFieldByRowNameAndColumnName(LaterThanOneYearButNoLAterThanFiveYears, OffBalanceSheets,arg0);
        commitmentUnderPFI.setValueInFieldByRowNameAndColumnName(LaterThanOneYearButNoLAterThanFiveYears, OnBalanceSheets,arg0);
    }

    @Then("^I see value in row Later than one year but not later than five years  and column Total is \"([^\"]*)\"$")
    public void iSeeValueInRowLaterThanOneYearButNotLaterThanFiveYearsAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(LaterThanOneYearButNoLAterThanFiveYears,Total),arg0);
    }

    @And("^I enter value in row Later than five years and all columns with \"([^\"]*)\"$")
    public void iEnterValueInRowLaterThanFiveYearsAndAllColumnsWith(String arg0) {
        commitmentUnderPFI.setValueInFieldByRowNameAndColumnName(LaterThanFiveYears, OffBalanceSheets,arg0);
        commitmentUnderPFI.setValueInFieldByRowNameAndColumnName(LaterThanFiveYears, OnBalanceSheets,arg0);
    }

    @Then("^I see value in row Later than five years and column Total is \"([^\"]*)\"$")
    public void iSeeValueInRowLaterThanFiveYearsAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(LaterThanFiveYears,Total),arg0);
    }

    @Then("^I see value in row Total and all columns with \"([^\"]*)\"$")
    public void iSeeValueInRowTotalAndAllColumnsWith(String arg0) {
        hardAssertion.assertEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.Total, OffBalanceSheets),arg0);
        hardAssertion.assertEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.Total, OnBalanceSheets),arg0);
    }

    @Then("^I see value in row Total and column Total is \"([^\"]*)\"$")
    public void iSeeValueInRowTotalAndColumnTotalIs(String arg0) {
        hardAssertion.assertEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.Total, Total),arg0);
    }

    @Then("^I see value in row Not later than one year and column Total is NOT \"([^\"]*)\"$")
    public void iSeeValueInRowNotLaterThanOneYearAndColumnTotalIsNOT(String arg0) {
        hardAssertion.assertNotEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.NoLaterThanOneYEar, Total),arg0);
    }

    @Then("^I see value in row Later than one year but not later than five years  and column Total is NOT \"([^\"]*)\"$")
    public void iSeeValueInRowLaterThanOneYearButNotLaterThanFiveYearsAndColumnTotalIsNOT(String arg0) {
        hardAssertion.assertNotEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.LaterThanOneYearButNoLAterThanFiveYears, Total),arg0);
    }

    @Then("^I see value in row Later than five years and column Total is NOT \"([^\"]*)\"$")
    public void iSeeValueInRowLaterThanFiveYearsAndColumnTotalIsNOT(String arg0) {
        hardAssertion.assertNotEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.LaterThanFiveYears, Total),arg0);
    }

    @Then("^I see value in row Total and all columns is NOT \"([^\"]*)\"$")
    public void iSeeValueInRowTotalAndAllColumnsIsNOT(String arg0) {
        hardAssertion.assertNotEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.Total, OffBalanceSheets),arg0);
        hardAssertion.assertNotEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.Total, OnBalanceSheets),arg0);
    }

    @Then("^I see value in row Total and column Total is NOT \"([^\"]*)\"$")
    public void iSeeValueInRowTotalAndColumnTotalIsNOT(String arg0) {
        hardAssertion.assertNotEquals(commitmentUnderPFI.getValueByRowNameAndColumnName(ComitmentUnderPFI.RowConstants.Total, Total),arg0);
    }
}
