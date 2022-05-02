package web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;




class RcOnBoard7stages implements Interconnect2{
	

static WebDriver driver;
	
	
	String[][] Rcadmin=null;
		
		@DataProvider(name="Rc")
		public String[][] entry3() throws BiffException, IOException{
			Rcadmin=powerhouse3();
		System.out.println(Rcadmin);	
			return Rcadmin;	
		}
		
		
		public String[][] powerhouse3() throws BiffException, IOException {
			FileInputStream file2= new FileInputStream("/home/sudalai/Documents/seventhstage.xls");
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
		public void beforetest3() throws InterruptedException {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.6.100:5050/ob-ui/#/login");
		
		driver.manage().window().maximize();
		driver.get("http://192.168.6.100:5050/ob-ui/#/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions fed= new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("(//input[@formcontrolname=\"userName\"])"));
		fed.moveToElement(findElement).click().sendKeys("seadmin@solvedge.in").perform();
		
	    WebElement findElement2 = driver.findElement(By.xpath("(//input[@formcontrolname=\"password\"])"));
	    fed.moveToElement(findElement2).click().sendKeys("Static~#006").perform();
		
	    driver.findElement(By.xpath("(//button[text()=\" Sign In \"])")).click();
	    Thread.sleep(2000);
      
        
          
		}
//		
//		@AfterTest	
//		 public void aftertst() {
//		 driver.close();
//			 
//		 }
//		
	@Test(dataProvider="Rc")
		public void Config2(CharSequence Clientname, CharSequence Hospitallogo, CharSequence Facilitylogo, CharSequence AddressLine1, CharSequence AddressLine2, CharSequence AddressLine3, CharSequence AddressLine4, CharSequence clientzipcode1, CharSequence PhoneNO, CharSequence firstgender,  CharSequence fname, CharSequence lname,CharSequence fall12, CharSequence fall22, CharSequence jobtitle, CharSequence phoneno2, CharSequence clientemail, CharSequence clientdesc, CharSequence todo, CharSequence userconfiguration, CharSequence Activity2, CharSequence Bulletin,String config2) throws InterruptedException, AWTException {// stage 1
Actions fed= new Actions(driver);

        Thread.sleep(2000);
		WebElement client = driver.findElement(By.xpath("(//i[@class=\"ion-person-stalker mr-2\"])"));
	    client.click();
	    
	    Thread.sleep(2000);
	    WebElement clientsearch = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
	    fed.moveToElement(clientsearch).click().perform();
	    clientsearch.sendKeys(Clientname);
	    
	    Thread.sleep(2000);
	    WebElement clientname = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/div[2]/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/a"));
	    clientname.click();
//	    
//	    
	    
	    
	    
	    //upload
	    Thread.sleep(1000);
	    WebElement Home = driver.findElement(By.xpath("(//i[@for=\"file-input\"])"));
	    Home.click();
	   
	    Thread.sleep(1000);
	    WebElement fileupload = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
	    fileupload.sendKeys(Hospitallogo);

	    Thread.sleep(1000);
	    WebElement save =        driver.findElement(By.xpath("(//button[text()=\"Save\"])")); 
	    save.click();
	    
	    Thread.sleep(2000);
	    JavascriptExecutor js312 = (JavascriptExecutor) driver;
	    js312.executeScript("window.scrollBy(0,100)");
	    
	    Thread.sleep(1000);
	    WebElement facility = driver.findElement(By.xpath("(//label[text()=\"Upload your facility image \"])"));
	   fed.moveToElement(facility).click().perform();
	 	  
	 	  WebElement facilitylogo = driver.findElement(By.xpath("(//input[@name=\"logofile\"])[2]"));
	 	  facilitylogo.sendKeys(Facilitylogo);
	 	 
	 	  Thread.sleep(2000);
	 	  WebElement save2 = driver.findElement(By.xpath("(//button[text()=\"Save\"])[2]"));
	 	  JavascriptExecutor js2 = (JavascriptExecutor) driver;
	 	  js2.executeScript("arguments[0].scrollIntoView();", save2);
	 	 fed.moveToElement(save2).click().perform();
	    //
	    
	    //client information
	 	 Thread.sleep(3000);
		 WebElement clientinformation = driver.findElement(By.xpath("(//span[text()=\"Client Information \"])"));
		 fed.moveToElement(clientinformation).click().perform();
		 
		 Thread.sleep(2000);
		 WebElement clientaddress = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Address Line 1\"])"));
	     fed.moveToElement(clientaddress).click().sendKeys(AddressLine1).perform();
	     
	     Thread.sleep(2000);
	     WebElement address2 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Address Line 2\"])"));
	    address2.click();
	    address2.sendKeys(AddressLine2);
	     
