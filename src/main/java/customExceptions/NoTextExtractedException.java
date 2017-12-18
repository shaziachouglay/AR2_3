package customExceptions;

import org.apache.log4j.Logger;
import utilityClasses.LoggingFactory;

public class NoTextExtractedException extends Exception {
    Logger logger = LoggingFactory.getLogger();
    public NoTextExtractedException(){
        logger.info("No Text Was Extracted from the field exception Occurred !");
        printStackTrace();
    }
}
