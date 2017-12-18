package pageObjects.sofa.revenueGrants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class RevenueGrantsOther extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement revenueGrantsOther_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Other')]")
    WebElement revenueGrantsOther_header;

    public String pageName = "Other";

    public void clickOnSaveAndNextInRevenueGrantsOtherPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForRevenueGrantsOtherPage(){
        return isPageHeaderPresentAndDisplayed(revenueGrantsOther_header,pageName);
    }

    public enum RevenueGrantsOtherLabelConstants{

        LocalAuthoritySpecialEducationalNeeds("Local Authority- Special Educational Needs"),
        LocalAuthorityEarlyYears("Local Authority-Early Years"),
        OtherLocalAuthorityRevenueGrants("Other Local Authority Revenue Grants "),
        OtherGovernmentRevenueGrants("Other Government Revenue Grants "),
        NonGovernmentRevenueGrants("Non-Government-Revenue Grants "),
        Total("Total");
        private final String stringValue;
        RevenueGrantsOtherLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void setValueInInputFieldByFiedsetNameInOtherRevenueGranstsPage(RevenueGrantsOtherLabelConstants fieldsetNames , String inputValue){
        setValueInInputFieldByLabelName(revenueGrantsOther_body ,fieldsetNames.toString() ,inputValue );
    }

    public String getValueFromFieldByFieldsetInOtherRevenueGrantsPage( RevenueGrantsOtherLabelConstants labelName) {
        return getValueFromInputFieldByParentElementAndLabelName(revenueGrantsOther_body,labelName.toString());
    }
}


