package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.resources.SpringConfigFile;
import in.vj.services.BankTransactions;
import in.vj.services.PaytmTransactions;

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        BankTransactions bt = context.getBean(BankTransactions.class);
        
        bt.transactionUsingUPI();
        System.out.println();
        
        bt.transactionUsingInternetBanking();
        System.out.println();
        
        bt.transactionUsingMobileBanking();
        System.out.println();
        
        PaytmTransactions pt =  context.getBean(PaytmTransactions.class);
        pt.transcationUsingWallet();
        System.out.println();
      
        
    }
}

// Output:-


/*
 
Buisness Logic for UPI Transaction
-----> Logging Service <-----

Buisness Logic for Internet Banking.

Buisness Logic for Mobile Banking.
-----> Logging Service <-----

*/
