package pageObjects.accessOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;
import utilityClasses.FrameworkPropertyConfigurator;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//button[@value='Log in']")
    WebElement signInButton;

    public void setvalueInUserName(){
        String userName = FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.credentials,"accesOneUserName");
        setValueInElementInputJS(username,userName);
        info("User name is set");
    }

    public void setvalueInPassword(){
        String passWord = FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.credentials,"accesOnePassword");
        setValueInElementInputJS(password,passWord);
        info("Password is set");
    }

     public void clickOnSignInButtonInAcessOneSignInPage(){
        clickElementWithJS2(signInButton);
        info("clicked on the sign in SIgn In Page - Access One ");
     }
}
