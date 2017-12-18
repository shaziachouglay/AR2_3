package pageObjects.sofa.staffAndTrustees;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

import java.util.List;

public class ExitPackages_NonCivilServiceSchemes extends CommonMethods {

    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement exitPackageNonCivilServicesSchemes_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Exit packages - Non Civil Service Schemes')]")
    WebElement exitPackageNonCivilServicesSchemes_header;

    @FindBy(xpath = "//button[@class='button owd-add']")
    WebElement addInstanceButton;

    @FindBy(xpath = "//button[@class='button owd-remove']")
    List<WebElement> removeInstanceButton;

    @FindBy(xpath = "//div[@class='opa_entity_table_body']/div[@class='opa_entity_table_row entity-instance']")
    List<WebElement> numberOfInstancePresent;

    @FindBy(xpath = "//div[@class='select-search-overlay-content']//input[@value='No']")
    WebElement popUpConfirmation_NO;

    @FindBy(xpath = "//div[@class='confirm-remove-overlay']//input[@value='Yes']")
    WebElement popUpConfirmation_YES;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Exit packages - Non Civil Service Schemes')]")
    WebElement exitPackages_NonCivilServiceSchemes_header;

    private String pageName= "Exit Package Non Civil Service Schemes Page";

    public boolean isHeaderPresentAndDisplayedForExitPackages_NonCivilServiceSchemesPage(){
        return isPageHeaderPresentAndDisplayed(exitPackageNonCivilServicesSchemes_header,pageName);
    }

