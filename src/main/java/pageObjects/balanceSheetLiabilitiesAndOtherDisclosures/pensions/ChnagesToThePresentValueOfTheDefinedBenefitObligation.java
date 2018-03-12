package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.landAndBuildings.landAndBuildingsTotal.LBT_Cost;
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

    public void setValueInFieldByLabelConstant(LBT_Cost.LabelConstant labelConstant, String inputValue){
        setValueInInputFieldByLabelName(page_body,labelConstant.toString(), inputValue);
        info("value set in field "+labelConstant.toString()+" is "+inputValue);
    }

    public String getValueByLabelName(LBT_Cost.LabelConstant label){
        String text = getValueFromInputFieldByParentElementAndLabelName(page_body,label.toString());
        info("Value present in field : "+label+" is : "+text);
        return text;
    }
}
