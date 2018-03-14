package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class ReconciliationOfDefecits extends CommonMethods {
    private String pageName="Reconciliation of deficit";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Reconciliation of deficit')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        OpeningBalance("OpeningBalance"),
        AdjustmentsMadeToOpeningBalance("AdjustmentsMadeToOpeningBalance"),
        ConversionOfAcademyTrustsInPriorYear("ConversionOfAcademyTrustsInPriorYear"),
        InYearConversionOfAcademyTrusts("InYearConversionOfAcademyTrusts"),
        CurrentServiceCost("CurrentServiceCost"),
        EmployerContributions("EmployerContributions"),
        UnfundedPensionPayments("UnfundedPensionPayments"),
        PastServiceCost("PastServiceCost"),
        NetInterestExpense("NetInterestExpense"),
        LossesOrGainsOnCurtailments("LossesOrGainsOnCurtailments"),
        ActuarialLossGain("Actuarial(Loss)/Gain"),
        EffectOfNonRoutineSettlements("EffectOfNon-RoutineSettlements"),
        TransferredInOnExistingAcademiesJoiningTheTrust("TransferredInOnExistingAcademiesJoiningTheTrust"),
        TransferredOutOnExistingAcademiesLeavingTheTrust("TransferredOutOnExistingAcademiesLeavingTheTrust"),
        ClosingBalance("ClosingBalance");

        private String stringValue;
        LabelConstants(String s){
            this.stringValue = s;
        }

        public String toString(){
            return stringValue;
        }
    }


    public int getRowNumber(LabelConstants labelConstants){
        int rowNumber= 0;
        int incrementer = 0 ;

        switch (labelConstants){

            case OpeningBalance:
                rowNumber = incrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:
                rowNumber = incrementer+2;
                break;
            case ConversionOfAcademyTrustsInPriorYear:
                rowNumber = incrementer+3;
                break;
            case InYearConversionOfAcademyTrusts:
                rowNumber = incrementer+4;
                break;
            case CurrentServiceCost:
                rowNumber = incrementer+5;
                break;
            case EmployerContributions:
                rowNumber = incrementer+6;
                break;
            case UnfundedPensionPayments:
                rowNumber = incrementer+7;
                break;
            case PastServiceCost:
                rowNumber = incrementer+8;
                break;
            case NetInterestExpense:
                rowNumber = incrementer+9;
                break;
            case LossesOrGainsOnCurtailments:
                rowNumber = incrementer+10;
                break;
            case ActuarialLossGain:
                rowNumber = incrementer+11;
                break;
            case EffectOfNonRoutineSettlements:
                rowNumber = incrementer+12;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:
                rowNumber = incrementer+13;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:
                rowNumber = incrementer+14;
                break;
            case ClosingBalance:
                rowNumber = incrementer+15;
                break;
        }
        return rowNumber;
    }

    public String getValueByLabelName(LabelConstants label){
        String extractedText = getValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(label)),"1",pageName);
        info("Value present in field : "+label+" is : "+extractedText);
        return extractedText;
    }
}
