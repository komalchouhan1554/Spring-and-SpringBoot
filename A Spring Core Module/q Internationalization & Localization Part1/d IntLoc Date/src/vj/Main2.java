package vj;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date);
		
		// String pattern = "dd/MM/yyyy"; // 04/04/2026
		// String pattern = "dd/MMM/yyyy";  // 04/Apr/2026
		// String pattern = "dd/MMM/yy"; // 04/Apr/26
		// Sring pattern = "dd MM yyyy";  // 04 04 2026
		// String pattern = "dd MM yy"; // 04 04 26s
		// String pattern = "dd MMM yy"; // 04 Apr 26
		// String pattern = "dd-MMM-yy"; // 04-Apr-26
		// String pattern = "dd-MMM-yy HH:mm:ss"; // 04-Apr-26 11:54:56
		String pattern = "dd-MMM-yy HH:mm:ss aa"; // 04-Apr-26 11:56:06 am
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
		System.out.println(sdf1.format(date));
	
	}
}

// Output:-

/*
 
Sat Apr 04 11:54:56 IST 2026
04-Apr-26 11:56:06 am
 
 */
