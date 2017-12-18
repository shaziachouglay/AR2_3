package stepsDefinitions.steps_sofa_expenditure;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.expenditure.CharitableActivities_SupportCost;

public class Steps_CharitableActivitiesSupportCosts extends BaseTest {

    @When("^I navigate to Charitable Activities Support Cost Page$")
    public void iNavigateToCharitableActivitiesSupportCostPage() {

        navigationMenuBar.hoverMainMenuAndClickOption(NavigationMenuBar.MAIN_MENU_OPTIONS.ACCOUNTS_RETURN, NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA);
        navigationMenuBar.click_arMenuTabBarOptions(NavigationMenuBar.SOFA_TAB_MENU_OPTIONS.Expenditure, NavigationMenuBar.SOFA_SUB_TAB_MENU_OPTIONS.CharitableActivitiesSupportCost);
        softAssert.assertTrue(navigationMenuBar.isTabMenuHeaderPresentAndDisplayedInNavigationPanel(NavigationMenuBar.ACCOUNTS_RETURN_HOVER_CONSTANTS.SoFA), "SoFA not displayed in Navigation Panel");
        hardAssertion.assertTrue(charitableActivities_supportCost.isHeaderPresentAndDisplayedForCharitableActivitiesSupportCostPage());
    }

    @And("^I enter value in Support Staff Pay Costs with \"([^\"]*)\"$")
    public void iEnterValueInSupportStaffPayCostsWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.SupportStaffPayCosts,arg0);
    }

    @And("^I enter value in Staff Related Insurance field with \"([^\"]*)\"$")
    public void iEnterValueInStaffRelatedInsuranceFieldWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.StaffRelatedInsurance,arg0);
    }

    @And("^I enter value in Other Staff costs with \"([^\"]*)\"$")
    public void iEnterValueInOtherStaffCostsWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.OtherStaffCosts,arg0);
    }

    @And("^I enter value in Depreciation field with \"([^\"]*)\"$")
    public void iEnterValueInDepreciationFieldWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Depreciation,arg0);
    }

    @And("^I enter value in Amortisation field with \"([^\"]*)\"$")
    public void iEnterValueInAmortisationFieldWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Amortisation,arg0);
    }

    @And("^I enter value in Impairment field with \"([^\"]*)\"$")
    public void iEnterValueInImpairmentFieldWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Impairment,arg0);
    }

    @And("^I enter value in Maintenance of Premises with \"([^\"]*)\"$")
    public void iEnterValueInMaintenanceOfPremisesWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.MaintenanceOfPremises,arg0);
    }

    @And("^I enter value in Special Facilities with \"([^\"]*)\"$")
    public void iEnterValueInSpecialFacilitiesWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.SpecialFacilities,arg0);
    }

    @And("^I enter value in Cleaning and CareTaking with \"([^\"]*)\"$")
    public void iEnterValueInCleaningAndCareTakingWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.CleaningAndCaretaking,arg0);
    }

    @And("^I enter value in Operating  Lease Rentals Land B with \"([^\"]*)\"$")
    public void iEnterValueInOperatingLeaseRentalsLandBWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.OperatingLeaseRentalsLandAndBuildings,arg0);
    }

    @And("^I enter value in Operating Lease Rentals Others with \"([^\"]*)\"$")
    public void iEnterValueInOperatingLeaseRentalsOthersWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.OperatingLeaseRentalsOther,arg0);
    }

    @And("^I enter value in Rates wit \"([^\"]*)\"$")
    public void iEnterValueInRatesWit(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Rates,arg0);
    }

    @And("^I enter value in Energy with \"([^\"]*)\"$")
    public void iEnterValueInEnergyWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Energy,arg0);
    }

    @And("^I enter value in Risk Protection Arrangement Fees with \"([^\"]*)\"$")
    public void iEnterValueInRiskProtectionArrangementFeesWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.RiskProtectionArrangementFees,arg0);
    }

    @And("^I enter value in Security with \"([^\"]*)\"$")
    public void iEnterValueInSecurityWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Security,arg0);
    }

    @And("^I enter value in Transport with \"([^\"]*)\"$")
    public void iEnterValueInTransportWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Transport,arg0);
    }

    @And("^I enter value in Catering with \"([^\"]*)\"$")
    public void iEnterValueInCateringWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Catering,arg0);
    }

    @And("^I enter value in Technology Cost with \"([^\"]*)\"$")
    public void iEnterValueInTechnologyCostWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.TechnologyCosts,arg0);
    }

    @And("^I enter value in other premises cost with \"([^\"]*)\"$")
    public void iEnterValueInOtherPremisesCostWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.OtherPremisesCosts,arg0);
    }

    @And("^I enter value in PFI_Services Costs with \"([^\"]*)\"$")
    public void iEnterValueInPFI_ServicesCostsWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.PFIServiceCosts,arg0);
    }

    @And("^I enter value in Loan Interest paid to Dfe_EFA Family with \"([^\"]*)\"$")
    public void iEnterValueInLoanInterestPaidToDfe_EFAFamilyWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.LoanInterest_PaidToDfE_EFAFamily,arg0);
    }

    @And("^I enter value in  Loan Interest paid to others with \"([^\"]*)\"$")
    public void iEnterValueInLoanInterestPaidToOthersWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.LoanInterestPaidOthers,arg0);
    }

    @And("^I enter value in Finance Leases Interest with \"([^\"]*)\"$")
    public void iEnterValueInFinanceLeasesInterestWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.FinanceLeaseInterest,arg0);
    }

    @And("^I enter value in Non Educational Consultancy with \"([^\"]*)\"$")
    public void iEnterValueInNonEducationalConsultancyWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.NonEducationalConsultancy,arg0);
    }

    @And("^I enter value in Legal and Professional with \"([^\"]*)\"$")
    public void iEnterValueInLegalAndProfessionalWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.LegalProfessional,arg0);
    }

    @And("^I enter value in Auditor Costs Audit Fees with \"([^\"]*)\"$")
    public void iEnterValueInAuditorCostsAuditFeesWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.AuditorCostsAuditFees,arg0);
    }

    @And("^I enter value in Auditor Costs Internal Audit Fees with \"([^\"]*)\"$")
    public void iEnterValueInAuditorCostsInternalAuditFeesWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.AuditorCostsInternalAuditFees,arg0);
    }

    @And("^I enter value in Auditor Costs Other fees with \"([^\"]*)\"$")
    public void iEnterValueInAuditorCostsOtherFeesWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.ExternalAuditorFees,arg0);
    }

    @And("^I enter value in Governors Reimbursement Travel and Subsistence with \"([^\"]*)\"$")
    public void iEnterValueInGovernorsReimbursementTravelAndSubsistenceWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.GovernorReimbursementTravelSubsistence,arg0);
    }

    @And("^I enter value in Travel expenses Travel and Subsistence with \"([^\"]*)\"$")
    public void iEnterValueInTravelExpensesTravelAndSubsistenceWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.TrusteeExpensesTravelSubsistence,arg0);
    }

    @And("^I enter value in Governors Reimbursement Other with \"([^\"]*)\"$")
    public void iEnterValueInGovernorsReimbursementOtherWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.GovernorsReimbursementOther,arg0);
    }

    @And("^I enter value in Trustees  Expenses Others  with \"([^\"]*)\"$")
    public void iEnterValueInTrusteesExpensesOthersWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.TrusteeExpensesOther,arg0);
    }

    @And("^I enter value in Net Movement in Provisions During the year with \"([^\"]*)\"$")
    public void iEnterValueInNetMovementInProvisionsDuringTheYearWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.NetMovementProvisionsDuringYear,arg0);
    }

    @And("^I enter gain or loss on Disposal of Tangible Fixed Assets \"([^\"]*)\"$")
    public void iEnterGainOrLossOnDisposalOfTangibleFixedAssets(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.GainOrLossOnDisposalOfTangibleFixedAssets,arg0);
    }

    @And("^I enter gain or loss on Disposal of Intangible fixed assets \"([^\"]*)\"$")
    public void iEnterGainOrLossOnDisposalOfIntangibleFixedAssets(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.GainLossDisposalIntangibleFixedAssets,arg0);
    }

    @And("^I enter Gain Or Loss on Disposal of Investments \"([^\"]*)\"$")
    public void iEnterGainOrLossOnDisposalOfInvestments(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.GainLossDisposalInvestments,arg0);
    }

    @And("^I enter Other Support Costs with \"([^\"]*)\"$")
    public void iEnterOtherSupportCostsWith(String arg0) {
        charitableActivities_supportCost.setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.OtherSupportCosts,arg0);
    }

    @Then("^I can see the total to be \"([^\"]*)\"$")
    public void iCanSeeTheTotalToBe(String arg0) {
        hardAssertion.assertEquals(charitableActivities_supportCost.getValueFromInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Total),arg0);
    }

    @Then("^I can see the total is NOT \"([^\"]*)\" in Charitable Activities Support Cost Page$")
    public void iCanSeeTheTotalIsNOTInCharitableActivitiesSupportCostPage(String arg0) {
        hardAssertion.assertNotEquals(charitableActivities_supportCost.getValueFromInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivities_SupportCost.CharitableActivitiesSupportCostLabelNames.Total),arg0);
    }
}
