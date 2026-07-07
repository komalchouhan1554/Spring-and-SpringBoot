package vj;

import java.text.NumberFormat;
import java.util.Locale;

public class Main1
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		int no1 = 123456789;
		double no2 = 983808.22425;
		
		
		System.out.println("------------Below Format is Indian Format-----------");
		Locale l1 = Locale.getDefault();
		NumberFormat nf1 = NumberFormat.getInstance(l1);
		System.out.println(nf1.format(no1));
		System.out.println(nf1.format(no2));
		
		System.out.println("------------Below Format is France Format-----------");
		Locale l2 = new Locale("fr","FR");
		NumberFormat nf2 = NumberFormat.getInstance(l2);
		System.out.println(nf2.format(no1));
		System.out.println(nf2.format(no2));
		
		
		System.out.println("------------Below Format is Argentina Format-----------");
		Locale l3 = new Locale("es","AR");
		NumberFormat nf3 = NumberFormat.getInstance(l3);
		System.out.println(nf3.format(no1));
		System.out.println(nf3.format(no2));
	}
}

// Output:-

/*
 
------------Below Format is Indian Format-----------
123,456,789
983,808.224
------------Below Format is France Format-----------
123 456 789
983 808,224
------------Below Format is Argentina Format-----------
123.456.789
983.808,224
 
 */
