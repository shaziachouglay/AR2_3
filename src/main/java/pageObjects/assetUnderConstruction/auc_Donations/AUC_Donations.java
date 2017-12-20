package pageObjects.assetUnderConstruction.auc_Donations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AUC_Donations extends CommonMethods{

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Donations')]")
    private WebElement page_header;

    public String pageName = "DfE Group";

    public void clickOnSaveAndNextInDonationsAUCPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }


    public boolean isHeaderPresentAndDisplayedForDonationsAUCPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum DonationsAUCLabelConstants {
        DonationFixedAssets("Donation fixed assets"),
        FixedAssetsDonatedByTheDFEESFA("Fixed assets donated by the DFE"),
        DonatedIntangibleAssets("Donated intangible assets"),
        OtherDonations("Other donations"),
        Total("Total");

        private final String stringValue;
        DonationsAUCLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }


    public void setValueInInPutFieldByFieldsetNameInDonationsAUCPage(DonationsAUCLabelConstants fieldsetName, String inputValue) {
        setValueInInputFieldByLabelName(page_body, fieldsetName.toString(), inputValue);
    }

    public String getValueFromFieldByFieldsetInDonationsAUCPage(DonationsAUCLabelConstants labelConstants) {
        return getValueFromInputFieldByParentElementAndLabelName(page_body,labelConstants.toString());
    }
}


