package vj;

import java.text.DecimalFormat;

public class Main2
{
	public static void main(String[] args) 
	{
		int no1 = 123456789;
		double no2 = 983808.22425;
		
		String pattern = "##,##,##.#####";
		
		DecimalFormat dm1 = new DecimalFormat(pattern);
		System.out.println(dm1.format(no1));
		System.out.println(dm1.format(no2));
		
	}
}

// Output:-

/*
 
1,23,45,67,89
98,38,08.22425
 
 */
