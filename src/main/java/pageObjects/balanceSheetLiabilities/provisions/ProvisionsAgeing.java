package pageObjects.balanceSheetLiabilities.provisions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class ProvisionsAgeing extends CommonMethods{
    private String pageName="LNB Provisions Agening";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Provisions (Ageing)')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayedForAUC_CostPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstant{
        WithingOneYear("Within one year"),
        BetweenTwoAndFiveYears("Between two and five years"),
        MoreThanFiveYears("More than five years"),
        Total("Total");

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
