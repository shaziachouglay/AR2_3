package pageObjects.landAndBuildings.landAndBuildingsTotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class LBT_Depreciation extends CommonMethods {

    private String pageName="LNB Totals Cost ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Depreciation')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstant{
        OriginalPriorYearClosingbalance("Original prior year closing balance "),
        AdjustmentMadeToOpeningbalance("Adjustments made to opening balance "),
        ChargedInPeriod("Charged in period"),
        EliminatedOnDisposal("Eliminated on disposal"),
        TransferredInOnExistingAcademiesJoiningTheTrust("Transferred in on existing Academies joining the Trust"),
        TransferredOutOnExistingAcademiesLeavingTheTrust("Transferred out on existing Academies leaving the Trust"),
        Revaluations("Revaluations"),
        Reclassifications("Reclassifications"),
        AtCloseOfPeriod("At close of period");

        private final String stringvalue;
        LabelConstant(String s){
            stringvalue=s;
        }
        public String toString(){
            return stringvalue;
        }
    }

    public String getValueFromInputFieldByLabelName(LabelConstant label){
        return getValueFromInputFieldByParentElementAndLabelName(page_body, label.toString());
    }

}
