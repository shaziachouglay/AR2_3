package pageObjects.landAndBuildings.trustOwned;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class TO_Depreciation extends CommonMethods {


    private String pageName="LNB Trust Owned Depreciation ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Depreciation')]")
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

            case OriginalPriorYearClosingBalance:                                       rowCount=rowIncrementer+1;
                break;
            case AdjustmentMadeToOpeningBalance:                                        rowCount=rowIncrementer+2;
                break;
            case ChargedInPeriod:                                                       rowCount=rowIncrementer+3;
                break;
            case EliminatedOnDisposal:                                                  rowCount=rowIncrementer+4;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                       rowCount=rowIncrementer+5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                      rowCount=rowIncrementer+6;
                break;
            case Revaluations:                                                          rowCount=rowIncrementer+7;
                break;
            case Reclassifications:                                                     rowCount=rowIncrementer+8;
                break;
            case AtCloseOfPeriod:                                                       rowCount=rowIncrementer+9;
                break;
        }

        switch (column){

            case FreeholdLandAndBuildings:                                              columnCount=columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:                                             columnCount=columnIncrementer+2;
                break;
            case LeaseholdImprovements:                                                 columnCount=columnIncrementer+3;
                break;
            case Total:                                                                 columnCount=columnIncrementer+4;
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

            case OriginalPriorYearClosingBalance:                                       rowCount=rowIncrementer+1;
                break;
            case AdjustmentMadeToOpeningBalance:                                        rowCount=rowIncrementer+2;
                break;
            case ChargedInPeriod:                                                       rowCount=rowIncrementer+3;
                break;
            case EliminatedOnDisposal:                                                  rowCount=rowIncrementer+4;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                       rowCount=rowIncrementer+5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                      rowCount=rowIncrementer+6;
                break;
            case Revaluations:                                                          rowCount=rowIncrementer+7;
                break;
            case Reclassifications:                                                     rowCount=rowIncrementer+8;
                break;
            case AtCloseOfPeriod:                                                       rowCount=rowIncrementer+9;
                break;
        }

        switch (column){

            case FreeholdLandAndBuildings:                                              columnCount=columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:                                             columnCount=columnIncrementer+2;
                break;
            case LeaseholdImprovements:                                                 columnCount=columnIncrementer+3;
                break;
            case Total:                                                                 columnCount=columnIncrementer+4;
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
        OriginalPriorYearClosingBalance,
        AdjustmentMadeToOpeningBalance,
        ChargedInPeriod,
        EliminatedOnDisposal,
        TransferredInOnExistingAcademiesJoiningTheTrust,
        TransferredOutOnExistingAcademiesLeavingTheTrust,
        Revaluations,
        Reclassifications,
        AtCloseOfPeriod
    }


    public enum ColumnConstant{
        FreeholdLandAndBuildings,
        LeaseholdLandAndBuildings,
        LeaseholdImprovements,
        Total

    }

}


