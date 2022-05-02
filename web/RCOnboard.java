package web;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


 class RCOnboard implements Interconnect1 {
static WebDriver driver;
	
	
	String[][] Rcadmin=null;

	@DataProvider(name="Rc")
	public String[][] entry2() throws BiffException, IOException {
		
		Rcadmin=powerhouse2();
		System.out.println(Rcadmin);	
			return Rcadmin;
		
	}


	public String[][] powerhouse2() throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file2= new FileInputStream("/home/sudalai/Documents/onboardbaseedit.xls");
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
	public void beforetest2() throws InterruptedException {
		// TODO Auto-generated method stub
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
          
	}

	@Test(dataProvider="Rc")
	public void Config1(CharSequence Clientnamesearch, CharSequence clientname, CharSequence FacilityType, CharSequence taxidendification, CharSequence pin,CharSequence website,String country,String timezone,CharSequence clienttype, CharSequence specs, CharSequence serviceline, CharSequence procedure, CharSequence bodypart, CharSequence chooseWorkflow, CharSequence firstname, CharSequence lastname,CharSequence genderC, CharSequence emailC, CharSequence phoneno, CharSequence Jobtitle) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
Actions fed= new Actions(driver);
		
	    WebElement findElement3 = driver.findElement(By.xpath("(//i[@class=\"ion-ios-browsers mr-2\"])"));
	    fed.moveToElement(findElement3).click().perform();
	    
	    //workflow search
	    Thread.sleep(2000);
	    WebElement findElement4 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
		
	    fed.moveToElement(findElement4).click().sendKeys(Clientnamesearch).perform();
	    

	    
	    //worflow status
//	    Thread.sleep(2000);
//	    WebElement findElement5= driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/app-obadmin/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/button"));
//	  boolean enabled = findElement5.isEnabled();
//	  String text = findElement5.getText();
//	    System.out.println(enabled);
//	    
//	    if (text.equals("Active")) {
//	    	
//	    	Thread.sleep(2000);
//	    	 WebElement Active=driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/div/div/app-obadmin/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/button"));
//	    	 JavascriptExecutor js2= (JavascriptExecutor) driver;
//	         js2.executeScript("arguments[0].scrollIntoView();", Active);
//	         
//	         Active.click();
//	    
//	    
//	    
//	    Thread.sleep(2000);
//	    WebElement findElement7 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[3]/button[1]"));
//	    findElement7.click();
	    
	  
	    
//	    }
	    	    	
	    
  
	        	
	    
	  
//	    Thread.sleep(1000);
//		  WebElement findElement61 = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/div[1]/div/div/div/ngb-tabset/ul/li[2]/a/span/i"));
//		  fed.moveToElement(findElement61).click().perform();
		  
		    // client
	    
		  Thread.sleep(2000);
		  WebElement client = driver.findElement(By.xpath("(//b[text()=\"Clients\"])"));
		  fed.moveToElement(client).click().perform();
		  
		  //add new client
		    Thread.sleep(2000);
		  WebElement findElement81 =driver.findElement(By.xpath("(//button[text()=\"Add New Client\"])"));
		  fed.moveToElement(findElement81).click().perform();
		  
		//  client name
		  Thread.sleep(3000);
		  WebElement findElement91 = driver.findElement(By.xpath("(//input[@id=\"clientName\"])"));
		  findElement91.sendKeys(clientname);
		  
		  //choose option(hospital,practice)
		  
		  String s11="Hospital";
		  String s21="Practice";
		  String s31="Surgery Center";
		  
		  if(s11.equals(FacilityType)) {
		  Thread.sleep(2000);
		 WebElement findElement10=driver.findElement(By.xpath("(//label[text()=\"Hospital\"])"));
		 findElement10.click();
		  }
		  else if(s21.equals("Practice"))
		  {
			  WebElement findElement10=driver.findElement(By.xpath("(//label[text()=\"Practice\"])"));
				 findElement10.click();
				
//				 set2
				//choose(in patient or ambulance )
				  Thread.sleep(2000);
				  WebElement findElement11 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div/div[1]/label"));
				  fed.moveToElement(findElement11).click().perform();
				  
//				  enter the tax identifcation
				  Thread.sleep(1000);
				  WebElement findElement12 = driver.findElement(By.xpath("(//input[@id=\"ltinid\"])"));
				  fed.moveToElement(findElement12).click().sendKeys(taxidendification).perform();
				  
//				  enter the pin
				  Thread.sleep(1000);
				  WebElement findElement13 = driver.findElement(By.xpath("(//input[@value=\"CMS UID \"])"));
				  fed.moveToElement(findElement13).click().sendKeys(pin).perform();
				  
//				  website
				  Thread.sleep(1000);
				  WebElement findElement14 = driver.findElement(By.xpath("(//input[@value=\"CMSUID\"])"));
				  JavascriptExecutor js1 = (JavascriptExecutor) driver;
				  js1.executeScript("arguments[0].scrollIntoView();", findElement14);
				  fed.moveToElement(findElement14).click().sendKeys(website).perform();
				  
//				  map client manager
				  Thread.sleep(1000);

				  WebElement findElement15 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[5]/div/div/div/div/dx-drop-down-box/div[1]/div/input"));
				  findElement15.click();
				  
//				  search client manager
				  Thread.sleep(2000);
				  WebElement findElement16 = driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div/div/div/input"));
				  findElement16.sendKeys("Benjamin");
				  
//				  client manager checkbox
				  Thread.sleep(1000);
				  WebElement findElement161=driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
				  findElement161.click();
				
				  
				  String text2 = findElement161.getText();
				  System.out.println(text2);
				
				 
				  WebElement findElement200=driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[5]/div/label"));
			     fed.moveToElement(findElement200).click().perform();
			      
//				  country
				   Thread.sleep(2000);
				   WebElement findElement17 = driver.findElement(By.xpath(country));
				 findElement17.click();
				  
//				   timezone
				   Thread.sleep(2000);
			       WebElement findElement18 = driver.findElement(By.xpath(timezone));
			     findElement18.click();
			       
			       
//			       client type
			   WebElement findElement101 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[7]/div/div/div[1]/label"));
					String text3 = findElement101.getText();
					System.out.println(text3);
					
					if(text3.equals(clienttype))
					{
						Thread.sleep(1000);
						WebElement findElement102 = driver.findElement(By.xpath("(//label[@for=\"clitype+0\"])"));
						findElement102.click();
					}
				
				
//			       next
			       Thread.sleep(1000);
			       WebElement findElement19 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/ul/li/button"));
			       findElement19.click();
			       
			       
//			       2 Config
			       WebElement findElement20 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/div/div/ul/li[2]/a/span[2]"));
			       findElement20.click();
			       
			       
			       //add
			       Thread.sleep(1000);
			       WebElement findElement21 = driver.findElement(By.xpath("(//div[text()=\"Add\"])"));
			      fed.moveToElement(findElement21).click().perform();
			      
			      //speciality
			      Thread.sleep(1000);
			      WebElement findElement22 = driver.findElement(By.xpath("(//span[text()=\"Select\"])"));
			       fed.moveToElement(findElement22).click().perform();
			       
			       //search
			       Thread.sleep(1000);
			       WebElement findElement23 = driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])"));
			      fed.moveToElement(findElement23).click().sendKeys(specs).perform();
			      
			      //search click
			      Thread.sleep(1000);
			      WebElement findElement24 = driver.findElement(By.xpath("(//ul[@style=\"max-height: 197px;\"])/li"));
			      findElement24.click();
			      
			      //serviceline
			      Thread.sleep(1000);
			      WebElement findElement25 = driver.findElement(By.xpath("(//span[text()=\"Select\"])[1]"));
			     fed.moveToElement(findElement25).click().perform();
			     
			      //serviceline click
			      Thread.sleep(1000);
			     WebElement findElement26= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input"));
			     fed.moveToElement(findElement26).click().sendKeys(serviceline).perform();
			     
			      //serviceline click
			     Thread.sleep(1000);
			     WebElement findElement27 = driver.findElement(By.xpath("(//ul[@class=\"item2\"])[2]/li"));
			     findElement27.click();
			     
			     //procedure
			     Thread.sleep(1000);
			     WebElement findElement28=driver.findElement(By.xpath("(//span[text()=\"Select\"])[1]"));
			     findElement28.click();
			     
			     //procedure search 
			     Thread.sleep(1000);
			     WebElement findElement29 = driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])[3]"));
			     fed.moveToElement(findElement29).click().sendKeys(procedure).perform();
			     
			     
			     //procedure click
			     Thread.sleep(1000);
			     WebElement findElement30 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[3]/ng-multiselect-dropdown/div/div[2]/ul[2]/li"));
			       findElement30.click();
			       
			       
			       //Body part
			       Thread.sleep(3000);
			      WebElement findElement31= driver.findElement(By.xpath("(//span[text()=\"Select\"])"));
			      findElement31.click();
			      
			      //body part search 
			      Thread.sleep(3000);
			      WebElement findElement32 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[4]/ng-multiselect-dropdown/div/div[2]/ul[2]/li"));
			      fed.moveToElement(findElement32).click().sendKeys(bodypart).perform();       
			       

