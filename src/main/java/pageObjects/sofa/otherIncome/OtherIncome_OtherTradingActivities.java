package pageObjects.sofa.otherIncome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class OtherIncome_OtherTradingActivities extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement otherTradingActivities_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Other Trading Activities')]")
    WebElement otherTradingActivities_header;

    public String pageName = "Other Trading Activities";

    public void clickOnSaveAndNextInOtherIncomeOtherTradingActivitiesPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForOtherIncomeOtherTradingActivitiesPage(){
        return isPageHeaderPresentAndDisplayed(otherTradingActivities_header,pageName);
    }

    public enum OtherTradingActivitiesLabelConstants {
        HireOfFacilities("Hire of Facilities"), CateringIncome("Catering Income"), RentalIncome("Rental Income"), ReceiptsFromSupplyTeacherInsuranceClaims("Receipts from Supply Teacher Insurance Claims"),
        RiskProtectionArrangementClaims("Risk Protection Arrangement Claims "), Other("Other") , Total("Total");
        private final String stringValue;
        OtherTradingActivitiesLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void setValueInInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherTradingActivitiesLabelConstants label , String inputValue){
        setValueInInputFieldByLabelName(otherTradingActivities_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInOtherIncomeTradingActivitiesPage(OtherTradingActivitiesLabelConstants label){
        return getValueFromInputFieldByParentElementAndLabelName(otherTradingActivities_body, label.toString());
    }
}
