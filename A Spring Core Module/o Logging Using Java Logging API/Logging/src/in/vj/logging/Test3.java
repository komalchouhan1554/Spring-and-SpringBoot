package in.vj.logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test3 {
    public static void main(String[] args) {

        try {
            System.out.println("Hello 1");

            

            FileHandler fl = new FileHandler("D://myDemo.log");
            SimpleFormatter sf = new SimpleFormatter();
            fl.setFormatter(sf);
            
            Logger logger = Logger.getLogger("Test3");
            logger.addHandler(fl);

            logger.setUseParentHandlers(true);

            logger.log(Level.SEVERE, "Server is not responding");
            logger.log(Level.WARNING, "3 Invalid Login attempts");
            logger.log(Level.INFO, "This is the information message");

            System.out.println("Hello 2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Output:-


/*

Hello 1
Mar 31, 2026 12:33:27 PM in.vj.logging.Test3 main
SEVERE: Server is not responding
Mar 31, 2026 12:33:27 PM in.vj.logging.Test3 main
WARNING: 3 Invalid Login attempts
Mar 31, 2026 12:33:27 PM in.vj.logging.Test3 main
INFO: This is the information message
Hello 2

*/