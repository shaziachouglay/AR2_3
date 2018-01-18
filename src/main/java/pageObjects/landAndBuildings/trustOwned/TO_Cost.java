package pageObjects.landAndBuildings.trustOwned;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class TO_Cost extends CommonMethods{

    private String pageName="LNB Trust Owned Cost ";

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Cost')]")
    private WebElement page_header;


    public boolean isHeaderPresentAndDisplayedForAUC_CostPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum RowConstants{
        OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn,
        AdjustmentMadeToOpeningBalance,
        AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme,
        AdditionsFundedFromOtherDFEESFACapitalGrants,
        AdditionsOther,
        TransferredInOnConversionLocalAuthority,
        TransferredInOnConversionElsewhere,
        TransferredInOnExistingAcademiesJoiningTheTrust,
        TransferredOutOnExistingAcademiesLeavingTheTrust,
        DonationDFEESFA,
        DonationsNonDFEESFA,
        Disposals,
        Revaluations,
        Reclassifications,
        AtCloseOfPeriod
    }

    public enum ColumnConstant{
        FreeholdLandAndBuildings,
        LeaseholdLandAndBuildings,
        LeaseholdImprovements,
        AssetsUnderConstruction,
        Total

    }
    public void setValueInFieldByRowNameAndColumnName(RowConstants row, ColumnConstant column, String inputValue){

        int rowIncrementer=0;
        int rowCount=0;

        int columnIncrementer=0;
        int columnCount=0;

        switch(row){

            case OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn:         rowCount=rowIncrementer+1;
                break;
            case AdjustmentMadeToOpeningBalance:                                        rowCount=rowIncrementer+2;
                break;
            case AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme:         rowCount=rowIncrementer+3;
                break;
            case AdditionsFundedFromOtherDFEESFACapitalGrants:                          rowCount=rowIncrementer+4;
                break;
            case AdditionsOther:                                                        rowCount=rowIncrementer+5;
                break;
            case TransferredInOnConversionLocalAuthority:                               rowCount=rowIncrementer+6;
                break;
            case TransferredInOnConversionElsewhere:                                    rowCount=rowIncrementer+7;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                       rowCount=rowIncrementer+8;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                      rowCount=rowIncrementer+9;
                break;
            case DonationDFEESFA:                                                       rowCount=rowIncrementer+10;
                break;
            case DonationsNonDFEESFA:                                                   rowCount=rowIncrementer+11;
                break;
            case Disposals:                                                             rowCount=rowIncrementer+12;
                break;
            case Revaluations:                                                          rowCount=rowIncrementer+13;
                break;
            case Reclassifications:                                                     rowCount=rowIncrementer+14;
                break;
            case AtCloseOfPeriod:                                                       rowCount=rowIncrementer+15;
                break;
        }

        switch (column){

            case FreeholdLandAndBuildings:                                              columnCount=columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:                                             columnCount=columnIncrementer+2;
                break;
            case LeaseholdImprovements:                                                 columnCount=columnIncrementer+3;
                break;
            case AssetsUnderConstruction:                                               columnCount=columnIncrementer+4;
                break;
            case Total:                                                                 columnCount=columnIncrementer+5;
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

            case OriginalPriorYearClosingBalanceAsSubmittedInTheAccountsReturn:         rowCount=rowIncrementer+1;
                break;
            case AdjustmentMadeToOpeningBalance:                                        rowCount=rowIncrementer+2;
                break;
            case AdditionsFundedFromFreeSchoolsPrioritySchoolBuildingProgramme:         rowCount=rowIncrementer+3;
                break;
            case AdditionsFundedFromOtherDFEESFACapitalGrants:                          rowCount=rowIncrementer+4;
                break;
            case AdditionsOther:                                                        rowCount=rowIncrementer+5;
                break;
            case TransferredInOnConversionLocalAuthority:                               rowCount=rowIncrementer+6;
                break;
            case TransferredInOnConversionElsewhere:                                    rowCount=rowIncrementer+7;
                break;
            case TransferredInOnExistingAcademiesJoiningTheTrust:                       rowCount=rowIncrementer+8;
                break;
            case TransferredOutOnExistingAcademiesLeavingTheTrust:                      rowCount=rowIncrementer+9;
                break;
            case DonationDFEESFA:                                                       rowCount=rowIncrementer+10;
                break;
            case DonationsNonDFEESFA:                                                   rowCount=rowIncrementer+11;
                break;
            case Disposals:                                                             rowCount=rowIncrementer+12;
                break;
            case Revaluations:                                                          rowCount=rowIncrementer+13;
                break;
            case Reclassifications:                                                     rowCount=rowIncrementer+14;
                break;
            case AtCloseOfPeriod:                                                       rowCount=rowIncrementer+15;
                break;
        }

        switch (column){

            case FreeholdLandAndBuildings:                                              columnCount=columnIncrementer+1;
                break;
            case LeaseholdLandAndBuildings:                                             columnCount=columnIncrementer+2;
                break;
            case LeaseholdImprovements:                                                 columnCount=columnIncrementer+3;
                break;
            case AssetsUnderConstruction:                                               columnCount=columnIncrementer+4;
                break;
            case Total:                                                                 columnCount=columnIncrementer+5;
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


