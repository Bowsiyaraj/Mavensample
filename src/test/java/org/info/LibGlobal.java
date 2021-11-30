package org.info;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert a1;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	public static void maxbrowser() {
		driver.manage().window().maximize();
		
	}
	public static void loadurl(String url) {
		driver.get(url);
		
	}
	public static void printtitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	public static void totext(WebElement element,String name) {
		element.sendKeys(name);
		
	}
	public static void btnclick(WebElement element) {
		element.click();
		
	}
	public static void printGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void performMovetoElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
		
	}
	public static void performDragandDrop(WebElement src,WebElement desnt) {
		a.dragAndDrop(src, desnt).perform();
	}
	public static void toperformDoubleClick(WebElement element) {
		a.doubleClick(element);
	}
	public static void toPerformRightClick(WebElement element) {
		a.contextClick(element);
	}
	public static void toPerformEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void toperformDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void toPerformSimpleAlert() {
		a1=driver.switchTo().alert();
		a1.accept();
	}
	public static void toPerformConfirmAlert() {
		a1.dismiss();
	}
	public static void toPerformPromptAlert(WebElement element,String text) {
		a1=driver.switchTo().alert();
		a1.sendKeys(text);
	}
	public static void replacementofSendkeys(WebElement element,String text) {
		js.executeScript("arguments[0].setAttribute('value','text')", element);
	}
	public static void replacementGetAttribute(WebElement element) {
		Object o=js.executeScript("returm arguments[0].getAttribute('value')", element);
		String s=(String)o;
		System.out.println(s);
	}
	public static void replacementofClick(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}
	public static void toPerformScreenshot() {
		ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
	}
	public static void toPerformScrollDown(WebElement element) {
		js.executeScript("arguments[0].ScrollIntoView('true')", element);
	}
	public static void toPerformScrollUp(WebElement element) {
		js.executeScript("argument[0].ScrollIntoView('false')", element);
	}
	public static void toPerformFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void toPerformWindows(String text) {
		driver.switchTo().window(text);
	}
	public static void toPerformSelect(WebElement element,int a) {
		s=new Select(element);
		s.selectByIndex(a);
	}
	public static String excelRead(String sheetName,int rowNo,int cellNo) throws IOException {
		File f=new File("C:\\Users\\bowsi_000\\eclipse-workspace\\MavenSample\\Excel File\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(sheetName);
		Sheet sh = book.getSheet(sheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name ="";
		if (type==1) {
			name=c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)){
			Date dd = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM,yyyy");
			 name = sim.format(dd);
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
		  name = String.valueOf(1);
		}
		return name;
		}
	

}
