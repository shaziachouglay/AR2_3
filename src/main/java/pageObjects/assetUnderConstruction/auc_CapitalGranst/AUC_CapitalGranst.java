package pageObjects.assetUnderConstruction.auc_CapitalGranst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AUC_CapitalGranst extends CommonMethods{


    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'DfE Group')]")
    private WebElement page_header;

    public String pageName = "DfE Group";

    public void clickOnSaveAndNextInCapitalGrantsAUCPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }


    public boolean isHeaderPresentAndDisplayedForCapitalGrantsAUCPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum CapitalGrantsAUCLabelConstants {
        ConditionImprovementFund("Condition Improvement Fund"),
        MATsSchoolConditionAllowance("MATs School Condition Allowance "),
        PrioritySchoolBuildingProgramme("Priority School Building Programme "),
        DevolvedFormulaCapitalGrant("Devolved Formula Capital Grant"),
        CentrallyManagedProgrammeFreeSchools("Centrally Managed Programme - Free Schools"),
        ContinuingCommitmentsBuildingSchoolsForTheFuture("Continuing Commitments - Building Schools for the Future"),
        SchoolsSponsorshipDevelopmentFund("Schools Sponsorship Development Fund"),
        Other("Other"),
        LocalAuthorityCapitalGrnats("Local Authority Capital Grants"),
        OtherGovernmentCapitalGrants("Other Government Capital Grants "),
        NonGovernmentCapitalGrants("Non-Government Capital Grants"),
        Total("Total");

        private final String stringValue;
        CapitalGrantsAUCLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }


    public void setValueInInPutFieldByFieldsetNameInCapitalGrantsAUCPage(CapitalGrantsAUCLabelConstants fieldsetName, String inputValue) {
        setValueInInputFieldByLabelName(page_body, fieldsetName.toString(), inputValue);
    }

    public String getValueFromFieldByFieldsetInCapitalGrantsAUCPage(CapitalGrantsAUCLabelConstants labelConstants) {
        return getValueFromInputFieldByParentElementAndLabelName(page_body,labelConstants.toString());
    }
}
