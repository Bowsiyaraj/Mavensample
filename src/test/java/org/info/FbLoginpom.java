package org.info;

public class FbLoginpom extends LibGlobal{

	public static void main(String[] args) {
		launchBrowser();
		loadurl("https://en-gb.facebook.com/");
		maxbrowser();
		printtitle();
		currenturl();
		FbPojo p =new FbPojo();
		totext(p.gettxtEmail(), "blue");
		totext(p.gettxtPass(), "@1234567890");
		btnclick(p.getbtnclick());
	}
}
