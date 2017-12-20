package pageObjects.navigationPanel;

import customAnnotations.MenuTabBarMarkerInterface;
import customAnnotations.SubMenuMarketInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilityClasses.CommonMethods;

public class NavigationMenuBar extends CommonMethods {

    @FindBy(xpath = "//div[@id='ar-main-menu']")
    private WebElement ar_MainMenu;

    @FindBy(xpath = "//div[@class='ar-menu-tab-bar']")
    private WebElement ar_TabMenuBar;

    @FindBy(xpath = "//div[@class='ar-menu-sub-tab-bar']")
    private WebElement ar_SubTabMenuBar;

    /**
     * These enums cater to the high level menu in the Navigation Pane.
     */
    public enum MAIN_MENU_OPTIONS{
        ACADEMY_TRUST_OVERVIEW, ACCOUNTS_RETURN, DECLARATION_AND_SUBMISSION
    }

    /**
     * keep adding as you need more : this will include all the hover drop down options.
     * this is not based on numbering because the application is dynamic and the menu will be populated as per the standing data which would change the ordering of the menu options.
     */
    public enum ACCOUNTS_RETURN_HOVER_CONSTANTS{
        SoFA("SoFA"),
        BalanceSheetAssets("Balance Sheet Assets") ,AssetUnderConstruction("Assets Under Construction"),LandAndBuildings("Land and Buildings"), BalanceSheetLiabilities("Balance Sheet Liabilities"),
        TransfersAndConversions("Transfers and Conversions"), CountepartyData("Counterparty Data"), Summary("Summary"), BalanceSheetFundAndOtherDisclosure("Balance Sheet Fund And Other Disclosure");

        private final String stringValue;
        ACCOUNTS_RETURN_HOVER_CONSTANTS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    /**
     * These enums are for Academy Trust Overview hover options.
     */
    public enum ACADEMY_TRUST_OVERVIEW{
        WelcomeScreen("Welcome screen"), AcademyTrustInformation("Academy Trust Information"), Academy("Academy"), AcademyInformation("Academy Information"), Questionnaire("Questionnaire");

