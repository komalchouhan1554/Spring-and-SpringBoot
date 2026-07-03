package in.vj.logging;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Test2 {

	static Logger logger;

	public void m1()
	{
		System.out.println("m1 method starts");

		logger.log(Level.ERROR, "m1 method ERROR message");
		logger.log(Level.WARNING, "m1 method WARNING message");
		logger.log(Level.INFO, "m1 method INFO message");

		System.out.println("m2 methods ends");
	}

	public static void main(String[] args)
	{
		System.out.println("Main methid starts");

		logger = System.getLogger("Test2");

		Test2 t2 = new Test2();
		t2.m1();

		logger.log(Level.ERROR, "Main method ERROR message");
		logger.log(Level.WARNING, "Main method WARNING message");
		logger.log(Level.INFO, "Main method INFO message");


		System.out.println("Main methods ends");


	}
}

// Output:-


/*

Main method starts
m1 method starts
Mar 31, 2026 10:46:53 AM in.vj.logging.Test2 m1
SEVERE: m1 method ERROR message
Mar 31, 2026 10:46:53 AM in.vj.logging.Test2 m1
WARNING: m1 method WARNING message
Mar 31, 2026 10:46:53 AM in.vj.logging.Test2 m1
INFO: m1 method INFO message
m2 methods ends
Mar 31, 2026 10:46:53 AM in.vj.logging.Test2 main
SEVERE: Main method ERROR message
Mar 31, 2026 10:46:53 AM in.vj.logging.Test2 main
WARNING: Main method WARNING message
Mar 31, 2026 10:46:53 AM in.vj.logging.Test2 main
INFO: Main method INFO message
Main methods ends

*/