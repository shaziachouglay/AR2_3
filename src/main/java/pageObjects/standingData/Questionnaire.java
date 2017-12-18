package pageObjects.standingData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Questionnaire extends CommonMethods{

    String pageName = "Questionnaire";

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Questionnaire')]")
    WebElement questionnaire_header;

    public void clickOnSaveAndNextInQuestionnairePage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForQuestionnairePage(){
        return isPageHeaderPresentAndDisplayed(questionnaire_header,pageName);
    }
}
