package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkview {
	
	 static WebDriver driver;
	
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   
	     
	     
//	     Thread.sleep(15000);
//	     WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/span[1]/i")));
//	     JavascriptExecutor j11 = (JavascriptExecutor) driver;
//	     j11.executeScript("arguments[0].click();", until); 
		
		
		
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
        
        
        Thread.sleep(3000);
		 WebElement fav2 = driver.findElement(By.xpath("(//h6[text()=\"Workflow\"])"));
	        fav2.click();
	        
	        
	        Thread.sleep(2000);
	        WebElement fav3= driver.findElement(By.xpath("(//img[@src=\"./assets/images/dashboard/circle.svg\"])[1]"));
	        fav3.click();
        
        
        
	     
		
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
	     findElement.click();
	     findElement.sendKeys("ratter");
	     
	     Thread.sleep(1000);
	    WebElement findElement22= driver.findElement(By.xpath("(//i[@class=\"mdi mdi-eye menu-icon mdi-24px\"])[1]"));
	     findElement22.click();
	 
	     WebDriverWait wait= new WebDriverWait(driver ,15);
	     
	    WebElement until2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@role=\"textbox\"])")));
	    JavascriptExecutor j12 = (JavascriptExecutor) driver;
	    j12.executeScript("arguments[0].click();", until2);
	    until2.sendKeys("beater");
	    
	    Thread.sleep(1000);
	    WebElement findElement9 = driver.findElement(By.xpath("(//a[text()=\" Care Cards \"])"));
	    JavascriptExecutor j19 = (JavascriptExecutor) driver;
	    j19.executeScript("arguments[0].click();", findElement9); 
	    
	    
	    //carecards 
	    
	    Thread.sleep(1000);
	    WebElement findElement10 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])"));
	    findElement10.click();
	    
	    Thread.sleep(1000);
	    WebElement findElement50 = driver.findElement(By.xpath("(//div[text()=\"xervic\"])"));
	    JavascriptExecutor js48 = (JavascriptExecutor) driver;
	    js48.executeScript("arguments[0].scrollIntoView();", findElement50);
	    
	    WebElement findElement39 = driver.findElement(By.xpath("(//div[text()=\"xervic\"])"));
	    findElement39.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement2 = driver.findElement(By.xpath("(//a[text()=\" Bulletin boards \"])"));
	    findElement2.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement101 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[2]"));
	  
	    findElement101.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement501 = driver.findElement(By.xpath("(//div[text()=\"fercrt\"])"));
	    JavascriptExecutor js481 = (JavascriptExecutor) driver;
	    js481.executeScript("arguments[0].scrollIntoView();", findElement501);
	    
	    Thread.sleep(1000);
	    WebElement findElement391 = driver.findElement(By.xpath("(//div[text()=\"fercrt\"])"));
	    findElement391.click();
	    
	    Thread.sleep(1000);
	    WebElement findElement3 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[4]"));
	    findElement3.click();
	    findElement3.sendKeys("gillvan");
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement4 = driver.findElement(By.xpath("(//i[@class=\"mdi mdi-eye menu-icon text-dark\"])"));
	    findElement4.click();
	    
	    Thread.sleep(1000);
	    WebElement findElement5 = driver.findElement(By.xpath("(//span[text()=\"×\"])"));
	    findElement5.click();
	    
	    //todo
	   Thread.sleep(3000);
	   WebElement findElement6 = driver.findElement(By.xpath("(//a[text()=\" To do's \"])"));
	   findElement6.click(); 
	    
	    Thread.sleep(1000);
	    WebElement findElement104 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[3]"));
	    findElement104.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement509 = driver.findElement(By.xpath("(//div[text()=\"felican\"])"));
	    JavascriptExecutor js4812 = (JavascriptExecutor) driver;
	    js4812.executeScript("arguments[0].scrollIntoView();", findElement509);
	    
	    Thread.sleep(1000);
	    WebElement findElement393 = driver.findElement(By.xpath("(//div[text()=\"felican\"])"));
	    findElement393.click();
	    
	    //             Thread.sleep(2000);