//			      //bopdy part click
//			      Thread.sleep(1000);
//			     WebElement findElement33= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[4]/ng-multiselect-dropdown/div/div[2]/ul[2]/li"));
			//  fed.moveToElement(findElement33).click().perform();
			   
			   
			   
			 Thread.sleep(3000);
			 WebElement findElement34 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[2]/div/div/div/div/dx-drop-down-box/div[1]/div/input"));
			 fed.moveToElement(findElement34).click().perform();
			 
			 //workflow name
			 Thread.sleep(1000);
			 WebElement findElement51 = driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div/div/div/input"));
			 findElement51.sendKeys(chooseWorkflow);Thread.sleep(1000);
			 WebElement findElement35 = driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
			 fed.moveToElement(findElement35).click().perform();
			 
			 //save
			 Thread.sleep(2000);
			 WebElement saver=driver.findElement(By.xpath("(//div[text()=\"Save\"])"));
			 JavascriptExecutor js122 = (JavascriptExecutor) driver;
			 js122.executeScript("arguments[0].click();", saver);  	
//			fed.moveToElement(save1).click().perform();


			WebElement CINEXT=driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
			CINEXT.click();

			// *************************************************************************************************


			//CLIENT CONTACT INFORMATION

			//CIADD
			Thread.sleep(2000);
			WebElement CIADD=driver.findElement(By.xpath("(//div[text()=\"Add\"])"));
			CIADD.click();

			//CIFIRSTNAME
			Thread.sleep(2000);
			WebElement CIFIRSTNAME = driver.findElement(By.xpath("(//input[@placeholder=\"Enter First Name\"])"));
			fed.moveToElement(CIFIRSTNAME).click().sendKeys(firstname).perform();

			//CILASTNAME
			Thread.sleep(2000);
			WebElement CILASTNAME = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Last Name\"])"));
			fed.moveToElement(CILASTNAME).click().sendKeys(lastname).perform();

			//CIGENDER
			String ss1= "Male";



			if(ss1.equals(genderC)) {
				Thread.sleep(2000);
			WebElement CIGENDERMALE = driver.findElement(By.xpath("(//label[text()=\"Male\"])"));
			CIGENDERMALE.click();
			
			}
			else
			{
				WebElement CIGENDERFEMALE= driver.findElement(By.xpath("(//label[text()=\"Female\"])"));
				CIGENDERFEMALE.click();
				}

			//Email
			Thread.sleep(2000);
			WebElement CIEMAIL = driver.findElement(By.xpath("(//input[@placeholder=\"abd@abc.com\"])"));
			fed.moveToElement(CIEMAIL).click().sendKeys(emailC).perform();


			//Country code
			Thread.sleep(2000);
			WebElement Countrycode = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[3]/div[1]/div/div[1]/select/option[2]"));
			Countrycode.click();




			//Phonono.
			Thread.sleep(2000);
			WebElement Phonono = driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
			fed.moveToElement(Phonono).click().sendKeys(phoneno).perform();

			//Job title
			Thread.sleep(2000);
			WebElement JobTitle = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Job Title\"])"));
			fed.moveToElement(JobTitle).click().sendKeys(Jobtitle).perform();


			//Role
			Thread.sleep(2000);
			WebElement Role = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[4]/div/select/option[3]"));
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("arguments[0].scrollIntoView();", Role);
			Role.click();


			//checkboxCI

			//List<WebElement> findElements2 = driver.findElements(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]"));
			//for (WebElement webElement : findElements2) {
