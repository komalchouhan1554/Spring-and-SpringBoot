package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.services.BankTransactions;


public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
        
        BankTransactions bt = (BankTransactions) context.getBean("proxyId");
        bt.transactionUsingUpi();
    }
}


// Output:-


/*

----- Logging Service Logic -----
===== Buisness logiv for UPI transaction =====

*/