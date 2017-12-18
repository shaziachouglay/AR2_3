package stepsDefinitions.steps_bsa_intangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.balanceSheetAssets.intangibleFixedAssets.IFA_Amortisation;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_IFA_Amortisation extends BaseTest{
    @And("^I navigate to IFA Amortisation page$")
    public void iNavigateToIFAAmortisationPage() {

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.IntangibelFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.Amortisation);
        hardAssertion.assertTrue(ifa_amortisation.isPageHeaderPresentAndDisplayedInIFAAmortisationPage(), "Failed to display the Header for IFA Amortisation page");

    }

    @And("^I enter in row Original prior year closing balance  and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.OriginalPriorYearClosingBalance, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.OriginalPriorYearClosingBalance, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.OriginalPriorYearClosingBalance, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Adjustments made to opening balance and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.AdjustmentsMadeToOpeningBalance, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.AdjustmentsMadeToOpeningBalance, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.AdjustmentsMadeToOpeningBalance, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Charged in period and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowChargedInPeriodAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.ChargedInPeriod, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.ChargedInPeriod, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.ChargedInPeriod, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Eliminated on disposal and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowEliminatedOnDisposalAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.EliminatedOnDisposal, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.EliminatedOnDisposal, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.EliminatedOnDisposal, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Transferred in on existing academies joining the trust and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Transferred out on existing academies leaving the trust and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Revaluations and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowRevaluationsAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.Revaluations, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.Revaluations, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.Revaluations, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I enter in row Reclassifications and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iEnterInRowReclassificationsAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.Reclassifications, IFA_Amortisation.columnName.Software,arg0);
        ifa_amortisation.setValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.Reclassifications, IFA_Amortisation.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.Reclassifications, IFA_Amortisation.columnName.Total),arg2);
    }

    @And("^I must see row At close of period and column \"([^\"]*)\" and \"([^\"]*)\" and the total should be \"([^\"]*)\"$")
    public void iMustSeeRowAtCloseOfPeriodAndColumnAndAndTheTotalShouldBe(String arg0, String arg1, String arg2) {
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.AtCloseOfPeriod, IFA_Amortisation.columnName.Software),arg0);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.AtCloseOfPeriod, IFA_Amortisation.columnName.Other),arg1);
        hardAssertion.assertEquals(ifa_amortisation.getValueByRowNameAndColumnNameInIFAAmortisationPage(IFA_Amortisation.rowName.AtCloseOfPeriod, IFA_Amortisation.columnName.Total),arg2);
    }
}
