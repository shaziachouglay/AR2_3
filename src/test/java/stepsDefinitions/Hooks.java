package stepsDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilityClasses.BrowserFactory;
import utilityClasses.FrameworkPropertyConfigurator;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import static utilityClasses.LoggingFactory.getLogger;


/**
 * This class provides the stepsDefinitions.Hooks which need to be executed before and after the test to be executed.
 */
public class Hooks {

    public static void welcomeMessage() throws IOException {
        getLogger().info("\nWelcome to Online Forms for Application Name"+ FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.config,"ApplicationName"));
        getLogger().info("Session started on : "+timestamp());
    }

    public static String timestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EE dd-MM-yyyy  HH:mm:ss");
        return dateFormat.format(new Date());
    }

    public static void goodByeMessage() throws IOException {
        getLogger().info("\nClosing the session");
    }


    public void getSecnarioName(){
        Scenario scenario = new Scenario() {
            @Override
            public Collection<String> getSourceTagNames() {
                return null;
            }

            @Override
            public String getStatus() {
                return null;
            }

            @Override
            public boolean isFailed() {
                return isFailed();
            }

            @Override
            public void embed(byte[] data, String mimeType) {

            }

            @Override
            public void write(String text) {

            }

            @Override
            public String getName() {
                return getName();
            }

            @Override
            public String getId() {
                return null;
            }
        };
        scenario.getName();


    }


    @Before
    public  void setup() throws IOException {
        welcomeMessage();
        BrowserFactory.openBrowser();

    }

    @After
    public  void teardown() throws IOException {
        try {
            Reporter.loadXMLConfig(new File("extent-config.xml"));
            Reporter.setSystemInfo("user", System.getProperty("user.name"));
            Reporter.setSystemInfo("os", "Mac OSX");
            Reporter.setTestRunnerOutput("Sample test runner output message");
        }catch(NullPointerException npe){

        }
        finally {
            goodByeMessage();
            BrowserFactory.closeBrowser();
        }
    }
}


