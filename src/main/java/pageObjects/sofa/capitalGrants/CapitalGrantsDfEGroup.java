package pageObjects.sofa.capitalGrants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class CapitalGrantsDfEGroup extends CommonMethods {

    /**
     * this is the parent element for the page.
     */
    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement capitalGrantsDfEGroup_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'DfE Group')]")
    WebElement capitalGrantsDfEGroup_header;

    public String pageName = "DfE Group";

    /**
     * clicks on the save and next button in CapitalGrantsDfEGroup page.
     */
    public void clickOnSaveAndNextInCapitalGrantsDfEESFAPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    /**
     * checks if the header is present and displayed in the CapitalGrantsDfEGroup page.
     * @return
     */
    public boolean isHeaderPresentAndDisplayedForCapitalGrantsDfEESFAPage(){
        return isPageHeaderPresentAndDisplayed(capitalGrantsDfEGroup_header,pageName);
    }

    /**
     * enum for the label names, returns the String value for the labels.
     */
    public enum CapitalGrantsDFEGroupLabelConstants {
        NationalCollegeForTeachingAndLeadership("National College for Teaching and Leadership"), StandardsAndTestingAgency("Standards and Testing Agency"),
        EqualityAndHumanRightsCommission("Equality and Human Rights Commission"), OfficeOfTheChildrensCommissioner ("Office of the Children"), SkillsFundingAgency("Skills Funding Agency"),
        Total("Total (£"), StudentLoanCompany("Student Loans Company (SLC)"),HigherEducationFundingCouncilforEngland("Higher Education Funding Council for England"),
        OfficeforFairAccess("Office for Fair Access"),EngineeringConstructionIndustryTrainingBoard("Engineering Construction Industry Training Board (ECITB)"),
        ConstructionIndustryTrainingBoard ("Construction Industry Training Board (CITB)");

        private final String stringValue;
        CapitalGrantsDFEGroupLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }


    public void setValueInInPutFieldByFieldsetNameIn_FamilyCapitalGrantsPage(CapitalGrantsDFEGroupLabelConstants fieldsetName, String inputValue) {
        setValueInInputFieldByLabelName(capitalGrantsDfEGroup_body, fieldsetName.toString(), inputValue);
    }

    public String getValueFromFieldByFieldsetInFamilyCapitalGrantsPage(CapitalGrantsDFEGroupLabelConstants labelConstants) {
        return getValueFromInputFieldByParentElementAndLabelName(capitalGrantsDfEGroup_body,labelConstants.toString());
    }
}
