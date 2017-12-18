package pageObjects.accessOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class ServicePortalPage extends CommonMethods {

    @FindBy(xpath = "//div[@class='app allowed']//div[contains(.,'Accounts Return')]")
    WebElement accountreturnTile ;

    public  void clickOnAccountReturnTile(){
        waitForPageLoadToComplete();
        clickElementWithJS2(accountreturnTile);
        info("Clicked on the Account Return Tile.");
    }
}
