package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.funds;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class UnrestrictedEndowment extends CommonMethods {

    private String pageName="Unrestricted Endowment";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Unrestricted/Endowments')]")
    private WebElement page_header;

    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public void setValueInFieldByRowNameAndColumnName(RowConstants row, ColumnConstant column, String inputValue){

        int rowIncrementer=0;
        int rowCount=0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(row){

            case OriginalPriorYearClosingBalance:
                rowCount= rowIncrementer+1;
                break;
            case AdjustmentMadeInToTheOpeningBalance:
                rowCount= rowIncrementer+2;
                break;
            case IncomingResources:
                rowCount= rowIncrementer+3;
                break;
            case ResourcesExpended:
                rowCount= rowIncrementer+4;
                break;
            case TransferredInOnConversion:
                rowCount= rowIncrementer+5;
                break;
            case TransferredInOrOutOfExistingAcademies:
                rowCount= rowIncrementer+6;
                break;
            case GrossTransferBetweenFunds:
                rowCount= rowIncrementer+7;
                break;
            case OtherGainsLossesAndTransfers:
                rowCount= rowIncrementer+8;
                break;
            case BalanceAtPeriodEnd:
                rowCount= rowIncrementer+9;
                break;
        }

        switch (column){

            case EndowmentFunds:
                columnCount=columnCount+columnIncrementer+1;
                break;
            case UnrestrictedFunds:
                columnCount=columnCount+columnIncrementer+2;
                break;
            case Total:
                columnCount=columnCount+columnIncrementer+3;
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

    public String getValueByRowNameAndColumnName(RowConstants row, ColumnConstant column){
        String extractedText = "Not Text Extracted !";
        int rowIncrementer=0;
        int rowCount=0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(row){

            case OriginalPriorYearClosingBalance:
                rowCount= rowIncrementer+1;
                break;
            case AdjustmentMadeInToTheOpeningBalance:
                rowCount= rowIncrementer+2;
                break;
            case IncomingResources:
                rowCount= rowIncrementer+3;
                break;
            case ResourcesExpended:
                rowCount= rowIncrementer+4;
                break;
            case TransferredInOnConversion:
                rowCount= rowIncrementer+5;
                break;
            case TransferredInOrOutOfExistingAcademies:
                rowCount= rowIncrementer+6;
                break;
            case GrossTransferBetweenFunds:
                rowCount= rowIncrementer+7;
                break;
            case OtherGainsLossesAndTransfers:
                rowCount= rowIncrementer+8;
                break;
            case BalanceAtPeriodEnd:
                rowCount= rowIncrementer+9;
                break;
        }

        switch (column){


            case EndowmentFunds:
                columnCount=columnCount+columnIncrementer+1;
                break;
            case UnrestrictedFunds:
                columnCount=columnCount+columnIncrementer+2;
                break;
            case Total:
                columnCount=columnCount+columnIncrementer+3;
                break;

        }
        try {

            WebElement tableElement = page_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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


    public enum RowConstants{

        OriginalPriorYearClosingBalance, AdjustmentMadeInToTheOpeningBalance, IncomingResources,ResourcesExpended,TransferredInOnConversion,TransferredInOrOutOfExistingAcademies,
        GrossTransferBetweenFunds,OtherGainsLossesAndTransfers,BalanceAtPeriodEnd
    }


    public enum ColumnConstant{
        EndowmentFunds, UnrestrictedFunds, Total
    }

}

