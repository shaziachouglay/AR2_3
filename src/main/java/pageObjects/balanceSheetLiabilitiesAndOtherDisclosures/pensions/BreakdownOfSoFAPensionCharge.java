package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

        import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class BreakdownOfSoFAPensionCharge extends CommonMethods {
    private String pageName="Breakdown of SoFA pension charge";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Breakdown of SoFA pension charge')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum LabelConstants{
        LGPS("LGPS"),
        TeachersPensionScheme("Teachers Pension Scheme"),
        IncomingResources("Incoming Resources"),
        DefinedContributionScheme("Defined contribution scheme"),
        StakeholderPrivatePensionProvision("Stakeholder/private pension provision"),
        Total("Total"),
        NumberOfPaidTrusteesWhoWereNOTPartOfAMainPensionScheme("Number of paid trustees who were NOT part of a main pension scheme");

        private String stringValue;
        LabelConstants(String s){
            this.stringValue = s;
        }
        public String toString(){
            return stringValue;
        }
    }

    public int getRowNumber(LabelConstants labelConstant){
        int incrementer = 0;
        int rowNumber=0 ;

        switch (labelConstant){

            case LGPS: rowNumber = incrementer+1;
                break;
            case TeachersPensionScheme:rowNumber = incrementer+2;
                break;
            case IncomingResources:rowNumber = incrementer+3;
                break;
            case DefinedContributionScheme:rowNumber = incrementer+4;
                break;
            case StakeholderPrivatePensionProvision:rowNumber = incrementer+5;
                break;
            case Total:rowNumber = incrementer+6;
                break;
            case NumberOfPaidTrusteesWhoWereNOTPartOfAMainPensionScheme:rowNumber = incrementer+7;
                break;
        }

        return rowNumber;
    }

    public void setValueInFieldByLabelConstant(LabelConstants labelConstant, String inputValue){
        setValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(labelConstant)),"1",inputValue,pageName);
        info("value set in field "+labelConstant.toString()+" is "+inputValue);
    }

    public String getValueByLabelName(LabelConstants labelConstant){

        String extractedText = getValueByRowNumberAndColumnNumber(page_body,String.valueOf(getRowNumber(labelConstant)),"1", pageName);
        info("Value extracted from field : "+labelConstant+" is : "+extractedText);
        return extractedText;
    }
}
