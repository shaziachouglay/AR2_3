package pageObjects.sofa.staffAndTrustees;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class OffPayrollArrangements extends CommonMethods {

    @FindBy(how= How.XPATH , using = "//div[@class='opa-main-panel']")
    WebElement offPayRollArrangements_body ;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Off Payroll Arrangements')]")
    WebElement offPayRollArrangements_header;

    private String pageName = "Off Payroll Arrangements)" ;

    public boolean isHeaderPresentAndDisplayedForOffPayrollArrangementsPage(){
        return isPageHeaderPresentAndDisplayed(offPayRollArrangements_header,pageName);
    }

    public enum RowNames{
        TrusteeOffPayrollArrangements , OtherOffPayrollArrangements, Total
    }

    public enum ColumnNames{
        one , two
    }

    public void setValueInTableByRowNameAndColumnNameInOffPayrollArrangementsPage(RowNames row,ColumnNames column,String inputValue){
        int rowCount= 0 ;
        int columnCount= 0 ;
        switch (row){
            case TrusteeOffPayrollArrangements:     rowCount = 1;
                break;
            case OtherOffPayrollArrangements:       rowCount = 2;
                break;
            case Total:                             rowCount = 3;
                break;
        }
        switch (column){
            case one:                               columnCount = 1;
                break;
            case two:                               columnCount = 2;
                break;
        }
        try {
            waitForAjax();
            WebElement tableElement = offPayRollArrangements_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            waitForElementToBeVisible(tableElement);
            cleanAndRebuildElement(tableElement);
            setValueInElementInputJS(tableElement, inputValue);
            hitKeyboardButton(tableElement, Keys.TAB);
            explicitWait(150);
        }
        catch (StaleElementReferenceException sere){
            warn("StaleElementReferenceException Occurred in"+pageName);
            takeScreenshot();
            sere.printStackTrace();
        }
        catch (NoSuchElementException nsee){
            warn("NoSuchElementException Occurred in"+pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        info("The value set in row : "+ row+ " and column : "+column+" is : "+inputValue+" in "+pageName);
    }

    public String getValueFromTableByRowNameAndColumnName(RowNames row , ColumnNames column){

        String extractedText = " No Text Extracted !";
        int rowCount= 0 ;
        int columnCount= 0 ;

        switch (row){
            case TrusteeOffPayrollArrangements:     rowCount = 1;break;
            case OtherOffPayrollArrangements:       rowCount = 2;break;
            case Total:                             rowCount = 3;break;
        }
        switch (column){
            case one:                               columnCount = 1;break;
            case two:                               columnCount = 2;break;
        }
        try {
            WebElement tableElement = offPayRollArrangements_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement,Keys.TAB);
            explicitWait(500);
            waitForJStoLoad();
            waitForElementToBeVisible(tableElement); waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
            info("The extracted value from row : "+ row+ " and column : "+column+" is : "+extractedText);
        }
        catch (NoSuchElementException nsee){
            warn("NoSuchElementException Occurred in"+pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return extractedText;
    }

}
