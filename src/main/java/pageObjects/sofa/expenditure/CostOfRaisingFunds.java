package pageObjects.sofa.expenditure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

/**
 * @author Aniket Wadkar
 */
public class CostOfRaisingFunds extends CommonMethods {

    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement costOfRaisingFunds_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Costs of Raising Funds')]")
    WebElement costOfRaisingFunds_header;

    public String pageName = "Costs of Raising Funds";

    public enum CostOfRaisingFundsLabelNames {
        PayCosta("Pay Costs"), PremiseCosts("Premises Costs") ,
        Other("Other") , Total("Total");
        private final String stringValue;
        CostOfRaisingFundsLabelNames(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void clickOnSaveAndNextInCostOfRaisingFundsPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    public boolean isHeaderPresentAndDisplayedForCostOfRaisingFundsPage(){
        return isPageHeaderPresentAndDisplayed(costOfRaisingFunds_header,pageName);
    }
    public void setValueInInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFundsLabelNames label , String inputValue){
        setValueInInputFieldByLabelName(costOfRaisingFunds_body,label.toString(), inputValue);
    }

    public String getValueFromInputFieldByLabelNameInCostOfRaisingFundsPage(CostOfRaisingFundsLabelNames label){
        return getValueFromInputFieldByParentElementAndLabelName(costOfRaisingFunds_body, label.toString());
    }
}
