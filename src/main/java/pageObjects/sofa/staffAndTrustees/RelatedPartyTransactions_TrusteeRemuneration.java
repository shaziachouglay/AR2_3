package pageObjects.sofa.staffAndTrustees;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

import java.util.List;

public class RelatedPartyTransactions_TrusteeRemuneration extends CommonMethods {

    @FindBy(how= How.XPATH, using = "//div[@class='opa-main-panel']")
    WebElement relatedPartyTransactions_TrusteeRemuneration_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Related party transactions: trustee remuneration')]")
    WebElement relatedPartyTransactions_header;

    @FindBy(xpath = "//button[@class='button owd-add']")
    WebElement addNewInstanceButton;

    @FindBy(xpath = "//button[@class='button owd-remove']")
    WebElement removeInstanceButton;

    @FindBy(xpath = "//div[@class='opa-main-panel']//div[@class='opa_entity_table_row entity-instance']")
    List<WebElement> instancesCount;

    @FindBy(xpath = "//div[@class='opa-dialog-body']/following-sibling::input[1]")
    WebElement confirmDeleteYES;

    @FindBy(xpath = "//button[@class='button owd-remove']")
    List<WebElement> removeInstanceButtons;


    public boolean isHeaderPresentAndDisplayedForRelatedPartyTransactionsPage(){
        return isPageHeaderPresentAndDisplayed(relatedPartyTransactions_header,pageName);
    }

    private String pageName= "Related Party Transactions Trustee Remuneration Page";

    public enum DropDownValues {
        a_1_60000("£1-£60,000")                 , a_60001_70000("£60,001-£70,000")      , a_70001_80000("£70,001-£80,000")      ,
        a_80001_90000("£80,001-£90,000")        , a_90001_100000("£90,001-£100,000")    , a_100001_110000("£100,001-£110,000")  ,
        a_110001_120000("£110,001-£120,000")    , a_120001_130000("£120,001-£130,000")  , a_130001_140000("£130,001-£140,000")  ,
        a_140001_150000("£140,001-£150,000")    , a_150001_160000("£150,001-£160,000")  , a_160001_170000("£160,001-£170,000")  ,
        a_170001_180000("£170,001-£180,000")    , a_180001_190000("£180,001-£190,000")  , a_190001_200000("£190,001-£200,000")  ,
        a_200001_210000("£200,001-£210,000")    , a_210001_220000("£210,001-£220,000")  , a_220001_230000("£220,001-£230,000")  ,
        a_230001_240000("£230,001-£240,000")    , a_240001_250000("£240,001-£250,000")  , a_250001_260000("£250,001-£260,000")  ,
        a_£260001_270000("£260,001-£270,000")   , a_270001_280000("£270,001-£280,000")  , a_280001_290000("£280,001-£290,000")  ,
        a_290001_300000("£290,001-£300,000")    , a_300001_310000("£300,001-£310,000")  , a_310001_320000("£310,001-£320,000")  ,
        a_320001_330000("£320,001-£330,000")    , a_330001_340000("£330,001-£340,000")  , a_340001_350000("£340,001-£350,000")  ,
        a_350001_360000("£350,001-£360,000")    , a_360001_370000("£360,001-£370,000")  , a_370001_380000("£370,001-£380,000")  ,
        a_380001("£380,001+");

        private final String stringValue;

        DropDownValues(String s) {
            this.stringValue = s;
        }

        public String toString() {
            return stringValue;
        }
    }

    public enum ColumnNames{NumberPaidAsTrustees , NumberPaidAsStaff}

    public void setValueInTableByRowNumberAndColumnName(int rowNumber ,ColumnNames columnNames , String inputValue) {
        int columnNumber = 0 ;
        switch (columnNames){
            case NumberPaidAsTrustees:      columnNumber = 2 ;
                break;
            case NumberPaidAsStaff:         columnNumber = 3 ;
                break;
        }
        try {
            refreshWebElement(relatedPartyTransactions_TrusteeRemuneration_body);
            WebElement element = relatedPartyTransactions_TrusteeRemuneration_body.findElement(By.xpath(".//div[@class='opa_entity_table_body']/div[" + rowNumber + "]/div[" + columnNumber + "]//input"));
            cleanAndRebuildElement(element);
            setValueInElementInputJS(element, inputValue);
            hitKeyboardButton(element,Keys.TAB);
            info("The value s et in " + rowNumber + " and Column " + columnNames.toString() + " is : " + inputValue + " .");
        }catch (Exception e){
            info(" Exception Occured");
        }
    }