//				String text = webElement.getText();
//				System.out.println(text);
			//	
//				if(text.equals("Set as Primary User")) {
//					Thread.sleep(3000);
//					WebElement Click1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]/div[1]/div/label"));
//					fed.moveToElement(Click1).click().perform();
//				}
			//	
			//}

			//Set as primary user
			Thread.sleep(2000);
			WebElement check = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]/div/div"));

			JavascriptExecutor js41 = (JavascriptExecutor) driver;
			js41.executeScript("arguments[0].scrollIntoView();", check);

			fed.moveToElement(check).click().perform();

			//Show in Patient Care Family
			Thread.sleep(2000);
			WebElement ShowinPatientCareFamily  = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]/div[2]/div/label"));
			ShowinPatientCareFamily.click();

			//save
			Thread.sleep(2000);
			WebElement Save = driver.findElement(By.xpath("(//button[@href=\"JavaScript:Void(0);\"])"));
			Save.click();


			//next
			Thread.sleep(2000);
			WebElement Next =driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
			Next.click();


			//serviceline
			Thread.sleep(2000);

			List<WebElement> findElements2 = driver.findElements(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]"));
			for (WebElement webElement : findElements2) {
				String text1 = webElement.getText();
				System.out.println(text1);
			}

			WebElement Serviceline=driver.findElement(By.xpath("(//input[@value=\"Save\"])"));
			Serviceline.click();




			//Multiple Sites of Service
