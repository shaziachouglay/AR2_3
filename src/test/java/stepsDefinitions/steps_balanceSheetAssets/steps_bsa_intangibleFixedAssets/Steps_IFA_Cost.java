package stepsDefinitions.steps_balanceSheetAssets.steps_bsa_intangibleFixedAssets;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.balanceSheetAssets.intangibleFixedAssets.IFA_Cost;
import pageObjects.navigationPanel.NavigationMenuBar;

public class Steps_IFA_Cost extends BaseTest{
    @And("^I navigate to IFA Cost page$")
    public void iNavigateToIFACostPage(){

        navigationMenuBar.click_arMenuTabBarOptionsWithSubMenuOption(NavigationMenuBar.BSA_TAB_MENU_OPTIONS.IntangibelFixedAssets, NavigationMenuBar.BSA_TAB_SUBMENU_OPTIONS.Cost);
        hardAssertion.assertTrue(ifa_cost.isPageHeaderPresentAndDisplayedInIFACostPage(), "Failed to display the Header for IFA Cost page");
    }

    @And("^I enter in row Original prior year closing balance  and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowOriginalPriorYearClosingBalanceAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.OriginalPriorYearClosingBalance, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.OriginalPriorYearClosingBalance, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.OriginalPriorYearClosingBalance, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Adjustments made to opening balance and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowAdjustmentsMadeToOpeningBalanceAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.AdjustmentsMadeToOpeningBalance, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Additions and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowAdditionsAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Additions, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Additions, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Additions, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Transferred in on conversion local authority and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnConversionLocalAuthorityAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnConversionLocalAuthority, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnConversionLocalAuthority, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnConversionLocalAuthority, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Transferred in on conversion elsewhere and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnConversionElsewhereAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnConversionElsewhere, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnConversionElsewhere, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnConversionElsewhere, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Transferred in on existing academies joining the trust and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowTransferredInOnExistingAcademiesJoiningTheTrustAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredInOnExistingAcademiesJoiningTheTrust, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Transferred out on existing academies leaving the trust and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowTransferredOutOnExistingAcademiesLeavingTheTrustAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.TransferredOutOnExistingAcademiesLeavingTheTrust, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Donations and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowDonationsAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Donations, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Donations, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Donations, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Disposals and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowDisposalsAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Disposals, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Disposals, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Disposals, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Revaluations and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowRevaluationsAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Revaluations, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Revaluations, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Revaluations, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I enter in row Reclassifications and column \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iEnterInRowReclassificationsAndColumnAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Reclassifications, IFA_Cost.columnName.Software,arg0);
        ifa_cost.setValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Reclassifications, IFA_Cost.columnName.Other,arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.Reclassifications, IFA_Cost.columnName.Total),arg2);
    }

    @And("^I must see row At close of period and column to be  \"([^\"]*)\" \"([^\"]*)\" and must see the total is \"([^\"]*)\"$")
    public void iMustSeeRowAtCloseOfPeriodAndColumnToBeAndMustSeeTheTotalIs(String arg0, String arg1, String arg2){
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.AtCloseOfPeriod, IFA_Cost.columnName.Software),arg0);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.AtCloseOfPeriod, IFA_Cost.columnName.Other),arg1);
        hardAssertion.assertEquals(ifa_cost.getValueByRowNameAndColumnNameInIFACostPage(IFA_Cost.rowName.AtCloseOfPeriod, IFA_Cost.columnName.Total),arg2);
    }
}
