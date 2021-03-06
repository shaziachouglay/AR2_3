package pageObjects.balanceSheetLiabilities.loans;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class LoanMovementTable extends CommonMethods {
    private String pageName = " BSL Loan Movement Table ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how = How.XPATH, using = "//div[@class='opa-screen-title'][contains(.,'Loan movement table')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed() {
        return isPageHeaderPresentAndDisplayed(page_header, pageName);
    }

    public void setValueInFieldByRowNameAndColumnName(RowConstants row, ColumnConstant column, String inputValue) {

        int rowIncrementer = 1;
        int rowCount = 0;

        int columnIncrementer = 0;
        int columnCount = 0;

        switch (row) {

            case OriginalPriorYearClosingBalance:
                rowCount = rowIncrementer + 1;
                break;
            case AdjustmentsMadeInRelationToTheOpeningBalance:
                rowCount = rowIncrementer + 2;
                break;
            case NewBorrowings:
                rowCount = rowIncrementer + 3;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:
                rowCount = rowIncrementer + 4;
                break;
            case TransferredInOnConversion:
                rowCount = rowIncrementer + 5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:
                rowCount = rowIncrementer + 6;
                break;
            case RepaymentOfBorrowings:
                rowCount = rowIncrementer + 7;
                break;
            case INterestCharged:
                rowCount = rowIncrementer + 8;
                break;
            case ClosingBalance:
                rowCount = rowIncrementer + 9;
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
        int rowIncrementer = 1;
        int rowCount = 0;

        int columnIncrementer = 0;
        int columnCount = 0;

        switch (row) {

            case OriginalPriorYearClosingBalance:
                rowCount = rowIncrementer + 1;
                break;
            case AdjustmentsMadeInRelationToTheOpeningBalance:
                rowCount = rowIncrementer + 2;
                break;
            case NewBorrowings:
                rowCount = rowIncrementer + 3;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:
                rowCount = rowIncrementer + 4;
                break;
            case TransferredInOnConversion:
                rowCount = rowIncrementer + 5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:
                rowCount = rowIncrementer + 6;
                break;
            case RepaymentOfBorrowings:
                rowCount = rowIncrementer + 7;
                break;
            case INterestCharged:
                rowCount = rowIncrementer + 8;
                break;
            case ClosingBalance:
                rowCount = rowIncrementer + 9;
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
            explicitWait(500);
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
        OriginalPriorYearClosingBalance, AdjustmentsMadeInRelationToTheOpeningBalance, NewBorrowings,
        TransferredInOnExistingAcademiesJoiningTheTrust, TransferredInOnConversion,
        TransferredOutOnExistingAcademiesLeavingTheTrust, RepaymentOfBorrowings, INterestCharged, ClosingBalance,
    }


    public enum ColumnConstant {
        DfEGroup, OtherGovernment, Other, Total
    }

}
