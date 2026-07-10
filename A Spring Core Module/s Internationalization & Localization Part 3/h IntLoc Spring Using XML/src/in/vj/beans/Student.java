package in.vj.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;
// import org.springframework.context.support.ResourceBundleMessageSource;

public class Student 
{
	private String name;
	private String country;
	private MessageSource msgSource;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public void setMsgSource(MessageSource msgSource) {
		this.msgSource = msgSource;
	}
	
	@SuppressWarnings("deprecation")
	public void disp()
	{
		Locale locale = new Locale("hi", "IN");
		String msg = msgSource.getMessage("key_message",new Object[] {name,country}, locale);
		
		System.out.println(msg);
	}
}
