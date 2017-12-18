package pageObjects.sofa.revenueGrants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class RevenueGrantsDfEGroup extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement revenueGrantsDfEGroup_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'DfE Group')]")
    WebElement revenueGrantsDfEGroup_header;

    public String pageName = "DfE Group";

    public void clickOnSaveAndNextInRevenueGrantsDfEGroupPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForRevenueGrantsDfEGroupPage(){
        return isPageHeaderPresentAndDisplayed(revenueGrantsDfEGroup_header,pageName);
    }

    public enum RevenueGrantsDFEGroupLabelConstants {
        NationalCollegeForTeachingAndLeadership("National College for Teaching and Leadership"), StandardsAndTestingAgency("Standards and Testing Agency"),
        EqualityAndHumanRightsCommission("Equality and Human Rights Commission"), OfficeOfTheChildrensCommissioner ("Office of the Children"), SkillsFundingAgency("Skills Funding Agency"),
        Total("Total (£"), StudentLoanCompany("Student Loans Company (SLC)"),HigherEducationFundingCouncilforEngland("Higher Education Funding Council for England"),
        OfficeforFairAccess("Office for Fair Access"),EngineeringConstructionIndustryTrainingBoard("Engineering Construction Industry Training Board (ECITB)"),
        ConstructionIndustryTrainingBoard ("Construction Industry Training Board (CITB)");

        private final String stringValue;
        RevenueGrantsDFEGroupLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void setValueInInPutFieldByFieldsetNameInRevenueGrantsDfEGroupPage(RevenueGrantsDFEGroupLabelConstants labelConstant, String inputValue) {
        setValueInInputFieldByLabelName(revenueGrantsDfEGroup_body, labelConstant.toString(), inputValue);
    }

    public String getValueFromFieldByFieldsetInRevenueGrantsDfEGroupPage(RevenueGrantsDFEGroupLabelConstants labelConstants) {
        return getValueFromInputFieldByParentElementAndLabelName(revenueGrantsDfEGroup_body,labelConstants.toString());
    }
}
