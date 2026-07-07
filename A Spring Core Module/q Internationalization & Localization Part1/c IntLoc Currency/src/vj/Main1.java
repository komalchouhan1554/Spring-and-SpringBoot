package vj;

import java.util.Currency;
import java.util.Locale;

public class Main1 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// Indian Format
		Locale l1 = Locale.getDefault();
		Currency c1 = Currency.getInstance(l1);
		System.out.println(c1.getSymbol() + " - "+ c1.getDisplayName());
		
		// US Format
		Locale l2 = new Locale("en","US");
		Currency c2 = Currency.getInstance(l2);
		System.out.println(c2.getSymbol() + " - "+ c2.getDisplayName());
		
		// France Format
		Locale l3 = new Locale("fr","FR");
		Currency c3 = Currency.getInstance(l3);
	    System.out.println(c3.getSymbol() + " - "+ c3.getDisplayName());
	}
}

// Output:-

/*

₹ - Indian Rupee
$ - US Dollar
€ - Euro

*/