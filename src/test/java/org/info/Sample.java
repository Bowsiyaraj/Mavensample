package org.info;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample{
	
	@Before
	public void launch() {
		System.out.println("Bowsiya");
	}
	@After
	public void quit() {
		System.out.println("no");
	}
	@Test
	public void tc1() {
		System.out.println("done");
	}
	
	
		
	
}
