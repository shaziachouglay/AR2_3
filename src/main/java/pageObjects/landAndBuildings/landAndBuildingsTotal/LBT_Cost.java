package pageObjects.landAndBuildings.landAndBuildingsTotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class LBT_Cost extends CommonMethods{

    private String pageName="LNB Totals Cost ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Cost')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayedForAUC_CostPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstant{
        OriginalPriorYearClosingbalance("Original prior year closing balance "),
        AdjustmentMadeToOpeningbalance("Adjustments made to opening balance "),
        AdditionsFundedFromFreeSchoolsProritySchoolBuildingProgramme("Additions - funded from Free Schools/Priority Schools Building programme"),
        AdditionsFundedFromOtherDFEandESFACapitalGransts("Additions - funded from other DFE and ESFA (EFA) capital grant"),
        Additions("Additions"),
        TransferredInOnConversionLocalAuthority("Transferred in on conversion - local authority"),
        TransferredInOnConversionElsewhere("Transferred in on conversion - elsewhere"),
        TransferredInOnExistingAcademiesJoiningTheTrust("Transferred in on existing Academies joining the Trust"),
        TransferredOutOnExitingAcademiesLeavingTheTrust("Transferred out on existing Academies leaving the Trust"),
        DonationsDFEESFA("Donations (DFE and ESFA"),
        DonationsNonDFEESFA("Donations (non-DFE and ESFA"),
        Disposals("Disposals"),
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


    public String getValueFromInputFieldByLabelNameInDonationsPage(LabelConstant label){
        return getValueFromInputFieldByParentElementAndLabelName(page_body, label.toString());
    }

    public String getValueFromInputFieldByLabelName(LabelConstant label){
        return getValueFromInputFieldByParentElementAndLabelName(page_body, label.toString());
    }

}
