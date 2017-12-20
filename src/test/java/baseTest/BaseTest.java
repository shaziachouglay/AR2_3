package baseTest;


import org.apache.log4j.Logger;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pageObjects.accessOne.HomePage;
import pageObjects.accessOne.LandingPage;
import pageObjects.accessOne.LoginPage;
import pageObjects.accessOne.ServicePortalPage;
import pageObjects.assetUnderConstruction.auc_CapitalGranst.AUC_CapitalGranst;
import pageObjects.assetUnderConstruction.auc_Donations.AUC_Donations;
import pageObjects.assetUnderConstruction.auc_TangibleFixedAssets.AUC_TFA_Cost;
import pageObjects.balanceSheetAssets.cash.Cash;
import pageObjects.balanceSheetAssets.currentInvestment.CurrentInvestments;
import pageObjects.balanceSheetAssets.debtors.Debtors;
import pageObjects.balanceSheetAssets.intangibleFixedAssets.*;
import pageObjects.balanceSheetAssets.nonCurrentInvestment.NonCurrentInvestment;
import pageObjects.balanceSheetAssets.stock.Stock;
import pageObjects.balanceSheetAssets.tangibleFixedAssets.*;
import pageObjects.navigationPanel.NavigationMenuBar;
import pageObjects.sofa.capitalGrants.CapitalGrantsDfEESFA;
import pageObjects.sofa.capitalGrants.CapitalGrantsDfEGroup;
import pageObjects.sofa.capitalGrants.CapitalGrantsOther;
import pageObjects.sofa.donations.Donations;
import pageObjects.sofa.expenditure.CharitableActivities_DirectCosts;
import pageObjects.sofa.expenditure.CharitableActivities_SupportCost;
import pageObjects.sofa.expenditure.CostOfRaisingFunds;
import pageObjects.sofa.expenditure.OtherExpenditure;
import pageObjects.sofa.otherIncome.OtherIncome_OtherIncome;
import pageObjects.sofa.otherIncome.OtherIncome_OtherTradingActivities;
import pageObjects.sofa.provisionOfBoardingActivities.ProvisionOfBoardingActivitesExpenditure;
import pageObjects.sofa.provisionOfBoardingActivities.ProvisionOfBoardingActivities_Income;
import pageObjects.sofa.revenueGrants.RevenueGrantsDfEESFA;
import pageObjects.sofa.revenueGrants.RevenueGrantsDfEGroup;
import pageObjects.sofa.revenueGrants.RevenueGrantsOther;
import pageObjects.sofa.staffAndTrustees.*;
import pageObjects.standingData.*;
import utilityClasses.FrameworkPropertyConfigurator;
import utilityClasses.LoggingFactory;

/**
 * To use the testNG assertion Library extend the stepDefinition class with the BaseTest class.
 */
public class BaseTest {

    HomePage homePage = new HomePage();
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    ServicePortalPage servicePortalPage = new ServicePortalPage();
    // Page Objects Common to both the environments.

    /**
     * objects for the SOFA Section
     */
    protected WelcomeScreen_dev welcomeScreen_dev = new WelcomeScreen_dev();
    protected AcademyTrustInformation academyTrustInformationPage = new AcademyTrustInformation();
    protected Academy academy = new Academy();
    protected AcademyInformation academyInformation = new AcademyInformation();
    protected Questionnaire questionnaire = new Questionnaire();
    protected Donations donations = new Donations();
    protected NavigationMenuBar navigationMenuBar = new NavigationMenuBar();
    protected CapitalGrantsDfEESFA dfeefa = new CapitalGrantsDfEESFA();
    protected CapitalGrantsDfEGroup dfeGroup = new CapitalGrantsDfEGroup();
    protected CapitalGrantsOther otherCapitalGrants = new CapitalGrantsOther();
    protected RevenueGrantsOther revenueGrantsOther = new RevenueGrantsOther();
    protected RevenueGrantsDfEESFA revenueGrantsDfEESFA = new RevenueGrantsDfEESFA();
    protected RevenueGrantsDfEGroup revenueGrantsDfEGroup = new RevenueGrantsDfEGroup();
    protected OtherIncome_OtherIncome otherIncome_otherIncome = new OtherIncome_OtherIncome();
    protected OtherIncome_OtherTradingActivities otherIncome_otherTradingActivities = new OtherIncome_OtherTradingActivities();
    protected CharitableActivities_DirectCosts charitableActivities_directCosts = new CharitableActivities_DirectCosts();
    protected CharitableActivities_SupportCost charitableActivities_supportCost = new CharitableActivities_SupportCost();
    protected CostOfRaisingFunds costOfRaisingFunds = new CostOfRaisingFunds();
    protected OtherExpenditure otherExpenditure = new OtherExpenditure();
    protected ProvisionOfBoardingActivities_Income income = new ProvisionOfBoardingActivities_Income();
    protected ProvisionOfBoardingActivitesExpenditure expenditure = new ProvisionOfBoardingActivitesExpenditure();
    protected AverageStaffNumbers averageStaffNumbers = new AverageStaffNumbers();
    protected StaffCosts staffCosts = new StaffCosts();
    protected RelatedPartyTransactions_TrusteeRemuneration relatedParty = new RelatedPartyTransactions_TrusteeRemuneration();
    protected OffPayrollArrangements offPayroll = new OffPayrollArrangements();
    protected NumbersOfEmployeesWhoseEmolumentsExceed_60k numberExceedClass = new NumbersOfEmployeesWhoseEmolumentsExceed_60k();
    protected LossOfOfficePayments officePayments = new LossOfOfficePayments();
    protected ExitPackages_NonCivilServiceSchemes exitPackage = new ExitPackages_NonCivilServiceSchemes();


