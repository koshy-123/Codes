package web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testlaf {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img")).click();
	Thread.sleep(2000);
//WebElement findElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
// Actions fed= new Actions(driver);
// fed.moveToElement(findElement).doubleClick().perform();
// String text = findElement.getText();
// System.out.println(text);
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.cssSelector("div.example:nth-child(7) > div:nth-child(1) > div:nth-child(1) > input:nth-child(3)"));
 findElement.click();
 
  String attribute = findElement.getAttribute("name");
System.out.println(attribute);
    
	
}

}
