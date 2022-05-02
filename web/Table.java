package web;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.leafground.com/"
			+ "");

	WebElement findElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/h5"));
	findElement.click();
	
	
	Thread.sleep(2000);
	WebElement find = driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
	boolean enabled = find.isEnabled();
	
//	boolean enabled = find.isEnabled();
//	System.out.println(enabled);
    
//    
//    
//    
//    
//    

}

}
