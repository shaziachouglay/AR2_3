package pageObjects.standingData;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class WelcomeScreen_dev extends CommonMethods {

    @FindBy(xpath = "//input[@class='form-control']")
    WebElement userName;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Welcome screen')]")
    WebElement welcomeScreen_header;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement welcomeScreenBody;

    String pageName = "Welcome Screen";
    /**
     *
     * @return the displayed status of the User Name Field for Aniket.
     */
    public boolean isUserNameDisplayed(){
        boolean isDisplayed = isElementPresentAndDisplayed(userName);
        info(" user name displayed status is : "+ isDisplayed);
        return isDisplayed;
    }

    /**
     *
     * @return the username value from the user name field in welcome screen
     */
    public String getUserNameFromInputFieldInWelcomeScreenPage(){
        String text = getElementAttributeValueWithRetry(userName, "value");
        info("The extracted text from the user name field is : "+text);
        return text;
    }

    public boolean isWelcomePageHeaderPresentAndDisplayed(){
       return isPageHeaderPresentAndDisplayed(welcomeScreen_header,pageName);
    }

    public void clickOnSaveAndNextInWelcomePage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    /**
     * use these enums to choose the roles.
     */
    public enum USER_ROLE{PREPARER, APPROVER , EXTERNALAUDITOR, HELPDESK}

    /**
     *
     * @param role takes the enum as a role
     */
    public void clickYesOnUserRole(USER_ROLE role){
        int roleIndex = 0;
        switch (role){
            case PREPARER: roleIndex = 3;
                break;
            case APPROVER: roleIndex = 4;
                break;
            case EXTERNALAUDITOR: roleIndex = 5;
                break;
            case HELPDESK: roleIndex = 6;
                break;
        }
        try{
            WebElement element = welcomeScreenBody.findElement(By.xpath(".//div[@class='opa-container form-group']/div["+roleIndex+"]//fieldset/label[contains(.,'Yes')]/input"));
            waitForElementToBeVisible(element);
            cleanAndRebuildElement(element);
            clickElementWithRetry(element);
            info("Clicked Yes in "+role.toString()+" .");
        }catch (StaleElementReferenceException sere){
            info("StaleElementReferenceException occured on "+this.pageName);
        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            warn("NoSuchElementException occurred in "+this.pageName);
        }
    }

    public void clickYesOnUserRoleNO(USER_ROLE role){
        int roleIndex = 0;
        switch (role){
            case PREPARER: roleIndex = 3;
                break;
            case APPROVER: roleIndex = 4;
                break;
            case EXTERNALAUDITOR: roleIndex = 5;
                break;
            case HELPDESK: roleIndex = 6;
                break;
        }
        try{
            WebElement element = welcomeScreenBody.findElement(By.xpath(".//div[@class='opa-container form-group']/div["+roleIndex+"]//fieldset/label[contains(.,'No')]/input"));
            waitForElementToBeVisible(element);
            cleanAndRebuildElement(element);
            clickElementWithRetry(element);
            info("Clicked Yes in "+role.toString()+" .");
        }catch (StaleElementReferenceException sere){
            info("StaleElementReferenceException occured on "+this.pageName);
        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            warn("NoSuchElementException occurred in "+this.pageName);
        }
    }


    public void getApplicationInformationFromWelcomeScreen(){
        String text = "";
        WebElement element1 = welcomeScreenBody.findElement(By.xpath(".//div[@id='global_global_g_4']/br[1]"));
        cleanAndRebuildElement(element1);
        text = getElementAttributeValueWithRetry(element1,"value");
        info(text);

        WebElement element2 = welcomeScreenBody.findElement(By.xpath(".//div[@id='global_global_g_4']/br[2]/following-sibling::text()"));
        cleanAndRebuildElement(element2);
        text = text+getElementTextWithRetry(element2);
        info(text);

        WebElement element3 = welcomeScreenBody.findElement(By.xpath(".//div[@id='global_global_g_4']/br[3]/following-sibling::text()"));
        cleanAndRebuildElement(element3);
        text = text+getElementTextWithRetry(element3);
        info(text);

        WebElement element4 = welcomeScreenBody.findElement(By.xpath(".//div[@id='global_global_g_4']/br[4]/following-sibling::text()"));
        cleanAndRebuildElement(element4);
        text = text+getElementTextWithRetry(element4);
        info(text);
    }

    public String getAccountReturnVersionNumber(){
        String text = null;
        try{
            WebElement element = welcomeScreenBody.findElement(By.xpath(".//h6"));
            cleanAndRebuildElement(element);
            text = getElementTextWithRetry(element);
            info(text);
            return text;
        }catch (StaleElementReferenceException e){
            warn("StaleElementReferenceException occurred");
            e.printStackTrace();
        }catch (NoSuchElementException nsee){
            warn("NoSuchElementException occurred");
            nsee.printStackTrace();
        }
        return text;
    }
}
