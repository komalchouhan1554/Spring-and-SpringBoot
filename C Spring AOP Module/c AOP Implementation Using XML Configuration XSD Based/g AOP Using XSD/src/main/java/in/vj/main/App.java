package in.vj.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.services.BankTransactions;
import in.vj.services.PaytmTransactions;

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
        
        // ----------------
        
        PaytmTransactions pt = (PaytmTransactions) context.getBean("paytmTransID");
        pt.walletTransactions();
    }
}

// Output:-

/*

-----> Logging Service <-----
!!!!! Security Service !!!!!
===== Buisness Logic for UPI =====
!!!!! Security Service !!!!!
-----> Logging Service <-----

-----> Logging Service <-----
!!!!! Security Service !!!!!
===== Buisness Logic for Wallet =====
!!!!! Security Service !!!!!
-----> Logging Service <-----

-----> Logging Service <-----
!!!!! Security Service !!!!!
===== Buisness Logic for Internet Banking =====
!!!!! Security Service !!!!!
-----> Logging Service <-----

-----> Logging Service <-----
!!!!! Security Service !!!!!
===== Buisness Logic for Paytm Wallet =====

*/
