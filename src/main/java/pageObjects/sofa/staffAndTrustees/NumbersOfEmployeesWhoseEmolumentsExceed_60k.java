package pageObjects.sofa.staffAndTrustees;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class NumbersOfEmployeesWhoseEmolumentsExceed_60k extends CommonMethods {


    @FindBy(how = How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement numbersOfEmployeesWhoseEmolumentsExceed_60k_body;

    @FindBy(how = How.XPATH, using = "//div[@class='opa_entity_table']")
    WebElement table_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Numbers of Employees Whose Emoluments Exceed £60k')]")
    WebElement numbersOfEmployeesWhoseEmolumentsExceed_60k_header;

    private String pageName = "Numbers Of Employees Whose Emoluments Exceed 60k";

    public boolean isHeaderPresentAndDisplayedForNumbersOfEmployeesWhoseEmolumentsExceed_60kPage(){
        return isPageHeaderPresentAndDisplayed(numbersOfEmployeesWhoseEmolumentsExceed_60k_header,pageName);
    }

    public void selectDropDownOptionByRowNumber(int rowNumber, String visibleText) {
        try {
            WebElement element = table_body.findElement(By.xpath(".//div[@class='opa_entity_table_row entity-instance']["+rowNumber+"]//select"));
            cleanAndRebuildElement(element);
            selectElementByVisibleText(element, visibleText);
            hitKeyboardButton(element,Keys.TAB);
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("Selected the dropdown for row number :" + rowNumber + " with a drop down value of : " + visibleText);
    }

    public void clickRemoveButtonFromTableByRowNumber(int rowNumber) {
        try {
            WebElement element = table_body.findElement(By.xpath(".//div[" + rowNumber + "]/div/div/div/div[@class='buttons']"));
            clickElementWithRetry(element);
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("Clicked on the remove button for row number : " + rowNumber + " .");
    }

    public String getValueFromTotalButton() {
        String extractedText = "";
        try {
            WebElement element = numbersOfEmployeesWhoseEmolumentsExceed_60k_body.findElement(By.xpath(".//input[@name='global_global_a_AnnuEmBnds_Tot']"));
            extractedText = element.getAttribute("value");
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("The Extracted Text from the Totals field is :" + extractedText);
        return extractedText;
    }

    public void setValueInNumberField(String inputValue){
        try {
            WebElement element = numbersOfEmployeesWhoseEmolumentsExceed_60k_body.findElement(By.xpath(".//div[1]/div/input"));
            cleanAndRebuildElement(element,10000);
            setValueInElementInputJS(element, inputValue);
            hitKeyboardButton(element,Keys.TAB);
            logger.info("Value set in the Numbers field is :"+ inputValue);
        } catch (Exception e){
            e.printStackTrace();
            takeScreenshot();
            logger.info("Exception Occured : trying to enter value in the  Numbers Field in Class Number Of Employees Exceed ... ");
        }
    }
}