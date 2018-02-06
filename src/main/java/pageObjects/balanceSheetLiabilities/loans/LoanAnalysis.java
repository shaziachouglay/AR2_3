package pageObjects.balanceSheetLiabilities.loans;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class LoanAnalysis extends CommonMethods{

    private String pageName = " BSL Loan Analysis";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how = How.XPATH, using = "//div[@class='opa-screen-title'][contains(.,'Loan analysis')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed() {
        return isPageHeaderPresentAndDisplayed(page_header, pageName);
    }

    public void setValueInFieldByRowNameAndColumnName(RowConstants row, ColumnConstant column, String inputValue) {

        int rowIncrementer = 0;
        int rowCount = 0;

        int columnIncrementer = 0;
        int columnCount = 0;

        switch (row) {

            case WithinOneYear:
                rowCount = rowIncrementer + 1;
                break;
            case BetweenTwoAndFiveYears:
                rowCount = rowIncrementer + 2;
                break;
            case AfterMoreThanFiveYears:
                rowCount = rowIncrementer + 3;
                break;
            case Total:
                rowCount = rowIncrementer + 4;
                break;
                default:
                warn("No Case Statement Matched");
        }

        switch (column) {
            case DfEGroup:
                columnCount = columnIncrementer + 1;
                break;
            case OtherGovernment:
                columnCount = columnIncrementer + 2;
                break;
            case Other:
                columnCount = columnIncrementer + 3;
                break;
            case Total:
                columnCount = columnIncrementer + 4;
                break;
        }

        try {
            waitForAjax();
            WebElement tableElement = page_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            waitForElementToBeVisible(tableElement);
            cleanAndRebuildElement(tableElement);
            setValueInElementInputJS(tableElement, inputValue);
            hitKeyboardButton(tableElement, Keys.TAB);
            explicitWait(150);
        } catch (StaleElementReferenceException sere) {
            warn("StaleElementReferenceException Occurred in" + pageName);
            takeScreenshot();
            sere.printStackTrace();
        } catch (NoSuchElementException nsee) {
            warn("NoSuchElementException Occurred in" + pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        info("The value set in row : " + row + " and column : " + column + " is : " + inputValue + " in " + pageName);

    }

    public String getValueByRowNameAndColumnName(RowConstants row, ColumnConstant column) {
        String extractedText = "Not Text Extracted !";
        int rowIncrementer = 0;
        int rowCount = 0;

        int columnIncrementer = 0;
        int columnCount = 0;

        switch (row) {

            case WithinOneYear:
                rowCount = rowIncrementer + 1;
                break;
            case BetweenTwoAndFiveYears:
                rowCount = rowIncrementer + 2;
                break;
            case AfterMoreThanFiveYears:
                rowCount = rowIncrementer + 3;
                break;
            case Total:
                rowCount = rowIncrementer + 4;
                break;
            default:
                warn("No Case Statement Matched");
        }

        switch (column) {

            case DfEGroup:
                columnCount = columnIncrementer + 1;
                break;
            case OtherGovernment:
                columnCount = columnIncrementer + 2;
                break;
            case Other:
                columnCount = columnIncrementer + 3;
                break;
            case Total:
                columnCount = columnIncrementer + 4;
                break;
        }
        try {

            WebElement tableElement = page_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement, Keys.TAB);
            //explicitWait(500);
            waitForJStoLoad();
            waitForElementToBeVisible(tableElement);
            waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
            info("The extracted value from row : " + row + " and column : " + column + " is : " + extractedText);
        } catch (NoSuchElementException nsee) {
            warn("NoSuchElementException Occurred in" + pageName);
            nsee.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return extractedText;
    }


    public enum RowConstants {
       WithinOneYear, BetweenTwoAndFiveYears, AfterMoreThanFiveYears, Total
    }


    public enum ColumnConstant {
        DfEGroup, OtherGovernment, Other, Total
    }

}

