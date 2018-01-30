package stepsDefinitions.steps_AssetsUnderConstruction.steps_auc_debtors;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.assetUnderConstruction.auc_TangibleFixedAssets.AUC_TFA_Debtors;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_auc_tfa_debtors extends BaseTest{


    @And("^I have navigated to the Debtors Section for AUC$")
    public void iHaveNavigatedToTheDebtorsSectionForAUC() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.AUC_TAB_MENU_OPTIONS.Debtors);
        hardAssertion.assertTrue(auc_debtors.isHeaderPresentAndDisplayed(), "Failed to display the Header for AUC Debtorss page");
    }

    @And("^I enter value in row Accrued Capital Grant DfEESFA and column Amounts due within one year with \"([^\"]*)\" and column Amount due after more than one year with \"([^\"]*)\"$")
    public void iEnterValueInRowAccruedCapitalGrantDfEESFAAndColumnAmountsDueWithinOneYearWithAndColumnAmountDueAfterMoreThanOneYearWith(String arg0, String arg1) {
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.AccruedCapitalGrantDFEESFA, AUC_TFA_Debtors.ColumnConstant.AmountsDueWithin1Year,arg0);
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.AccruedCapitalGrantDFEESFA, AUC_TFA_Debtors.ColumnConstant.AmountsDueAfterMoreThan1Year,arg1);

    }

    @And("^I enter value in row Accrued capital grant other and column Amounts due within one year with \"([^\"]*)\" and column Amount due after more than one year with \"([^\"]*)\"$")
    public void iEnterValueInRowAccruedCapitalGrantOtherAndColumnAmountsDueWithinOneYearWithAndColumnAmountDueAfterMoreThanOneYearWith(String arg0, String arg1) {
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.AccruedCapitalGrantOther, AUC_TFA_Debtors.ColumnConstant.AmountsDueWithin1Year,arg0);
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.AccruedCapitalGrantOther, AUC_TFA_Debtors.ColumnConstant.AmountsDueAfterMoreThan1Year,arg1);
    }

    @And("^I enter value in row Accrued Income column Amounts due within one year with \"([^\"]*)\" and column Amount due after more than one year with \"([^\"]*)\"$")
    public void iEnterValueInRowAccruedIncomeColumnAmountsDueWithinOneYearWithAndColumnAmountDueAfterMoreThanOneYearWith(String arg0, String arg1) {
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.AccruedIncome, AUC_TFA_Debtors.ColumnConstant.AmountsDueWithin1Year,arg0);
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.AccruedIncome, AUC_TFA_Debtors.ColumnConstant.AmountsDueAfterMoreThan1Year,arg1);
    }

    @And("^I enter value in row Other Debtors and column Amounts due within one year with \"([^\"]*)\" and column Amount due after more than one year with \"([^\"]*)\"$")
    public void iEnterValueInRowOtherDebtorsAndColumnAmountsDueWithinOneYearWithAndColumnAmountDueAfterMoreThanOneYearWith(String arg0, String arg1) {
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.OtherDebtors, AUC_TFA_Debtors.ColumnConstant.AmountsDueWithin1Year,arg0);
        auc_debtors.setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(AUC_TFA_Debtors.RowConstants.OtherDebtors, AUC_TFA_Debtors.ColumnConstant.AmountsDueAfterMoreThan1Year,arg1);
    }

    @Then("^I must see value in row Totals and column Amounts due within one year with \"([^\"]*)\" and column Amount due after more than one year with \"([^\"]*)\"$")
    public void iMustSeeValueInRowTotalsAndColumnAmountsDueWithinOneYearWithAndColumnAmountDueAfterMoreThanOneYearWith(String arg0, String arg1) {
        hardAssertion.assertEquals(auc_debtors.getValueByRowNameAndColumnName(AUC_TFA_Debtors.RowConstants.Total, AUC_TFA_Debtors.ColumnConstant.AmountsDueWithin1Year),arg0);
        hardAssertion.assertEquals(auc_debtors.getValueByRowNameAndColumnName(AUC_TFA_Debtors.RowConstants.Total, AUC_TFA_Debtors.ColumnConstant.AmountsDueAfterMoreThan1Year),arg1);
    }

    @Then("^I must not see value in row Totals and column Amounts due within one year with \"([^\"]*)\" and column Amount due after more than one year with \"([^\"]*)\"$")
    public void iMustNotSeeValueInRowTotalsAndColumnAmountsDueWithinOneYearWithAndColumnAmountDueAfterMoreThanOneYearWith(String arg0, String arg1) {
        hardAssertion.assertNotEquals(auc_debtors.getValueByRowNameAndColumnName(AUC_TFA_Debtors.RowConstants.Total, AUC_TFA_Debtors.ColumnConstant.AmountsDueWithin1Year),arg0);
        hardAssertion.assertNotEquals(auc_debtors.getValueByRowNameAndColumnName(AUC_TFA_Debtors.RowConstants.Total, AUC_TFA_Debtors.ColumnConstant.AmountsDueAfterMoreThan1Year),arg1);
    }
}
