package pageObjects.sofa.provisionOfBoardingActivities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

import java.util.List;

public class ProvisionOfBoardingActivitesExpenditure extends CommonMethods {


    @FindBy(how = How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement expenditure_body;

    @FindBy(how = How.XPATH, using = "//form[@id='owdInterviewForm']//label/img")
    private List<WebElement> expenditure_helpButtons;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Expenditure')]")
    WebElement expenditure_header;

    public String pageName = "Expenditure";

    /**
     * These are he enus to be used for the SoFA sub menu Expenditure
     */
    public enum ProvisionOfBoardingActiviteisExpenditureLabelConstants {
        DirectStaffPayCosts("Direct Staff Pay Costs"),
        DirectCostsForGoodsAndServices("Direct Costs for Goods and Services"),
        OtherDirectCosts("Other Direct Costs"),
        TotalDirectCosts("Total Direct Costs"),
        IndirectCostsForStaffPay("Indirect Costs for Staff Pay"),
        IndirectCostsForUtilities("Indirect Costs for Utilities"),
        IndirectCostsForMaintenanceOfPremises("Indirect Costs for Maintenance of Premises"),
        IndirectCostsForDepreciation("Indirect Costs for Depreciation"),
        IndirectCostsForAmortisation("Indirect Costs for Amortisation"),
        IndirectCostsForImpairment("Indirect Costs for Impairment"),
        OtherIndirectCosts("Other Indirect Costs"),
        TotalIndirectCosts("Total Indirect Costs");

        private final String stringValue;
        ProvisionOfBoardingActiviteisExpenditureLabelConstants(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public boolean isHeaderPresentAndDisplayedForBoardingActivitiesExpenditurePage() {
       return isPageHeaderPresentAndDisplayed(expenditure_header,pageName);
    }

    public void setValueInInPutFieldByFieldsetNameIn_ProvisionOfBoardingActivitiesExpenditurePage(ProvisionOfBoardingActiviteisExpenditureLabelConstants labelName, String inputValue) {
        setValueInInputFieldByLabelName(expenditure_body, labelName.toString(), inputValue);
    }


    public String getValueFromFieldByLabelInProvisionOfBoardignActivitiesExpenditurePage(ProvisionOfBoardingActiviteisExpenditureLabelConstants label) {
       return getValueFromInputFieldByParentElementAndLabelName(expenditure_body, label.toString());
    }

    public void clickOnSaveAndNextInProvisionOfBoardignActivitiesExpenditurePage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
}
