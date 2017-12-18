package utilityClasses;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaRuntimeCommandExecutor {

   static Logger logger = LoggingFactory.getLogger();

    /**
     *  use this method to execute cli commands at runtime.
     */
   public static void executeRuntimeCommand() {
        String s = null;
        try {
            // Example below.
            // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec("ps -ef");

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            logger.info("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            logger.info("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
                logger.info(s);
            }
            System.exit(0);
        } catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            logger.info("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}

