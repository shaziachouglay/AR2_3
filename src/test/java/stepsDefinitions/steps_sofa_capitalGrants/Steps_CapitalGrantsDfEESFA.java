package stepsDefinitions.steps_sofa_capitalGrants;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.capitalGrants.CapitalGrantsDfEESFA;

public class Steps_CapitalGrantsDfEESFA extends BaseTest{
    @When("^I have navigated to the DfE and ESFA section$")
    public void iHaveNavigatedToTheDfEAndESFASection()  {
        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.CapitalGrants, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.DfEandESFA);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(dfeefa.isHeaderPresentAndDisplayedForCapitalGrantsDfEESFAPage(), "Failed to display the Header for Capital Grants DfE ESFA page");
    }

    @And("^I enter value in row Conditional Improvement Fund and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowConditionalImprovementFundAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ConditionImprovementFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Conditional Improvement Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowConditionalImprovementFundAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ConditionImprovementFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Conditional Improvement Fund and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowConditionalImprovementFundAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ConditionImprovementFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row MATs School Condition Allowance and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowMATsSchoolConditionAllowanceAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.MATsSchoolConditionAllowance, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row MATs School Condition Allowance and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowMATsSchoolConditionAllowanceAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.MATsSchoolConditionAllowance,CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row MATs School Condition Allowance and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowMATsSchoolConditionAllowanceAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.MATsSchoolConditionAllowance, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Priority School Building Programme and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPrioritySchoolBuildingProgrammeAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.PrioritySchoolBuildingProgramme, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Priority School Building Programme and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowPrioritySchoolBuildingProgrammeAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.PrioritySchoolBuildingProgramme,CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Priority School Building Programme and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowPrioritySchoolBuildingProgrammeAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.PrioritySchoolBuildingProgramme, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Devolved Formula Capital Grant and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowDevolvedFormulaCapitalGrantAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.DevolvedFormulaCapitalGrant, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Devolved Formula Capital Grant and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowDevolvedFormulaCapitalGrantAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.DevolvedFormulaCapitalGrant, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Devolved Formula Capital Grant and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowDevolvedFormulaCapitalGrantAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.DevolvedFormulaCapitalGrant, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Centrally Managed Programme Free Schools and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowCentrallyManagedProgrammeFreeSchoolsAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.CentrallyManagedProgrammeFreeSchools, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Centrally Managed Programme Free Schools and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowCentrallyManagedProgrammeFreeSchoolsAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.CentrallyManagedProgrammeFreeSchools,CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Centrally Managed Programme Free Schools and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowCentrallyManagedProgrammeFreeSchoolsAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.CentrallyManagedProgrammeFreeSchools, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);
    }

    @And("^I enter value in row Continuing Commitments Building Schools for the Future and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowContinuingCommitmentsBuildingSchoolsForTheFutureAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ContinuingCommitmentsBuildingSchoolsfortheFuture, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);
    }

    @And("^I enter value in row Continuing Commitments Building Schools for the Future and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowContinuingCommitmentsBuildingSchoolsForTheFutureAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ContinuingCommitmentsBuildingSchoolsfortheFuture,CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Continuing Commitments Building Schools for the Future and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowContinuingCommitmentsBuildingSchoolsForTheFutureAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ContinuingCommitmentsBuildingSchoolsfortheFuture, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);

    }

    @And("^I enter value in row Schools Sponsorship Development Fund and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowSchoolsSponsorshipDevelopmentFundAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.SchoolsSponsorshipDevelopmentFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);

    }

    @And("^I enter value in row Schools Sponsorship Development Fund and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowSchoolsSponsorshipDevelopmentFundAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.SchoolsSponsorshipDevelopmentFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);
    }

    @And("^I enter value in row Schools Sponsorship Development Fund and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowSchoolsSponsorshipDevelopmentFundAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.SchoolsSponsorshipDevelopmentFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);

    }

    @And("^I enter value in row Old Skills Funding Agency and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.OldSkillsFundingAgency, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);

    }

    @And("^I enter value in row Old Skills Funding Agency and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.OldSkillsFundingAgency, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);

    }

    @And("^I enter value in row Old Skills Funding Agency and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.OldSkillsFundingAgency, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);

    }

    @And("^I enter value in row Other and Column Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowOtherAndColumnGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Others, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts,arg0);

    }

    @And("^I enter value in row Other and Column Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowOtherAndColumnCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Others,CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA,arg0);

    }

    @And("^I enter value in row Other and Column Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iEnterValueInRowOtherAndColumnExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Others, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant,arg0);

    }

    @Then("^I see value in row  and Totals Granst Value in Accounts with \"([^\"]*)\" in DFEESFA page$")
    public void iSeeValueInRowAndTotalsGranstValueInAccountsWithInDFEESFAPage(String arg0)  {
        hardAssertion.assertEquals(dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts),arg0);
    }

    @Then("^I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iSeeValueInRowAndTotalsCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        hardAssertion.assertEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA));

    }

    @Then("^I see value in row  and Totals Expenditure recorded in the accounts from this grant with \"([^\"]*)\" in DFEESFA page$")
    public void iSeeValueInRowAndTotalsExpenditureRecordedInTheAccountsFromThisGrantWithInDFEESFAPage(String arg0)  {
        hardAssertion.assertEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant));
    }

    @Then("^I see value in row  and Totals Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iSeeValueInRowAndTotalsCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        hardAssertion.assertEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA));
    }
    //********

    @Then("^I see value in row  and Totals Granst Value in Accounts is NOT  \"([^\"]*)\" in DFEESFA page$")
    public void iSeeValueInRowAndTotalsGranstValueInAccountsIsNOTInDFEESFAPage(String arg0)  {
        hardAssertion.assertNotEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.GrantValueInAccounts));
    }

    @Then("^I see value in row  and Totals Cash Recieved in period per Academies record if different to DFE and ESFA record is NOT \"([^\"]*)\"in DFEESFA page$")
    public void iSeeValueInRowAndTotalsCashRecievedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFARecordIsNOTInDFEESFAPage(String arg0)  {
        hardAssertion.assertNotEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA));
    }

    @Then("^I see value in row  and Totals Expenditure recorded in the accounts from this grant is NOT \"([^\"]*)\" in DFEESFA page$")
    public void iSeeValueInRowAndTotalsExpenditureRecordedInTheAccountsFromThisGrantIsNOTInDFEESFAPage(String arg0)  {
        hardAssertion.assertNotEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.ExpenditureRecordedInTheAccountsFromThisGrant));
    }

    @And("^I enter value in row Conditional Improvement Fund and Column  Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowConditionalImprovementFundAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ConditionImprovementFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row MATs School Condition Allowance and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowMATsSchoolConditionAllowanceAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.MATsSchoolConditionAllowance, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Priority School Building Programme and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowPrioritySchoolBuildingProgrammeAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.PrioritySchoolBuildingProgramme, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Devolved Formula Capital Grant and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowDevolvedFormulaCapitalGrantAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.DevolvedFormulaCapitalGrant, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Centrally Managed Programme Free Schools and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowCentrallyManagedProgrammeFreeSchoolsAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.CentrallyManagedProgrammeFreeSchools, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Continuing Commitments Building Schools for the Future and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowContinuingCommitmentsBuildingSchoolsForTheFutureAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.ContinuingCommitmentsBuildingSchoolsfortheFuture, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Schools Sponsorship Development Fund and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowSchoolsSponsorshipDevelopmentFundAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.SchoolsSponsorshipDevelopmentFund, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Old Skills Funding Agency and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowOldSkillsFundingAgencyAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.OldSkillsFundingAgency, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @And("^I enter value in row Other and Column Cash received in period per DFE and ESFA record with \"([^\"]*)\"in DFEESFA page$")
    public void iEnterValueInRowOtherAndColumnCashReceivedInPeriodPerDFEAndESFARecordWithInDFEESFAPage(String arg0)  {
        dfeefa.setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Others, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA,arg0);
    }

    @Deprecated
    @And("^I have navigated to Family Capital Grants section$")
    public void iHaveNavigatedToFamilyCapitalGrantsSection()  {
    info("depricated");
    }

    @Then("^I see value in row  and Totals Cash received in period per DFE and ESFA record is NOT \"([^\"]*)\"in DFEESFA page$")
    public void iSeeValueInRowAndTotalsCashReceivedInPeriodPerDFEAndESFARecordIsNOTInDFEESFAPage(String arg0) {
        hardAssertion.assertNotEquals(arg0,dfeefa.getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_rowFieldConstants.Totals, CapitalGrantsDfEESFA.DfEESFA_CapitalGrants_ColumnFieldConstants.CashReceivedInPeriodPerDFEAndESFA));
    }
}
