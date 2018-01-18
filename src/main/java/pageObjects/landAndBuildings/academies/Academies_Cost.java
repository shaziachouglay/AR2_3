package pageObjects.landAndBuildings.academies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class Academies_Cost extends CommonMethods {

    private String pageName="LNB Academies Cost ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Cost')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayedForAUC_CostPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }
}