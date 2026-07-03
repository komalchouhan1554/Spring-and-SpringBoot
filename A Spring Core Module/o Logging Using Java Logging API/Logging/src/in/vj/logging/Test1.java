package in.vj.logging;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Hello 1");

        // Correct way to get logger
        Logger logger = System.getLogger("Test1");

        logger.log(Level.ERROR, "Server is not responding");
        logger.log(Level.WARNING, "3 Invalid Login attempts");
        logger.log(Level.INFO, "This is the information message");

        System.out.println("Hello 2");
    }
}


//Output:-


/*

Hello 1
Mar 31, 2026 10:48:28 AM in.vj.logging.Test1 main
SEVERE: Server is not responding
Mar 31, 2026 10:48:28 AM in.vj.logging.Test1 main
WARNING: 3 Invalid Login attempts
Mar 31, 2026 10:48:28 AM in.vj.logging.Test1 main
INFO: This is the information message
Hello 2

*/