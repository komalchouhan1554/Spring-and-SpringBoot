package in.vj.calc;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {

	public static void main(String[] args) throws IOException
	{
		FileHandler fh = new FileHandler("D:\\calc1.log", true);
		SimpleFormatter sf = new SimpleFormatter();
		fh.setFormatter(sf);
		
		Logger logger = Logger.getLogger("Calculator");
		logger.addHandler(fh);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int no1 = sc.nextInt();
		logger.log(Level.INFO,"User has provided no1 i.e. "+no1);
		
		System.out.println("Enter number 2: ");
		int no2 = sc.nextInt();
		logger.log(Level.INFO,"User has provided no2 i.e. "+no2);
		
		System.out.println("Enter Symbol(+,-,*,/): ");
		String symbol = sc.next();
		logger.log(Level.INFO,"User has provided symbol i.e. "+symbol);
		
		int res;
		
		switch (symbol) 
		{
			case "+":
				res = no1+no2;
				System.out.println("Addition is: "+ res);
				logger.log(Level.INFO,"result is: "+res);
				break;
			
				
			case "/":
				res = no1/no2;
				System.out.println("Division is: "+res);
				logger.log(Level.INFO,"result is: "+res);
				break;
				
				
			case "-":
				res = no1-no2;
				System.out.println("Subtraction is: "+res);
				logger.log(Level.INFO,"result is: "+res);
				break;
				
				
			case "*":
				res = no1*no2;
				System.out.println("Multiplication is: "+res);
				logger.log(Level.INFO,"result is: "+res);
				break;
		
		default:
			System.out.println("Invalid Symbol....");
			logger.log(Level.INFO,"Invalid Symbol....");
		}
		
		
		sc.close();
	}

}

// Output:-

/*
 
 
 Enter number 1: 
82
Mar 31, 2026 12:55:52 PM in.vj.calc.Calculator main
INFO: User has provided no1 i.e. 82
Enter number 2: 
3
Mar 31, 2026 12:56:03 PM in.vj.calc.Calculator main
INFO: User has provided no2 i.e. 3
Enter Symbol(+,-,*,/): 
*
Mar 31, 2026 12:56:08 PM in.vj.calc.Calculator main
INFO: User has provided symbol i.e. *
Multiplication is: 246
Mar 31, 2026 12:56:08 PM in.vj.calc.Calculator main
INFO: result is: 246

*/
