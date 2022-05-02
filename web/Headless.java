package web;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.tools.xjc.Driver;


import web.DCLogin;

public class Headless  {
	WebDriver driver;
@Test
	public  void dec() throws InterruptedException {
		
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
		
		
		WebElement findElement4 = driver.findElement(By.xpath("(//input[@placeholder=\"Start typing to search...\"])"));
		findElement4.click();
		
		WebElement findElement5 = driver.findElement(By.xpath("(//input[@type=\"radio\"])"));
		Actions des= new Actions(driver);
		des.moveToElement(findElement5).click().perform();
		
		WebElement findElement6 = driver.findElement(By.xpath("(//span[@style=\"float:right !important;padding-right:4px\"])"));
		des.moveToElement(findElement6).click().perform();
		
		WebElement findElement7 = driver.findElement(By.xpath("(//div[text()=\"Approved\"])"));
		des.moveToElement(findElement7).click().perform();
		
		WebElement findElement8 = driver.findElement(By.xpath("(//span[text()=\" Approved \"])"));
		des.moveToElement(findElement8).click().perform();
		
		
		WebElement findElement9 = driver.findElement(By.xpath("(//button[text()=\"Search\"])"));
		findElement9.click();
		
		WebElement findElement9i	 = driver.findElement(By.xpath("//*[@id=\"button-alignment\"]"));
		findElement9i.sendKeys("martes");
		
		WebElement findElement9i2 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-dashboardview/div/div/div[1]/div/em"));
		findElement9i2.click();
		
		
		
		
		
		
		WebElement findElement10 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-dashboardview/div/div/div[3]/div/div/ul/li/a/div[4]/span[2]/img"));
		findElement10.click();
		
		WebElement findElement11 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-share/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[6]"));
		findElement11.click();
		
		WebElement findElement12=	driver.findElement(By.xpath("//*[@id=\"button-alignment\"]"));
		findElement12.click();
		findElement12.sendKeys("martes");
		
		WebElement findElement13 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-share/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/span"));
		findElement13.click();
		
		
		WebElement findElement14 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-myallotmentsubmit/div/div/div[1]/div/div/div[2]/div[1]/div/input"));
		des.moveToElement(findElement14).doubleClick().sendKeys("02/15/2022").perform();
		
	
        Thread.sleep(2000);
        WebElement findElement15 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-myallotmentsubmit/div/div/div[1]/div/div/div[2]/div[1]/div/select[1]/option[17]"));
        findElement15.click();
        
        Thread.sleep(2000);
        WebElement findElement16 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-myallotmentsubmit/div/div/div[1]/div/div/div[2]/div[1]/div/select[2]/option[4]"));
        findElement16.click();
         
		
        Thread.sleep(1000);
        WebElement findElement17 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-myallotmentsubmit/div/div/div[2]/div/div/div[2]/button[1]"));
        findElement17.click();
   
        
        WebElement findElement18 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/div/button[1]"));
        findElement18.click();
        
		
		
		
		
		
		
		
//		WebElement findElement4 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/header/nav/div/app-navigation/div/div/div[1]/div/ul/li[2]/div/div/img"));
//	    findElement4.click();
//	    
//	    WebElement findElement5 = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/header/nav/div/app-navigation/div/div/div[1]/div/ul/li[2]/div/div[2]/div/ul/li[3]/a/img"));
//	    findElement5.click();
//	    
//		WebElement findElement4i = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/header/nav/div/app-navigation/div/div/div[1]/div/ul/li[2]/div/div/img"));
//	    findElement4i.click();
//	
	}



}
