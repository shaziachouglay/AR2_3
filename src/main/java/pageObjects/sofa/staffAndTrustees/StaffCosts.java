package pageObjects.sofa.staffAndTrustees;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class StaffCosts extends CommonMethods {


    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement staffCosts_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Staff Costs')]")
    WebElement staffCosts_header;

    private String pageName= "Staff Costs";

    public void clickSaveAndNextButtonInStaffCosts(){
        clickOnSaveAndNextButtonInPage();
        logger.info("Next Button is now clicked in "+pageName);
    }

    public boolean isHeaderPresentAndDisplayedForStaffCostsPage(){
        return isPageHeaderPresentAndDisplayed(staffCosts_header,pageName);
    }

    public enum RowValue{
        WagesAndSalaries("Wages and Salaries"), SocailSecurityCost("Social Security Costs") ,
        ApprenticeshipLevy("Apprenticeship Levy"),
        PensionCost("Pension Cost") , AgencyStaffCost("Agency Staff Costs") ,
        RedundancyPayments("Redundancy Payments") , SeverancePayments("Severance Payments") ,
        OtherRestructuringCost("Other Restructuring Costs") ,
        LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation("Less Recoveries"),
        Total("Total");

        private final String stringValue;
        RowValue(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public enum ColumnValue{PermanantlyEmployed , TemporaryInterimStaff , Total}

    public void setValueInColumnInputFieldBasedOnRowValueInStaffCosts(RowValue row , ColumnValue column , String inputValue){
        int columnCount = 0 ; int rowCount=0 ;
        if(column == ColumnValue.PermanantlyEmployed){
            columnCount = 1 ;
        } else if (column == ColumnValue.TemporaryInterimStaff){
            columnCount = 2 ;
        }
        switch(row){
            case WagesAndSalaries: rowCount=1;
                break;
            case SocailSecurityCost:rowCount=2;
                break;
            case ApprenticeshipLevy: rowCount=3;
                break;
            case PensionCost:rowCount=4;
                break;
            case AgencyStaffCost:rowCount=5;
                break;
            case RedundancyPayments:rowCount=6;
                break;
            case SeverancePayments:rowCount=7;
                break;
            case OtherRestructuringCost:rowCount=8;
                break;
            case LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation:rowCount=9;
                break;
            case Total:rowCount=10;
                break;
        }

        try {
            waitForAjax();
            WebElement tableElement = staffCosts_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            cleanAndRebuildElement(tableElement);
            waitForElementToBeVisibleloop(tableElement);
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

    public String getValueFromColumnBasedOnRowValueInStaffCosts(ColumnValue column , RowValue row) {
        String extractedText = "";
        int columnCount = 0;
        int rowCount = 0;
        if (column == ColumnValue.PermanantlyEmployed) {
            columnCount = 1;
        } else if (column == ColumnValue.TemporaryInterimStaff) {
            columnCount = 2;
        } else if (column == ColumnValue.Total) {
            columnCount = 3;
        }
        switch (row) {

            case WagesAndSalaries:
                rowCount = 1;
                break;
            case SocailSecurityCost:
                rowCount = 2;
                break;
            case ApprenticeshipLevy:
                rowCount = 3;
                break;
            case PensionCost:
                rowCount = 4;
                break;
            case AgencyStaffCost:
                rowCount = 5;
                break;
            case RedundancyPayments:
                rowCount = 6;
                break;
            case SeverancePayments:
                rowCount = 7;
                break;
            case OtherRestructuringCost:
                rowCount = 8;
                break;
            case LessRecoveriesOfStaffCostsForEmployeesSecondedOutOfTheOrganisation:
                rowCount = 9;
                break;
            case Total:
                rowCount = 10;
                break;
        }
        try {
            waitForAjax();
            WebElement tableElement = staffCosts_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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
