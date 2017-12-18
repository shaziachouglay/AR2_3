package pageObjects.sofa.otherIncome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class OtherIncome_OtherIncome extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement otherIncome_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Other')]")
    WebElement otherIncome_header;

    public String pageName = "Other Income";

    public void clickOnSaveAndNextInOtherIncomeOtherIncomePage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForOtherIncomeOtherIncomePage(){
        return isPageHeaderPresentAndDisplayed(otherIncome_header,pageName);
    }

    public enum OtherIncomeLabelNames {
        Academies("Academies"), GovernmentSourcesNonGrant("Government Sources - Non Grant") ,
        NonGovernmentRevenue("Non-Government Revenue") ,NotionalApprenticeshipLevyIncome ("Notional Apprenticeship Levy Income "), Total("Total"), InvestmentIncomeInterest("Investment income Interest");

        private final String stringValue;
        OtherIncomeLabelNames(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }


    public void setValueInInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncomeLabelNames label , String inputValue){
        setValueInInputFieldByLabelName(otherIncome_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInOtherIncomeOtherIncomePage(OtherIncomeLabelNames label){
        return getValueFromInputFieldByParentElementAndLabelName(otherIncome_body, label.toString());
    }
}
