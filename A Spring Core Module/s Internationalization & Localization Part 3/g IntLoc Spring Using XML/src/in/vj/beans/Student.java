package in.vj.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;
// import org.springframework.context.support.ResourceBundleMessageSource;

public class Student 
{
	
	private MessageSource msgSource;
	
	public void setMsgSource(MessageSource msgSource) {
		this.msgSource = msgSource;
	}

	
	@SuppressWarnings("deprecation")
	public void disp()
	{
		Locale locale = new Locale("hi", "IN");
		String msg = msgSource.getMessage("key_message",null, locale);
		
		System.out.println(msg);
	}
}
