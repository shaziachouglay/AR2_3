package pageObjects.sofa.expenditure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class CharitableActivities_DirectCosts extends CommonMethods {

    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement charitableActivitiesDirectCost_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Charitable Activities - Direct Costs')]")
    WebElement charitableActivitiesDirectCost_header;

    public String pageName = "Charitable Activities - Direct Costs";

    public enum CharitableActivitiesDirectCostLabelNames {
        TeachingEducationalSupportStaff("Teaching and Educational Support Staff") , StaffExpenses("Staff Expenses") , OtherStaffCosts("Other Staff Costs"),
        Depreciation("Depreciation") , Amortisation("Amortisation") , Impairment("Impairment") , EducationalSupplies("Educational Supplies") ,
        ExaminationFees("Examination Fees") , StaffRelatedInsurance("Staff Related Insurance") , TechnologyCosts("Technology Costs") , EducationalConsultancy("Educational Consultancy") ,
        OtherDirectCosts("Other Direct Costs") , Total("Total"), NotionalApprenticeshipLevyExpenditure("Notional Apprenticeship Levy Expenditure");

        private final String stringValue;
        CharitableActivitiesDirectCostLabelNames(String s) {
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

    public boolean isHeaderPresentAndDisplayedForCharitableActivitiesDirectCostPage(){
        return isPageHeaderPresentAndDisplayed(charitableActivitiesDirectCost_header,pageName);
    }
    public void setValueInInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivitiesDirectCostLabelNames label , String inputValue){
        setValueInInputFieldByLabelName(charitableActivitiesDirectCost_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInCharitableActivitiesDirectCostPage(CharitableActivitiesDirectCostLabelNames label){
        return getValueFromInputFieldByParentElementAndLabelName(charitableActivitiesDirectCost_body, label.toString());
    }
}
