package com.ak.local;

import java.util.Locale;

public class I18 {

	
	public static void main(String[] args) {
		Locale local1=new Locale("en","US");
		Locale local2=new Locale("fr","FR");
		Locale local3 = Locale.getDefault();
		System.out.println("Langauge : "+local1.toString());
		System.out.println("Langauge : "+local2.toString());
		System.out.println("Langauge : "+local3.toString());
		
		String language = local1.getLanguage(); // Returns "en"
		String country = local1.getCountry(); // Returns "US"
		String displayName = local1.getDisplayName(); // Returns "English (United States)
		
		System.out.println(language);
		System.out.println(country);
		System.out.println(displayName);
		
		String language3 = local3.getLanguage(); // Returns "en"
		String country3 = local3.getCountry(); // Returns "US"
		String displayName3 = local3.getDisplayName(); // Returns "English (United States)
		
		System.out.println(language3);
		System.out.println(country3);
		System.out.println(displayName3);
	}
}
