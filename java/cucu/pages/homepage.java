package cucu.pages;

import cucu.base.commen;

public class homepage {
	
	public static String searc="//input[@name='search-suggestions-nykaa']";
	
	public static void search() {
		
		commen.input(searc, "comb");
	}

}
