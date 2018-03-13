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


    public String getValueByLabelName(LabelConstants label){

        String extractedText = getValueByRowNumberAndColumnNumber(page_body,"","",pageName);
        String text = getValueFromInputFieldByParentElementAndLabelName(page_body,label.toString());
        info("Value present in field : "+label+" is : "+text);
        return text;
    }
}
