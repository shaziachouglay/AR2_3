package pageObjects.balanceSheetLiabilities.provisions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class ProvisionsMovement extends CommonMethods{
    private String pageName="LNB Provisions Movement";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Provisions (Movement)')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstant{
        OriginalPriorYearClosingbalance("Original prior year closing balance "),
        AdjustmentMadeToOpeningbalance("Adjustments made to opening balance "),
        ChargedINPeriod("Charged in the period"),
        TransferredInOnExistingAcademiesJoiningTheTrust("Transferred in on existing Academies joining the Trust"),
        TransferredInOnConversion("Transferred in on conversion"),
        TransferredOutOnExitingAcademiesLeavingTheTrust("Transferred out on existing Academies leaving the Trust"),
        UtilisedInThePeriod("Utilised in the period"),
        ReleasedInThePeriod("Released in the period"),
        Total("Total");

        private final String stringvalue;
        LabelConstant(String s){
            stringvalue=s;
        }
        public String toString(){
            return stringvalue;
        }
    }


    public String getValueFromInputFieldByLabelNameInDonationsPage(LabelConstant label){
        return getValueFromInputFieldByParentElementAndLabelName(page_body, label.toString());
    }

    public String getValueFromInputFieldByLabelName(LabelConstant label){
        return getValueFromInputFieldByParentElementAndLabelName(page_body, label.toString());
    }

}
