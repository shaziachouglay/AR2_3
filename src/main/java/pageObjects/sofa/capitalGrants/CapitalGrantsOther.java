package pageObjects.sofa.capitalGrants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class CapitalGrantsOther extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement capitalGrantsOther_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Other')]")
    WebElement capitalGrantsOther_header;

    public String pageName = "Other";

    public void clickOnSaveAndNextInCapitalGrantsOtherPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForCapitalOtherPage(){
        return isPageHeaderPresentAndDisplayed(capitalGrantsOther_header,pageName);
    }

    public enum CapitalGrantsOtherLabelConstants{
        LocalAuthorityCapitalGrants("Local Authority Capital Grants"), OtherGovernmentCapitalGrants("Other Government Capital Grants") ,
        NonGovernmentCapitalGrants("Non-Government Capital Grants") , Total("Total");
        private final String stringValue;
        CapitalGrantsOtherLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void setValueInInputFieldByFiedsetNameInOtherCapitalGranstsPage(CapitalGrantsOtherLabelConstants fieldsetNames , String inputValue){
        setValueInInputFieldByLabelName(capitalGrantsOther_body ,fieldsetNames.toString() ,inputValue );
    }

    public String getValueFromFieldByFieldsetInOtherCapitalGrantsPage(CapitalGrantsOtherLabelConstants labelName) {
        return getValueFromInputFieldByParentElementAndLabelName(capitalGrantsOther_body,labelName.toString());
    }
}
