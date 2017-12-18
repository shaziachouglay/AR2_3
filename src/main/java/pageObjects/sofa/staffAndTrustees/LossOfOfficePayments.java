package pageObjects.sofa.staffAndTrustees;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

public class LossOfOfficePayments extends CommonMethods {

    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement lossOfOfficePayments_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Loss of Office Payments')]")
    WebElement lossOfOfficePayments_header;

    private String pageName= "Loss Of Office Payments";

    public boolean isHeaderPresentAndDisplayedForLossOfOfficePaymentsPage(){
        return isPageHeaderPresentAndDisplayed(lossOfOfficePayments_header,pageName);
    }

    public enum SelectText{Yes , No}
    public enum RowNames{LossOfOfficePayemntServingAtYEarEnd, LossOfOfficePayemntLeftDuringTheYear, Total,}
    public enum ColumnNames{AccOfficer_NumberOfPayments, AccOfficerValueOfPayments, OtherTrustees_NumberOfPayments, OtherTrustees_ValueOfPayments}

    public void setValueInTableByRowNameAndColumnNameInLossOfOfficePayments(RowNames row , ColumnNames column , String inputValue){

     int rowCount = 0 ; int columnCount = 0;
     switch (row){
         case LossOfOfficePayemntServingAtYEarEnd: rowCount = 3;break;
         case LossOfOfficePayemntLeftDuringTheYear: rowCount = 4;break;
         case Total: rowCount = 5;break;
     }
     switch (column){
         case AccOfficer_NumberOfPayments:       columnCount = 2;break;
         case AccOfficerValueOfPayments:       columnCount = 3;break;
         case OtherTrustees_NumberOfPayments:           columnCount = 4;break;
         case OtherTrustees_ValueOfPayments:           columnCount = 5;break;
     }
        try {
            waitForAjax();
            WebElement tableElement = lossOfOfficePayments_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
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



    public void selectValueFromDropDownListByRowNameInLossOfOfficePayments(RowNames rowName , String selectText){
        int rowNumber = 0 ;

      switch(rowName){

          case LossOfOfficePayemntServingAtYEarEnd: rowNumber = 3;
              break;
          case LossOfOfficePayemntLeftDuringTheYear: rowNumber = 4;
              break;
      }
        try {
            WebElement element = lossOfOfficePayments_body.findElement(By.xpath(".//tr["+rowNumber+"]//select"));
            selectElementByVisibleText(element , selectText);
        } catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e){
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("Selected drop down option :"+ selectText+" for Row "+ rowName.toString());
    }

    public String getValueInTableByRowNameAndColumnNameInLossOfOfficePayments(RowNames row , ColumnNames column ){

        int rowCount = 0 ; int columnCount = 0; String extractedText = "No value retrieved";

        switch (row){
            case LossOfOfficePayemntServingAtYEarEnd: rowCount = 3;break;
            case LossOfOfficePayemntLeftDuringTheYear: rowCount = 4;break;
            case Total: rowCount = 5;break;
        }
        switch (column){
            case AccOfficer_NumberOfPayments:       columnCount = 2;break;
            case AccOfficerValueOfPayments:       columnCount = 3;break;
            case OtherTrustees_NumberOfPayments:           columnCount = 4;break;
            case OtherTrustees_ValueOfPayments:           columnCount = 5;break;
        }
        try {
            waitForAjax();
            WebElement tableElement = lossOfOfficePayments_body.findElement(By.xpath(".//tr[" + rowCount + "]/td[" + columnCount + "]//div/input"));
            waitForJStoLoad();
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
