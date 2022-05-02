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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MasterPage {
static WebDriver driver;
	
	
	String[][] Rcadmin=null;
		
		@DataProvider(name="Rc")
		public String[][] entry() throws BiffException, IOException{
			
			Rcadmin=powerhouse();
		  System.out.println(Rcadmin);	
			return Rcadmin;	
			
		}
		
		
		public String[][] powerhouse() throws BiffException, IOException {
			FileInputStream file2= new FileInputStream("/home/sudalai/Documents/loadtest.xls");
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
        
        
        
        
        WebElement fav2= driver.findElement(By.xpath("(//h6[text()=\"Workflow\"])"));
	       
        Thread.sleep(2000);
        WebElement fav3 = driver.findElement(By.xpath("(//h6[text()=\"Base Configuration\"])"));
        Actions dd= new Actions(driver);
        dd.moveToElement(fav3).click().perform();
        
        
        Thread.sleep(2000);
		WebElement findEle = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-base-configuration/div/div[1]/div/div/div/h4"));
		findEle.click();
		
        
      
        
          
		}
		
		@AfterTest	
		 public void aftertst() {
		 driver.close();
			 
		 }
//		
	@Test(dataProvider="Rc")
		public void Config(CharSequence Name, CharSequence procname, CharSequence bodypartsec, CharSequence stager, String dropkey, CharSequence ccname, CharSequence ccsearch, CharSequence bname, CharSequence bsearch, CharSequence todoname, CharSequence tododesc, CharSequence todorname, CharSequence Todoname, CharSequence totdoashboard, CharSequence todoshorttitle, CharSequence toododesc, CharSequence totdoListing, CharSequence todoQuickview, CharSequence todoType, CharSequence ToDoLambda
  ,CharSequence NewSubToDo, CharSequence DashboardSubTodoName, CharSequence ShortTitleSubTodoName, CharSequence SubTodoLambdaName 
,CharSequence ListingSubTodoName, CharSequence QuickViewSubTodoName, CharSequence Ddescription, CharSequence notifiname, CharSequence notifidesc, CharSequence notname, CharSequence notifidrop, CharSequence nottifiname, CharSequence notificationtype, CharSequence descr, CharSequence EmailID,CharSequence appoinname, CharSequence appoindesc,CharSequence appoin, CharSequence appoinnamees, CharSequence appoindescription, CharSequence appointtype) throws InterruptedException, AWTException {// stage 1
	  
		//speciality
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("(//input[@placeholder=\"Specialty Name\"])"));
		findElement.click();
		
		 Thread.sleep(2000);
		 JavascriptExecutor js4 = (JavascriptExecutor) driver;
		 js4.executeScript("window.scrollBy(0,1000)");
		 
		 WebElement Element1 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
		 Element1.sendKeys(Name);
		 
		 
		 
		 Thread.sleep(1000);
		 WebElement Element2 = driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-specialty/div/div[2]/div/div/div/form/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/div/a/i"));
          Element2.click();
		 
        	 
   //2nd procedurename
          Thread.sleep(1000);
          WebElement Element3 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
 		 Element3.sendKeys(procname);
 		
 		 Thread.sleep(1000);
       	 WebElement findElement31 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
        	 JavascriptExecutor j = (JavascriptExecutor) driver;
        	 j.executeScript("arguments[0].click();", findElement31);
 		 
 		 
          //2nd end
        	 
        	 //3rdbodypart
        	 Thread.sleep(1000);
             WebElement Element4 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
    		 Element4.sendKeys(bodypartsec);
    		 
    		
    		 Thread.sleep(1000);
          	 WebElement findElement34 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
           	 JavascriptExecutor j1 = (JavascriptExecutor) driver;
           	 j1.executeScript("arguments[0].click();", findElement34);
    		 
        	 //3rd end
           	 
           	 
           	 
           	 //4th stage
           	 
           	 
           	 
        	 Thread.sleep(1000);
             WebElement Element5 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
    		 Element5.sendKeys(stager);
    		
    		 Thread.sleep(2000);
          	 WebElement findElement35 = driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-stages/div/div[2]/div/div/div/form/div[1]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/a[1]/i"));
           	 JavascriptExecutor j2 = (JavascriptExecutor) driver;
           	 j2.executeScript("arguments[0].click();", findElement35);
           	 
           
          //5thdraganddrop
               
           	Thread.sleep(2000);
           	WebElement findElement24 = driver.findElement(By.xpath(dropkey));
          	JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].scrollIntoView();", findElement24);
          
            Thread.sleep(2000);
         	WebElement findElement2 = driver.findElement(By.xpath("(//p[@class=\"card-description mt-1 pull-right text-dark\"])"));
            Actions sell= new Actions(driver);
            sell.sendKeys(findElement2, Keys.ARROW_UP).perform();
            
            Thread.sleep(2000);
        	WebElement findElement22 = driver.findElement(By.xpath(dropkey));
        	WebElement findElement324 = driver.findElement(By.xpath("(//div[@class=\"example-list cdk-drop-list\"])[2]"));
      
        	Thread.sleep(2000);
        	Actions dec= new Actions(driver);
        	dec.clickAndHold(findElement22).moveToElement(findElement324).release(findElement324).perform();
           	       
           	
           	Thread.sleep(1000);
           	WebElement findElement3 = driver.findElement(By.xpath("(//button[@class=\"card-description btn btn-success mt-4 pull-right text-dark\"])"));
            findElement3.click();
           	// 4th end
           	 
