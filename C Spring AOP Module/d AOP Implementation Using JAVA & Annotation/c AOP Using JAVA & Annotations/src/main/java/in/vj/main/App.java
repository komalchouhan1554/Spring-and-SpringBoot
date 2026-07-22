package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.resources.SpringConfigFile;
import in.vj.services.BankTransactions;

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        BankTransactions bt =  (BankTransactions) context.getBean("bankTrans");
        
        bt.transactionUsingUPI();
        System.out.println();
        
        bt.transactionUsingInternetBanking();
        System.out.println();
        
        bt.transactionUsingMobileBanking();
        System.out.println();
      
        
    }
}

// Output:-


/*
 
-----> Logging Service (Before) <-----
Buisness Logic for UPI Transaction
-----> Logging Service (After) <-----

Buisness Logic for Internet Banking.

-----> Logging Service (Before) <-----
Buisness Logic for Mobile Banking.
-----> Logging Service (After) <-----

*/