//			WebElement MultipleSitesofService = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[1]/div[1]/div[3]/label"));
//			MultipleSitesofService.click();


			//Add New Client
			
			
			
//			WebDriverWait wait= new WebDriverWait(driver ,15);
//			//
//			Thread.sleep(5000);
//			WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/input")));
//			JavascriptExecutor j11 = (JavascriptExecutor) driver;
//			j11.executeScript("arguments[0].click();", until); 

			Thread.sleep(2000);
			WebElement  AddNewClient= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/input"));
			
			JavascriptExecutor j = (JavascriptExecutor) driver;
			 j.executeScript("arguments[0].click();", AddNewClient);
			AddNewClient.click();

//				 
				 
		  } 
		  else if(s31.equals("Surgery Center")) {
			  WebElement findElement10=driver.findElement(By.xpath("(//label[text()=\"Surgery Center\"])"));
				 findElement10.click();
		  }
		  
		  //choose(in patient or ambulance )
		  Thread.sleep(2000);
		  WebElement findElement11 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div/div[1]/label"));
		  fed.moveToElement(findElement11).click().perform();
		  
//		  enter the tax identifcation
		  Thread.sleep(1000);
		  WebElement findElement12 = driver.findElement(By.xpath("//*[@id=\"lmedicareid\"]"));
		  fed.moveToElement(findElement12).click().sendKeys(taxidendification).perform();
		  
//		  enter the pin
		  Thread.sleep(1000);
		  WebElement findElement13 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[4]/div[2]/div/input"));
		  fed.moveToElement(findElement13).click().sendKeys(pin).perform();
		  
//		  website
		  Thread.sleep(1000);
		  WebElement findElement14 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[4]/div[3]/div/div/div[2]/input"));
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js1.executeScript("arguments[0].scrollIntoView();", findElement14);
		  fed.moveToElement(findElement14).click().sendKeys(website).perform();
		  
//		  map client manager
		  Thread.sleep(1000);

		  WebElement findElement15 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[5]/div/div/div/div/dx-drop-down-box/div[1]/div/input"));
		  findElement15.click();
		  
//		  search client manager
		  Thread.sleep(2000);
		  WebElement findElement16 = driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div/div/div/input"));
		  findElement16.sendKeys("Benjamin");
		  
//		  client manager checkbox
		  Thread.sleep(1000);
		  WebElement findElement161=driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		  findElement161.click();
		
		  
		  String text2 = findElement161.getText();
		  System.out.println(text2);
		
		 
		  WebElement findElement200=driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[5]/div/label"));
	     fed.moveToElement(findElement200).click().perform();
	      
//		  country
		   Thread.sleep(2000);
		   WebElement findElement17 = driver.findElement(By.xpath(country));
		 findElement17.click();
		  
//		   timezone
		   Thread.sleep(2000);
	       WebElement findElement18 = driver.findElement(By.xpath(timezone));
	     findElement18.click();
	       
	       
//	       client type
	   WebElement findElement10 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[7]/div/div/div[1]/label"));
			String text3 = findElement10.getText();
			System.out.println(text3);
			
			if(text3.equals(clienttype))
			{
				Thread.sleep(1000);
				WebElement findElement101 = driver.findElement(By.xpath("(//label[@for=\"clitype+0\"])"));
				findElement101.click();
			}
		
		
