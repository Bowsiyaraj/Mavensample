package org.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends LibGlobal {

	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(name="login")
	private WebElement btnclick;
	public WebElement gettxtEmail() {
		return txtEmail;
	}
	public WebElement gettxtPass() {
		return txtPass;
	}
	public WebElement getbtnclick() {
		return btnclick;

	}
	
}