	     Thread.sleep(2000);
	     WebElement clientcity = driver.findElement(By.xpath("(//input[@placeholder=\"Enter City\"])"));
	     clientcity.click();
	     clientcity.sendKeys(AddressLine3);
	     
	     Thread.sleep(2000);
	     WebElement state = driver.findElement(By.xpath("(//input[@placeholder=\"Enter State\"])"));
		state.click();
		state.sendKeys(AddressLine4);
		 
		 
		 Thread.sleep(2000);
		   JavascriptExecutor js4 = (JavascriptExecutor) driver;
		   js4.executeScript("window.scrollBy(0,500)");
		   
		    Thread.sleep(2000);
		 WebElement clientzipcode = driver.findElement(By.xpath("//*[@id=\"zip\"]"));
		  clientzipcode.click();
		  clientzipcode.sendKeys(clientzipcode1);
		  
	     Thread.sleep(1000);
	     WebElement code = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-clientinformation/div/div/div/div/div/div/div/div/form/div[6]/div/div/div[1]/select/option[2]"));
	    code.click();
	    
	    Thread.sleep(2000);
	    WebElement phonenumber = driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
	    phonenumber.click();
	    phonenumber.sendKeys(PhoneNO);
	    
	    Thread.sleep(2000);
		   JavascriptExecutor js5 = (JavascriptExecutor) driver;
		   js5.executeScript("window.scrollBy(0,-500)");
	 	 
	 	 //

	    
	   

	 	
	//*********************************************************************************************************
	  
	 	 	   
	// ********************************************************************************************************
	 	   
	 	   //carefamily
	    
			    Thread.sleep(3000);
			   WebElement carefamily= driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/ul/li[3]/a/span/i"));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			      js.executeScript("arguments[0].click();", carefamily); 
		       
		     
//		rec code
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"vert-tab-1\"]")).click();
		 
		
	    Thread.sleep(3000);
	  WebElement addnew = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-carefamily/div/div[2]/div/div/div/div/div[1]/div/button[2]"));
	addnew.click();
	  
	  

	   Thread.sleep(2000);
	  WebElement selection = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[3]/div[1]/select/option[2]"));
	  selection.click();
	  
	//  List<WebElement> Gender = driver.findElements(By.xpath("(div[@class=\"col-xl-4\"])"));
	//  for (WebElement Genderlist : Gender) {
//		String text = Genderlist.getText();
//		System.out.println(text);
	
		String s1="Male";
		
		if(s1.contentEquals(firstgender)) {
			
			WebElement Male = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/label"));
			Male.click();
		}
		
		else {
			
			WebElement female = driver.findElement(By.xpath("(label[text()=\"Female\"])"));
			female.click();
			
		}
//		else if(s1.contains("Female")) {

