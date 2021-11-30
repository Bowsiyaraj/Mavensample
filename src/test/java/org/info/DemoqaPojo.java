package org.info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPojo extends LibGlobal{

	public DemoqaPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	private WebElement firstname;
	@FindBy(id="lastName")
	private WebElement lastname;
	@FindBy(id="userEmail")
	private WebElement useremail;
	@FindBy(xpath ="//label[text()='Female']")
	private WebElement gender;
	@FindBy(id="userNumber")
	private WebElement usernumber;
	//@FindBy(xpath="//label[text()='Music']")
	//private WebElement hobbies;
	@FindBy(id="currentAddress")
	private WebElement address;
	@FindBy(xpath ="//div[text()='Select State']")
	private WebElement state;
	@FindBy(id="submit")
	private WebElement submit;
	
	
	public WebElement getfirstname() {
		return firstname;
	}
	public WebElement getlastname() {
		return lastname;
	}
	public WebElement getuseremail() {
		return useremail;
	}
	public WebElement getgender() {
		return gender;
	}
	public WebElement getusernumber() {
		return usernumber;
	}
	//public WebElement gethobbies() {
		//return hobbies;
	//}
	public WebElement getaddress() {
		return address;
	}
	public WebElement getstate() {
		return state;
	}
	public WebElement getsubmit() {
		return submit;
	}
}
