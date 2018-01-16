package pageObjects.assetUnderConstruction.auc_others;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClasses.CommonMethods;

import java.util.List;

import static pageObjects.assetUnderConstruction.auc_others.AUC_Others.columConstants.columnOne;
import static pageObjects.assetUnderConstruction.auc_others.AUC_Others.columConstants.columnTwo;

public class AUC_Others extends CommonMethods {

    @FindBy(xpath = "//div[@class='opa-main-panel']")
    private WebElement page_body;

    @FindBy(how= How.XPATH , using = "//div[@class='opa-screen-title'][contains(.,'Other')]")
    private WebElement page_header;

    @FindBy(xpath = "//div[@class='opa_entity_table_row entity-instance']")
    List<WebElement> numberOfInstances;

    @FindBy(xpath = "//button[@class='button owd-add']")
    WebElement addNewInstanceButton;

    @FindBy(xpath = "//div[@class='confirm-remove-overlay-content']//input[@value='Yes']")
    WebElement yesConfirmatioRemoveInstance;

    public String pageName = "Other AUC";

    public void clickOnSaveAndNextInDonationsAUCPage(){
        clickOnSaveAndNextButtonInPage();
        this.waitForPageLoadToComplete();
    }


    public boolean isHeaderPresentAndDisplayedForDonationsAUCPage(){
        return isPageHeaderPresentAndDisplayed(page_header,pageName);
    }

    public enum columConstants{
        columnOne, columnTwo
    }


    public int getNumberOFInstances(){
        return numberOfInstances.size();
    }

    public void setValueByInstanceAndColumnNumber(int instanceNumber,columConstants columConstants, String inputValue){
        int columnNumber=0;

        if(columConstants.equals(columnOne)){columnNumber=1;}
        else if(columConstants.equals(AUC_Others.columConstants.columnTwo)){columnNumber=2;}

        try {
            waitForAjax();
            WebElement element = getDriver().findElement(By.xpath("//div[@class='opa_entity_table_body']//div[@class='opa_entity_table_row entity-instance']["+instanceNumber+"]/div["+columnNumber+"]//input"));
            waitForElementToBeVisible(element);
            cleanAndRebuildElement(element);
            setValueInElementInputJS(element, inputValue);
            hitKeyboardButton(element, Keys.TAB);
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
        info("The value set in instance number  : "+ instanceNumber+ " and column : "+ columConstants.toString()+" is : "+inputValue+" in "+pageName);
    }


    public void clickOnAddNewInstanceButton(){
        clickElementWithJS2(addNewInstanceButton);
        info("Clicked in the ADD NEW INSTANCE button in "+pageName);
    }

    public boolean addNewInstance(){
        boolean instaceAddedStatus = false;
        int firstcount = getNumberOFInstances();
        clickElementWithJS2(addNewInstanceButton);
        waitForPageLoadToComplete();
        int secondCount = getNumberOFInstances();
        if(secondCount-firstcount==1){ instaceAddedStatus=true;
        info("Instance Successfully Added");
        }
        return instaceAddedStatus;
    }

    public void clickOnRemoveInstanceButtonByInstanceNumber(int instanceNumber){

        int firstInstanceCount= getNumberOFInstances();
        WebElement element = getDriver().findElement(By.xpath("//div[@class='opa_entity_table_body']/div[@class='opa_entity_table_row entity-instance']["+instanceNumber+"]//button[@class='button owd-remove']"));
        clickElementWithJS2(element);
        clickElementWithJS2(yesConfirmatioRemoveInstance);
        info("Clicked on the remove instance button for instance number "+ instanceNumber);
        waitForPageLoadToComplete();
        int secondInstanceCount = getNumberOFInstances();
        if(secondInstanceCount-firstInstanceCount==1){
            info("Instance Succesfully Deleted");
        }else{
            info("Instance NOT Deleted!");
        }
    }

    public String getValueOfTotalField(){
        WebElement element = getDriver().findElement(By.xpath("//input[@id='global_global_a_otherAUC_Total']"));
        String text = getElementAttributeValueWithRetry(element,"value");
        return text;

    }

     public void addMultipleInstances(int instancesToBeAdded, String inputValue){

        int firstInstanceCount = getNumberOFInstances();
        for(int i=1; i<instancesToBeAdded+1; i++){
            addNewInstance();
            info("Current number of Instaces are : "+getNumberOFInstances());
            waitForPageLoadToComplete();
            setValueByInstanceAndColumnNumber( i,columnOne,inputValue);
            setValueByInstanceAndColumnNumber( i,columnTwo,inputValue);

            if(getNumberOFInstances()==1){break; }
            else if(getNumberOFInstances()==instancesToBeAdded){break;}
        }
        info("The Total Number of INSTANCES present are : "+getNumberOFInstances());
     }


     public void removeMultipleInstances(){
         int firstInstanceCount= getNumberOFInstances();
        List<WebElement> removeButtonList = getDriver().findElements(By.xpath("//button[@class='button owd-remove']"));

         for(int i=firstInstanceCount-1; true;i--){
             clickElementWithJS2(removeButtonList.get(i));
             waitForElementToBeVisible(yesConfirmatioRemoveInstance);
             clickElementWithJS2(yesConfirmatioRemoveInstance);
             explicitWait(500);
             if(getNumberOFInstances()==1){break;}
             if(i>firstInstanceCount){break;}
         }
     }
}