//            Thread.sleep(1000);
//            Actions jek= new Actions(driver);
//            jek.sendKeys(Keys.ARROW_DOWN).perform();
//            
//            Thread.sleep(1000);
//            JavascriptExecutor js3 = (JavascriptExecutor) driver;
//    	    js3.executeScript("window.scrollBy(0,800)");
            
            Thread.sleep(1000);
          	 WebElement findElement313 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
           	 JavascriptExecutor js = (JavascriptExecutor) driver;
           	 js.executeScript("arguments[0].click();", findElement313);   
           	 
           	 
           	 
	         	//5th stage care card
Thread.sleep(1000);
WebElement fill198= driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
fill198.click();
fill198.sendKeys(ccname);

Thread.sleep(1000);
WebElement fill200=driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-carecards/div/div[2]/div/div/div/form/div[1]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/a[1]/i"));
JavascriptExecutor js12 = (JavascriptExecutor) driver;
	 js12.executeScript("arguments[0].click();", fill200);  

	 
Thread.sleep(1000);
WebElement fill201=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
fill201.click();
fill201.sendKeys(ccsearch);


Thread.sleep(1000);
WebElement fill202=driver.findElement(By.xpath("(//a[@tooltip=\"View Card\"])"));
fill202.click();

Thread.sleep(1000);
WebElement fill203=driver.findElement(By.xpath("/html/body/modal-container/div/div/div[1]/button/span"));
fill203.click();

Thread.sleep(1000);
WebElement fill204=driver.findElement(By.xpath("(//i[@class=\"mdi mdi-arrow-left-bold-circle\"])"));
JavascriptExecutor js121 = (JavascriptExecutor) driver;
js121.executeScript("arguments[0].click();", fill204);  

	
Thread.sleep(1000);
JavascriptExecutor js31 = (JavascriptExecutor) driver;
js31.executeScript("window.scrollBy(0,500)");


Thread.sleep(1000);
WebElement fill205=driver.findElement(By.xpath(("(//button[text()=\"Next\"])")));
JavascriptExecutor js122 = (JavascriptExecutor) driver;
js122.executeScript("arguments[0].click();", fill205);  	
  		//5th end
  		
  		//6thBulletin
  		 Thread.sleep(1000);
WebElement fill206=driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])"));
fill206.click();
fill206.sendKeys(bname);

Thread.sleep(1000);
JavascriptExecutor js41 = (JavascriptExecutor) driver;
js41.executeScript("window.scrollBy(0,500)");


Thread.sleep(1000);
WebElement fill208=driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-bulletinboards/div/div[2]/div/div/div/form/div[1]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/a[1]/i"));
JavascriptExecutor js123 = (JavascriptExecutor) driver;
	 js123.executeScript("arguments[0].click();", fill208);  

	 
Thread.sleep(1000);
WebElement fill209=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
fill209.click();
fill209.sendKeys(bsearch);


Thread.sleep(1000);
WebElement fill300=driver.findElement(By.xpath("(//a[@tooltip=\"View Card\"])"));
fill300.click();

Thread.sleep(1000);
WebElement fill301=driver.findElement(By.xpath("/html/body/modal-container/div/div/div[1]/button/span"));
fill301.click();

