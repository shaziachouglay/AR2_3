package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class ChnagesToTheFairValueOfAssets extends CommonMethods {

    private String pageName="Changes to the fair value of assets";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Changes to the fair value of assets')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        OpeningFairValueOfSchemeAssets("Opening fair value of scheme assets"),
        AdjustmentMadetoTheOpeningBalance("Adjustments made to opening balance"),
        ConversionOfAcademyTrustInPriorYear("Conversion of academy trusts in prior year"),
        InYearConversionOfAcademyTrusts("In-year conversion of academy trusts"),
        InterestIncome("Interest income"),
        ActuarialGains("Actuarial (gain)/loss"),
        EmployerContribution("Employer Contributions"),
        BenefitsPaid("Benefits Paid"),
        EffectOfNonRoutineSettlements("Effect of non-routine settlements"),
        TransferredInOnExistingAcademiesJoiningTheTrust("Transferred in on existing academies joining the trust"),
        TransferredOutOnExistingAcademiesLeavingTheTrust("Transferred out on existing academies leaving the trust"),
        ClosingFairValueOfSchemeAssets("Closing fair value of scheme assets");


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

            case OpeningFairValueOfSchemeAssets:
                rowNumber = incrementer+1;
                break;
            case AdjustmentMadetoTheOpeningBalance:
                rowNumber = incrementer+2;
                break;
            case ConversionOfAcademyTrustInPriorYear:
                rowNumber = incrementer+3;
                break;
            case InYearConversionOfAcademyTrusts:
                rowNumber = incrementer+4;
                break;
            case InterestIncome:
                rowNumber = incrementer+5;
                break;
            case ActuarialGains:
                rowNumber = incrementer+6;
                break;
            case EmployerContribution:
                rowNumber = incrementer+7;
                break;
            case BenefitsPaid:
                rowNumber = incrementer+8;
                break;
            case EffectOfNonRoutineSettlements:
                rowNumber = incrementer+9;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:
                rowNumber = incrementer+10;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:
                rowNumber = incrementer+11;
                break;
            case ClosingFairValueOfSchemeAssets:
                rowNumber = incrementer+12;
                break;
        }

        return rowNumber;
    }

    public void setValueInFieldByLabelConstant(LabelConstants labelConstant, String inputValue){
        setValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(labelConstant)),"1",inputValue,pageName);
        info("value set in field "+labelConstant.toString()+" is "+inputValue);
    }

    public String getValueByLabelName(LabelConstants label){
        String extractedText = getValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(label)),"1",pageName);
        info("Value present in field : "+label+" is : "+extractedText);
        return extractedText;
    }
}