//			
//		}
		
		
		
		

	   Thread.sleep(2000);
	  WebElement firstname = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	  fed.moveToElement(firstname).click().sendKeys(fname).perform();
	  
	  
	   Thread.sleep(2000);
	  WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
	  fed.moveToElement(lastname).click().sendKeys(lname).perform();
	  
	  
	  Thread.sleep(1000);
	WebElement fall1=driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[5]/div[1]/input"));	      
	fall1.sendKeys(fall12);

	Thread.sleep(1000);
	WebElement fall2= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[5]/div[2]/input"));
	fall2.sendKeys(fall22);

	   Thread.sleep(2000);
	  WebElement next1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/ul/li/button"));
	  JavascriptExecutor js148 = (JavascriptExecutor) driver;
	  js148.executeScript("arguments[0].click();", next1); 
	 
	  
	   Thread.sleep(3000);
	  WebElement Jobtitle = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[1]/div/div/input"));
	  Jobtitle.click();
	  Jobtitle.sendKeys(jobtitle); 
	  
	  
	   Thread.sleep(2000);
	  List<WebElement> Phonecode = driver.findElements(By.xpath("html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/div[1]/div/div[1]/select"));
	 
	  for (WebElement webElement : Phonecode) {
		String text = webElement.getText();
		System.out.println(text);
		String s11="UK +44";	
		
	}
	  WebElement phonecode = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div/div[1]/select/option[2]"));
		phonecode.click();
	  
	 Thread.sleep(3000);
	WebElement phonecode12 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div/div[2]/input"));
	phonecode12.click();
	phonecode12.sendKeys(phoneno2);

	 Thread.sleep(2000);
	WebElement mail = driver.findElement(By.xpath("//*[@id=\"email1\"]"));
	mail.sendKeys(clientemail);

	 Thread.sleep(2000);
	WebElement Bio = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[2]/div[3]/div/textarea"));
	Bio.sendKeys(clientdesc);


	//Show in Patient Care Family or  Set As Primary User   





	Thread.sleep(1000);
	WebElement checkbox1= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[2]/div[4]/div/label"));
	 checkbox1.click();
	 
	 Thread.sleep(1000);
	WebElement next= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/ul/span/li[2]/button"));
	 next.click();
	//String s11="Show in Patient Care Family";
	//String s21="Set As Primary User";
	// 
	//if(s1.contains("Show in Patient Care Family")) {
	// Thread.sleep(2000);
	//WebElement checkin1 = driver.findElement(By.xpath("(div[@class=\"col-xl-6 mb-3\"])[2]"));
	//checkin1.click();
	// }
	//else {
//		WebElement checkin2 = driver.findElement(By.xpath("(div[@class=\"col-xl-6 mb-3\"])[3]"));
//		checkin2.click();
	//}
	//
	// Thread.sleep(2000);
	//WebElement next2= driver.findElement(By.xpath("(button[text()=\"Next\"])"));
	//JavascriptExecutor js21 = (JavascriptExecutor) driver;
	//js21.executeScript("arguments[0].click();", next2);  
	//
	//
	//
	Thread.sleep(2000);
	WebElement Grantaccess = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[1]/div[2]/label"));
	Grantaccess.click();


	//List<WebElement> findElements = driver.findElements(By.xpath("(div[@class=\"row\"])[3]"));
	//String ss1=" Access to RecoveryCOACH Portal ";
	//String ss2=" Access to RecoveryCOACH Reports ";
	//
	//for (WebElement webElement : findElements) {
