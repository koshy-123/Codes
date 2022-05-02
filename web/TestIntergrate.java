package web;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestIntergrate {
	static WebDriver driver;
	
	String[][] Rcadmin=null;
	
	@DataProvider(name="Rc")
	public String[][] entry() throws BiffException, IOException{
		Rcadmin=powerhouse();
	System.out.println(Rcadmin);	
		return Rcadmin;	
	}
	
	
	public String[][] powerhouse() throws BiffException, IOException {
		FileInputStream file2= new FileInputStream("/home/sudalai/Documents/loadtest.xls");
		Workbook wb= Workbook.getWorkbook(file2);
		Sheet sheet= wb.getSheet(0);
		int rows = sheet.getRows();
	    int columns = sheet.getColumns();
	   
	    
	    String[][] testend= new String[rows-1][columns];
		for(int i=1;i<rows;i++) {
			for(int j=0;j<columns;j++) {	
			
				testend[i-1][j]=sheet.getCell(j, i).getContents();	
				
			}
			
		}
		
		return testend;
	
		
	}
	
@BeforeTest
	public void beforetest() throws InterruptedException {
	
	driver= new FirefoxDriver();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://192.168.6.100:4040/rcadmin-ui/#/login");
	WebElement find = driver.findElement(By.xpath("(//input[@id=\"exampleInputEmail1\"])"));
	find.click();
	find.clear();
	find.sendKeys("seadmin@solvedge.com");
	
	
	WebElement fav=driver.findElement(By.xpath("(//input[@id=\"exampleInputPassword1\"])"));
	fav.click();
	fav.clear();
    fav.sendKeys("Demo@123");
    Thread.sleep(2000);
    WebElement fav1=driver.findElement(By.xpath("(//button[@class=\"btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn\"])"));
    fav1.click();
    
      
	}
//	
//	@AfterTest	
//	 public void aftertst() {
//	 driver.close();
//		 
//	 }
//	
@Test(dataProvider="Rc")
	public void Config() throws InterruptedException, AWTException {// stage 1

}
}
