package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Wf {
static WebDriver driver;
	
	
	String[][] Rcadmin=null;
		
		@DataProvider(name="Rc")
		public String[][] entry() throws BiffException, IOException{
			Rcadmin=powerhouse();
		System.out.println(Rcadmin);	
			return Rcadmin;
			
		}
		
		public String[][] powerhouse() throws BiffException, IOException {
			FileInputStream file2= new FileInputStream("/home/sudalai/Documents/bringWorkflow.xls");
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
//		 @AfterTest
//		 public void aftertst() {
//		 driver.close();	 
//		 }
		
	
	@Test(dataProvider="Rc")
		public void workflow(String dropone, String droptwo, String dropthree, String dropfour, CharSequence stages, CharSequence carecard, CharSequence bulletin, CharSequence ToDO, CharSequence Notification, CharSequence appoinment, CharSequence descriptionwf, CharSequence workflowname, CharSequence searchbox, CharSequence stageslogic, String CareCardlogic, String bulletindrop, CharSequence bulletinsearch, String tododrop, CharSequence todosearch, String notifdrop, CharSequence notisearch, String appoindrop, CharSequence appoinsearch) throws InterruptedException {
	     
		Thread.sleep(3000);
		 WebElement fav2 = driver.findElement(By.xpath("(//h6[text()=\"Workflow\"])"));
	        fav2.click();
	        
	        
	        Thread.sleep(2000);
	        WebElement fav3= driver.findElement(By.xpath("(//img[@src=\"./assets/images/dashboard/circle.svg\"])[1]"));
	        fav3.click();
	        
	        Thread.sleep(2000);
	         WebElement fav4 = driver.findElement(By.xpath("(//div[@title=\"Add New Workflow\"])"));
	        fav4.click();
	        
	        //1specs
	
	        Thread.sleep(1000);
	        WebElement findElement = driver.findElement(By.xpath("(//input[@role=\"combobox\"])"));
            findElement.click();
            
            
            Thread.sleep(1000);
            WebElement findElement2 = driver.findElement(By.xpath(dropone));
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].scrollIntoView();", findElement2);
            
            WebElement findElement21 = driver.findElement(By.xpath(dropone));
            findElement21.click();
            
          //2ndservline
            
            Thread.sleep(1000);
	        WebElement findElement3 = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[2]"));
            findElement3.click();
            
            
            Thread.sleep(1000);
            WebElement findElement4 = driver.findElement(By.xpath(droptwo));
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("arguments[0].scrollIntoView();", findElement4);
            
            WebElement findElement31 = driver.findElement(By.xpath(droptwo));
            findElement31.click();
            
            //2nd
            
            //3rdprocedure
            
            
            Thread.sleep(1000);
           WebElement find= driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[2]/mat-step-header/div[3]/div"));
            find.click();
           
           Thread.sleep(1000);
	        WebElement findElement5 = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[3]"));
            findElement5.click();
            
            
            Thread.sleep(1000);
            WebElement findElement41 = driver.findElement(By.xpath(dropthree));
            JavascriptExecutor js3 = (JavascriptExecutor) driver;
            js3.executeScript("arguments[0].scrollIntoView();", findElement41);
            
            WebElement findElement32 = driver.findElement(By.xpath(dropthree));
            findElement32.click();
	        
     //3nd
            
            //4thbodypart
            Thread.sleep(1000);
	        WebElement findElement6 = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[4]"));
            findElement6.click();
            
            
            Thread.sleep(1000);
            WebElement findElement42 = driver.findElement(By.xpath(dropfour));
            JavascriptExecutor js4 = (JavascriptExecutor) driver;
            js4.executeScript("arguments[0].scrollIntoView();", findElement42);
            
            WebElement findElement33 = driver.findElement(By.xpath(dropfour));
            findElement33.click();
            
//            
//           Thread.sleep(1000);
//          WebElement findyes=  driver.findElement(By.xpath("(//button[text()=\"Yes\"])"));
//          findyes.click();
	
	//4th end
            
            
            
   
	        //3stages
	        Thread.sleep(2000);
	        WebElement findElement13 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[3]/mat-step-header/div[2]"));
	    findElement13.click();
	        
	        Thread.sleep(1000);
	        WebElement findElement14 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])[1]"));
	        findElement14.click();
	        findElement14.sendKeys(stages);
	        
	        Thread.sleep(2000);
	        WebElement findElement15 = driver.findElement(By.xpath("(//div[@class=\"dx-select-checkbox dx-datagrid-checkbox-size dx-show-invalid-badge dx-checkbox dx-widget\"])[1]"));
	        findElement15.click();
	        JavascriptExecutor js12 = (JavascriptExecutor) driver;
	    	    js12.executeScript("window.scrollBy(0,500)");

	        //3
	        //4carecard
	        Thread.sleep(1000);
	        WebElement findElement16 = driver.findElement(By.xpath("(//span[text()=\"Care Card\"])"));
	        findElement16.click();
	        
	        //show all
	        
	        Thread.sleep(1000);
	        WebElement findElement7 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[4]/div/div/div/app-carecards/div/div/div/div/div/form/div/div/div/input"));
	        Actions set1 = new Actions(driver);
	        set1.moveToElement(findElement7).click().perform();
	        
	        Thread.sleep(1000);
	        
	        WebElement findElement17 = driver.findElement(By.xpath("(//input[@aria-label=\"Search in the data grid\"])[2]"));
  	        findElement17.click();
 	        findElement17.sendKeys(carecard);
        

	        JavascriptExecutor js21 = (JavascriptExecutor) driver;
    	    js21.executeScript("window.scrollBy(0,300)");
 	        Thread.sleep(2000);
	        WebElement findElement18 = driver.findElement(By.xpath("(//div[@class=\"dx-checkbox-container\"])[4]"));
        findElement18.click();
	        
     

	        //4
	        //5bulletin
	        
	        
	        
	        Thread.sleep(2000);	
	      WebElement findElement19=  driver.findElement(By.xpath("(//div[@class=\"mat-step-text-label ng-star-inserted\"])[2]"));
	       findElement19.click(); 
	        
	       Thread.sleep(1000);
	        WebElement findElement20 = driver.findElement(By.xpath("(//span[text()=\"5\"])"));
	        JavascriptExecutor j5121 = (JavascriptExecutor) driver;
	    	 j5121.executeScript("arguments[0].click();", findElement20);
	    	 
	    	 //show all
	    	 Thread.sleep(1000);
	    	 WebElement findElement71 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[5]/div/div/div/app-bulletinboards/div/div/div/div/div/form/div/div/div/input"));
	    	 Actions set2 = new Actions(driver);
		        set2.moveToElement(findElement71).click().perform();

	        Thread.sleep(1000);
	        WebElement findElement212  = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[5]/div/div/div/app-bulletinboards/div/div/div/div/div/form/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
	        findElement212.click();
	        findElement212.sendKeys(bulletin);
	        
	      Thread.sleep(1000);
	      WebElement findElement612 = driver.findElement(By.xpath("(//span[@class=\"dx-checkbox-icon\"])[6]"));
	      JavascriptExecutor j6 = (JavascriptExecutor) driver;
	    	 j6.executeScript("arguments[0].click();", findElement612);
          //5
	      
              //ToDO
         Thread.sleep(1000);
	         WebElement findElement23=driver.findElement(By.xpath("(//div[@class=\"mat-step-text-label ng-star-inserted\"])[1]"));
         findElement23.click();
	         
         
         Thread.sleep(1000);
         WebElement findElement24=driver.findElement(By.xpath("(//span[text()=\"6\"])"));
        findElement24.click();
         
         
         //show all     
   	 Thread.sleep(1000);
         WebElement findElement72 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[6]/div/div/div/app-todos/div/div/div/div/div/form/div/div/div/input"));
         Actions set3 = new Actions(driver);
	        set3.moveToElement(findElement72).click().perform();
	        
	         Thread.sleep(2000);
	         WebElement findElement25=driver.findElement(By.xpath("(//input[@aria-label=\"Search in the data grid\"])[4]"));
         findElement25.click();
	         findElement25.sendKeys(ToDO);
	         JavascriptExecutor js6 = (JavascriptExecutor) driver;
    	    js6.executeScript("window.scrollBy(0,200)");
