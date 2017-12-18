package pageObjects.sofa.capitalGrants;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class CapitalGrantsDfEESFA extends CommonMethods {

    /**
     * this it the parent element for the page.
     */
    @FindBy(xpath = "//div[@class='opa-main-panel']")
    WebElement capitalGrantsDfEESFA_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'DfE and ESFA')]")
    WebElement capitalGrantsDfEESFA_header;

    public String pageName = "DfE and ESFA (previously EFA)";

    /**
     * clicks on the save and next button for CapitalGrantsDfEESFA page
     */
    public void clickOnSaveAndNextInCapitalGrantsDfEESFAPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }

    /**
     * checks if the header is present and displayed.
     * @return
     */
    public boolean isHeaderPresentAndDisplayedForCapitalGrantsDfEESFAPage(){
        return isPageHeaderPresentAndDisplayed(capitalGrantsDfEESFA_header,pageName);
    }

    /**
     * enum for the row names. returns the String value for the enum.
     */
    public enum DfEESFA_CapitalGrants_rowFieldConstants {
        ConditionImprovementFund("Condition Improvement Fund"), MATsSchoolConditionAllowance("MATs School Condition Allowance"),
        PrioritySchoolBuildingProgramme("Priority School Building Programme"), DevolvedFormulaCapitalGrant("Devolved Formula Capital Grant"),
        CentrallyManagedProgrammeFreeSchools("Centrally Managed Programme Free Schools"), ContinuingCommitmentsBuildingSchoolsfortheFuture("Continuing Commitments Building Schools for the Future"),
        SchoolsSponsorshipDevelopmentFund("Schools Sponsorship Development Fund"), OldSkillsFundingAgency("Old Skills Funding Agency"),
        Others("Others"), Totals("Totals");

        private final String stirngValue;

        DfEESFA_CapitalGrants_rowFieldConstants(String s) {
            this.stirngValue = s;
        }

        public String toString() {
            return stirngValue;
        }
    }

    /**
     * enum for the column names. returns the String value for the column name.
     */
        public enum DfEESFA_CapitalGrants_ColumnFieldConstants {

            GrantValueInAccounts("Grant value in accounts "), CashReceivedInPeriodPerDFEAndESFA ("Cash received in period per DFE and ESFA "),
            CashReceivedInPeriodPerAcademiesRecordIfDifferentToDFEAndESFA("Cash received in period per Academies record if different to DFE and ESFA"),
            ExpenditureRecordedInTheAccountsFromThisGrant("Expenditure recorded in the accounts from this grant");

            private final String stirngValue;
            DfEESFA_CapitalGrants_ColumnFieldConstants(String s){
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
    public String getValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(DfEESFA_CapitalGrants_rowFieldConstants row, DfEESFA_CapitalGrants_ColumnFieldConstants column){
        int rowCount= 0;
        int columnCount = 0;
        String extractedText = "";
        int incrementer = -1;

        switch(row){
            case ConditionImprovementFund:                              rowCount = 2+incrementer; break;
            case MATsSchoolConditionAllowance:                          rowCount = 3+incrementer; break;
            case PrioritySchoolBuildingProgramme:                       rowCount = 4+incrementer; break;
            case DevolvedFormulaCapitalGrant:                           rowCount = 5+incrementer; break;
            case CentrallyManagedProgrammeFreeSchools:                  rowCount = 6+incrementer; break;
            case ContinuingCommitmentsBuildingSchoolsfortheFuture:      rowCount = 7+incrementer; break;
            case SchoolsSponsorshipDevelopmentFund:                     rowCount = 8+incrementer; break;
            case OldSkillsFundingAgency:                                rowCount = 9+incrementer; break;
            case Others:                                                rowCount = 10+incrementer; break;
            case Totals:                                                rowCount = 11+incrementer; break;
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

            WebElement tableElement = capitalGrantsDfEESFA_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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

    /**
     *
     * @param row the enum for the row
     * @param column the enum for the column
     * @param inputValue  the value to be set in the field.
     */
    public void setValueInTableByRowAndColumnNameIn_DfEESFA_CapitalGrants(DfEESFA_CapitalGrants_rowFieldConstants row, DfEESFA_CapitalGrants_ColumnFieldConstants column, String inputValue ){

        int rowCount= 0;
        int columnCount = 0;
        int incrementer = -1;
        switch(row){
            case ConditionImprovementFund:                              rowCount = 2+incrementer; break;
            case MATsSchoolConditionAllowance:                          rowCount = 3+incrementer; break;
            case PrioritySchoolBuildingProgramme:                       rowCount = 4+incrementer; break;
            case DevolvedFormulaCapitalGrant:                           rowCount = 5+incrementer; break;
            case CentrallyManagedProgrammeFreeSchools:                  rowCount = 6+incrementer; break;
            case ContinuingCommitmentsBuildingSchoolsfortheFuture:      rowCount = 7+incrementer; break;
            case SchoolsSponsorshipDevelopmentFund:                     rowCount = 8+incrementer; break;
            case OldSkillsFundingAgency:                                rowCount = 9+incrementer; break;
            case Others:                                                rowCount = 10+incrementer; break;
            case Totals:                                                rowCount = 11+incrementer; break;
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
            WebElement tableElement = capitalGrantsDfEESFA_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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




