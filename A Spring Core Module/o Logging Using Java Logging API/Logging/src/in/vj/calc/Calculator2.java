package in.vj.calc;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator2 {

	public static void main(String[] args) throws IOException
	{
		FileHandler fh = new FileHandler("D:\\calc2.log", true);
		SimpleFormatter sf = new SimpleFormatter();
		fh.setFormatter(sf);
		
		Logger logger = Logger.getLogger("Calculator");
		logger.addHandler(fh);
		
		Scanner sc = new Scanner(System.in);
		String cont_calc="";
		
		do 
		{
			logger.log(Level.INFO,"=========================================");
		
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
					if(no2 == 0)
					{
						logger.log(Level.SEVERE, "Cannotdivide by zero");
					}
					else
					{
						res = no1/no2;
						System.out.println("Division is: "+res);
						logger.log(Level.INFO,"result is: "+res);
					}
					
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
			
			System.out.println("Do you want to continue: if yes the y if no then press any key");
			cont_calc = sc.next();
		} 
		while (cont_calc.equals("y") || cont_calc.equals("Y"));
	
		
		
		sc.close();
	}

}

// Output:-

/*
 
 
Mar 31, 2026 2:08:44 PM in.vj.calc.Calculator2 main
INFO: =========================================
Enter number 1: 
321
Enter number 2: 
Mar 31, 2026 2:08:50 PM in.vj.calc.Calculator2 main
INFO: User has provided no1 i.e. 321
6
Enter Symbol(+,-,*,/): 
Mar 31, 2026 2:08:54 PM in.vj.calc.Calculator2 main
INFO: User has provided no2 i.e. 6
*
Mar 31, 2026 2:08:55 PM in.vj.calc.Calculator2 main
INFO: User has provided symbol i.e. *
Multiplication is: 1926
Mar 31, 2026 2:08:55 PM in.vj.calc.Calculator2 main
INFO: result is: 1926
Do you want to continue: if yes the y if no then press any key
y
Enter number 1: 
Mar 31, 2026 2:08:58 PM in.vj.calc.Calculator2 main
INFO: =========================================
85
Mar 31, 2026 2:08:59 PM in.vj.calc.Calculator2 main
INFO: User has provided no1 i.e. 85
Enter number 2: 
987
Mar 31, 2026 2:09:04 PM in.vj.calc.Calculator2 main
INFO: User has provided no2 i.e. 987
Enter Symbol(+,-,*,/): 
+
Mar 31, 2026 2:09:10 PM in.vj.calc.Calculator2 main
INFO: User has provided symbol i.e. +
Addition is: 1072
Mar 31, 2026 2:09:10 PM in.vj.calc.Calculator2 main
INFO: result is: 1072
Do you want to continue: if yes the y if no then press any key

*/
