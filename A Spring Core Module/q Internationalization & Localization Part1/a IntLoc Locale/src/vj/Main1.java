package vj;

import java.util.Locale;

public class Main1 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		Locale locale = Locale.getDefault();
		
		System.out.println("Default locale: " + locale);
		System.out.println("Country Name: "+ locale.getDisplayCountry());
		System.out.println("Country Code: "+ locale.getCountry());
		System.out.println("Country Language: "+ locale.getDisplayLanguage());
		System.out.println("Language Code: "+ locale.getLanguage());
		
		System.out.println("---------------------------------------------------");
		
		Locale l2 = new Locale("fr","FR");
		System.out.println("Provided locale: "+ l2);
		System.out.println("Country Name: "+ l2.getDisplayCountry());
		System.out.println("Country Code: "+ l2.getCountry());
		System.out.println("Country Language: "+ l2.getDisplayLanguage());
		System.out.println("Language Code: "+ l2.getLanguage());
	}
}

// Output:-

/*

Default locale: en_IN
Country Name: India
Country Code: IN
Country Language: English
Language Code: en
---------------------------------------------------
Provided locale: fr_FR
Country Name: France
Country Code: FR
Country Language: French
Language Code: fr

*/
