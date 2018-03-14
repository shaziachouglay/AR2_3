package pageObjects.balanceSheetLiabilitiesAndOtherDisclosures.pensions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class MajorAssumptionOfPension extends CommonMethods {

    private String pageName="Major Assumptions for pension";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Major Assumptions for pension')]")
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

            case RateODInflation:
                rowCount= rowIncrementer+1;
                break;
            case RateOfIncreasedInSalaries:
                rowCount= rowIncrementer+2;
                break;
            case RateOfIncreaseOfPensionsInPayment:
                rowCount= rowIncrementer+3;
                break;
            case DiscountRate:
                rowCount= rowIncrementer+4;
                break;
        }

        switch (column){
            case SingleOrMinimumOfRange:
                columnCount=columnCount+1;
                break;
            case MaximumOfRange:
                columnCount=columnCount+2;
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
            case RateODInflation:
                rowCount= rowIncrementer+1;
                break;
            case RateOfIncreasedInSalaries:
                rowCount= rowIncrementer+2;
                break;
            case RateOfIncreaseOfPensionsInPayment:
                rowCount= rowIncrementer+3;
                break;
            case DiscountRate:
                rowCount= rowIncrementer+4;
                break;
        }

        switch (column){
            case SingleOrMinimumOfRange:
                columnCount=columnIncrementer+1;
                break;
            case MaximumOfRange:
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


    public enum RowConstants{
        RateODInflation, RateOfIncreasedInSalaries, RateOfIncreaseOfPensionsInPayment,DiscountRate,
    }


    public enum ColumnConstant{
        SingleOrMinimumOfRange, MaximumOfRange
    }
}
