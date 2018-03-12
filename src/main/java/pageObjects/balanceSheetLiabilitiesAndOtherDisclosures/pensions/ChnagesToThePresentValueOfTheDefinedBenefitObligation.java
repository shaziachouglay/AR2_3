package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class ChnagesToThePresentValueOfTheDefinedBenefitObligation extends CommonMethods {

    private String pageName="Changes to the present value of the defined benefit obligation";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Changes to the present value of the defined benefit obligation')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        OpeningPresentValueOSchemeObligations("Opening present value of scheme obligations"),
        AdjustmentMadetoTheOpeningBalance("Adjustments made to opening balance"),
        ConversionOfAcademyInPriorYear("Conversion of academy in prior year"),
        InYearConversionOfAcademy("In-year conversion of academy"),
        CurrentServiceCost("Current service cost"),
        InterestCost("Interest cost"),
        ActuarialGains("Actuarial (gain)/loss"),
        EmployeeContribution("Employee Contributions"),
        BenefitsPaid("Benefits Paid"),
        LossesOrGainsOnCurtailments("Losses or Gains on curtailments"),
        PastServiceCostOrGain("Past service cost/(gain)"),
        UnfundedPensionPayments("Unfunded pension payments"),
        EffectOfNonRoutineSettlements("Effect of non-routine settlements"),
        TransferredInOnExistingAcademiesJoiningTheTrust("Transferred in on existing academies joining the trust"),
        TransferredOutOnExistingAcademiesLeavingTheTrust("Transferred out on existing academies leaving the trust"),
        ClosingDefinedBenefitObligation("Closing defined benefit obligation");


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

            case OpeningPresentValueOSchemeObligations:
                rowNumber = incrementer+1;
                break;
            case AdjustmentMadetoTheOpeningBalance:
                rowNumber = incrementer+2;
                break;
            case ConversionOfAcademyInPriorYear:
                rowNumber = incrementer+3;
                break;
            case InYearConversionOfAcademy:
                rowNumber = incrementer+4;
                break;
            case CurrentServiceCost:
                rowNumber = incrementer+5;
                break;
            case InterestCost:
                rowNumber = incrementer+6;
                break;
            case ActuarialGains:
                rowNumber = incrementer+7;
                break;
            case EmployeeContribution:
                rowNumber = incrementer+8;
                break;
            case BenefitsPaid:
                rowNumber = incrementer+9;
                break;
            case LossesOrGainsOnCurtailments:
                rowNumber = incrementer+10;
                break;
            case PastServiceCostOrGain:
                rowNumber = incrementer+11;
                break;
            case UnfundedPensionPayments:
                rowNumber = incrementer+12;
                break;
            case EffectOfNonRoutineSettlements:
                rowNumber = incrementer+13;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:
                rowNumber = incrementer+14;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:
                rowNumber = incrementer+15;
                break;
            case ClosingDefinedBenefitObligation:
                rowNumber = incrementer+16;
                break;
        }

         return rowNumber;
    }

    public void setValueInFieldByLabelConstant(LabelConstants labelConstant, String inputValue){
        setValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(labelConstant)),"1",inputValue, pageName );
        info("value set in field "+labelConstant.toString()+" is "+inputValue);
    }

    public String getValueByLabelName(LabelConstants label){
        String text = getValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(label)),"1", pageName);
        info("Value present in field : "+label+" is : "+text);
        return text;
    }
}
