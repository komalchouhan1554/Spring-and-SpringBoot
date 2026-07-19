package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.services.BankTransactions;

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
        
        BankTransactions bt = (BankTransactions) context.getBean("bankTransID");
        
        bt.transactionUsingUPI();
        System.out.println();
        
        bt.transactionUsingWallet();
        System.out.println();
        
        bt.transactionUsingInternetBanking();
        System.out.println();
    }
}

// Output:-

/*

-----> Logging Service <-----
===== Buisness Logic for UPI =====
-----> Logging Service <-----

===== Buisness Logic for Wallet =====

-----> Logging Service <-----
===== Buisness Logic for Internet Banking =====
-----> Logging Service <-----

*/
