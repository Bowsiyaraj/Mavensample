package org.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends LibGlobal {

	public Loginpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement textEmail;
	@FindBy(id="password")
	private WebElement textPass;
	@FindBy(id="login")
	private WebElement btnlogin;
	
	public WebElement gettextEmail() {
		return textEmail;
	}
	public WebElement gettextPass() {
		return textPass;
	}
	public WebElement getbtnlogin() {
		return btnlogin;
	}
	
	
}