    /**
     * Objects for Balance Sheet Asset Section.
     */
    protected Cash cash = new Cash();
    protected Stock stock = new Stock();
    protected Debtors debtors = new Debtors();
    protected CurrentInvestments currentInvestments = new CurrentInvestments();
    protected NonCurrentInvestment nonCurrentInvestment = new NonCurrentInvestment();
    protected IFA_Cost ifa_cost = new IFA_Cost();
    protected IFA_Amortisation ifa_amortisation = new IFA_Amortisation();
    protected IFA_AmortisationPeriods ifa_amortisationPeriods = new IFA_AmortisationPeriods();
    protected IFA_NetBookValue ifa_netBookValue = new IFA_NetBookValue();
    protected IFA_AssetFinancing ifa_assetFinancing = new IFA_AssetFinancing();

    protected TFA_AssetFinancing tfa_assetFinancing = new TFA_AssetFinancing();
    protected TFA_Depriciation tfa_depriciation = new TFA_Depriciation();
    protected TFA_Impairments tfa_impairments = new TFA_Impairments();
    protected TFA_NetBookvalue tfa_netBookvalue = new TFA_NetBookvalue();
    protected TFA_DepriciationPeriodsPerAccountingPolicies tfa_depriciationPeriodsPerAccountingPolicies = new TFA_DepriciationPeriodsPerAccountingPolicies();
    protected TFA_Cost tfa_cost = new TFA_Cost();



    /**
     * Objects for Asset Under Construction
     */
    protected AUC_CapitalGranst auc_capitalGranst = new AUC_CapitalGranst();
    protected AUC_Donations auc_donations= new AUC_Donations();
    protected AUC_TFA_Cost auc_tfa_cost = new AUC_TFA_Cost();



    /**
     * The testNG Assertion Class provides us with Hard Assertions.
     *    -----Use hardAsser to terminate the programme when the assertion fails.
     */
    protected Assertion hardAssertion = new Assertion();

    /**
     *The testNG SoftAssertions Class provides us with Soft Assertions.
     *    -----Use softAssert to display a WARNING on failure and continue the test case.
     */
    protected SoftAssert softAssert = new SoftAssert();

   protected static Logger log = LoggingFactory.getLogger();

    public void info(Object message){
        if(FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.config, FrameworkPropertyConfigurator.keys.LOG_SWITCH).equalsIgnoreCase("ON")){
        log.info(message);}
    }

    public void getMeCurrentMethodInfo(){
        Thread.currentThread().getContextClassLoader();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        String ClassFromWhereMethodCallIsMade = Thread.currentThread().getStackTrace()[2].getFileName();
        info(   "\n-------------------------------------------------------------------------"+"" +
                "\n|Information for the current running Method                      "+"" +
                "\n|Method Name is             |"+methodName+"                             "+"" +
                "\n|Class Calling this method  |"+ClassFromWhereMethodCallIsMade+"         "+"" +
                "\n-------------------------------------------------------------------------");
    }
}
