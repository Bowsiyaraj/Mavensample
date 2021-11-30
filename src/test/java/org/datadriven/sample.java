package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\bowsi_000\\eclipse-workspace\\MavenSample\\Excel File\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book =new XSSFWorkbook(fin);
		Sheet sh=book.getSheet("sheet1");
		Row r = sh.getRow(9);
		Cell c = r.getCell(0);
		Cell c1 = r.getCell(1);
		Cell c2 = r.getCell(2);
		c.setCellValue("13");
		c1.setCellValue("sureka");
		c2.setCellValue("Java");
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);
		System.out.println("done");
		
		
	}
}
