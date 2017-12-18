package pageObjects.balanceSheetAssets.cash;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Cash extends CommonMethods {

    public String pageName = "Cash";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement cash_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Cash')]")
    WebElement cash_header;

    public enum BSA_Cash_Label {

        CashBalance("Cash balance");

        private final String stringValue;
        BSA_Cash_Label(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void clickOnSaveAndNextInBSA_CashPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForBSA_CashPage(){
        return isPageHeaderPresentAndDisplayed(cash_header,pageName);
    }

    public void setValueInInputFieldByLabelNameInBSA_CashPage(BSA_Cash_Label label , String inputValue){
        setValueInInputFieldByLabelName(cash_body,label.toString(), inputValue);
    }
}
