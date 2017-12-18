package pageObjects.standingData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AcademyInformation extends CommonMethods{

    String pageName = "Academy Information";

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Academy Information')]")
    WebElement academyInformationPage_header;

    @FindBy(xpath = "//div[@id='fg-the_multi_academy_trust_the-multi-academy-trust1_a_MAT_Status']//select[@class='form-control']")
    WebElement dropdownElement;

    public void clickOnSaveAndNextInAcademyInformationPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForAcademyInformationPage(){
        return isPageHeaderPresentAndDisplayed(academyInformationPage_header,pageName);
    }

    public void selectDropDownInAcademyInformationPage(){
        explicitWait(500);
        selectElementByVisibleDropDownValue(dropdownElement, "In period transfer in");
    }


}
