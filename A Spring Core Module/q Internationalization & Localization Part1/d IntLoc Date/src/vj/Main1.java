package vj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Main1 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		System.out.println();
		
		// Indian Format
		System.out.println("----> Indian Format");
		Locale l1 = new Locale("en","IN");
		DateFormat df1 = DateFormat.getDateInstance(0,l1);
		System.out.println(df1.format(date));
		
		//USA Format
		System.out.println("\n----> USA Format");
		Locale l2 = new Locale("en","US");
		DateFormat df2 = DateFormat.getDateInstance(0,l2);
		System.out.println(df2.format(date));
		
		// France Format
		System.out.println("\n----> France Format");
		Locale l3 = new Locale("fr","FR");
		DateFormat df3 = DateFormat.getDateInstance(0,l3);
		System.out.println(df3.format(date));
		
		// France Format
		System.out.println("\n----> Argentina Format");
		Locale l4 = new Locale("es","AR");
		DateFormat df4= DateFormat.getDateInstance(0,l4);
		System.out.println(df4.format(date));
	}
}

// Output:-

/*

Sat Apr 04 11:45:50 IST 2026

----> Indian Format
Saturday 4 April, 2026

----> USA Format
Saturday, April 4, 2026

----> France Format
samedi 4 avril 2026

----> Argentina Format
sábado, 4 de abril de 2026

*/