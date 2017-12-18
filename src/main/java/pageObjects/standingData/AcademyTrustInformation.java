package pageObjects.standingData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AcademyTrustInformation extends CommonMethods {

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Academy Trust Information')]")
    WebElement academyTrustInformationPage_header;

    @FindBy(xpath = "//div[@id='fg-global_global_a_AT_Type']//select[@class='form-control']")
    WebElement dropdownElement;

    public String pageName = "Academy Trust Information";

    public boolean isHeaderPresentAndDisplayedForAcademyTrustInformationPage(){
       return isPageHeaderPresentAndDisplayed(academyTrustInformationPage_header,pageName);
    }

    public void clickOnSaveAndNextInAcademyTrustInformationPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    public void selectDropDownAcademyTrustTypeInAcademyTrustInformationPage(){
        explicitWait(500);
        selectElementByVisibleDropDownValue(dropdownElement, "Multi Academy Trust (MAT)");
    }
}
