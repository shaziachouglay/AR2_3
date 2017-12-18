package pageObjects.balanceSheetAssets.tangibleFixedAssets;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class TFA_Impairments extends CommonMethods {

    public String pageName ="Impairment";

    @FindBy(xpath = "//div[@class='opa-screen-title'][contains(.,'Impairment')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement bodyElement;

    public boolean isPageHeaderPresentAndDisplayedInTFAImpairmentPage(){
        return isPageHeaderPresentAndDisplayed(pageHeader,pageName);
    }

    public enum rowName{
        OriginalPriorYearClosingBalance,
        AdjustmentsMadeToOpeningBalance,
        ChargedInPeriod,
        ReleasedInPeriod,
        TransferredInOnExistingAcademiesJoiningTheTrust,
        TransferredOutOnExistingAcademiesLeavingTheTrust,
        ClosingBalance,
    }
    public enum columnName{

        FreeholdLandAndBuildings,
        LeaseholdLandAndBuildings,
        LeaseholdImprovements,
        PlantAndMachinery,
        FurnitureAndEquipment,
        ComputerEquipment,
        MotorVehicles,
        AssetsUnderConstruction,
        Total
    }

    public void setValueByRowNameAndColumnNameInImpairmentPage(rowName rowName,columnName columnName,String inputValue){

        int rowIncrementer = 2 ;
        int rowCount= 0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(rowName){

            case OriginalPriorYearClosingBalance: rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:rowCount=rowIncrementer+2;
                break;
            case ChargedInPeriod:rowCount=rowIncrementer+3;
                break;
            case ReleasedInPeriod:rowCount=rowIncrementer+4;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:rowCount=rowIncrementer+5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:rowCount=rowIncrementer+6;
                break;
            case ClosingBalance:rowCount=rowIncrementer+7;
                break;
        }


        switch (columnName){

            case FreeholdLandAndBuildings: columnCount=columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:columnCount=columnIncrementer+2;
                break;
            case LeaseholdImprovements:columnCount=columnIncrementer+3;
                break;
            case PlantAndMachinery:columnCount=columnIncrementer+4;
                break;
            case FurnitureAndEquipment:columnCount=columnIncrementer+5;
                break;
            case ComputerEquipment:columnCount=columnIncrementer+6;
                break;
            case MotorVehicles:columnCount=columnIncrementer+7;
                break;
            case AssetsUnderConstruction:columnCount=columnIncrementer+8;
                break;
            case Total:columnCount=columnIncrementer+9;
                break;
        }

        try {
            waitForAjax();
            WebElement tableElement = bodyElement.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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
        info("The value set in row : "+ rowName+ " and column : "+columnName+" is : "+inputValue+" in "+pageName);
    }

    public String getValueByRowNameAndColumnNameInTFAImpairmentsPage(rowName rowName, columnName columnName){

        String extractedText="Nothing extracted";
        int rowIncrementer = 2 ;
        int rowCount= 0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(rowName){

            case OriginalPriorYearClosingBalance: rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:rowCount=rowIncrementer+2;
                break;
            case ChargedInPeriod:rowCount=rowIncrementer+3;
                break;
            case ReleasedInPeriod:rowCount=rowIncrementer+4;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:rowCount=rowIncrementer+5;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:rowCount=rowIncrementer+6;
                break;
            case ClosingBalance:rowCount=rowIncrementer+7;
                break;
        }


        switch (columnName){

            case FreeholdLandAndBuildings: columnCount=columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:columnCount=columnIncrementer+2;
                break;
            case LeaseholdImprovements:columnCount=columnIncrementer+3;
                break;
            case PlantAndMachinery:columnCount=columnIncrementer+4;
                break;
            case FurnitureAndEquipment:columnCount=columnIncrementer+5;
                break;
            case ComputerEquipment:columnCount=columnIncrementer+6;
                break;
            case MotorVehicles:columnCount=columnIncrementer+7;
                break;
            case AssetsUnderConstruction:columnCount=columnIncrementer+8;
                break;
            case Total:columnCount=columnIncrementer+9;
                break;
        }
        try {

            WebElement tableElement = bodyElement.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement,Keys.TAB);
            explicitWait(500);
            waitForJStoLoad();
            waitForElementToBeVisible(tableElement); waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
            info("The extracted value from row : "+ rowName+ " and column : "+columnName+" is : "+extractedText);
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
