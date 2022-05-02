package Real;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RCOnboardNextStage {

static WebDriver driver;

	
	String[][] Rcadmin=null;
		
		@DataProvider(name="Rc")
		public String[][] entry() throws BiffException, IOException{
			Rcadmin=powerhouse();
		System.out.println(Rcadmin);	
			return Rcadmin;	
		}
		
		
		public String[][] powerhouse() throws BiffException, IOException {
			FileInputStream file2= new FileInputStream("/home/sudalai/Documents/finalrc.xls");
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
		driver.get("http://192.168.6.100:5050/ob-ui/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    Actions fed= new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("(//input[@formcontrolname=\"userName\"])"));
		fed.moveToElement(findElement).click().sendKeys("seadmin@solvedge.in").perform();
		
	    WebElement findElement2 = driver.findElement(By.xpath("(//input[@formcontrolname=\"password\"])"));
	    fed.moveToElement(findElement2).click().sendKeys("Static~#006").perform();
		
	    driver.findElement(By.xpath("(//button[text()=\" Sign In \"])")).click();
	    
		}
//		
//		@AfterTest	
//		 public void aftertst() {
//		 driver.close();
//			 
//		 }
//		
	@Test(dataProvider="Rc")
		public void Config(CharSequence name1, CharSequence name2, CharSequence name3, CharSequence name4, CharSequence name5) throws InterruptedException, AWTException {// stage 1
	  	    
		
		Actions fed2= new Actions(driver);
		
		Thread.sleep(2000);
	    WebElement client = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/ul/li[2]/a/span/b"));
	    client.click();
	    
	    Thread.sleep(3000);
	    WebElement clientsearch = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
	    fed2.moveToElement(clientsearch).click().perform();
	    clientsearch.sendKeys(name1);
	    
	    Thread.sleep(2000);
	    WebElement clientname = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/a"));
	    clientname.click();
	    
	    
	    Thread.sleep(2000);
	    WebElement submittoric = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-home/div[1]/div[4]/button"));
        
	 	 JavascriptExecutor j2 = (JavascriptExecutor) driver;
       	 j2.executeScript("arguments[0].click();", submittoric);

        Thread.sleep(2000);
     WebElement okay=   driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[3]/button[1]"));
        okay.click();
//        
        Actions sel= new Actions(driver);
//     
    Thread.sleep(2000);
    WebElement backtoclient = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/div/div/div/div/div/button[2]"));
      
       sel.moveToElement(backtoclient).click().perform();
        
        
        Thread.sleep(2000);
        WebElement searchgrid=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
        searchgrid.click();
        searchgrid.sendKeys(name2);
        
 
        Thread.sleep(2000);
        WebElement clientstatus = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[12]/div/span/span"));
       
        JavascriptExecutor js2= (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", clientstatus);
        
         String text = clientstatus.getText();
         System.out.println(text);
         
//         Thread.sleep(2000);
//WebElement Launch = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[11]/div/button"));
//        Launch.click();
//        
        
         Thread.sleep(2000);
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
        spssearch.sendKeys(name3);
        
        
      
      Thread.sleep(2000);
      WebElement spsApprove = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[12]/div/button"));
   JavascriptExecutor js12= (JavascriptExecutor) driver;
   js12.executeScript("arguments[0].scrollIntoView()",spsApprove);
   spsApprove.click();
      
      
      Thread.sleep(2000);
      WebElement spsconfirm = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[3]/div/div/div[3]/button[1]"));
      spsconfirm.click();
      
      
      Thread.sleep(4000);
      WebElement spslogout = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/app-header/header/nav/div/ul/li[3]/a/img"));
 ss.moveToElement(spslogout).click().perform();
      
      
      Thread.sleep(4000);
      WebElement logout1 = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/app-header/header/nav/div/ul/li[3]/ul/li[6]/a"));
     ss.moveToElement(logout1).click().perform();
      
      
  
      Thread.sleep(2000);
      WebElement spsusername1 = driver.findElement(By.xpath("/html/body/app-root/app-loginpage/div/div/div[2]/div/div[1]/div/form/div[1]/label/input"));
      Actions s1s=new Actions(driver);
      s1s.moveToElement(spsusername1).click().sendKeys("seadmin@solvedge.in").perform();
       
       
      Thread.sleep(2000);
      WebElement spspassword1 = driver.findElement(By.xpath("(//span[text()=\"Password\"])"));
      ss.moveToElement(spspassword1).click().sendKeys("Static~#006").perform();
       
      Thread.sleep(3000);
      WebElement spslogin1 = driver.findElement(By.xpath("(//button[text()=\" Sign In \"])"));
      spslogin1.click();
      
      Thread.sleep(1000);
     WebElement clientname2= driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/ul/li[2]/a/span/b"));
      clientname2.click();
      
      
      Thread.sleep(2000);
      WebElement spssearch2=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
       spssearch2.sendKeys(name4);
       
       
  
       
       Thread.sleep(3000);
       WebElement pushtoadmin = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[11]/div/p"));
      
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
    
//admin end
    
    Thread.sleep(2000);
    WebElement practice = driver.findElement(By.xpath("(//h2[text()=\"Practice\"])"));
    ss.moveToElement(practice).click().perform();
    

    Thread.sleep(2000);
    WebElement pracsearch = driver.findElement(By.xpath("(//input[@role=\"textbox\"])[1]"));
    pracsearch.sendKeys(name5);
    
    Thread.sleep(2000);
    WebElement get = driver.findElement(By.xpath("(//td[@role=\"gridcell\"])[4]"));
    String text2 = get.getText();
    System.out.println(text2);
   
    
    if(text2.contentEquals(name5))
    {
    	 Thread.sleep(3000);
  	   WebElement lastpush = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow/div/div/div/div/div/div/div[1]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div/button/span"));
          ss.moveToElement(lastpush).click().perform();
          
          Thread.sleep(2000);
          WebElement finalpush = driver.findElement(By.xpath("/html/body/modal-container/div/div/div[3]/button[1]"));
    finalpush.click();
    }   
    else {
    
    
    	WebElement back = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow/div/button"));
    back.click();
      
    
	    
	    Thread.sleep(3000);
	    WebElement Hospital = driver.findElement(By.xpath("(//h2[text()=\"Hospital\"])"));
	    ss.moveToElement(Hospital).click().perform();
	    
	    
	   Thread.sleep(3000);
	   WebElement Hospitalsearch =  driver.findElement(By.xpath("(//input[@role=\"textbox\"])[1]")); 
			   ss.moveToElement(Hospitalsearch).click().sendKeys(name5).perform();
	   
	   
        
        
        
	   Thread.sleep(3000);
	   WebElement lastpush = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow/div/div/div/div/div/div/div[1]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div/button/span"));
        ss.moveToElement(lastpush).click().perform();
        
        Thread.sleep(2000);
        WebElement finalpush = driver.findElement(By.xpath("/html/body/modal-container/div/div/div[3]/button[1]"));
  finalpush.click();
  
  
  
 
        
      
    }
        
        
        
         
		
	}
}

