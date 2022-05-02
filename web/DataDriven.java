package web;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	
	String[][] Rcadmin=null;
@Test
	@DataProvider(name="Rc")
	public String[][] entry() throws BiffException, IOException{
		Rcadmin=powerhouse();
	System.out.println(Rcadmin);	
		return Rcadmin;	
	}

@Test
	public String[][] powerhouse() throws BiffException, IOException {
		FileInputStream file2= new FileInputStream("/home/sudalai/Documents/reelonboard.xls");
		Workbook wb= Workbook.getWorkbook(file2);
		Sheet sheet= wb.getSheet(0);
		int rows = sheet.getRows();
	    int columns = sheet.getColumns();
	   
	    
	    String[][] testend= new String[rows-1][columns];
		for(int i=1;i<rows;i++) {
			for(int j=0;j<columns;j++) {	
			
				testend[i-1][j]=sheet.getCell(j, i).getContents();	
				System.out.println(testend[i][j]);
			}
			
		}
		
		return testend;

		
	}


}
