package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AmountsRecognisedInTheFinancialStatements extends CommonMethods{
       private String pageName="Amounts recognised in the financial statements";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Amounts recognised in the financial statements')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

public enum LabelConstants{
    CurrentServiceCost("Current service cost"),
    PastServiceCost("Past service cost"),
    CurtailmentAndSettlement("Curtailment and settlement"),
    TotalOperatingCharge("Total operating charge");


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

            case CurrentServiceCost:
                rowNumber = incrementer+1;
                break;
            case PastServiceCost:
                rowNumber = incrementer+2;
                break;
            case CurtailmentAndSettlement:
                rowNumber = incrementer+3;
                break;
            case TotalOperatingCharge:
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
