package pageObjects.sofa.revenueGrants;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class RevenueGrantsDfEESFA extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement revenueGrantsDfEESFA_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'DfE and ESFA')]")
    WebElement revenueGrantsDfEESFA_header;

    public String pageName = "DfE and ESFA";

    public void clickOnSaveAndNextInRevenueGrantsDfEESFAPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }
    public boolean isHeaderPresentAndDisplayedForRevenueGrantsDfEESFAPage(){
        return isPageHeaderPresentAndDisplayed(revenueGrantsDfEESFA_header,pageName);
    }

    /**
     * enum for the row names.
     */
    public enum revenueGrantsRowLabelConstants {
        GeneralAnnualGrants,
        RatesReclaim,
        StudentSupportService,
        PupilPremiumAndServicePremium,
        PupilNumberAdjustment,
        UniversalInfantFreeSchoolMeals,
        Insurance,
        SponsorCapacityGrants,
        StartUpGrants,
        PEandSportsGrants,
        Year7CatchUpGrant,
        OldSkillFundingAgency,
        Other,
        Total
        }


    /**
     * enum for the column names
     */
    public enum revenueGrantsColumnLabelConstants {

        GrantValueInAccounts("Grant value in accounts "), CashReceivedInPeriodPerDFEAndESFA ("Cash received in period per DFE and ESFA "),
        CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA("Cash received in period per Academies record if different to DFE and ESFA"),
        ExpenditureRecordedInTheAccountsFromThisGrant("Expenditure recorded in the accounts from this grant");

        private final String stirngValue;
        revenueGrantsColumnLabelConstants(String s){
            this.stirngValue = s;
        }
        public String toString(){
            return stirngValue;
        }
    }
    /**
     *
     * @param row the enum for the Row
     * @param column the enum for the column
     * @return the value from the field.
     */
    public String getValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(revenueGrantsRowLabelConstants row, revenueGrantsColumnLabelConstants column){
        int rowCount= 0;
        int columnCount = 0;
        String extractedText = "";
        int incrementer = -1;

        switch(row){
            case GeneralAnnualGrants:                                   rowCount = 2+incrementer; break;
            case RatesReclaim:                                          rowCount = 3+incrementer; break;
            case StudentSupportService:                                 rowCount = 4+incrementer; break;
            case PupilPremiumAndServicePremium:                         rowCount = 5+incrementer; break;
            case PupilNumberAdjustment:                                 rowCount = 6+incrementer; break;
            case UniversalInfantFreeSchoolMeals:                        rowCount = 7+incrementer; break;
            case Insurance:                                             rowCount = 8+incrementer; break;
            case SponsorCapacityGrants:                                 rowCount = 9+incrementer; break;
            case StartUpGrants:                                         rowCount = 10+incrementer; break;
            case PEandSportsGrants:                                     rowCount = 11+incrementer; break;
            case Year7CatchUpGrant:                                     rowCount = 12+incrementer; break;
            case OldSkillFundingAgency:                                 rowCount = 13+incrementer; break;
            case Other:                                                 rowCount = 14+incrementer; break;
            case Total:                                                 rowCount = 15+incrementer; break;
        }
        switch(column){
            case GrantValueInAccounts:                                              columnCount = 1;
                break;
            case CashReceivedInPeriodPerDFEAndESFA:                                 columnCount = 2;
                break;
            case CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA:     columnCount = 3;
                break;
            case ExpenditureRecordedInTheAccountsFromThisGrant:                     columnCount = 4;
                break;
        }
        try {
            WebElement tableElement = revenueGrantsDfEESFA_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            hitKeyboardButton(tableElement, Keys.TAB);
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

    /**
     *
     * @param row the enum for the row
     * @param column the enum for the column
     * @param inputValue  the value to be set in the field.
     */
    public void setValueInTableByRowAndColumnNameIn_DfEESFA_RevenueGrants(revenueGrantsRowLabelConstants row, revenueGrantsColumnLabelConstants column, String inputValue ){
        int rowCount= 0;
        int columnCount = 0;
        int incrementer = -1;
        switch(row){
            case GeneralAnnualGrants:                                   rowCount = 2+incrementer; break;
            case RatesReclaim:                                          rowCount = 3+incrementer; break;
            case StudentSupportService:                                 rowCount = 4+incrementer; break;
            case PupilPremiumAndServicePremium:                         rowCount = 5+incrementer; break;
            case PupilNumberAdjustment:                                 rowCount = 6+incrementer; break;
            case UniversalInfantFreeSchoolMeals:                        rowCount = 7+incrementer; break;
            case Insurance:                                             rowCount = 8+incrementer; break;
            case SponsorCapacityGrants:                                 rowCount = 9+incrementer; break;
            case StartUpGrants:                                         rowCount = 10+incrementer; break;
            case PEandSportsGrants:                                     rowCount = 11+incrementer; break;
            case Year7CatchUpGrant:                                     rowCount = 12+incrementer; break;
            case OldSkillFundingAgency:                                 rowCount = 13+incrementer; break;
            case Other:                                                 rowCount = 14+incrementer; break;
            case Total:                                                 rowCount = 15+incrementer; break;
        }
        switch(column){
            case GrantValueInAccounts:                                              columnCount = 1;
                break;
            case CashReceivedInPeriodPerDFEAndESFA:                                 columnCount = 2;
                break;
            case CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA:     columnCount = 3;
                break;
            case ExpenditureRecordedInTheAccountsFromThisGrant:                     columnCount = 4;
                break;
        }
        try {
            waitForAjax();
            WebElement tableElement = revenueGrantsDfEESFA_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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
}




