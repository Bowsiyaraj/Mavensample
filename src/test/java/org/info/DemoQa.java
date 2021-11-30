package org.info;

public class DemoQa extends LibGlobal{

	public static void main(String[] args) {
		launchBrowser();
		loadurl("https://demoqa.com/automation-practice-form");
		maxbrowser();
		printtitle();
		currenturl();
		DemoqaPojo dp =new DemoqaPojo();
		totext(dp.getfirstname(), "Rose");
		totext(dp.getlastname(), "Marry");
		totext(dp.getuseremail(), "rosemarry@gmail.com");
		btnclick(dp.getgender());
		totext(dp.getusernumber(), "6634424323");
		//btnclick(dp.gethobbies());
		totext(dp.getaddress(), "1/16,main road");
		btnclick(dp.getstate());
		btnclick(dp.getsubmit());
		
	}
}
	
	
