package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class MajorCategoriesOfPlanAssets extends CommonMethods {
    private String pageName="Major Categories of Plan Assets";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Major Categories of Plan Assets')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        Equities("Equities"),Gilts("Gilts"),CorporateBonds("Corporate Bonds"),Property("Property"),
        ashAndOtherLiquidAssets("Cash and Other Liquid Assets"),Derivatives("Derivatives"),
        InvestmentFunds("Investment Funds"),AssetBackedSecurities("Asset Backed Securities"),Other("Other"),Total("Total");

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
