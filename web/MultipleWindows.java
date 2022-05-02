package web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	

@Test
public void Change() throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
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
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
	  driver.get("http://192.168.6.200:7575/dc-ui/#/login");
	  
	 
	    Thread.sleep(2000);
	    
	    
	    WebElement findElement4=driver.findElement(By.xpath("(//input[@placeholder=\"Username\"])"));
	    findElement4.sendKeys("rcadmin@solvedge.com");
	    
	    WebElement findElement5=    driver.findElement(By.xpath("(//input[@placeholder=\"Password\"])"));
	    findElement5.sendKeys("Demo@123");
	    
	    driver.findElement(By.xpath("(//button[@type=\"submit\"])")).click();
	    
	    
	    
	    driver.close();
	    
	    
	    
	}
}
	