//      WebElement findElement10 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[1]/div/div/ul/li[2]/a"));
//      findElement10.click();
//      
//      Thread.sleep(2000);
//      WebElement findElement11=  driver.findElement(By.xpath("(//td[text()=\"Stop Smoking\"])"));
//      sed.moveToElement(findElement11).click().perform();
//      String text2 = findElement11.getText();
//      System.out.println(text2);
//      String S3="Stop Smoking";
//      if(S3.equals(text2)) {
//     	 
//      }
////      
//      Thread.sleep(2000);
//      WebElement findElement12=  driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div[1]/select/option[2]"));
//     findElement12.click();            
//      
//     
//     Thread.sleep(2000);
//     WebElement findElement13=  driver.findElement(By.xpath("(//span[text()=\"Select \"])"));
//    findElement13.click();  
//    
//    Thread.sleep(2000);
//    WebElement findElement14=  driver.findElement(By.xpath("(//input[@name=\"search-text\"])"));
//   findElement14.click();
//   findElement14.sendKeys("citon");
//  
//   Thread.sleep(2000);
// WebElement finddrap= driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/ngx-select-dropdown/div/div/ul[2]/li[1]"));
//   finddrap.click();
//   
//   Thread.sleep(1000);
//   WebElement findElement15 = driver.findElement(By.xpath("(//input[@placeholder=\"Surgical Type\"])"));
//   findElement15.sendKeys("text aarea");
//   
//   Thread.sleep(2000);
//   WebElement findElement16 = driver.findElement(By.xpath("(//input[@formcontrolname=\"assigndate\"])"));
//   sed.moveToElement(findElement16).click().sendKeys("-8").perform();
//   
//   Thread.sleep(2000);
//   WebElement findElement17 = driver.findElement(By.xpath("(//input[@formcontrolname=\"overDuedate\"])"));
//   sed.moveToElement(findElement17).click().sendKeys("10").perform();
//   
//   Thread.sleep(2000);
//   WebElement findElement18 = driver.findElement(By.xpath("(//input[@formcontrolname=\"expirationdate\"])"));
//   sed.moveToElement(findElement18).click().sendKeys("91").perform();
//   
//   
//   Thread.sleep(1000);
//   WebElement findElement19 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div[9]/button"));
//   sed.moveToElement(findElement19).click().perform();
//   
//   
//   
//   Thread.sleep(2000);
//   WebElement findElement20 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[3]/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
//   sed.moveToElement(findElement20).click().sendKeys("citan").perform();
//sleep(1000);
	    WebElement findElement41 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[6]"));
	    findElement41.click();
	    findElement41.sendKeys("uppeer");
	    
	    
	   //notfication
	    Thread.sleep(1000);
        WebElement findElement7 = driver.findElement(By.xpath("(//a[text()=\" Notifications \"])"));	  
	    findElement7.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement201 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[4]"));
	    findElement201.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement609 = driver.findElement(By.xpath("(//div[text()=\"flowpad\"])"));
	    JavascriptExecutor js4912 = (JavascriptExecutor) driver;
	    js4912.executeScript("arguments[0].scrollIntoView();", findElement609);
	    
	    Thread.sleep(1000);
	    WebElement findElement398 = driver.findElement(By.xpath("(//div[text()=\"flowpad\"])"));
	    findElement398.click();
	    
//	    Thread.sleep(1000);
//	    WebElement findElement49 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[6]"));
//	    findElement49.click();
//	    findElement49.sendKeys("uppeer");
	    
	    //appoinments
	    Thread.sleep(1000);
	    WebElement findElement8 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[1]/div/div/ul/li[6]/a"));
	    findElement8.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement301 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[5]"));
	    findElement301.click();
	    
	    
	    Thread.sleep(1000);
	    WebElement findElement709 = driver.findElement(By.xpath("(//div[text()=\"caregiver\"])"));
	    JavascriptExecutor js914 = (JavascriptExecutor) driver;
	    js914.executeScript("arguments[0].scrollIntoView();", findElement709);
	    
	    Thread.sleep(1000);
	    WebElement findElement493 = driver.findElement(By.xpath("(//div[text()=\"caregiver\"])"));
	    findElement493.click();
	    
	    Thread.sleep(1000);
	    WebElement findElement51 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[10]"));
	    findElement51.click();
	    findElement51.sendKeys("peltven");
	    
	    
	    
	    
	    
	   
	    
	    
	}

}
