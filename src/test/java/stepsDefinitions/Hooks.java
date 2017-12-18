package stepsDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilityClasses.BrowserFactory;
import utilityClasses.FrameworkPropertyConfigurator;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

    @Before
    public  void setup() throws IOException {
        welcomeMessage();
        BrowserFactory.openBrowser();
    }

    @After
    public  void teardown() throws IOException {

        goodByeMessage();
        BrowserFactory.closeBrowser();
    }
}


