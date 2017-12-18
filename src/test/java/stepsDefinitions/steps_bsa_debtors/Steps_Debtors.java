package stepsDefinitions.steps_bsa_debtors;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.balanceSheetAssets.debtors.Debtors;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_Debtors extends BaseTest {
    @And("^I navigate to BSA Debtors page$")
    public void iNavigateToBSADebtorsPage() {
        navigationMenuBar.click_MenuTabBarOptions(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.Debtors);
        hardAssertion.assertTrue(debtors.isHeaderPresentAndDisplayedForBSA_DebtorsPage(), "Failed to display the Header for Debtors page");
    }

    @And("^I enter value for row Trade debtors before bad debt and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowTradeDebtorsBeforeBadDebtAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.TradeDebtorsBeforeDabDebt, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.TradeDebtorsBeforeDabDebt, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row BAd Debt and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowBAdDebtAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.BadDebt, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.BadDebt, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Accrued capital grant DfE_ESFA and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowAccruedCapitalGrantDfE_ESFAAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccuredCapitalGrantDEESFA, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccuredCapitalGrantDEESFA, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Accrued capital grant other and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowAccruedCapitalGrantOtherAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedCapitalgrantOther, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedCapitalgrantOther, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Accrued revenue grants DFE_ESFA and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowAccruedRevenueGrantsDFE_ESFAAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedRevenueGrantOtherDFEESFA, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedRevenueGrantOtherDFEESFA, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Accrued revenue grants other and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowAccruedRevenueGrantsOtherAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedRevenueGrantOther, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedRevenueGrantOther, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Prepayments and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowPrepaymentsAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.Prepayments, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.Prepayments, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Accrued income and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowAccruedIncomeAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedIncome, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.AccruedIncome, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row VAT recoverable and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowVATRecoverableAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.VATRecoverable, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.VATRecoverable, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row PFI payment  and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowPFIPaymentAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.PFIpayments, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.PFIpayments, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @And("^I enter value for row Other debtors and cloumn Amt due within one year with \"([^\"]*)\" and column Amt due after one year with \"([^\"]*)\"$")
    public void iEnterValueForRowOtherDebtorsAndCloumnAmtDueWithinOneYearWithAndColumnAmtDueAfterOneYearWith(String arg0, String arg1) {
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.OtherDebtors, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year,arg0);
        debtors.setValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.OtherDebtors, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year,arg1);
    }

    @Then("^I musts see the row Total and column Amt due within one year is \"([^\"]*)\" and column Amt due after one year is \"([^\"]*)\"$")
    public void iMustsSeeTheRowTotalAndColumnAmtDueWithinOneYearIsAndColumnAmtDueAfterOneYearIs(String arg0, String arg1) {
        hardAssertion.assertEquals(debtors.getValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.Total, Debtors.BSA_DebtorsColumnLabels.AmountDueWithin1Year),arg0, "Values do nto match");
        hardAssertion.assertEquals(debtors.getValueByRowNameAndColumnNameInBSADebtorsPage(Debtors.BSA_DebtorsRowLabels.Total, Debtors.BSA_DebtorsColumnLabels.AmountDueAfter1Year),arg1, "Values do nto match");
    }
}
