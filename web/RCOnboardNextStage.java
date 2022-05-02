package web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import jxl.read.biff.BiffException;

class RCOnboardNextStage {

	public  void test () throws InterruptedException {
		
	
	    

		WebDriver driver= new FirefoxDriver();
		driver.get("http://192.168.6.100:5050/ob-ui/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Actions fed= new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("(//input[@formcontrolname=\"userName\"])"));
		fed.moveToElement(findElement).click().sendKeys("seadmin@solvedge.in").perform();
		
	    WebElement findElement2 = driver.findElement(By.xpath("(//input[@formcontrolname=\"password\"])"));
	    fed.moveToElement(findElement2).click().sendKeys("Static~#005").perform();
		
	    driver.findElement(By.xpath("(//button[text()=\" Sign In \"])")).click();
	    Thread.sleep(2000);
	    WebElement client = driver.findElement(By.xpath("(//i[@class=\"ion-person-stalker mr-2\"])"));
	    client.click();
	    
	    Thread.sleep(3000);
	    WebElement clientsearch = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
	    fed.moveToElement(clientsearch).click().perform();
	    clientsearch.sendKeys("peterson");
	    
	    Thread.sleep(3000);
	    WebElement clientname = driver.findElement(By.xpath("(//span[text()=\"peterson\"])"));
	    clientname.click();
         
	    WebElement backtoclient = driver.findElement(By.xpath("(//button[text()=\" Back to Client List \"])"));
        backtoclient.click();
        
        Thread.sleep(5000);
        WebElement searchgrid=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
        searchgrid.click();
        searchgrid.sendKeys("peterson");
        
        
        Thread.sleep(2000);
        WebElement clientstatus = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[12]/div/span/span"));
       
        JavascriptExecutor js2= (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", clientstatus);
        
         String text = clientstatus.getText();
         System.out.println(text);
         
        
         Thread.sleep(3000);
         WebElement logout = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/app-header/header/nav/div/ul/li[2]/a/img"));
        logout.click();
        
        
        Thread.sleep(3000);
        WebElement logout2 = driver.findElement(By.xpath("(//a[@class=\"dropdown-item icon no-padding-bottom\"])"));
       logout2.click();
        
       Thread.sleep(3000);
       WebElement spsusername = driver.findElement(By.xpath("/html/body/app-root/app-loginpage/div/div/div[2]/div/div[1]/div/form/div[1]/label/input"));
       Actions ss=new Actions(driver);
       ss.moveToElement(spsusername).click().sendKeys("spsadmin@solvedge.in").perform();
        
        
       Thread.sleep(3000);
       WebElement spspassword = driver.findElement(By.xpath("(//span[text()=\"Password\"])"));
       ss.moveToElement(spspassword).click().sendKeys("Static~#005").perform();
        
       Thread.sleep(3000);
       WebElement spslogin = driver.findElement(By.xpath("(//button[text()=\" Sign In \"])"));
       spslogin.click();
       
       
       Thread.sleep(2000);
       WebElement spssearch=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
        spssearch.sendKeys("peterson");
        
        
//        
//        Thread.sleep(2000);
//        WebElement spsApprove = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[12]/div/button"));
//     JavascriptExecutor js12= (JavascriptExecutor) driver;
//     js12.executeScript("arguments[0].scrollIntoView()",spsApprove);
//     spsApprove.click();
//        
//        
//        Thread.sleep(2000);
//        WebElement spsconfirm = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[3]/button[1]"));
//        spsconfirm.click();
//        
        
        Thread.sleep(3000);
        WebElement spslogout = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/app-header/header/nav/div/ul/li[3]/a/img"));
   ss.moveToElement(spslogout).click().perform();
        
        
        Thread.sleep(3000);
        WebElement logout1 = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/app-header/header/nav/div/ul/li[3]/ul/li[6]/a"));
       ss.moveToElement(logout1).click().perform();
        
        
    
        Thread.sleep(2000);
        WebElement spsusername1 = driver.findElement(By.xpath("/html/body/app-root/app-loginpage/div/div/div[2]/div/div[1]/div/form/div[1]/label/input"));
        Actions s1s=new Actions(driver);
        s1s.moveToElement(spsusername1).click().sendKeys("seadmin@solvedge.in").perform();
         
         
        Thread.sleep(2000);
        WebElement spspassword1 = driver.findElement(By.xpath("(//span[text()=\"Password\"])"));
        ss.moveToElement(spspassword1).click().sendKeys("Static~#005").perform();
         
        Thread.sleep(3000);
        WebElement spslogin1 = driver.findElement(By.xpath("(//button[text()=\" Sign In \"])"));
        spslogin1.click();
        
        Thread.sleep(1000);
       WebElement clientname2= driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/ul/li[2]/a/span/b"));
        clientname2.click();
        
        
        Thread.sleep(2000);
        WebElement spssearch2=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
         spssearch2.sendKeys("peterson");
         
         
    
         
         Thread.sleep(3000);
         WebElement pushtoadmin = driver.findElement(By.xpath("(//p[text()=\"Push to admin\"])"));
        
         JavascriptExecutor js21= (JavascriptExecutor) driver;
         js21.executeScript("arguments[0].scrollIntoView();", pushtoadmin);
         pushtoadmin.click();
         
         
         
         Thread.sleep(1000);
         WebElement confirmpush= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[3]/dx-button/div/span"));
         ss.moveToElement(confirmpush).click().perform();
         
         
          
//admin
         
  	    Thread.sleep(5000);
  	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
  	    
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
      
//  admin end
  	    
  	    Thread.sleep(5000);
  	    WebElement Hospital = driver.findElement(By.xpath("(//h2[text()=\"Hospital\"])"));
  	    ss.moveToElement(Hospital).click().perform();
  	    
  	    
  	  Thread.sleep(5000);
	    WebElement Hospitalsearch = driver.findElement(By.xpath("(//input[@role=\"textbox\"])[1]"));
	    ss.moveToElement(Hospitalsearch).click().sendKeys("TEST HSP13").perform();
  	    
  	    
  	    
          
          
          
	    
	    
      
		
	}
	

	
	
	
	
	
	
}