    public void selectDropDownValueInTableByRowNumber(String value,String rowNumber ){
        try {
            WebElement element = relatedPartyTransactions_TrusteeRemuneration_body.findElement(By.xpath(".//div[@class='opa_entity_table_body']//div[@class='opa_entity_table_row entity-instance']["+rowNumber+"]//select"));
            cleanAndRebuildElement(element);
            selectElementByVisibleText(element,value);
            hitKeyboardButton(element,Keys.TAB);
            info("The drop Down Selected Value for Row Number :" + rowNumber + " is :" + value);
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot();
        }
    }

    public String getValueFromTotalsByColumnName(ColumnNames columnNames) throws InterruptedException {
        int columnNumber = 0 ;
        String extractedText = "";
        if(columnNames == ColumnNames.NumberPaidAsTrustees){
            columnNumber = 2 ;
        }
        else if (columnNames == ColumnNames.NumberPaidAsStaff){
            columnNumber = 3 ;
        }
        waitForAjax();waitForJStoLoad();
        WebElement element = relatedPartyTransactions_TrusteeRemuneration_body.findElement(By.xpath(".//div[@class='opa-container form-group'][2]//div["+columnNumber+"]/div/div/input"));
        cleanAndRebuildElement(element);
        hitKeyboardButton(element,Keys.TAB);
        extractedText= getElementAttributeValueWithRetry(element,"value");
        info("The value extracted from Total row and column "+columnNames.toString()+"  in "+pageName+" is :"+ extractedText);
        return extractedText ;
    }

    public void addNewInstance(){
        int a = getNumberOfInstances();
        a = getNumberOfInstances();
        scrollToElement(addNewInstanceButton);
        cleanAndRebuildElement(addNewInstanceButton);
        waitForJStoLoad();
        try {
            waitForAjax();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElementWithJS2(addNewInstanceButton);
        info("Added New Instance");
    }

    public void removeAnInstance(){
        int a = getNumberOfInstances();
        long startTime = System.currentTimeMillis();
        try{
            do{
                cleanAndRebuildElement(removeInstanceButton);
                moveToElement(removeInstanceButton);
                clickElementWithJS1(removeInstanceButton);
                cleanAndRebuildElement(confirmDeleteYES);
                clickElementWithJS1(confirmDeleteYES);
                waitForPageLoadToComplete();
            }while ((getNumberOfInstances()==a-1)||(startTime-System.currentTimeMillis()>10000));
            info("Removed an Instance");
        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
        }catch(StaleElementReferenceException sere){
            sere.printStackTrace();
        }
    }

    public int getNumberOfInstances(){
        waitForPageLoadToComplete();
        int numberOfInstancesPresent = instancesCount.size();
        info("The current number of instances present in the "+pageName+" are : "+numberOfInstancesPresent);
        return numberOfInstancesPresent;
    }

    public void addMultipleInstances(int numberOfInstanceToAdd){
        do{
            addNewInstance();
            waitForPageLoadToComplete();
            explicitWait(50);
            refreshListOfWebElement(instancesCount,String.valueOf(numberOfInstanceToAdd));
        }while (getNumberOfInstances()!=numberOfInstanceToAdd);
    }

    public void removeMultipleInstances(int numberOfInstances){
        int currentCount;
        for( int i=1; i<=numberOfInstances; i++){
            waitForPageLoadToComplete();
            currentCount = getNumberOfInstances();
            if(currentCount==1){
                break;
            }
            cleanAndRebuildElement(removeInstanceButton);
            clickElementWithJS2(removeInstanceButton);
            explicitWait(1000);
            clickElementWithJS(confirmDeleteYES);
            explicitWait(500);
            waitForPageLoadToComplete();
        }
        info("The current instance count is ; "+ getNumberOfInstances());
    }

}
