package in.vj.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Locale locale = new Locale("en","US");
		Locale locale2 = new Locale("hi","IN");
		Locale locale3 = new Locale("fr","FR");
		
		ResourceBundle rb = ResourceBundle.getBundle("in/vj/resources/MessageBundle", locale);
		String msg = rb.getString("key_greet");
		System.out.println(msg);
		
		ResourceBundle rb2 = ResourceBundle.getBundle("in/vj/resources/MessageBundle", locale2);
		String msg2 = rb2.getString("key_greet");
		System.out.println(msg2);
		
		ResourceBundle rb3 = ResourceBundle.getBundle("in/vj/resources/MessageBundle", locale3);
		String msg3 = rb3.getString("key_greet");
		System.out.println(msg3);
	}

}

// Output:-

/*
 
Hello, how are you?
नमस्ते, आप कैसे हैं?
Bonjour comment allez-vous?

*/
