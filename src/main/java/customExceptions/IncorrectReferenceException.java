package customExceptions;

import org.apache.log4j.Logger;
import utilityClasses.LoggingFactory;

public class IncorrectReferenceException extends Exception{


    Logger logger = LoggingFactory.getLogger();

    public IncorrectReferenceException(Exception e) throws Exception {
        logger.warn("|      The Reference did not match the Application                   |\n");
                logger.warn("|      Please Check The Source Data Sheet and the Application Match  |\n");
        throw e;
    }
}