Thread.sleep(1000);
WebElement fill305=driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-bulletinboards/div/div/div[1]/i"));
JavascriptExecutor js128 = (JavascriptExecutor) driver;
js128.executeScript("arguments[0].click();", fill305);  

	
Thread.sleep(1000);
JavascriptExecutor js312 = (JavascriptExecutor) driver;
js312.executeScript("window.scrollBy(0,700)");


Thread.sleep(1000);
WebElement fill306=driver.findElement(By.xpath(("(//button[text()=\"Next\"])")));
JavascriptExecutor js146 = (JavascriptExecutor) driver;
js146.executeScript("arguments[0].click();", fill306);  	


  		 //6thend
  			 
  			 //7th ToDo
  			 Thread.sleep(2000);
  			 WebElement findtrig66 = driver.findElement(By.xpath("(//input[@placeholder=\"Todos Group Name\"])"));
  	         findtrig66.sendKeys(todoname);
               
  	         
  	    	 Thread.sleep(2000);
  	         WebElement findtrig43 = driver.findElement(By.xpath("(//textarea[@placeholder=\"Todos Group Description\"])"));
  	         findtrig43.sendKeys(tododesc);
  	         
  	    	 Thread.sleep(2000);
  	         WebElement findtrig64 = driver.findElement(By.xpath("(//button[text()=\"Add To Do's\"])"));
  	         findtrig64.click();
  	        
  	    	 Thread.sleep(2000);
  	        WebElement webCheck =driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])"));
  	        JavascriptExecutor j56 = (JavascriptExecutor) driver;
  		  	 j56.executeScript("arguments[0].click();", webCheck);
  	        webCheck.sendKeys(todorname);
  	         
  	   	     Thread.sleep(2000);
  	         WebElement fill1 = driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-todos/div/div[2]/div/div/div/form/div[1]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/a[1]/i"));
  	         JavascriptExecutor j5135 = (JavascriptExecutor) driver;
  			 j5135.executeScript("arguments[0].click();", fill1);
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill21 = driver.findElement(By.xpath(("(//button[text()=\"Create New To Do's\"])")));
  	         fill21.click();
  	        
  	         
  	    	 Thread.sleep(2000);
  	        WebElement fill31 = driver.findElement(By.xpath("(//input[@formcontrolname=\"bname\"])"));
  	         fill31.sendKeys(Todoname);
  	         
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill4 = driver.findElement(By.xpath("(//input[@formcontrolname=\"dname\"])"));
  	         fill4.sendKeys(totdoashboard);
  	         
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill5 = driver.findElement(By.xpath("(//input[@formcontrolname=\"shname\"])"));
  	         fill5.sendKeys(todoshorttitle);
  	         
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill6 = driver.findElement(By.xpath("(//textarea[@formcontrolname=\"bdesc\"])"));
  	         fill6.sendKeys(toododesc);
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill7 = driver.findElement(By.xpath("(//input[@formcontrolname=\"pname\"])"));
  	         fill7.sendKeys(totdoListing);
  	         
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill8 = driver.findElement(By.xpath("(//input[@formcontrolname=\"qname\"])"));
  	         fill8.sendKeys(todoQuickview);
  	         
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill9 = driver.findElement(By.xpath("(//input[@formcontrolname=\"todoMasterType\"])"));
  	         fill9.sendKeys(todoType);
  	         
  	       Thread.sleep(2000);
	         WebElement fill91 = driver.findElement(By.xpath("(//input[@placeholder=\"Todo Lambda Name\"])"));
	         fill91.sendKeys(ToDoLambda);
  	         
  	    	 Thread.sleep(2000);
  	         WebElement fill10 = driver.findElement(By.xpath("(//button[text()=\"Add To Do's\"])"));
  	         fill10.click();
  	         
  	         Thread.sleep(1000);
  	         WebElement fill101 = driver.findElement(By.xpath("(//div[@class=\"dx-datagrid-group-closed\"])"));
  	         fill101.click();
  	         
  	         Thread.sleep(1000);
  	         WebElement fill102 = driver.findElement(By.xpath("(//button[text()=\"Create New SubToDo's\"])"));
  	         fill102.click();
  	         
  	         Thread.sleep(1000);
  	         WebElement fill103 = driver.findElement(By.xpath("(//input[@placeholder=\"SubToDo's Name\"])"));
  	         fill103.sendKeys(NewSubToDo);
  	         
  	         
  	         Thread.sleep(1000);
  	         WebElement fill104 = driver.findElement(By.xpath("(//input[@placeholder=\"Dashboard SubTodo Name\"])"));
  	         fill104.sendKeys(DashboardSubTodoName);
  	         

  	         Thread.sleep(1000);
  	         WebElement fill105 = driver.findElement(By.xpath("(//input[@placeholder=\"Short Title SubTodo Name\"])"));
  	         fill105.sendKeys(ShortTitleSubTodoName);

  	       Thread.sleep(1000);
	         WebElement fill1110 = driver.findElement(By.xpath("(//input[@placeholder=\"SubTodo's Lambda Name\"])"));
	         fill1110.sendKeys(SubTodoLambdaName );

  	         
  	         Thread.sleep(1000);
  	         WebElement fill106 = driver.findElement(By.xpath("(//input[@placeholder=\"Listing SubTodo Name\"])"));
  	         fill106.sendKeys(ListingSubTodoName);

  	         Thread.sleep(1000);
  	         WebElement fill107 = driver.findElement(By.xpath("(//input[@placeholder=\"Quick View SubTodo Name\"])"));
  	         fill107.sendKeys(QuickViewSubTodoName);
  	         
  	         
  	         Thread.sleep(1000);
  	         WebElement fill108 = driver.findElement(By.xpath("(//textarea[@placeholder=\"SubToDo's Description\"])"));
  	         fill108.sendKeys(Ddescription);
  	         
  	         Thread.sleep(1000);
  	         WebElement fill109 = driver.findElement(By.xpath("(//button[text()=\"Add SubTo Do's\"])"));
  	 fill109.click();
  	         
  	         
  	        
  	         Thread.sleep(3000);
  	         WebElement fill147= driver.findElement(By.xpath("(//i[@class=\"mdi mdi-arrow-left-bold-circle\"])"));
  	         JavascriptExecutor j6 = (JavascriptExecutor) driver;
  			 j6.executeScript("arguments[0].click();", fill147);
  	       
  	 
  	         Thread.sleep(2000);
  			 WebElement findtrig97 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
  			 JavascriptExecutor j61 = (JavascriptExecutor) driver;
  			 j61.executeScript("arguments[0].click();", findtrig97); 

  			 //7th end
  			 //8th notification
  			 
  			 Thread.sleep(2000);
  			 WebElement findtrig004 = driver.findElement(By.xpath("(//input[@placeholder=\"Notifications Group Name\"])"));
  			 findtrig004.sendKeys(notifiname);
  			 
  			 Thread.sleep(2000);
  			 WebElement findtrig002 = driver.findElement(By.xpath("(//textarea[@placeholder=\"Notifications Group Description\"])"));
  			 findtrig002.sendKeys(notifidesc);
  			 
  			 Thread.sleep(2000);
  			 WebElement findtrig001 = driver.findElement(By.xpath("(//button[text()=\"Add Notification\"])"));
  			 findtrig001.click();
  			 
  			Thread.sleep(2000);	 
  			WebElement webClick= driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])"));
  			JavascriptExecutor j54 = (JavascriptExecutor) driver;
  		  	j54.executeScript("arguments[0].click();", webClick);
  			webClick.sendKeys(notname);
  			
  				 Thread.sleep(2000); 
  				 WebElement fill100 = driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-notifications/div/div[2]/div/div/div/form/div[1]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/a[1]/i"));
  				 JavascriptExecutor j541 = (JavascriptExecutor) driver;
  				  	j541.executeScript("arguments[0].click();", fill100);		    
