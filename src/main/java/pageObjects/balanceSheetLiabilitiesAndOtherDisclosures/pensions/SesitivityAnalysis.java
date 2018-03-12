package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class SesitivityAnalysis extends CommonMethods {

    private String pageName="Sensitivity Analysis";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Sensitivity Analysis')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        OpeningFairValueOfSchemeAssets("Opening fair value of scheme assets"),
        AdjustmentsMadeToOpeningBalance("Adjustments made to opening balance"),
        ConversionOfAcademyTrustsInPriorYear("Conversion of academy trusts in prior year"),
        InYearConversionOfAcademyTrusts("In-year conversion of academy trusts"),
        InterestIncome("Interest income"),ActuarialLossGain("Actuarial (loss)/gain"),
        EmployerContributions("Employer contributions"),
        EmployeeContributions("Employee Contributions"),
        BenefitsPaid("Benefits Paid"),EffectOfNonRoutineSettlements("Effect of non-routine settlements"),
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

    public void setValueInFieldByLabelConstant(LabelConstants labelConstant, String inputValue){
        setValueInInputFieldByLabelName(page_body,labelConstant.toString(), inputValue);
        info("value set in field "+labelConstant.toString()+" is "+inputValue);
    }

    public String getValueByLabelName(LabelConstants label){
        String text = getValueFromInputFieldByParentElementAndLabelName(page_body,label.toString());
        info("Value present in field : "+label+" is : "+text);
        return text;
    }
}
