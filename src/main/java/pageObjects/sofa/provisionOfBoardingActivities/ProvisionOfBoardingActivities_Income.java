package pageObjects.sofa.provisionOfBoardingActivities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

import java.util.List;

public class ProvisionOfBoardingActivities_Income extends CommonMethods {

    @FindBy(how = How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement income_body;

    @FindBy(how = How.XPATH, using = "//form[@id='owdInterviewForm']//label/img")
    private List<WebElement> income_helpButtons;


    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Income')]")
    WebElement income_header;

    public String pageName = "Income";


    /**
     * These are he enus to be used for the SoFA sub menu
     */
    public enum ProvisionOfBoardingActivitiesIncomeLabelConstants {

        FeeIncome("Fee Income"),GrantsDfEEFA("Grants - DFE and ESFA"),
        GrantsNationalCollegeForTeachingAndLearning("Grants - National College for Teaching and Learning (NCTL)"),
        GrantsStandardsAndTeachingAgency("Grants - Standards and Teaching Agency (STA)"),
        GrantsSkillsFundingAgency("Grants - Skills Funding Agency (SFA) "),
        GrantsEqualityAndHumanRightsCommission("Grants - Equality and Human Rights Commission (EHRC)"),
        GrantsOfficeOfTheChildrensCommissioner("Grants - Office of the Children"),
        GrantsOtherGovernment("Grants-Other Government"),OtherIncome("Other Income"),Total("Total");

        private final String stringValue;
        ProvisionOfBoardingActivitiesIncomeLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void setValueInInPutFieldByLabelNameIn_ProvisionOfBoardingActivitiesIncomePage(ProvisionOfBoardingActivitiesIncomeLabelConstants label, String inputValue) {
        setValueInInputFieldByLabelName(income_body, label.toString(), inputValue);
    }

    public String getValueFromFieldByLabelInProvisionOfBoardignActivitiesIncomePage(ProvisionOfBoardingActivitiesIncomeLabelConstants label) {
        return getValueFromInputFieldByParentElementAndLabelName(income_body,label.toString());
    }

    public void clickOnNextButtonInProvisionOfBoardignActivitiesIncomePage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    public boolean isHeaderPresentAndDisplayedForBoardingActivitiesIncomePage() {
        return isPageHeaderPresentAndDisplayed(income_header,pageName);
    }
}
