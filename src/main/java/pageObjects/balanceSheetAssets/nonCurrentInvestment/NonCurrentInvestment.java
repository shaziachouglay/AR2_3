package pageObjects.balanceSheetAssets.nonCurrentInvestment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class NonCurrentInvestment extends CommonMethods {

    public String pageName="Non-current investments";
    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Non-current investments')]")
    WebElement nonCurrentInvestment_header;


    public boolean isHeaderPresentAndDisplayedForBSA_NonCurrentInvestment(){
        return isPageHeaderPresentAndDisplayed(nonCurrentInvestment_header,pageName);
    }
}