//	       next
	       Thread.sleep(1000);
	       WebElement findElement19 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/ul/li/button"));
	       findElement19.click();
	       
	       
//	       2 Config
	       WebElement findElement20 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/div/div/ul/li[2]/a/span[2]"));
	       findElement20.click();
	       
	       
	       //add
	       Thread.sleep(1000);
	       WebElement findElement21 = driver.findElement(By.xpath("(//div[text()=\"Add\"])"));
	      fed.moveToElement(findElement21).click().perform();
	      
	      //speciality
	      Thread.sleep(1000);
	      WebElement findElement22 = driver.findElement(By.xpath("(//span[text()=\"Select\"])"));
	       fed.moveToElement(findElement22).click().perform();
	       
	       //search
	       Thread.sleep(1000);
	       WebElement findElement23 = driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])"));
	      fed.moveToElement(findElement23).click().sendKeys(specs).perform();
	      
	      //search click
	      Thread.sleep(1000);
	      WebElement findElement24 = driver.findElement(By.xpath("(//ul[@style=\"max-height: 197px;\"])/li"));
	      findElement24.click();
	      
	      //serviceline
	      Thread.sleep(1000);
	      WebElement findElement25 = driver.findElement(By.xpath("(//span[text()=\"Select\"])[1]"));
	     fed.moveToElement(findElement25).click().perform();
	     
	      //serviceline click
	      Thread.sleep(1000);
	     WebElement findElement26= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input"));
	     fed.moveToElement(findElement26).click().sendKeys(serviceline).perform();
	     
	      //serviceline click
	     Thread.sleep(1000);
	     WebElement findElement27 = driver.findElement(By.xpath("(//ul[@class=\"item2\"])[2]/li"));
	     findElement27.click();
	     
	     //procedure
	     Thread.sleep(1000);
	     WebElement findElement28=driver.findElement(By.xpath("(//span[text()=\"Select\"])[1]"));
	     findElement28.click();
	     
	     //procedure search 
	     Thread.sleep(1000);
	     WebElement findElement29 = driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])[3]"));
	     fed.moveToElement(findElement29).click().sendKeys(procedure).perform();
	     
	     
	     //procedure click
	     Thread.sleep(1000);
	     WebElement findElement30 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[3]/ng-multiselect-dropdown/div/div[2]/ul[2]/li"));
	       findElement30.click();
	       
	       
	       //Body part
	       Thread.sleep(3000);
	      WebElement findElement31= driver.findElement(By.xpath("(//span[text()=\"Select\"])"));
	      findElement31.click();
	      
	      //body part search 
	      Thread.sleep(3000);

	      WebElement findElement32 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[4]/ng-multiselect-dropdown/div/div[2]/ul[2]/li"));
	      fed.moveToElement(findElement32).click().sendKeys(bodypart).perform();       
	       

