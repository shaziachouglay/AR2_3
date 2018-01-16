package pageObjects.assetUnderConstruction.auc_TangibleFixedAssets;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AUC_TFA_Debtors  extends CommonMethods{

    private String pageName="Debtors AUC";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Debtors')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayed(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum RowConstants{
        AccruedCapitalGrantDFEESFA,
        AccruedCapitalGrantOther,
        AccruedIncome,
        OtherDebtors,
        Total
        }

    public enum ColumnConstant{
        AmountsDueWithin1Year,
        AmountsDueAfterMoreThan1Year
    }
    public void setValueInFieldByRowNameAndColumnNameInAUC_TFA_CostPage(RowConstants row, ColumnConstant column, String inputValue){

        int rowIncrementer=0;
        int rowCount=0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(row){

            case AccruedCapitalGrantDFEESFA:
                rowCount=rowIncrementer+1;
                break;
            case AccruedCapitalGrantOther:
                rowCount=rowIncrementer+2;
                break;
            case AccruedIncome:
                rowCount=rowIncrementer+3;
                break;
            case OtherDebtors:
                rowCount=rowIncrementer+4;
                break;
            case Total:
                rowCount=rowIncrementer+5;
                break;
        }

        switch (column){

            case AmountsDueWithin1Year:
                columnCount=columnIncrementer+1;
                break;
            case AmountsDueAfterMoreThan1Year:
                columnCount=columnIncrementer+2;
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

            case AccruedCapitalGrantDFEESFA:
                rowCount=rowIncrementer+1;
                break;
            case AccruedCapitalGrantOther:
                rowCount=rowIncrementer+2;
                break;
            case AccruedIncome:
                rowCount=rowIncrementer+3;
                break;
            case OtherDebtors:
                rowCount=rowIncrementer+4;
                break;
            case Total:
                rowCount=rowIncrementer+5;
                break;
        }

        switch (column){
            case AmountsDueWithin1Year:
                columnCount=columnIncrementer+1;
                break;
            case AmountsDueAfterMoreThan1Year:
                columnCount=columnIncrementer+2;
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

}
