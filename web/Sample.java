package web;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class Sample{
	WebDriver driver;

	 
		@BeforeTest 
	public void windowhandling() throws InterruptedException, BiffException, IOException {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.6.100:4040/rcadmin-ui/#/login");
		
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("(//input[@placeholder=\"Username\"])"));
		 
		findElement.clear();
			findElement.click();
			findElement.sendKeys("seadmin@solvedge.com");
			Thread.sleep(2000);
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@placeholder=\"Password\"])"));
			findElement2.clear();
			findElement2.click();
			findElement2.sendKeys("Demo@123");
			Thread.sleep(2000);
		    WebElement findElement3 = driver.findElement(By.xpath("(//button[@type=\"submit\"])"));
		    findElement3.click();
		    
		    
		    
		       Thread.sleep(2000);
		    WebElement findElement4 = driver.findElement(By.xpath("/html/body/app-layout1/div/app-header/nav/div[2]/div[1]/form/span[1]/div/h6"));
	        findElement4.click();
	        
	        
		       Thread.sleep(2000);
	        WebElement findElement5 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-workflow/div/div/div[1]/div/div/img"));
	        findElement5.click();
	        
	        
	        
		       Thread.sleep(2000);
	        WebElement findElement6 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
	        findElement6.sendKeys("Nephro"
	        		+ "");
	        
	        
	        
		       Thread.sleep(2000);
	        WebElement findElement7 = driver.findElement(By.xpath("(//button[text()=\"Push Workflow to OnBoard\"])[1]"));
	        Actions sed=new Actions(driver);
	        sed.moveToElement(findElement7).click().perform();	       
	        
//	       
        Thread.sleep(2000);
	        WebElement findElement8 = driver.findElement(By.xpath("(//div[text()=\" Care card is not yet ready \"])"));
findElement8.click();
	       String text = findElement8.getText();
     System.out.println(text);
	       
	   
 				       
	       
	       String s1="Care card is not yet ready";
	      
	       
	       
	       if(text.equals(s1)) { 
	    	   Thread.sleep(2000);
	    		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
	    		driver.get("http://192.168.6.200:7575/dc-ui/#/login");
	       }
	       
	     
	    		
//	    		//dclogin
//	 	       WebElement findElement101 = driver.findElement(By.xpath("(//input[@placeholder=\"Username\"])"));
//	 			findElement101.sendKeys("rcadmin@solvedge.com");
//	 			WebElement findElement201 = driver.findElement(By.xpath("(//input[@placeholder=\"Password\"])"));
//	 			findElement201.sendKeys("Demo@123");
//	 			
//	 			WebElement findElement301 = driver.findElement(By.xpath("(//button[text()=\"Login \"])"));
//	 			findElement301.click();
//	 			
//	 			
//	 			
//	 			
//	 			Thread.sleep(3000);
//	 			WebElement findElement41 = driver.findElement(By.xpath("(//input[@placeholder=\"Start typing to search...\"])"));
//	 			findElement41.sendKeys("pricles");
//	 			
//	 			
//	 			Thread.sleep(1000);
//	 			WebElement findElement51 = driver.findElement(By.xpath("(//span[text()=\" Edit\"])"));
//	 			findElement51.click();
//	 			
//	 			Thread.sleep(5000);
//	 			WebElement findElement61 = driver.findElement(By.xpath("/html/body/app-root/app-htmldocbuilder1/body/div/div/div/a[2]/em"));
//	 			Actions driv= new Actions(driver);
//	 			driv.moveToElement(findElement61).click().perform();
//	 			
//	 			Thread.sleep(1000);
//	 			WebElement findElement71 = driver.findElement(By.xpath("(//a[@placement=\"right\"])"));
//	 			driv.moveToElement(findElement71).click().perform();
//	 			
//	 			
//	 			Thread.sleep(3000);
//	 			WebElement findElement81 = driver.findElement(By.xpath("/html/body/app-root/app-htmldocbuilder1/body/div/div/div/div[3]/div/div/div/div/div/tinymce"));
//	 			driv.moveToElement(findElement81).doubleClick().sendKeys("hii team").perform();
	    	 	 
	       
	      
	       

		//dclog out	
	     
//	       
	   
	       
	       
	       
	       
	        
	        
	        
	        
	}
		
	    
	       
}
