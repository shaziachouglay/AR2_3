package pageObjects.accessOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class HomePage extends CommonMethods {

    @FindBy(xpath = "//h1[contains(.,'Department For Education')]/../../..//a[@class='button button-start']")
    WebElement signInOrCreateAnAccountElement;

    public void clickOnSignInOrCreateAnAccount(){
        clickElementWithJS2(signInOrCreateAnAccountElement);
        info("Clicked on the Sign In or Create An Account link");
    }
}
