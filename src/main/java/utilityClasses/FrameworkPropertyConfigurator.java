package utilityClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Use this class for its method to get the properties from .properties file.
 */
public class FrameworkPropertyConfigurator {

    /**
     * This Enum is the constant used to fetch the properties file path.
     */
    public enum propertyFileName {
        config("src/configuration/config.properties"),
        log4j("src/configuration/log4j.properties"),
        credentials("OnlineFormsFramework/OnlineForms/credentials.properties");

        private final String stringValue;

        propertyFileName(String s) {
            this.stringValue = s;
        }

        public String toString() {
            return stringValue;
        }
    }

    public enum keys {
        LOG_SWITCH("log_switch"), SCREENSHOT_SWITCH("screenshot_switch"), REPORT_SWITCH("report_switch");
        private final String stringValue;

        keys(String s) {
            this.stringValue = s;
        }

        public String toString() {
            return stringValue;
        }
    }

    public enum WAIT_SECONDS {
        S_sec, M_sec, L_sec, XL_sec, XXL_sec, XXXL_sec, variable_sec
    }

    public enum WAIT_MILLISECONDS {
        S_milli, M_milli, L_milli, XL_milli, XXL_milli, XXXL_milli, varibale_milli
    }

    public static int getWaitInSeconds(WAIT_SECONDS seconds) {
        Properties properties = new Properties();
        String value = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(seconds.toString());
            properties.load(fileInputStream);
            value = properties.getProperty(seconds.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(value);
    }

    public static long getWaitInMilliseconds(WAIT_MILLISECONDS milliseconds) {
        Properties properties = new Properties();
        String value = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(milliseconds.toString());
            properties.load(fileInputStream);
            value = properties.getProperty(milliseconds.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(value);
    }

    public static String getPropertiesByFileName(propertyFileName fileName, String key) {

        Properties properties = new Properties();
        String value = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName.toString());
            properties.load(fileInputStream);
            value = properties.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }


    public static String getPropertiesByFileName(propertyFileName fileName, keys key) {

        Properties properties = new Properties();
        String value = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName.toString());
            properties.load(fileInputStream);
            value = properties.getProperty(key.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}