//		String text = webElement.getText();
//		System.out.println(text);
	//	
	// 
	//}

	//enabled or not
	WebElement set1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[1]/div[3]/div[1]/label"));
	boolean enabled = set1.isEnabled();
	System.out.println(enabled);

	WebElement set2 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[1]/div[3]/div[2]/label"));
	boolean enabled212 = set2.isEnabled();
	System.out.println(enabled212);


	//validation and click 3rdcheck in
	// if(set1.isEnabled()&set2.isEnabled()) { 
	Thread.sleep(2000);
	WebElement checkin3 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[1]/div[3]/div[3]/label"));
	checkin3.click();

	//}

	Thread.sleep(2000);
	WebElement save1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[2]/span/input"));
	save1.click();

		//*****************************************************************************************************
	////********************************************************************************************************************************************		   
	    //new code
		
	    Thread.sleep(3000);
	   WebElement mytodo = driver.findElement(By.xpath("(//span[text()=\"My To-Do's \"])"));
	fed.moveToElement(mytodo).click().perform();
	    
	    
	    WebElement textcapture = driver.findElement(By.xpath("(//p[@class=\"todo_title\"])"));
	    textcapture.click();
	    String text = textcapture.getText();
	    System.out.println(text);	
	    
	    
	   if(text.contains(todo)) {
		   
		   Thread.sleep(2000);
		   
		   WebElement on = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-mytodo/div/div/ngb-tabset/div/div/div/div/div/div/div[2]/table/tr/td/div[1]/label"));
		   on.click();
		   
		   String text2 = on.getText();
		   System.out.println(text2);
		   
	   }
	   
	   else {
	        WebElement off = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-mytodo/div/div/ngb-tabset/div/div/div/div/div/div/div[2]/table/tr/td/div[2]/label"));
	        off.click();
	        
	   }
	   
	   
	    
	   // userconfiguration
	    
	    Thread.sleep(1000);
	    WebElement userconfig = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-mytodo/div/div/ngb-tabset/ul/li[2]/a/span"));
	    userconfig.click();
	    
	    List<WebElement> userconnfig=  driver.findElements(By.xpath("(//span[text()=\"rebert covert\"])"));
	    
	    for (WebElement config : userconnfig) {
	 	   String text2 = config.getText();
	 	   System.out.println(text2);
	 	   
	 	   
	 	   
//	 	     String s112="Selmen Delmen";
	 	   if(text2.contains(userconfiguration)) {
	 		  
	 		   WebElement cn1 = driver.findElement(By.xpath("(ul[@class=\"nav flex-column nav-tabs\"])/li[2]"));
	 	       cn1.click();   
	 	      
	 	   }

	 	   
	    }
	    
	    
	    //Activities
	    
	     Thread.sleep(1000);
	     WebElement Activities = driver.findElement(By.xpath("(//span[text()=\"Activities \"])"));
	    Activities.click();
	     
	     Thread.sleep(1000);
	     JavascriptExecutor js41 = (JavascriptExecutor) driver;
			 js41.executeScript("window.scrollBy(0,500)");
	    
			 
			 
			WebElement Activdocument = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div[2]/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/a/h5/span"));
			Activdocument.click();
			
			Thread.sleep(1000);
			WebElement searchdoc = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div[2]/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/input"));
			searchdoc.click();
			searchdoc.sendKeys(Activity2);
			
			
//			
//			Thread.sleep(1000);
//			WebElement documenton =driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div[2]/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/div/span/div[1]/label"));
//			JavascriptExecutor js12 = (JavascriptExecutor) driver;
//			js12.executeScript("arguments[0].scrollIntoView();", documenton);
//			documenton.click();
			
			Thread.sleep(2000);
			WebElement Bulletinboard = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div[2]/ngb-tabset/div/div/div/div/ngb-tabset/ul/li[2]"));
			Bulletinboard.click();
			
			Thread.sleep(1000);
			WebElement searchbulletin=driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div/div/div/div/div/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/input"));
			searchbulletin.click();
			searchbulletin.sendKeys(Bulletin);
		
			
			Thread.sleep(2000);
		WebElement status= 	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div/div/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/span/div[1]/label"));
		JavascriptExecutor js48 = (JavascriptExecutor) driver;
		js48.executeScript("window.scrollBy(0,500)");
		status.click();
		
			//config
			Thread.sleep(2000);
			WebElement config = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/ul/li[8]/a/span"));
			JavascriptExecutor js43 = (JavascriptExecutor) driver;
			js43.executeScript("window.scrollBy(0,-500)");
		config.click();
			
		
		
			Thread.sleep(2000);
		    WebElement configsearch=	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-baseconfig/div/div/div/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/input"));
		    configsearch.click();
		    configsearch.sendKeys(config2);
		    
		    Thread.sleep(3000);
		    WebElement configedit = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-baseconfig/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/div/i"));
		    configedit.click();
		    
		    Thread.sleep(3000);
		    WebElement findElement3 = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-clientbasedconfig/button"));
			findElement3.click();
	

//********************************************************************************************************************************************	
}


public void run() {
	// TODO Auto-generated method stub
	System.out.println("passed2");
}


public void Config2() {
	// TODO Auto-generated method stub
	System.out.println("passesd");
}


//public void Config2() {
//	// TODO Auto-generated method stub
//	
//}



}





   
   
    
   
   
   
   
	
//}
//}
