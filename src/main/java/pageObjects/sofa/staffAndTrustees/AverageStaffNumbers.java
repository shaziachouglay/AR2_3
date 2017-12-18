package pageObjects.sofa.staffAndTrustees;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class AverageStaffNumbers extends CommonMethods {

    @FindBy(how= How.XPATH , using = "//div[@class='opa-main-panel']")
    WebElement averageStaffNumbers_body ;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Average Staff Numbers')]")
    WebElement averageStaffNumbers_header;

    @FindBy(xpath = "//input[@id='global_global_a_StaffSickness_DaysLost']")
    WebElement DaysLostToSickness;

    private String pageName = "Average Staff Numbers (Full Time Equivalent)" ;

    public enum RowNames{
        Teachers, Management, AdministrationSupport, Total,
        PEGA_AccountingOfficer, PEGA_StaffWhoServeAsTrustees, PEGA_Teachers, PEGA_Management, PEGA_AdministrationAndSupport,
        PEGA_Total, SS_DaysLostToSickness,
    }

    public enum ColumnNames{PermanentlyEmployed, TemporaryOrInterimStaff, Total}

    public void clickSaveAndNextButtonInAverageStaffNumbersPage(){
        clickSaveAndNextButtonInAverageStaffNumbersPage();
        logger.info("Clicked the next button in "+pageName);
    }

    public boolean isHeaderPresentAndDisplayedForAverageStaffNumberPage(){
        return isPageHeaderPresentAndDisplayed(averageStaffNumbers_header,pageName);
    }

    public void setValueInTableByRowNameAndColumnNameInAverageStaffNumbersPage(RowNames row , ColumnNames column , String inputValue){
        /**
         * @varibale columnNumberIncrementer is uses to increment the columnNumber count. This is used here as the column alignment in the DOm is different.
         */
        int columnNumberIncrementer = 0;
        /**
         * @varibale tableNumber lets us make a choice of the table to address. In this page there are two tables.
         */
        int tableNumber = 0;
        int rowCount= 0 ;
        int columnCount= 0 ;
        switch (row){
            case Teachers:                              rowCount = 1; tableNumber = 1;
                break;
            case Management:                            rowCount = 2; tableNumber = 1;
                break;
            case AdministrationSupport:                 rowCount = 3; tableNumber = 1;
                break;
            case Total:                                 rowCount = 4; tableNumber = 1;
                break;
            case PEGA_AccountingOfficer:                rowCount = 2; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_StaffWhoServeAsTrustees:          rowCount = 3; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_Teachers:                         rowCount = 4; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_Management:                       rowCount = 5; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_AdministrationAndSupport:         rowCount = 6; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_Total:                            rowCount = 7; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case SS_DaysLostToSickness:                 rowCount = 8; tableNumber = 3; columnNumberIncrementer = 1;
                break;
        }
        switch (column){
            case PermanentlyEmployed:                   columnCount = 1+columnNumberIncrementer;
                break;
            case TemporaryOrInterimStaff:               columnCount = 2+columnNumberIncrementer;
                break;
            case Total:                                 columnCount = 3+columnNumberIncrementer;
                break;
        }try {
            waitForAjax();
            //WebElement tableElement = averageStaffNumbers_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            WebElement tableElement = averageStaffNumbers_body.findElement(By.xpath("//div[@class='opa-main-panel']//div[@class='form-group']["+tableNumber+"]//tr["+rowCount+"]/td["+columnCount+"]//input"));
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

    /**
     *
     * @param row is the enum for the Row Name
     * @param column is the enum for the Column Name
     * @return the value extracted from the element.
     */
    public String getValueFromTableByRowNameAndColumnName(RowNames row , ColumnNames column){
        String extractedText = " No Text Extracted !";
        /**
         * @varibale columnNumberIncrementer is uses to increment the columnNumber count. This is used here as the column alignment in the DOm is different.
         */
        int columnNumberIncrementer = 0;
        /**
         * @varibale tableNumber lets us make a choice of the table to address. In this page there are two tables.
         */
        int tableNumber = 0;
        int rowCount= 0 ;
        int columnCount= 0 ;
        switch (row){
            case Teachers:                              rowCount = 1; tableNumber = 1;
                break;
            case Management:                            rowCount = 2; tableNumber = 1;
                break;
            case AdministrationSupport:                 rowCount = 3; tableNumber = 1;
                break;
            case Total:                                 rowCount = 4; tableNumber = 1;
                break;
            case PEGA_AccountingOfficer:                rowCount = 2; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_StaffWhoServeAsTrustees:          rowCount = 3; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_Teachers:                         rowCount = 4; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_Management:                       rowCount = 5; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_AdministrationAndSupport:         rowCount = 6; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case PEGA_Total:                            rowCount = 7; tableNumber = 3; columnNumberIncrementer = 1;
                break;
            case SS_DaysLostToSickness:                 rowCount = 8; tableNumber = 3; columnNumberIncrementer = 1;
                break;
        }
        switch (column){
            case PermanentlyEmployed:                   columnCount = 1+columnNumberIncrementer;
                break;
            case TemporaryOrInterimStaff:               columnCount = 2+columnNumberIncrementer;
                break;
            case Total:                                 columnCount = 3+columnNumberIncrementer;
                break;
        }try {
            WebElement tableElement = averageStaffNumbers_body.findElement(By.xpath("//div[@class='opa-main-panel']//div[@class='form-group']["+tableNumber+"]//tr["+rowCount+"]/td["+columnCount+"]//input"));
            //hitKeyboardButton(tableElement,Keys.TAB);
            //explicitWait(100);
            waitForJStoLoad();
            waitForElementToBeVisibleloop(tableElement); waitForAjax();
            cleanAndRebuildElement(tableElement);
            extractedText = getElementAttributeValueWithRetry(tableElement, "value");
            hitKeyboardButton(tableElement,Keys.TAB);
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

     public void setValueInDaysLostToSickness(String inputValue){
        setValueInElementInputJS(DaysLostToSickness,inputValue);
        hitKeyboardButton(DaysLostToSickness,Keys.TAB);
     }
}