//	      //bopdy part click
//	      Thread.sleep(1000);
//	     WebElement findElement33= driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/div[4]/ng-multiselect-dropdown/div/div[2]/ul[2]/li"));
	//  fed.moveToElement(findElement33).click().perform();
	   
	   
	   
	 Thread.sleep(3000);
	 WebElement findElement34 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[2]/div/div/div/div/dx-drop-down-box/div[1]/div/input"));
	 fed.moveToElement(findElement34).click().perform();
	 
	 //workflow name
	 Thread.sleep(1000);
	 WebElement findElement51 = driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div/div/div/input"));
	 findElement51.sendKeys(chooseWorkflow);
	 
	 
	 Thread.sleep(1000);
	 WebElement findElement35 = driver.findElement(By.xpath("/html/body/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
	 fed.moveToElement(findElement35).click().perform();
	 
	 //save
	 Thread.sleep(1000);
	 WebElement save=driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[3]/div"));
	fed.moveToElement(save).click().perform();


	WebElement CINEXT=driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
	CINEXT.click();

	// *************************************************************************************************


	//CLIENT CONTACT INFORMATION

	//CIADD
	Thread.sleep(2000);
	WebElement CIADD=driver.findElement(By.xpath("(//div[text()=\"Add\"])"));
	CIADD.click();

	//CIFIRSTNAME
	Thread.sleep(2000);
	WebElement CIFIRSTNAME = driver.findElement(By.xpath("(//input[@placeholder=\"Enter First Name\"])"));
	fed.moveToElement(CIFIRSTNAME).click().sendKeys(firstname).perform();

	//CILASTNAME
	Thread.sleep(2000);
	WebElement CILASTNAME = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Last Name\"])"));
	fed.moveToElement(CILASTNAME).click().sendKeys(lastname).perform();

	//CIGENDER
	String ss1= "Male";



	if(ss1.equals(genderC)) {
		Thread.sleep(2000);
	WebElement CIGENDERMALE = driver.findElement(By.xpath("(//label[text()=\"Male\"])"));
	CIGENDERMALE.click();
	
	}
	else
	{
		WebElement CIGENDERFEMALE= driver.findElement(By.xpath("(//label[text()=\"Female\"])"));
		CIGENDERFEMALE.click();
		}

	//Email
	Thread.sleep(2000);
	WebElement CIEMAIL = driver.findElement(By.xpath("(//input[@placeholder=\"abd@abc.com\"])"));
	fed.moveToElement(CIEMAIL).click().sendKeys(emailC).perform();


	//Country code
	Thread.sleep(2000);
	WebElement Countrycode = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[3]/div[1]/div/div[1]/select/option[2]"));
	Countrycode.click();




	//Phonono.
	Thread.sleep(2000);
	WebElement Phonono = driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
	fed.moveToElement(Phonono).click().sendKeys(phoneno).perform();

	//Job title
	Thread.sleep(2000);
	WebElement JobTitle = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Job Title\"])"));
	fed.moveToElement(JobTitle).click().sendKeys(Jobtitle).perform();


	//Role
	Thread.sleep(2000);
	WebElement Role = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[4]/div/select/option[3]"));
	JavascriptExecutor js4 = (JavascriptExecutor) driver;
	js4.executeScript("arguments[0].scrollIntoView();", Role);
	Role.click();


	//checkboxCI

	//List<WebElement> findElements2 = driver.findElements(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]"));
	//for (WebElement webElement : findElements2) {
//		String text = webElement.getText();
//		System.out.println(text);
	//	
//		if(text.equals("Set as Primary User")) {
//			Thread.sleep(3000);
//			WebElement Click1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]/div[1]/div/label"));
//			fed.moveToElement(Click1).click().perform();
//		}
	//	
	//}

	//Set as primary user
	Thread.sleep(2000);
	WebElement check = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]/div/div"));

	JavascriptExecutor js41 = (JavascriptExecutor) driver;
	js41.executeScript("arguments[0].scrollIntoView();", check);

	fed.moveToElement(check).click().perform();

	//Show in Patient Care Family
	Thread.sleep(2000);
	WebElement ShowinPatientCareFamily  = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[5]/div[2]/div/label"));
	ShowinPatientCareFamily.click();

	//save
	Thread.sleep(2000);
	WebElement Save = driver.findElement(By.xpath("(//button[@href=\"JavaScript:Void(0);\"])"));
	Save.click();


	//next
	Thread.sleep(2000);
	WebElement Next =driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
	Next.click();


	//serviceline
	Thread.sleep(2000);

	List<WebElement> findElements2 = driver.findElements(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]"));
	for (WebElement webElement : findElements2) {
		String text1 = webElement.getText();
		System.out.println(text1);
	}

	WebElement Serviceline=driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
	Serviceline.click();




	//Multiple Sites of Service
	WebElement MultipleSitesofService = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[1]/div[1]/div[3]/label"));
	MultipleSitesofService.click();


	//Add New Client
	
	
	
//	WebDriverWait wait= new WebDriverWait(driver ,10);
//	
//	Thread.sleep(5000);
//	WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value=\"Save\"])")));
//	JavascriptExecutor j11 = (JavascriptExecutor) driver;
//	j11.executeScript("arguments[0].click();", until); 
//
	Thread.sleep(2000);
	WebElement  AddNewClient= driver.findElement(By.xpath("(//input[@value=\"Save\"])"));
//	AddNewClient.click();
//	
	
fed.moveToElement(AddNewClient).click().perform();

		
	}


	public void Config1() {
		// TODO Auto-generated method stub
		System.out.println("passed");
	}
		
		

   


	



}


     
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
  
  
  
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


