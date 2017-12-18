package pageObjects.sofa.expenditure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class OtherExpenditure extends CommonMethods {

    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement otherExpenditure_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Other Expenditure')]")
    WebElement otherExpenditure_header;

    public String pageName = "Other Expenditure";

    public enum OtherExpenditureLabelNames {
        OtherExpenditureNotAttributableToSpecificExpenditureHeading("Other Expenditure not Attributable to a Specific Expenditure Heading");
        private final String stringValue;
        OtherExpenditureLabelNames(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void clickOnSaveAndNextInOtherExpenditurePage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    public boolean isHeaderPresentAndDisplayedForOtherExpenditurePage(){
        return isPageHeaderPresentAndDisplayed(otherExpenditure_header,pageName);
    }
    public void setValueInInputFieldByLabelNameInOtherExpenditurePage(OtherExpenditureLabelNames label , String inputValue){
        setValueInInputFieldByLabelName(otherExpenditure_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInOtherExpenditurePage(OtherExpenditureLabelNames label){
        return getValueFromInputFieldByParentElementAndLabelName(otherExpenditure_body, label.toString());
    }
}