//  
  				 WebElement fill500= driver.findElement(By.xpath("(//button[text()=\"Create New Notifications\"])"));
  				 fill500.click();
  				 
  				 
  				 WebElement fill501= driver.findElement(By.xpath("(//button[@class=\"ngx-dropdown-button\"])"));
  			     fill501.click();
  				 
  				 
  				 WebElement fill400=driver.findElement(By.xpath("(//input[@name=\"search-text\"])"));
  			     fill400.sendKeys(notifidrop);
  				 
  				 
  				 WebElement fill502 = driver.findElement(By.xpath("(//ul[@class=\"available-items\"])"));
  				 fill502.click();
  				 
  				 
  				 WebElement fib = driver.findElement(By.xpath("(//button[@class=\"ngx-dropdown-button\"])"));
  				 fib.click();
  				 
  				 
  				 Thread.sleep(2000);
  				 WebElement fill600 = driver.findElement(By.xpath("(//input[@placeholder=\"Notification Name\"])"));
  				 fill600.click();
  				 fill600.sendKeys(nottifiname);			
  				 
  				 WebElement fill700 = driver.findElement(By.xpath("(//input[@placeholder=\"Notification Type\"])"));
  				 fill700.sendKeys(notificationtype);
  				 
  				 WebElement fill800= driver.findElement(By.xpath("(//textarea[@placeholder=\"Notification Description\"])"));
  				 fill800.sendKeys(descr);
  				 
  				 
  				 Thread.sleep(2000);
  				 WebElement fill900 = driver.findElement(By.xpath("(//input[@placeholder=\"Email Subject\"])"));
  				 fill900.sendKeys(EmailID);
  
  				 WebElement fill1090= driver.findElement(By.xpath("(//button[text()=\"Add Notification\"])"));
  				 fill1090.click();
  				 
  				
  		        Thread.sleep(2000);
  	            WebElement fill148= driver.findElement(By.xpath("(//i[@class=\"mdi mdi-arrow-left-bold-circle\"])"));
  		         JavascriptExecutor j91 = (JavascriptExecutor) driver;	   	     
  		         j91.executeScript("arguments[0].click();", fill148);

  			 
  	
  			 Thread.sleep(2000);
  			 WebElement findtrig13 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
  			 JavascriptExecutor j7 = (JavascriptExecutor) driver;
  			 j7.executeScript("arguments[0].click();", findtrig13);
   
  			 //8th end
  			 //9th stageAppoinment
  			 Thread.sleep(2000);
  			 WebElement findtrig400 = driver.findElement(By.xpath("(//input[@placeholder=\"Appointments Group Name\"])"));
  			 findtrig400.sendKeys(appoinname);
  		 
  			 
  			 Thread.sleep(2000);
  			 WebElement findtrig300 = driver.findElement(By.xpath("(//textarea[@placeholder=\"Appointments Group Description\"])"));
  			 findtrig300.sendKeys(appoindesc);
  			 
  			 
  			 Thread.sleep(2000);
  			 WebElement findtrig200 = driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-appointments/div/div[1]/div/div/div/form/div[2]/button"));
  			 findtrig200.click();	
  			 
  			 
  			 Thread.sleep(1000);
  			 WebElement webClick1= driver.findElement(By.xpath("(//input[@class=\"dx-texteditor-input\"])"));
  			 JavascriptExecutor j71 = (JavascriptExecutor) driver;
  		     j71.executeScript("arguments[0].click();",webClick1 );
  			 webClick1.sendKeys(appoin);
  				 
  				Thread.sleep(2000); 
  				 WebElement fill133 = driver.findElement(By.xpath("/html/body/app-layout/div/div/div/app-appointments/div/div[2]/div/div/div/form/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/a[1]/i"));
  				 JavascriptExecutor j712 = (JavascriptExecutor) driver;
  				 j712.executeScript("arguments[0].click();",fill133 );
  				 
  			 
  			 Thread.sleep(2000);
  				 WebElement fill222= driver.findElement(By.xpath("(//button[text()=\"Create New Appointments\"])"));
  				 fill222.click();
  				 
  				 Thread.sleep(2000);
  				 WebElement fill344= driver.findElement(By.xpath("(//input[@placeholder=\"Appointment Name\"])"));
  			     fill344.sendKeys(appoinnamees);
  			
  			   Thread.sleep(2000);
  			   WebElement fill436= driver.findElement(By.xpath("(//textarea[@id=\"exampleTextarea1\"])"));
  			   fill436.sendKeys(appoindescription);
  			   
  			   Thread.sleep(2000);
  			   WebElement fill4361= driver.findElement(By.xpath("(//input[@placeholder=\"--Select--\"])"));
  			   fill4361.click();
  			   fill4361.sendKeys(appointtype);
  			   
  			   Thread.sleep(2000); 
  			   WebElement fill587= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/form/div[4]/button"));
  			   fill587.click();
           	 
           	 
           	 
         			  Thread.sleep(2000);
         		        WebElement fav3 = driver.findElement(By.xpath("(//h6[text()=\"Base Configuration\"])"));
         		        Actions dd= new Actions(driver);
         		        dd.moveToElement(fav3).click().perform();
         		        
         		        
         		        Thread.sleep(2000);
         				 WebElement findEle = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-base-configuration/div/div[1]/div/div/div/h4"));
         				findEle.click();
         			   
            
	}
	

}