//	          
//	           
         Thread.sleep(2000);
         WebElement findElement26=driver.findElement(By.xpath("(//span[@class=\"dx-checkbox-icon\"])[8]"));
	         JavascriptExecutor j612 = (JavascriptExecutor) driver;
	    	 j612.executeScript("arguments[0].click();", findElement26);
//    	 
     	JavascriptExecutor js7 = (JavascriptExecutor) driver;
	       js7.executeScript("window.scrollBy(0,400)");
//
//	       //6
//	         //7Notification
	    	 Thread.sleep(1000);
    	WebElement findElement27 =driver.findElement(By.xpath("(//div[@class=\"mat-step-text-label ng-star-inserted\"])[7]"));
	    	 JavascriptExecutor j8 = (JavascriptExecutor) driver;
    	 j8.executeScript("arguments[0].click();", findElement27);
//	    	 
	    	 	 Thread.sleep(1000);
    	 WebElement findElement73 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[7]/div/div/div/app-notifications/div/div/div/div/div/form/div/div/div/input"));
    	 Actions set4 = new Actions(driver);
	        set4.moveToElement(findElement73).click().perform();
//	    	 
	        
	       
		    	 
	    	 Thread.sleep(1000);
  	 WebElement findElement28= driver.findElement(By.xpath("(//input[@aria-label=\"Search in the data grid\"])[5]"));
	    	 findElement28.click();	    	 
	    	 findElement28.sendKeys(Notification);
	    	 
	    	 Thread.sleep(2000);
		    	WebElement findElement29c= driver.findElement(By.xpath("(//span[@class=\"dx-checkbox-icon\"])[10]"));
			    	JavascriptExecutor j81 = (JavascriptExecutor) driver;
			    	 j81.executeScript("arguments[0].click();", findElement29c);
	    	 
    	 JavascriptExecutor js7c = (JavascriptExecutor) driver;
	       js7c.executeScript("window.scrollBy(0,400)");
    	
	    	
