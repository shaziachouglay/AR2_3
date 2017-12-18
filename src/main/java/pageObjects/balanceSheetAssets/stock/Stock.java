package pageObjects.balanceSheetAssets.stock;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Stock extends CommonMethods {


    public String pageName = "Stock";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement stock_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Stock')]")
    WebElement stock_header;

    public enum BSA_Stock_Label {

        Stock("Stock");

        private final String stringValue;
        BSA_Stock_Label(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void clickOnSaveAndNextInBSA_StockPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForBSA_StockPage(){
        return isPageHeaderPresentAndDisplayed(stock_header,pageName);
    }

    public void setValueInInputFieldByLabelNameInBSA_StockPage(BSA_Stock_Label label , String inputValue){
        setValueInInputFieldByLabelName(stock_body,label.toString(), inputValue);
    }
}
