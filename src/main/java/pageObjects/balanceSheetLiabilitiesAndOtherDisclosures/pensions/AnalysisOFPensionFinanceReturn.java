package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
        import utilityClasses.CommonMethods;

public class AnalysisOFPensionFinanceReturn extends CommonMethods {


    private String pageName="Analysis of pension finance return";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Analysis of pension finance return')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        InterestCost("Interest cost"),
        InterestIncome("Interest Income"),
        NetInterestExpense("Net interest expense"),
        ActuarialGainsLossesRecognised("Actuarial gains/(losses) recognised");

        private String stringValue;
        LabelConstants(String s){
            this.stringValue = s;
        }
        public String toString(){
            return stringValue;
        }
    }


    public String getValueByLabelName(LabelConstants label){
        String text = getValueFromInputFieldByParentElementAndLabelName(page_body,label.toString());
        info("Value present in field : "+label+" is : "+text);
        return text;
    }
}
