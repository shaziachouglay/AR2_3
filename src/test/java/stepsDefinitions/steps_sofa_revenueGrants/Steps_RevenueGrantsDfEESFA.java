package stepsDefinitions.steps_sofa_revenueGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;

import static pageObjects.sofa.revenueGrants.RevenueGrantsDfEESFA.revenueGrantsColumnLabelConstants.*;
import static pageObjects.sofa.revenueGrants.RevenueGrantsDfEESFA.revenueGrantsRowLabelConstants.*;

/**
 * @author Aniket Wadkar
 */
public class Steps_RevenueGrantsDfEESFA extends BaseTest {


    @When("^I have navigated to the Revenue Grants DfE and ESFA page$")
    public void iHaveNavigatedToTheRevenueGrantsDfEAndESFAPage() {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.RevenueGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.DfEandESFA);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(revenueGrantsDfEESFA.isHeaderPresentAndDisplayedForRevenueGrantsDfEESFAPage());
    }


    @And("^I enter value in row General Annual Grant and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowGeneralAnnualGrantAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(GeneralAnnualGrants, GrantValueInAccounts,arg0);

    }

    @And("^I enter value in row General Annual Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowGeneralAnnualGrantAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(GeneralAnnualGrants, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row General Annual Grant and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowGeneralAnnualGrantAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(GeneralAnnualGrants, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Rates reclaim and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowRatesReclaimAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(RatesReclaim, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Rates reclaim and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowRatesReclaimAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(RatesReclaim, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Rates reclaim and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowRatesReclaimAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(RatesReclaim, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Student Support Services and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowStudentSupportServicesAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StudentSupportService, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Student Support Services and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowStudentSupportServicesAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StudentSupportService, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Student Support Services and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowStudentSupportServicesAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StudentSupportService, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Pupil Premium and Service Premium and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPupilPremiumAndServicePremiumAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilPremiumAndServicePremium, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Pupil Premium and Service Premium and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowPupilPremiumAndServicePremiumAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilPremiumAndServicePremium, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Pupil Premium and Service Premium and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPupilPremiumAndServicePremiumAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilPremiumAndServicePremium, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Pupil Number Adjustment  and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPupilNumberAdjustmentAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilNumberAdjustment, GrantValueInAccounts,arg0);

    }

    @And("^I enter value in row Pupil Number Adjustment  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowPupilNumberAdjustmentAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilNumberAdjustment, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);

    }

    @And("^I enter value in row Pupil Number Adjustment  and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPupilNumberAdjustmentAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilNumberAdjustment, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);

    }

    @And("^I enter value in row Universal Infant Free School Meals and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowUniversalInfantFreeSchoolMealsAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(UniversalInfantFreeSchoolMeals, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Universal Infant Free School Meals and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowUniversalInfantFreeSchoolMealsAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(UniversalInfantFreeSchoolMeals, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Universal Infant Free School Meals and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowUniversalInfantFreeSchoolMealsAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(UniversalInfantFreeSchoolMeals, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Insurance and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowInsuranceAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Insurance, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Insurance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowInsuranceAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Insurance, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Insurance and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowInsuranceAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Insurance, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Sponsor Capacity Grant and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowSponsorCapacityGrantAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(SponsorCapacityGrants, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Sponsor Capacity Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowSponsorCapacityGrantAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(SponsorCapacityGrants, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Sponsor Capacity Grant and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowSponsorCapacityGrantAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(SponsorCapacityGrants, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Start Up Grants and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowStartUpGrantsAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StartUpGrants, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Start Up Grants and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowStartUpGrantsAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StartUpGrants, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Start Up Grants and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowStartUpGrantsAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StartUpGrants, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row PE and Sports Grant and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPEAndSportsGrantAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PEandSportsGrants, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row PE and Sports Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowPEAndSportsGrantAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PEandSportsGrants, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row PE and Sports Grant and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPEAndSportsGrantAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PEandSportsGrants, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Year Seven Catch Up Grant and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowYearSevenCatchUpGrantAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Year7CatchUpGrant, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Year Seven Catch Up Grant  and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowYearSevenCatchUpGrantAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Year7CatchUpGrant, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Year Seven Catch Up Grant  and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowYearSevenCatchUpGrantAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Year7CatchUpGrant, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with \"([^\"]*)\" in revenue grants DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnGranstValueInAccountsWithInRevenueGrantsDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(OldSkillFundingAgency, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in revenue grants DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInRevenueGrantsDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(OldSkillFundingAgency, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in revenue grants DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInRevenueGrantsDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(OldSkillFundingAgency, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Other and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iEnterValueInRowOtherAndColumnGranstValueInAccountsWithInDFEESFAPageInRevenueGrants(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Other, GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page in revenue grants$")
    public void iEnterValueInRowOtherAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPageInRevenueGrants(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Other, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Other and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iEnterValueInRowOtherAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPageInRevenueGrants(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Other, ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @Then("^I see value in row  and Totals Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsGranstValueInAccountsWithInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, GrantValueInAccounts));
    }

    @Then("^I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA));
    }

    @Then("^I see value in row  and Totals Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, ExpenditureRecordedInTheAccountsFromThisGrant));
    }

    @Then("^I see value in row  and Totals Granst Value in Accounts is NOT  \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsGranstValueInAccountsIsNOTInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertNotEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, GrantValueInAccounts));
    }

    @Then("^I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT \"([^\"]*)\"in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordIsNOTInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertNotEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA));
    }

    @Then("^I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsExpenditureRecordedInTheAccountsFromThisGrantIsNOTInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertNotEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, ExpenditureRecordedInTheAccountsFromThisGrant));
    }

    @And("^I wait for Revenue Grants DfE and ESFA Page to load$")
    public void iWaitForRevenueGrantsDfEAndESFAPageToLoad() {
        revenueGrantsDfEESFA.waitForPageLoadToComplete();
    }

    @And("^I enter value in row General Annual Grant and Column Cash received in period per DFE and ESFA record  with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowGeneralAnnualGrantAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(GeneralAnnualGrants, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Rates reclaim and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowRatesReclaimAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(RatesReclaim, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Student Support Services and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowStudentSupportServicesAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StudentSupportService, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Pupil Premium and Service Premium and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPupilPremiumAndServicePremiumAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilPremiumAndServicePremium, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Pupil Number Adjustment  and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPupilNumberAdjustmentAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PupilNumberAdjustment, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Universal Infant Free School Meals and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowUniversalInfantFreeSchoolMealsAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(UniversalInfantFreeSchoolMeals, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Insurance and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowInsuranceAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Insurance, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Sponsor Capacity Grant and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowSponsorCapacityGrantAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(SponsorCapacityGrants, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Start Up Grants and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowStartUpGrantsAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(StartUpGrants, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row PE and Sports Grant and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPEAndSportsGrantAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(PEandSportsGrants, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Year Seven Catch Up Grant and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowYearSevenCatchUpGrantAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Year7CatchUpGrant, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in revenue grants DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInRevenueGrantsDFEESFAPage(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(OldSkillFundingAgency, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Other and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iEnterValueInRowOtherAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPageInRevenueGrants(String arg0) {
        revenueGrantsDfEESFA.setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Other, CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @Then("^I see value in row  and Totals Cash received in period per DFE and ESFA record with \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, CashReceivedInPeriodPerDFEAndESFA));
    }

    @Then("^I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT  \"([^\"]*)\" in DFEESFA page in revenue grants$")
    public void iSeeValueInRowAndTotalsCashReceivedInPeriodPerDFEAndESFARecordIsNOTInDFEESFAPageInRevenueGrants(String arg0) {
        hardAssertion.assertNotEquals(arg0,revenueGrantsDfEESFA.getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(Total, CashReceivedInPeriodPerDFEAndESFA));
    }
}