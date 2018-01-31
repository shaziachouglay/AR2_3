package utilityClasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static utilityClasses.FrameworkPropertyConfigurator.propertyFileName.config;


public class BrowserFactory extends LoggingFactory{

    public static String browser;
    public static String url ;
    public static String testName;
    static Logger logger = LoggingFactory.getLogger();

    public static void openBrowser() throws IOException {

        browser = FrameworkPropertyConfigurator.getPropertiesByFileName(config,"browser");
        url     = FrameworkPropertyConfigurator.getPropertiesByFileName(config,"url");



        if(browser.equalsIgnoreCase("Firefox")){
            DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
            capabilities.setCapability("marionette",true);
            System.setProperty("webdriver.gecko.driver","src/test/drivers/geckodriver");
            driver = new FirefoxDriver();

            logger.info("Opening Firefox Browser");
            logger.info(driver.toString());
        }
        else if(browser.equalsIgnoreCase("headless")){
            driver = new HtmlUnitDriver();
            logger.info(" \nOperating on Headless Browser");
        }
        else if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver" , (System.getProperty("user.dir")+"/src/test/drivers/chromedriver 3"));
            driver = new ChromeDriver();
            logger.info("Opening Chrome Browser");

//            String deviceName = "Apple iPhone 5";
//            Map<String, String> mobileEmulation = new HashMap<String, String>();
//            mobileEmulation.put("deviceName", deviceName);
//
//            Map<String, Object> chromeOptions = new HashMap<String, Object>();
//            chromeOptions.put("mobileEmulation", mobileEmulation);
//            DesiredCapabilities  capabilities;
//            capabilities = DesiredCapabilities.chrome();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//            WebDriver driver = new ChromeDriver(capabilities);
        }
        else if(browser.equalsIgnoreCase("safari")){
            driver= new SafariDriver();
            logger.info(" \nOpening Safari Browser !");
        }
        else if (browser.equalsIgnoreCase("Phantom")){

            File file = new File (System.getProperty("user.dir")+"/src/test/drivers/phantomjs");
            System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
            driver.toString();
        }
        else if(browser.equalsIgnoreCase("js")){

            File file = new File (System.getProperty("user.dir")+"/src/test/drivers/phantomjs");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setJavascriptEnabled(true);
            caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, file.getAbsolutePath());
            PhantomJSDriverService service = PhantomJSDriverService.createDefaultService(caps);
            service.start();
            driver = new PhantomJSDriver(service, caps);
        }
        driver.get(url);
        Dimension d = new Dimension(1680,1050);
        driver.manage().window().setSize(d);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        //Get Browser name and version.
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getVersion();
        String br = caps.getPlatform().family().toString();

        //Get OS name.
        String os = System.getProperty("os.name").toLowerCase();
        logger.info("Running Driver : "+browserName+" version : "+browserVersion+" on OS : "+os+" of Family : "+br);
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver ;
    }
}
