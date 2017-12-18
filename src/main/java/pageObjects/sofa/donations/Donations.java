package pageObjects.sofa.donations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Donations extends CommonMethods {

    public String pageName = "Donations";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement donations_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Donations')]")
    WebElement donations_header;

    public enum DonationsPageLabelConstants {
        DonatedFixedAssets("Donated Fixed Assets"), DonatedFixedAssetsNonDEFandESFA("Donated Fixed Assets (Non-DfE and ESFA (EFA))"),
        DonatedIntangibleAssets("Donated Intangible Assets"), OtherDonationsCapital("Other Donations (Capital)"), OtherDonationsRevenue("Other Donations (Revenue)"),
        TotalCapital("Total Capital"), TotalRevenue("Total Revenue"), Total("Total (");

        private final String stringValue;
        DonationsPageLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void clickOnSaveAndNextInDonationsPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForDonationsPage(){
        return isPageHeaderPresentAndDisplayed(donations_header,pageName);
    }

    public void setValueInInputFieldByLabelNameInDonationsPage(DonationsPageLabelConstants label , String inputValue){
        setValueInInputFieldByLabelName(donations_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInDonationsPage(DonationsPageLabelConstants label){
        return getValueFromInputFieldByParentElementAndLabelName(donations_body, label.toString());
    }
}
