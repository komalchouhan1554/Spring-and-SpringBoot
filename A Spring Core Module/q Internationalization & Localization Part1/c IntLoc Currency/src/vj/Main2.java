package vj;

import java.text.NumberFormat;
import java.util.Locale;

public class Main2
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		int cr1 = 123456789;
		double cr2 = 983808.224525;
		
		Locale l1 = Locale.getDefault();
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(l1);
		System.out.println(nf1.format(cr1));
		System.out.println(nf1.format(cr2));
		
		
		System.out.println("\n------> For USA");
		Locale l2 = new Locale("","US");
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(l2);
		System.out.println(nf2.format(cr1));
		System.out.println(nf2.format(cr2));
		
		
		System.out.println("\n------> For France");
		Locale l3 = new Locale("fr","FR");
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(l3);
		System.out.println(nf3.format(cr1));
		System.out.println(nf3.format(cr2));
	
	}
}

// Output:-

/*
 
₹123,456,789.00
₹983,808.22

------> For USA
US$ 123,456,789.00
US$ 983,808.22

------> For France
123 456 789,00 €
983 808,22 €
 
 */