//	    	
//         //8Appoinment
//	    	 
	      Thread.sleep(2000);
	      WebElement  findElement30=	 driver.findElement(By.xpath("(//div[@class=\"mat-step-text-label ng-star-inserted\"])[8]"));
      JavascriptExecutor j91 = (JavascriptExecutor) driver;
	      j91.executeScript("arguments[0].click();", findElement30);
//	      
//	      
    	 Thread.sleep(1000);  
      WebElement findElement74 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-createworkflow/div/div/div[2]/mat-vertical-stepper/div[8]/div/div/div/app-appointments/div/div/div/div/div/form/div/div/div/input"));
      Actions set5 = new Actions(driver);
      set5.moveToElement(findElement74).click().perform();
	    	 
	      Thread.sleep(1000);
	      WebElement findElement315= driver.findElement(By.xpath("(//input[@aria-label=\"Search in the data grid\"])[6]"));
      findElement315.click();
	      findElement315.sendKeys(appoinment);
      
//	     
      Thread.sleep(1000);
      WebElement findElement327= driver.findElement(By.xpath("(//span[@class=\"dx-checkbox-icon\"])[12]"));
     findElement327.click();
//       //8
//         
//          //des1
    

     WebElement findElement339= driver.findElement(By.xpath("(//textarea[@id=\"workflowdesc\"])"));
     findElement339.sendKeys(descriptionwf);
// //des1
//     
////     //wk2
     WebElement findElement34 = driver.findElement(By.xpath("(//input[@id=\"workflowname\"])"));
     JavascriptExecutor j10 = (JavascriptExecutor) driver;
     j10.executeScript("arguments[0].click();", findElement34);
      findElement34.sendKeys(workflowname);
//// //wk2
////          
 WebElement findElement35 = driver.findElement(By.xpath("(//button[text()=\"Save\"])"));
findElement35.click();	  
//
////add workflow     
WebElement fav21 = driver.findElement(By.xpath("(//h6[text()=\"Workflow\"])"));
fav21.click();

//plus button
Thread.sleep(2000);
    WebElement fav31= driver.findElement(By.xpath("(//img[@src=\"./assets/images/dashboard/circle.svg\"])[1]"));
fav31.click();
//
////searchbox    
Thread.sleep(2000);
WebElement findElement36 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
    findElement36.click();
findElement36.sendKeys(searchbox);
//
////pushworkflow to Onboard
Thread.sleep(2000);
WebElement findElement37 = driver.findElement(By.xpath("(//button[text()=\"Push Workflow to OnBoard\"])"));
    findElement37.click();
////
    Thread.sleep(2000);
WebElement findElement38 = driver.findElement(By.xpath("(//button[text()=\"Yes\"])"));
findElement38.click(); 
//

WebDriverWait wait= new WebDriverWait(driver ,15);
//
Thread.sleep(5000);
WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/span[1]/i")));
JavascriptExecutor j11 = (JavascriptExecutor) driver;
j11.executeScript("arguments[0].click();", until); 

//
//
WebElement until2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@role=\"textbox\"])")));
JavascriptExecutor j12 = (JavascriptExecutor) driver;
j12.executeScript("arguments[0].click();", until2);
until2.sendKeys(stageslogic);
//
Thread.sleep(1000);
WebElement findElement9 = driver.findElement(By.xpath("(//a[text()=\" Care Cards \"])"));
JavascriptExecutor j19 = (JavascriptExecutor) driver;
j19.executeScript("arguments[0].click();", findElement9); 
//
//
////carecards 
//
Thread.sleep(1000);
WebElement findElement10 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])"));
findElement10.click();

