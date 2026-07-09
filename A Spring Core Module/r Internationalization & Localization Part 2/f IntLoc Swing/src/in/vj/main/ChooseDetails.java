package in.vj.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class ChooseDetails 
{
	@SuppressWarnings("deprecation")
	public static void localeDetails(String languageCode, String countryCode)
	{
		Locale locale = new Locale(languageCode,countryCode);
		ResourceBundle rb = ResourceBundle.getBundle("in/vj/resources/MessageBundle", locale);
		String key_login_title = rb.getString("key_login_title");
		String key_email_title = rb.getString("key_email_title");
		String key_pass_title = rb.getString("key_pass_title");
		String key_login_btn = rb.getString("key_login_btn");

		new LoggingFrame(key_login_title, key_email_title, key_pass_title, key_login_btn);
	}

	
}
