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

    public int getRowNumber(LabelConstants labelConstants){
        int rowNumber= 0;
        int incrementer = 0 ;

        switch (labelConstants){

            case InterestCost:
                rowNumber = incrementer+1;
                break;
            case InterestIncome:
                rowNumber = incrementer+2;
                break;
            case NetInterestExpense:
                rowNumber = incrementer+3;
                break;
            case ActuarialGainsLossesRecognised:
                rowNumber = incrementer+4;
                break;
        }
        return rowNumber;
    }

    public String getValueByLabelName(LabelConstants label){
        String extractedText = getValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(label)),"1",pageName);
        info("Value present in field : "+label+" is : "+extractedText);
        return extractedText;
    }
}
