package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


	
	

	import java.awt.AWTException;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class DCLogin {
		static WebDriver driver;

		
		
		String[][] Rcadmin=null;
			
			@DataProvider(name="Rc")
			public String[][] entry() throws BiffException, IOException{
				Rcadmin=powerhouse();
			System.out.println(Rcadmin);	
				return Rcadmin;	
			}
			
			
			public String[][] powerhouse() throws BiffException, IOException {
				FileInputStream file2= new FileInputStream("/home/sudalai/Documents/DCDOC.xls");
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
			
driver =new FirefoxDriver();
			
			driver.get("http://192.168.6.200:7575/dc-ui/#/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement findElement = driver.findElement(By.xpath("(//input[@placeholder=\"Username\"])"));
			findElement.sendKeys("rcadmin@solvedge.com");
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@placeholder=\"Password\"])"));
			findElement2.sendKeys("Demo@123");
			
			WebElement findElement3 = driver.findElement(By.xpath("(//button[text()=\"Login \"])"));
			findElement3.click();
			
	        
	      
	        
	          
			}
//			
//			@AfterTest	
//			 public void aftertst() {
//			 driver.close();
//				 
//			 }
//			
		@Test(dataProvider="Rc")
			public void Config(CharSequence DcSearch, CharSequence DcText, CharSequence createSubject, CharSequence createDescription, CharSequence InboxSearch, CharSequence LibarySearch, CharSequence EffectiveDate, String EffectiveHours, String Effectivemins) throws InterruptedException {
			

			Thread.sleep(1000);
			WebElement findElement4 = driver.findElement(By.xpath("(//input[@placeholder=\"Start typing to search...\"])"));
			findElement4.sendKeys(DcSearch);
			
			
			Thread.sleep(1000);
			WebElement findElement5 = driver.findElement(By.xpath("(//span[text()=\" Edit\"])"));
			findElement5.click();
			
			Thread.sleep(5000);
			WebElement findElement6 = driver.findElement(By.xpath("/html/body/app-root/app-htmldocbuilder1/body/div/div/div/a[2]/em"));
			Actions driv= new Actions(driver);
			driv.moveToElement(findElement6).click().perform();
			
			Thread.sleep(1000);
			WebElement findElement7 = driver.findElement(By.xpath("(//a[@placement=\"right\"])"));
			driv.moveToElement(findElement7).click().perform();
			
			
			Thread.sleep(3000);
			WebElement findElement8 = driver.findElement(By.xpath("/html/body/app-root/app-htmldocbuilder1/body/div/div/div/div[3]/div/div/div/div/div/tinymce"));
			driv.moveToElement(findElement8).doubleClick().sendKeys(DcText).perform();
			
			Thread.sleep(1000);
			WebElement findElement9 = driver.findElement(By.xpath("(//button[text()=\"Save\"])"));
		    findElement9.click();
		    
	 
		    Thread.sleep(1000);
			WebElement findElement10 = driver.findElement(By.xpath("(//img[@tooltip=\"Share\"])"));
		    findElement10.click();

		   
		    Thread.sleep(1000);
		 		WebElement findElement11 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Subject title\"])"));
		 	    findElement11.click();
		 	    findElement11.sendKeys(createSubject);
		 	    
		 	    
		 	   Thread.sleep(2000);
		 	    WebElement findElement12 = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[2]"));
		 	    findElement12.click();
		 	 
	          
	          Thread.sleep(2000);
	          WebElement findElement14=driver.findElement(By.xpath("(//div[text()=\"High Priority\"])"));
	          findElement14.click();
	                
	          //assign
	          
	          Thread.sleep(2000);
		 	    WebElement findElement15 = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[3]"));
		 	    findElement15.click();
		 	    
		 	    
	        Thread.sleep(2000);
	        WebElement findElement17=driver.findElement(By.xpath("(//div[text()=\"Approval\"])"));
	        findElement17.click();
	        
	        
	        Thread.sleep(2000);
	        WebElement findElement18 = driver.findElement(By.xpath("(//div[@class=\"ql-editor ql-blank dx-htmleditor-content\"])"));
	           findElement18.click();
	           findElement18.sendKeys(createDescription);
	          
	       Thread.sleep(2000);
	       WebElement findElement182 = driver.findElement(By.xpath("(//a[@class=\"kit__utils__avatarGroupAdd\"])"));
	           findElement182.click();
	                      
	           Thread.sleep(2000);
	           WebElement findElement183 = driver.findElement(By.xpath("(//div[@id=\"profileImage\"])[8]"));
	               findElement183.click();
	               

	               Thread.sleep(2000);
	               WebElement findElement184 = driver.findElement(By.xpath("(//a[text()=\"Add\"])"));
	                   findElement184.click();
	                           
	                   
	           Thread.sleep(2000);
	           WebElement findElement19 = driver.findElement(By.xpath("(//button[@type=\"submit\"])"));
	           findElement19.click();
	           
	          
	           Thread.sleep(2000);
	           WebElement findElement191 = driver.findElement(By.xpath("(//div[text()=\" Inbox \"])"));
	           findElement191.click();
	           
	           
	           Thread.sleep(2000);
	           WebElement findElement192 = driver.findElement(By.xpath("(//input[@id=\"button-alignment\"])"));
	           findElement192.click();
	           findElement192.sendKeys(InboxSearch);
	           
	           Thread.sleep(2000);
	           WebElement findElement193 = driver.findElement(By.xpath("(//i[@style=\" font-size: large;cursor: pointer;\"])"));
	           findElement193.click();
	           
	           Thread.sleep(2000);
	           WebElement findElement194 = driver.findElement(By.xpath("(//a[text()=\"View material\"])"));
	           findElement194.click();
	          
	           
	           Thread.sleep(2000);
	           WebElement findElement195 = driver.findElement(By.xpath("(//img[@tooltip=\"Share\"])"));
	           findElement195.click();
	           
	           
	           Thread.sleep(2000);
	           WebElement findElement196 = driver.findElement(By.xpath("(//input[@role=\"combobox\"])"));
	           findElement196.click();
	           
	           
	           Thread.sleep(2000);
	           WebElement findElement197 = driver.findElement(By.xpath("(//div[text()=\"Approval\"])"));
	           findElement197.click();
	           
	           
	           Thread.sleep(2000);
	           WebElement findElement198 = driver.findElement(By.xpath("(//button[text()=\"Submit\"])"));
	           findElement198.click();
	           
	           
	           
	           
	           
	           Thread.sleep(2000);
	           WebElement findElement20 = driver.findElement(By.xpath("(//div[text()=\" Library \"])"));
	           findElement20.click();
	           
	           Thread.sleep(2000);
	           WebElement findElement21 = driver.findElement(By.xpath("(//input[@id=\"button-alignment\"])"));
	           findElement21.click();
	           findElement21.sendKeys(LibarySearch);
	           
	           
	           Thread.sleep(1000);
	           WebElement findElement22 = driver.findElement(By.xpath("(//span[text()=\"Publish\"])"));
	           findElement22.click();
	           
	           Thread.sleep(1000);
	           WebElement findElement23 = driver.findElement(By.xpath("(//input[@placeholder=\"MM/DD/YYYY\"])"));
	           driv.moveToElement(findElement23).doubleClick().sendKeys(EffectiveDate).perform();
	           Thread.sleep(2000);
	           
	           WebElement findElement151 = driver.findElement(By.xpath(EffectiveHours));
	           findElement151.click();
	           
	           Thread.sleep(2000);
	           WebElement findElement16 = driver.findElement(By.xpath(Effectivemins));
	           findElement16.click();
	            
	   		
	           Thread.sleep(1000);
	           WebElement findElement171 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-myallotmentsubmit/div/div/div[2]/div/div/div[2]/button[1]"));
	           findElement171.click();
	   		
	           
	           
	           Thread.sleep(1000);
	           WebElement findElement242 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/button[1]"));
	           findElement242.click();      
		}
	

	
	
	
	
		
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
          
      
           
//           
//           Thread.sleep(1000);
//           WebElement findElement20 = driver.findElement(By.xpath("(//div[text()=\" Approved \"])"));
//           findElement20.click();
//           
           
           
           
  
	
	
	

}