        private final String stringValue;
        ACADEMY_TRUST_OVERVIEW(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    /**
     * Use this enum in the Tab Menu Bar level 1 Option. See the DOM for Tab Menu Bar class to understand more.
     */
    public enum SOFA_TAB_MENU_OPTIONS{
        Donations("Donations"),CapitalGrants("Capital"), RevenueGrants("Revenue"), OtherIncome("Other Income"), Expenditure("Expenditure"), StaffAndTrustees("Staff"),
        ProvisionOfBoardingActivities("Provision");

        private final String stringValue;
        SOFA_TAB_MENU_OPTIONS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public enum BSA_TAB_MENU_OPTIONS implements MenuTabBarMarkerInterface {
        IntangibelFixedAssets("Intangible"), NonCurrentInvestments("Non-Current"), CurrentInvestment("Current"), TangibleFixedAssets("Tangible"), Debtors("Debtors"),
        Stock("Stock"), Cash("Cash");
        private final String stringValue;
        BSA_TAB_MENU_OPTIONS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }


    public enum BSA_TAB_SUBMENU_OPTIONS implements SubMenuMarketInterface {
        Cost("Cost"),Depriciation("Depreciation"), Imparments("Impairment"), AssetFinancing("Asset financing"), DepriciationPeriodsPerAcountingPolicies("Depreciation periods per"),
        Amortisation("Amortisation"), AmortisationPeriods("Amortisation periods");
        private final String stringValue;
        BSA_TAB_SUBMENU_OPTIONS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public enum AUC_TAB_MENU_OPTIONS implements MenuTabBarMarkerInterface{
        CapitalGrants("Capital"), Donations("Donations"), Transfers("Transfers"), TangibelFixedAssets("Tangible"),Debtors("Debtors"), Other("Other");

        private final String stringvalue;
        AUC_TAB_MENU_OPTIONS(String s){
            this.stringvalue=s;
        }
        public String toString(){
            return stringvalue;
        }
    }

    public enum AUC_TAB_SUBMENU_OPTIONS implements SubMenuMarketInterface {
        Cost("Cost"),Depriciation("Depreciation"), Imparments("Impairment");
        private final String stringValue;
        AUC_TAB_SUBMENU_OPTIONS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }


    /**
     * use these enums when you need to choose sub tab menu option s in SoFA.
     */
    public enum SOFA_SUB_TAB_MENU_OPTIONS{

        DfEandESFA("DfE and ESFA"), DfEGroup("DfE Group "), Other("Other"),
        OtherIncome("Other Income"), OtherTrading("Other Trading"), CostOfRaisingFunds("Costs of"),
        CharitableActivitiesDirectCost("- Direct Costs"), CharitableActivitiesSupportCost("- Support Costs"),
        OtherExpenditure("Other Expenditure "), StaffCosts("Staff Costs "), AverageStaffNumbers("Average Staff Numbers"),
        NumbersofEmployeesWhose("Numbers of Employees Whose"), ExitpackagesNon("Exit packages - Non"),
        LossofOfficePayments("Loss of Office"), RelatedpartyTransactions("Related party transactions:"),
        OffPayroll("Off Payroll"), Income("Income"), Expenditure("Expenditure");

        private final String stringValue;
        SOFA_SUB_TAB_MENU_OPTIONS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }

    public enum BSA_SUB_TAB_MENU_OPTIONS{

        Cost("Cost"), Depriciation("Depreciation"),Impairments("Impairments"),NetBookValue("Net Book Value"), AssetFinancing("Asset Financing"), DepricationPeriodPerAccountingPolicies("Depreciation");

        private final String stringValue;
        BSA_SUB_TAB_MENU_OPTIONS(String s) {
            this.stringValue = s;
        }
        public String toString() {
            return stringValue;
        }
    }



    /**
     *
     * @param mainMenuOptions this is the option from the main menu (as labelled in the DOM)
     * @param arMainMenuHoverConstants this is the option from the Accounts Return hover drop down list.
     */
    public void hoverMainMenuAndClickOption(MAIN_MENU_OPTIONS mainMenuOptions, ACCOUNTS_RETURN_HOVER_CONSTANTS arMainMenuHoverConstants ){

        int mainMenuOptionsCounter =0;
        switch(mainMenuOptions){

            case ACADEMY_TRUST_OVERVIEW: mainMenuOptionsCounter = 1;
                break;
            case ACCOUNTS_RETURN: mainMenuOptionsCounter = 2;
                break;
            case DECLARATION_AND_SUBMISSION: mainMenuOptionsCounter = 3;
                break;
        }
        try {
            Actions actions = getActionsInstance();
            waitForPageLoadToComplete();
            WebElement mainMenuElement = ar_MainMenu.findElement(By.xpath(".//li["+ mainMenuOptionsCounter +"]/p"));
            cleanAndRebuildElement(mainMenuElement);
            waitForElementToBeVisibleloop(mainMenuElement);
            actions.moveToElement(mainMenuElement).build().perform();

            WebElement mainMenuHoverElement = ar_MainMenu.findElement(By.xpath(".//li["+ mainMenuOptionsCounter +"]/p/following-sibling::div/a[contains(.,'"+arMainMenuHoverConstants+"')]"));
            //explicitWait(250);
            waitForElementToBeVisibleloop(mainMenuHoverElement);
            cleanAndRebuildElement(mainMenuHoverElement);
            waitForElementToBeVisibleloop(mainMenuElement);
            actions.moveToElement(mainMenuHoverElement).click().build().perform();
            waitForPageLoadToComplete();

        }catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred");

        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred");
        }
    }


    /**
     *
     * @param options the tab menu option from SOFA_TAB_MENU_OPTIONS (e.g: SoFA... etc  )
     *                use this method when there is no sub tab menu options present.
     *                use the overloaded version of this method which caters to the sub tab menu options.
     */
    public void click_arMenuTabBarOptions(SOFA_TAB_MENU_OPTIONS options){
        try {
            waitForPageLoadToComplete();
            WebElement element = ar_TabMenuBar.findElement(By.xpath(".//div/a" + "[contains(.,'" + options + "')]"+"|.//div/span"+"[contains(.,'" + options + "')]"));
            waitForElementToBeVisible(element);
            cleanAndRebuildElement(element);
            clickElementWithJS2(element);

        }catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred choosing SOFA_TAB_MENU_OPTIONS");

        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred choosing SOFA_TAB_MENU_OPTIONS");
        }
    }


    public void click_MenuTabBarOptions(MenuTabBarMarkerInterface options){
        try {
            waitForPageLoadToComplete();
            cleanAndRebuildElement(ar_TabMenuBar);
            //WebElement element = ar_TabMenuBar.findElement(By.xpath(".//div/a" + "[contains(.,'" + options.toString() + "')]"+"|.//div/span"+"[contains(.,'" + options.toString() + "')]"));
            explicitWait(500);
            WebElement element = ar_TabMenuBar.findElement(By.xpath(".//div/span" + "[.//text()='" + options.toString() + "']"+"|.//div/a"+"[.//text()='" + options.toString() + "']"));
            explicitWait(500);
            cleanAndRebuildElement(element);
            waitForElementToBeVisible(element);

            clickElementWithJS2(element);

        }catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred choosing SOFA_TAB_MENU_OPTIONS");

        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred choosing SOFA_TAB_MENU_OPTIONS");
        }
    }
//************************************************
    public void click_arMenuTabBarOptionsWithSubMenuOption(MenuTabBarMarkerInterface options, SubMenuMarketInterface subTabMenuOption){

        try {
            waitForPageLoadToComplete();
            waitForAjax();waitForJStoLoad();
            WebElement element = ar_TabMenuBar.findElement(By.xpath(".//div/a" + "[contains(.,'" + options.toString() + "')]"+"|.//div/span"+"[contains(.,'" + options.toString() + "')]"));
            cleanAndRebuildElement(element);
            waitForElementToBeVisible(element);
            clickElementWithJS2(element);

            waitForAjax();waitForJStoLoad();
            WebElement element1 = ar_SubTabMenuBar.findElement(By.xpath(".//div/a" + "[contains(.,'" + subTabMenuOption.toString() + "')]"+"|.//div/span"+"[contains(.,'" + subTabMenuOption.toString() + "')]"));
            cleanAndRebuildElement(element1);
            waitForElementToBeVisible(element1);
            clickElementWithJS2(element1);

        }catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred choosing SOFA_TAB_MENU_OPTIONS");

        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred choosing SOFA_TAB_MENU_OPTIONS");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param options is an enum for SoFA tab Menu Options
     * @param subTabMenuOption is an enum for SoFA sub tab menu option.
     *                             This method is used when there are sub tab menu options present.
     *                             For no sub menus there is a overloaded method available.
     */
    public void click_arMenuTabBarOptions(SOFA_TAB_MENU_OPTIONS options, SOFA_SUB_TAB_MENU_OPTIONS subTabMenuOption){

        try {
            waitForPageLoadToComplete();
            waitForAjax();waitForJStoLoad();
            WebElement element = ar_TabMenuBar.findElement(By.xpath(".//div/a" + "[contains(.,'" + options + "')]"+"|.//div/span"+"[contains(.,'" + options + "')]"));
            cleanAndRebuildElement(element);
            waitForElementToBeVisible(element);
            clickElementWithJS2(element);

            waitForAjax();waitForJStoLoad();
            WebElement element1 = ar_SubTabMenuBar.findElement(By.xpath(".//div/a" + "[contains(.,'" + subTabMenuOption + "')]"+"|.//div/span"+"[contains(.,'" + subTabMenuOption + "')]"));
            cleanAndRebuildElement(element1);
            waitForElementToBeVisible(element1);
            clickElementWithJS2(element1);

        }catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred choosing SOFA_TAB_MENU_OPTIONS");

        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred choosing SOFA_TAB_MENU_OPTIONS");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * @param options is the Page Header / Section Header
     * @return the boolean present status.
     */
     public boolean isTabMenuHeaderPresentAndDisplayedInNavigationPanel(ACCOUNTS_RETURN_HOVER_CONSTANTS options){

        boolean isPresentAndDisplayed = false;
        try{
            WebElement element = ar_MainMenu.findElement(By.xpath("./div[contains(.,'"+options.toString()+"')]"));
            waitForElementToBeVisible(element);
            cleanAndRebuildElement(element);
            isPresentAndDisplayed = isElementPresentAndDisplayed(element);
        }catch (StaleElementReferenceException sere){
            sere.printStackTrace();
            takeScreenshot();
            warn("StaleElementReferenceException Occurred displaying the Tab Menu Header "+ options.toString()+"\n");
        }catch (NoSuchElementException nsee){
            nsee.printStackTrace();
            takeScreenshot();
            warn("NoSuchElementException Occurred displaying the Tab Menu Header "+ options.toString());
        }
        return isPresentAndDisplayed;
     }




}
