package pageObjects.balanceSheetAssets.tangibleFixedAssets;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class TFA_Cost extends CommonMethods {

    public String pageName ="Cost";

    @FindBy(xpath = "//div[@class='opa-screen-title'][contains(.,'Cost')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement bodyElement;

    public boolean isPageHeaderPresentAndDisplayedInTFACostPage(){
        return isPageHeaderPresentAndDisplayed(pageHeader,pageName);
    }

    public enum rowName{
        OriginalPriorYearClosingBalance,
        AdjustmentsMadeToOpeningBalance,
        AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme,
        AdditionsFundedFromOtherDFEAndESFACapitalGrant,
        AdditionsOther,
        TransferredInOnConversionLocalAuthority,
        TransferredInOnConversionElsewhere,
        TransferredInOnExistingAcademiesJoiningTheTrust,
        TransferredOutOnExistingAcademiesLeavingTheTrust,
        DonationsDFEAndESFAEFA,
        DonationsNonDFEAndESFAEFA,
        Disposals,
        Revaluations,
        Reclassifications,
        AtCloseOfPeriod,
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
        Total,
    }


    public void setValueInFieldByRowNameAndColumnNameInTFACostpage(rowName rowName, columnName columnName, String inputValue){

        int rowIncrementer = 2 ;
        int rowCount= 0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(rowName){

            case OriginalPriorYearClosingBalance:                                   rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:                                   rowCount=rowIncrementer+2;
                break;
            case AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme:    rowCount=rowIncrementer+3;
                break;
            case AdditionsFundedFromOtherDFEAndESFACapitalGrant:                    rowCount=rowIncrementer+4;
                break;
            case AdditionsOther:                                                    rowCount=rowIncrementer+5;
                break;
            case TransferredInOnConversionLocalAuthority:                           rowCount=rowIncrementer+6;
                break;
            case TransferredInOnConversionElsewhere:                                rowCount=rowIncrementer+7;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                   rowCount=rowIncrementer+8;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                  rowCount=rowIncrementer+9;
                break;
            case DonationsDFEAndESFAEFA:                                            rowCount=rowIncrementer+10;
                break;
            case DonationsNonDFEAndESFAEFA:                                         rowCount=rowIncrementer+11;
                break;
            case Disposals:                                                         rowCount=rowIncrementer+12;
                break;
            case Revaluations:                                                      rowCount=rowIncrementer+13;
                break;
            case Reclassifications:                                                 rowCount=rowIncrementer+14;
                break;
            case AtCloseOfPeriod:                                                   rowCount=rowIncrementer+15;
                break;
        }

        switch(columnName){

            case FreeholdLandAndBuildings:                                          columnCount= columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:                                         columnCount= columnIncrementer+2;
                break;
            case LeaseholdImprovements:                                             columnCount= columnIncrementer+3;
                break;
            case PlantAndMachinery:                                                 columnCount= columnIncrementer+4;
                break;
            case FurnitureAndEquipment:                                             columnCount= columnIncrementer+5;
                break;
            case ComputerEquipment:                                                 columnCount= columnIncrementer+6;
                break;
            case MotorVehicles:                                                     columnCount= columnIncrementer+7;
                break;
            case AssetsUnderConstruction:                                           columnCount= columnIncrementer+8;
                break;
            case Total:                                                             columnCount= columnIncrementer+9;
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


    public String getValueByRowNameAndColumnNameInTFACostPage(rowName rowName, columnName columnName){

        String extractedText="Nothing extracted";
        int rowIncrementer = 2 ;
        int rowCount= 0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(rowName){

            case OriginalPriorYearClosingBalance:                                   rowCount=rowIncrementer+1;
                break;
            case AdjustmentsMadeToOpeningBalance:                                   rowCount=rowIncrementer+2;
                break;
            case AdditionsFundedFromFreeSchoolsPrioritySchoolsBuildingProgramme:    rowCount=rowIncrementer+3;
                break;
            case AdditionsFundedFromOtherDFEAndESFACapitalGrant:                    rowCount=rowIncrementer+4;
                break;
            case AdditionsOther:                                                    rowCount=rowIncrementer+5;
                break;
            case TransferredInOnConversionLocalAuthority:                           rowCount=rowIncrementer+6;
                break;
            case TransferredInOnConversionElsewhere:                                rowCount=rowIncrementer+7;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                   rowCount=rowIncrementer+8;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                  rowCount=rowIncrementer+9;
                break;
            case DonationsDFEAndESFAEFA:                                            rowCount=rowIncrementer+10;
                break;
            case DonationsNonDFEAndESFAEFA:                                         rowCount=rowIncrementer+11;
                break;
            case Disposals:                                                         rowCount=rowIncrementer+12;
                break;
            case Revaluations:                                                      rowCount=rowIncrementer+13;
                break;
            case Reclassifications:                                                 rowCount=rowIncrementer+14;
                break;
            case AtCloseOfPeriod:                                                   rowCount=rowIncrementer+15;
                break;
        }

        switch(columnName){

            case FreeholdLandAndBuildings:                                          columnCount= columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:                                         columnCount= columnIncrementer+2;
                break;
            case LeaseholdImprovements:                                             columnCount= columnIncrementer+3;
                break;
            case PlantAndMachinery:                                                 columnCount= columnIncrementer+4;
                break;
            case FurnitureAndEquipment:                                             columnCount= columnIncrementer+5;
                break;
            case ComputerEquipment:                                                 columnCount= columnIncrementer+6;
                break;
            case MotorVehicles:                                                     columnCount= columnIncrementer+7;
                break;
            case AssetsUnderConstruction:                                           columnCount= columnIncrementer+8;
                break;
            case Total:                                                             columnCount= columnIncrementer+9;
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