    public enum DropDownValues {
        a_10000("< £10,000")                    , a_10001_25000("£10,001 - £25,000")    , a_25001_50000("£25,001 - £50,000")     ,
        a_50001_100000("£50,001 - £100,000")    , a_10001_150000("£100,001 - £150,000") , a_150001_200000("£150,001 - £200,000") ,
        a_200001_250000("£200,001 - £250,000")  , a_250001plus("£250,001+");
        private final String stringValue;
        DropDownValues(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public void selectDropDownOptionByRowNumber(int rowNumber, String visibleText) {
        try {
            WebElement element = exitPackageNonCivilServicesSchemes_body.findElement(By.xpath(".//div[@class='opa_entity_table_row entity-instance']["+rowNumber+"]//select"));
            cleanAndRebuildElement(element);
            selectElementByVisibleText(element, visibleText);
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("Selected the dropdown for row number :" + rowNumber + " with a drop down value of : " + visibleText);
    }

    public enum ColumnNames{    NumberOfCompulsoryRedundancies  ,   ValueOfCompulsoryRedundanciesContractual    , ValueOfCompulsoryRedundanciesNonContractual ,
                                NumberOfOtherAgreedDepartures   ,   ValueOfOtherAgreedDepartureContractual      , ValueOfOtherAgreedDepartureNonContractual }


    public void setValueInTableByRowNumberAndColumnNameInExitPackages(ColumnNames columnName , int rowNumber , String inputValue){
        int columnNumber = 0 ;
        if(columnName == ColumnNames.NumberOfCompulsoryRedundancies){
            columnNumber = 2 ;
        }
        else if (columnName == ColumnNames.ValueOfCompulsoryRedundanciesContractual){
            columnNumber = 3 ;
        }
        else  if(columnName == ColumnNames.ValueOfCompulsoryRedundanciesNonContractual){
            columnNumber = 4 ;
        }
        else if (columnName == ColumnNames.NumberOfOtherAgreedDepartures){
            columnNumber = 5 ;
        }
        else if (columnName == ColumnNames.ValueOfOtherAgreedDepartureContractual){
            columnNumber = 6 ;
        }
        else if (columnName == ColumnNames.ValueOfOtherAgreedDepartureNonContractual){
            columnNumber = 7 ;
        }
        try {
            WebElement element = exitPackageNonCivilServicesSchemes_body.findElement(By.xpath(".//div/div/div/div["+rowNumber+"]/div["+columnNumber+"]/div/div/input"));
            setValueInElementInputJS(element , inputValue);
            hitKeyboardButton(element, Keys.TAB);
        } catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e){
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("Inserted Value of :"+inputValue+" in Column Name :"+columnName.toString()+" and Row Value of :"+ rowNumber);
    }


    public String getValueFromBottomTotalsRowByColumnNameInExitPackages(ColumnNames columnName){
        int columnNumber = 0;
        String  textValue ="";
        if(columnName == ColumnNames.NumberOfCompulsoryRedundancies){
            columnNumber = 2 ;
        }
        else if (columnName == ColumnNames.ValueOfCompulsoryRedundanciesContractual){
            columnNumber = 3 ;
        }
        else  if(columnName == ColumnNames.ValueOfCompulsoryRedundanciesNonContractual){
            columnNumber = 4 ;
        }
        else if (columnName == ColumnNames.NumberOfOtherAgreedDepartures){
            columnNumber = 5 ;
        }
        else if (columnName == ColumnNames.ValueOfOtherAgreedDepartureContractual){
            columnNumber = 6 ;
        }
        else if (columnName == ColumnNames.ValueOfOtherAgreedDepartureNonContractual){
            columnNumber = 7 ;
        }
        try {
            WebElement element = exitPackageNonCivilServicesSchemes_body.findElement(By.xpath(".//div[@class='opa-container form-group']//div["+columnNumber+"]//input"));
            cleanAndRebuildElement(element);
            textValue = element.getAttribute("value");
        } catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e){
            e.printStackTrace();
            takeScreenshot();
        }
        logger.info("The value extracted from the Total for Column name :"+ columnName.toString()+ "is :"+ textValue);
        return textValue ;
    }



    public int getNumberOFInstances(){
        waitForPageLoadToComplete();
        int numberOfInstances = numberOfInstancePresent.size();
        logger.info("The number of Present Instances are "+ numberOfInstances);
        return numberOfInstances;

    }


    public void addNewInstance(){
        int a = getNumberOFInstances();
        a = getNumberOFInstances();
        scrollToElement(addInstanceButton);
        cleanAndRebuildElement(addInstanceButton);
        waitForJStoLoad();
        try {
            waitForAjax();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElementWithJS2(addInstanceButton);
        info("Added New Instance");
    }

    public void addMultipleInstances(int numberOfInstanceToAdd){
        do{
            addNewInstance();
            waitForPageLoadToComplete();
            explicitWait(50);
            refreshListOfWebElement(numberOfInstancePresent,String.valueOf(numberOfInstanceToAdd));
            if(getNumberOFInstances()==numberOfInstanceToAdd){break;}
        }while (getNumberOFInstances()!=numberOfInstanceToAdd);
    }




    public void addInstancesInExitPackage(int iterationNumber){
        for (int i=1; i<=iterationNumber; i++){
            explicitWait(200);
            cleanAndRebuildElement(addInstanceButton);
            clickElementWithJS(addInstanceButton);
            try {
                waitForAjax();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            waitForPageLoadToComplete();
            if(getNumberOFInstances()==iterationNumber+1){break;}
            logger.info("Added Instance no : "+i);
        }
    }

    public void removeInstance(){

        int numberOfInstanceOnPage = getNumberOFInstances()-1;

        for(int i=numberOfInstanceOnPage;i>=1;i--){
            //explicitWait(200);
            info(removeInstanceButton.size()+" is the number of remove button ");
            if(removeInstanceButton.size()==1){
                break;
            }
            waitForPageLoadToComplete();
            cleanAndRebuildElement(removeInstanceButton.get(i));
            scrollToElement(removeInstanceButton.get(i));
            waitForElementToBeVisibleloop(removeInstanceButton.get(i));
            clickElementWithJS(removeInstanceButton.get(i));
            info("clicked on the remove button X ");
            scrollToElement(popUpConfirmation_YES);
            waitForElementToBeVisibleloop(popUpConfirmation_YES);
            clickElementWithJS(popUpConfirmation_YES);
            info("Clicked the Pop Up Confomation with YES.");
            waitForPageLoadToComplete();
        }
    }

}
