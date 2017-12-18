package pageObjects.balanceSheetAssets.tangibleFixedAssets;

import customExceptions.NoTextExtractedException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class TFA_DepriciationPeriodsPerAccountingPolicies extends CommonMethods {

    public String pageName = "Depreciation periods per accounting policies";


    @FindBy(xpath = "//div[@class='opa-screen-title'][contains(.,'Depreciation periods per accounting policies')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement bodyElement;

    public boolean isPageHeaderPresentAndDisplayedInTFADepreciationPeriodsPerAccountingPoliciesPage(){
        return isPageHeaderPresentAndDisplayed(pageHeader,pageName);
    }


    public enum rowName{
        SinglePeriodOrMinimumOfRange,
        MaximumOfRange,
        ReducingBalanceRate
        }

    public enum columnName{
        FreeholdLandAndBuildings,
        LeaseholdLandAndBuildings,
        LeaseholdImprovements,
        PlantAndMachinery,
        FurnitureAndEquipment,
        ComputerEquipment,
        MotorVehicles
    }


    public void setValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(rowName rowName,columnName columnName, String inputValue){
        int rowCount= 0 ;
        int rowIncrementer=0;

        int columnCount=0;
        int columnIncrementer=0;

        switch(rowName){


            case SinglePeriodOrMinimumOfRange: rowCount=rowIncrementer+1;
                break;
            case MaximumOfRange:rowCount=rowIncrementer+2;
                break;
            case ReducingBalanceRate:rowCount=rowIncrementer+4;
                break;
        }

        switch (columnName){

            case FreeholdLandAndBuildings:  columnCount = columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:columnCount = columnIncrementer+2;
                break;
            case LeaseholdImprovements:columnCount = columnIncrementer+3;
                break;
            case PlantAndMachinery:columnCount = columnIncrementer+4;
                break;
            case FurnitureAndEquipment:columnCount = columnIncrementer+5;
                break;
            case ComputerEquipment:columnCount = columnIncrementer+6;
                break;
            case MotorVehicles:columnCount = columnIncrementer+7;
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



    public String getValueByRowNameAndColumnNameInDepreciationPeriodsPerAccountingPoliciesPage(rowName rowName,columnName columnName) throws NoTextExtractedException {
        String extractedText="No Text Extracted";
        int rowCount= 0 ;
        int rowIncrementer=0;

        int columnCount=0;
        int columnIncrementer=0;

        switch(rowName){


            case SinglePeriodOrMinimumOfRange: rowCount=rowIncrementer+1;
                break;
            case MaximumOfRange:rowCount=rowIncrementer+2;
                break;
            case ReducingBalanceRate:rowCount=rowIncrementer+4;
                break;
        }

        switch (columnName){

            case FreeholdLandAndBuildings:  columnCount = columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:columnCount = columnIncrementer+2;
                break;
            case LeaseholdImprovements:columnCount = columnIncrementer+3;
                break;
            case PlantAndMachinery:columnCount = columnIncrementer+4;
                break;
            case FurnitureAndEquipment:columnCount = columnIncrementer+5;
                break;
            case ComputerEquipment:columnCount = columnIncrementer+6;
                break;
            case MotorVehicles:columnCount = columnIncrementer+7;
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

        if(extractedText==null){
            throw new NoTextExtractedException();
        }
        return extractedText;
    }

}
