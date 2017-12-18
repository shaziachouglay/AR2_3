package pageObjects.accessOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class LandingPage extends CommonMethods {

    @FindBy(xpath = "//h1[contains(.,'Academy Trust Accounts Return')]/../../..//button[@id='normal_button']")
    WebElement landingPageContinueButton;

    public void clickOnLandingPageContinueButton(){
        clickElementWithJS2(landingPageContinueButton);
        info("clicked on the landing page continue button");
    }
}
