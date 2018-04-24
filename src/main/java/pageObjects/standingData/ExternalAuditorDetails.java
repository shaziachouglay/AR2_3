package pageObjects.standingData;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class ExternalAuditorDetails extends CommonMethods{

    private String pageName = "External Auditor Details";

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'External Auditor details')]")
    WebElement externalAuditorDetails_header;

    @FindBy(xpath = "//form[@id='owdInterviewForm']")
    WebElement parentElement;

    public boolean isHeaderPresentAndDisplayedForExternalAuditorDetailsPage(){
        return isPageHeaderPresentAndDisplayed(externalAuditorDetails_header,pageName);
    }

    public void clickOnAddAInstanceButton(){
        WebElement element = getDriver().findElement(By.xpath("//input[@value='Save & Next']"));
        clickElementWithJS2(element);
        info("Clicked on the Save and Next Button in "+pageName);
    }

    public void setValuesInInputFieldsInExternalAuditorDetailsPage(){
        setValueInInputFieldByLabelNameForExtAudPage(parentElement,"Person Name", "Test User");
        setValueInInputFieldByLabelNameForExtAudPage(parentElement,"Firm name", "Test User");
        setValueInInputFieldByLabelNameForExtAudPage(parentElement,"Phone number", "Test User");
        setValueInInputFieldByLabelNameForExtAudPage(parentElement,"Email address", "TestUser@test.com");
        setValueInInputFieldByLabelNameForExtAudPage(parentElement,"Re-type email address", "TestUser@test.com");
        selectElementByVisibleText(getDriver().findElement(By.xpath("//select")),"External Auditor Approver");
    }

    private void setValueInInputFieldByLabelNameForExtAudPage(WebElement parentElement, String labelName, String inputValue){
        try{
            cleanAndRebuildElement(parentElement);
            // The below line was changed in AR2 . leaving this for debugging.
            WebElement element = parentElement.findElement(By.xpath(".//div/label[contains(.,'"+labelName+"')]/../..//input"));
//            WebElement element = parentElement.findElement(By.xpath(".//div[contains(.,'"+labelName+"')]/../..//input"));
            cleanAndRebuildElement(element);
            setValueInElementInputJS(element, inputValue);
            info("Set value in label :"+labelName+" with value "+inputValue);
            hitKeyboardButton(element, Keys.TAB);

        }catch(StaleElementReferenceException sere) {
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred while setting value in label name " + labelName);
        }
    }
}
