package pageObjects.standingData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Academy extends CommonMethods {

    String pageName = "Academy";

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Academy')]")
    WebElement academyPage_header;

    public void clickOnSaveAndNextInAcademyPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    public boolean isHeaderPresentAndDisplayedForAcademyPage(){
        return isPageHeaderPresentAndDisplayed(academyPage_header,pageName);
    }

}