Thread.sleep(1000);
WebElement findElement50 = driver.findElement(By.xpath(CareCardlogic));
JavascriptExecutor js48 = (JavascriptExecutor) driver;
js48.executeScript("arguments[0].scrollIntoView();", findElement50);
//
WebElement findElement39 = driver.findElement(By.xpath(CareCardlogic));
findElement39.click();






//
//
//bulletin
//
Thread.sleep(1000);
WebElement findElement281 = driver.findElement(By.xpath("(//a[text()=\" Bulletin boards \"])"));
findElement281.click();
//
//
Thread.sleep(1000);
WebElement findElement101 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[2]"));
findElement101.click();
//

//
Thread.sleep(1000);
WebElement findElement501 = driver.findElement(By.xpath(bulletindrop));
JavascriptExecutor js481 = (JavascriptExecutor) driver;
js481.executeScript("arguments[0].scrollIntoView();", findElement501);

//
Thread.sleep(1000);
WebElement findElement391 = driver.findElement(By.xpath(bulletindrop));
findElement391.click();



Thread.sleep(1000);
WebElement findElement310 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[4]"));
findElement310.click();
findElement310.sendKeys(bulletinsearch);
//
//
Thread.sleep(1000);
WebElement findElement40 = driver.findElement(By.xpath("(//i[@class=\"mdi mdi-eye menu-icon text-dark\"])"));
findElement40.click();
//
Thread.sleep(1000);
WebElement findElement544 = driver.findElement(By.xpath("(//span[text()=\"×\"])"));
findElement544.click();



	 
	

//
////todo
Thread.sleep(3000);
WebElement findElement632 = driver.findElement(By.xpath("(//a[text()=\" To do's \"])"));
findElement632.click(); 
//
Thread.sleep(1000);
WebElement findElement104 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[3]"));
findElement104.click();
//
//
Thread.sleep(1000); 
WebElement findElement509 = driver.findElement(By.xpath(tododrop));
JavascriptExecutor js4812 = (JavascriptExecutor) driver;
js4812.executeScript("arguments[0].scrollIntoView();", findElement509);

Thread.sleep(1000);   
WebElement findElement393 = driver.findElement(By.xpath(tododrop));
findElement393.click();
//


Thread.sleep(1000);
WebElement findElement416 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[6]"));
findElement416.click();
findElement416.sendKeys(todosearch);
//
//
//notfication
Thread.sleep(1000);
WebElement findElement75 = driver.findElement(By.xpath("(//a[text()=\" Notifications \"])"));	  
findElement75.click();
//
//
Thread.sleep(1000);
WebElement findElement201 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[4]"));
findElement201.click();
//

Thread.sleep(1000);
WebElement findElement609 = driver.findElement(By.xpath(notifdrop));
JavascriptExecutor js4912 = (JavascriptExecutor) driver;
js4912.executeScript("arguments[0].scrollIntoView();", findElement609);
//
Thread.sleep(1000);
WebElement findElement398 = driver.findElement(By.xpath(notifdrop));
findElement398.click();
//
Thread.sleep(1000);
WebElement findElement49 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[5]/div[2]/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
findElement49.click();
findElement49.sendKeys(notisearch);
//
//appoinments
Thread.sleep(1000);
WebElement findElement8 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[1]/div/div/ul/li[6]/a"));
findElement8.click();
//
//
Thread.sleep(1000);
WebElement findElement301 = driver.findElement(By.xpath("(//div[@class=\"dx-dropdowneditor-icon\"])[5]"));
findElement301.click();
//
//
Thread.sleep(1000);
WebElement findElement709 = driver.findElement(By.xpath(appoindrop));
JavascriptExecutor js914 = (JavascriptExecutor) driver;
js914.executeScript("arguments[0].scrollIntoView();", findElement709);
//
Thread.sleep(1000);
WebElement findElement493 = driver.findElement(By.xpath(appoindrop));
findElement493.click();
//
Thread.sleep(1000);
WebElement findElement51 = driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])[10]"));
findElement51.click();
findElement51.sendKeys(appoinsearch);



    
   
    
    
    
   
    
    
    
    
    
    
    //     
//     Thread.sleep(6000);
//     WebElement findElement39 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
//     findElement39.click(); 
//     
     
     //stages
     
	}
	
	
}
