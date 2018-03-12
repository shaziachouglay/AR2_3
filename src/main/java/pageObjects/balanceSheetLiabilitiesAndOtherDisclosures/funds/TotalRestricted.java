package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.funds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.landAndBuildings.landAndBuildingsTotal.LBT_Cost;
import utilityClasses.CommonMethods;

public class TotalRestricted extends CommonMethods {

    private String pageName="Total Restricted";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Total Restricted')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

     public enum LabelConstants{
        OriginalPriorYearClosingBalance("Original prior year closing balance "),
         AdjustmentMadeInToTheOpeningBalance("Adjustments made in to the opening balance"),
         IncomingResources("Incoming Resources"),
         ResourcesExpended("Resources Expended"),
         TransfersOnConversion("Transfers on conversion"),
         TransfersInOrOutOfExistingAcademies("Transfers in or out of existing academies"),
         TransferBetweenFunds("Transfer between funds"),
         OtherGainsLossesANdTransfers("Other gains, losses and transfers"),
         OverallTotal("Overall Total");

        private String stringValue;
        LabelConstants(String s){
            this.stringValue = s;
        }
        public String toString(){
            return stringValue;
        }
     }

     public String getValueByLabelName(LBT_Cost.LabelConstant label){
        String text = getValueFromInputFieldByParentElementAndLabelName(page_body,label.toString());
        info("Value present in field : "+label+" is : "+text);
        return text;
     }
}
