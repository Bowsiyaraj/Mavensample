package org.info;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FbLogin {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\bowsi_000\\eclipse-workspace\\MavenSample\\Excel File\\FBlogin.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sh = book.createSheet("Login");
		Row r = sh.createRow(0);
		Cell c1 = r.createCell(0);
		Cell c2 = r.createCell(1);
		c1.setCellValue("username");
		c2.setCellValue("Password");
		Row r1 = sh.createRow(1);
		Cell c3 = r1.createCell(0);
		Cell c4 = r1.createCell(1);
		c3.setCellValue("bowsiya@gmail.com");
		c4.setCellValue("B1234567@");
		FileOutputStream fin = new FileOutputStream(f);
		book.write(fin);
		System.out.println("Done");
	}
}
