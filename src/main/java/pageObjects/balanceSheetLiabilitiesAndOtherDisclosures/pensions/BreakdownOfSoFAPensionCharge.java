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
