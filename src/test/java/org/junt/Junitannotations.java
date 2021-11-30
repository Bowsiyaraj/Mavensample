package org.junt;

import org.info.LibGlobal;
import org.info.Loginpojo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junitannotations extends LibGlobal {

	public static WebDriver driver;
	@Before
	public void launch() {
		System.out.println("browser Launch");
		

	}
	@After
	public void quit() {
		System.out.println("quit browser");
	
	}
	@Test
	public void tc1() {
		driver.findElement(By.id("email")).sendKeys("bowsiyaraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("544656533");
		driver.findElement(By.name("login")).click();
	}
		
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		

	}
	
}
