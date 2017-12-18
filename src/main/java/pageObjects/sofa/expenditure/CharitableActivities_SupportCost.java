package pageObjects.sofa.expenditure;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class CharitableActivities_SupportCost extends CommonMethods {


    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement charitableActivitiesSupportCost_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Charitable Activities - Support Costs')]")
    WebElement charitableActivitiesSupportCost_header;

    public String pageName = "Charitable Activities - Support Costs";


    public enum CharitableActivitiesSupportCostLabelNames {

        SupportStaffPayCosts("Support Staff Pay Costs") , StaffRelatedInsurance("Staff Related Insurance") , OtherStaffCosts("Other Staff Costs"),
        Depreciation("Depreciation") , Amortisation("Amortisation") , Impairment("Impairment") , MaintenanceOfPremises("Maintenance of Premises") ,
        SpecialFacilities("Special Facilities")  , CleaningAndCaretaking("Cleaning and Caretaking") , OperatingLeaseRentalsLandAndBuildings("Operating Lease Rentals - Land and Buildings") ,
        OperatingLeaseRentalsOther("Operating Lease Rentals - Other") , Rates("Rates") ,Energy("Energy") , RiskProtectionArrangementFees("Risk Protection Arrangement Fees") ,
        Security("Security") , Transport("Transport") , Catering("Catering") , TechnologyCosts("Technology Costs") , OtherPremisesCosts("Other Premises Costs") ,
        PFIServiceCosts("PFI Service Costs") , LoanInterest_PaidToDfE_EFAFamily("Loan interest - paid to DFE Group bodies") ,LoanInterestPaidOthers("Loan Interest-Paid to Others") ,
        FinanceLeaseInterest("Finance Lease Interest") , NonEducationalConsultancy("Non-Educational Consultancy") , LegalProfessional("Legal & Professional") ,
        AuditorCostsAuditFees("Auditor Costs-Audit Fees") , AuditorCostsInternalAuditFees("Internal Auditor Fees") , ExternalAuditorFees("External Auditor Fees") ,
        GovernorReimbursementTravelSubsistence("Governor Reimbursement-Travel and Subsistence") , TrusteeExpensesTravelSubsistence("Trustee Expenses-Travel and Subsistence") ,
        GovernorsReimbursementOther("Governors Reimbursement-Other") , TrusteeExpensesOther("Trustee Expenses-Other") , NetMovementProvisionsDuringYear("Net Movement in Provisions During the Year") ,
        GainOrLossOnDisposalOfTangibleFixedAssets("Gain or Loss on Disposal of Tangible Fixed Assets") , GainLossDisposalIntangibleFixedAssets("Gain or Loss on Disposal of Intangible Fixed Assets") ,
        GainLossDisposalInvestments("Gain or Loss on Disposal of Investments") , OtherSupportCosts("Other Support Costs") , Total("Total");

        private final String stringValue;
        CharitableActivitiesSupportCostLabelNames(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }
    public void clickOnSaveAndNextInCharitableActivitiesDirectCostPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    public boolean isHeaderPresentAndDisplayedForCharitableActivitiesSupportCostPage(){
        return isPageHeaderPresentAndDisplayed(charitableActivitiesSupportCost_header,pageName);
    }
    public void setValueInInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivitiesSupportCostLabelNames label , String inputValue){
        setValueInInputFieldByLabelName(charitableActivitiesSupportCost_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInCharitableActivitiesSupportCostPage(CharitableActivitiesSupportCostLabelNames label){
        return getValueFromInputFieldByParentElementAndLabelName(charitableActivitiesSupportCost_body, label.toString());
    }





}
