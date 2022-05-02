package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Retest {
	public static void main(String[] args) throws IOException {
		File file =    new File("/home/sudalai/Documents/intpart2.xls");
		FileInputStream inputStream = new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		HSSFSheet sheet = wb.getSheet("Array");
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell = row.getCell(3);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
	}
}
