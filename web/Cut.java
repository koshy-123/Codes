package web;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Cut {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("http://192.168.6.100:5050/ob-ui/#/login");
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
	    
	    Thread.sleep(2000);
	    WebElement clientsearch = driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
	    fed.moveToElement(clientsearch).click().perform();
	    clientsearch.sendKeys("Test client");
	    
	    WebElement clientname = driver.findElement(By.xpath("(//span[text()=\"test client\"])[1]"));
	    clientname.click();
	   
	// ********************************************************************************************************
//	    Thread.sleep(3000);
//	    WebElement Home = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-home/div[1]/div[1]/div/div[2]/div/ul/li[1]/div[2]/label/i"));
//	    Home.click();
	//   
//	    Thread.sleep(2000);
//	    WebElement fileupload = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
//	    fileupload.sendKeys("/home/sudalai/Pictures/hospital.jpeg");
	//
//	    Thread.sleep(000);
//	    WebElement saves =  driver.findElement(By.xpath("(//button[text()=\"Save\"])")); 
	//saves.click();
	//    
//	    Thread.sleep(2000);
//	    JavascriptExecutor js312 = (JavascriptExecutor) driver;
//	    js312.executeScript("window.scrollBy(0,100)");
	//    
//	    Thread.sleep(1000);
//	    WebElement facility = driver.findElement(By.xpath("(//label[text()=\"Upload your facility image \"])"));
	//   fed.moveToElement(facility).click().perform();
//	 	  
//	 	  WebElement facilitylogo = driver.findElement(By.xpath("(//input[@name=\"logofile\"])[2]"));
//	 	  facilitylogo.sendKeys("/home/sudalai/Pictures/specialtiy.jpeg");
//	 	 
//	 	  Thread.sleep(3000);
//	 	  WebElement save2 = driver.findElement(By.xpath("(//button[text()=\"Save\"])[2]"));
//	 	  JavascriptExecutor js2 = (JavascriptExecutor) driver;
//	 	  js2.executeScript("arguments[0].scrollIntoView();", save2);
//	 	 fed.moveToElement(save2).click().perform();
	 	 
	      Thread.sleep(2000);
	 	 WebElement clientinformation = driver.findElement(By.xpath("(//a[@href=\"#/home/clientinformation\"])"));
	 	 clientinformation.click();
	 	 
	 	    Thread.sleep(2000);
	 	 WebElement clientaddress = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Address Line 1\"])"));
	      fed.moveToElement(clientaddress).click().sendKeys("willson street").perform();
	      
	      Thread.sleep(2000);
	      WebElement address2 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Address Line 2\"])"));
	     address2.click();
	     address2.sendKeys("churchwill");
	      
	      Thread.sleep(2000);
	      WebElement clientcity = driver.findElement(By.xpath("(//input[@placeholder=\"Enter City\"])"));
	      clientcity.click();
	      clientcity.sendKeys("Norway");
	      
	      Thread.sleep(2000);
	      WebElement state = driver.findElement(By.xpath("(//input[@placeholder=\"Enter State\"])"));
	 	state.click();
	 	state.sendKeys("greyman");
	 	 
	 	 
	 	 Thread.sleep(2000);
	 	   JavascriptExecutor js4 = (JavascriptExecutor) driver;
	 	   js4.executeScript("window.scrollBy(0,500)");
	 	   
	 	    Thread.sleep(2000);
	 	 WebElement clientzip = driver.findElement(By.xpath("//*[@id=\"zip\"]"));
	 	  clientzip.click();
	 	  clientzip.sendKeys("12345");
	 	  
	      Thread.sleep(1000);
	      WebElement code = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-clientinformation/div/div/div/div/div/div/div/div/form/div[6]/div/div/div[1]/select/option[2]"));
	     code.click();
	     
	     Thread.sleep(2000);
	     WebElement phonenumber = driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
	     phonenumber.click();
	     phonenumber.sendKeys("1234567898");
	     
	    
	     
	     
	     Thread.sleep(2000);
	 	   JavascriptExecutor js5 = (JavascriptExecutor) driver;
	 	   js5.executeScript("window.scrollBy(0,-500)");
	 	   
//	 	   ************************
			
	 	  Thread.sleep(3000);
	 	  WebElement cn = driver.findElement(By.xpath("(//a[text()=\"Care Navigator / Coordinator \"])"));

	 	  Actions ss= new Actions(driver);
	 	  ss.moveToElement(cn).click().perform();



	 	    


	 	  	Thread.sleep(3000);
	 	  	WebElement addnew2 = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-carefamily/div/div[2]/div/div/div/div/div[1]/div/button[2]"));
	 	  	boolean enabled2 = addnew2.isEnabled();
	 	  	System.out.println(enabled2);
	 	  	ss.moveToElement(addnew2).click().perform();
	 	  	
	 	  	
	 	  	Thread.sleep(3000);
	 	  	WebElement cnchoosing  = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/select/option[3]"));
	 	  	boolean displayed = cnchoosing.isDisplayed();
	 	  	System.out.println(displayed);
	 	  	cnchoosing.click();
	 	  	
	 	  	String sd1="Male";
	 	  	
	 	  	
	 	  	
	 	  	if (sd1.contains("Male")) {
	 	  	
	 	  	Thread.sleep(1000);
	 	  	WebElement male=driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[2]/div[1]/label"));
	 	  	male.click();
	 	  	}
	 	  	else {
	 	  		Thread.sleep(1000);
	 	  		WebElement Female =	driver.findElement(By.xpath("(label[text()=\"Female\"])"));
	 	  	}
	 	  	
	 	  	
	 	  	
	 	  	Thread.sleep(2000);
	 	  	WebElement firstname1=driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	 	  	firstname1.sendKeys("groger");
	 	  	
	 	  	Thread.sleep(1000);
	 	  	WebElement Secondname1=driver.findElement(By.xpath("//*[@id=\"lname\"]"));
	 	  	Secondname1.sendKeys("herbers");
	 	  	
//	 	  	Thread.sleep(2000);
//	 	  	 List<WebElement> gender= driver.findElements(By.xpath("(div[@class=\"col-xl-4\"])"));
	 	  //	
//	 	  	 for (WebElement webElement : gender) {
//	 	  		String text = webElement.getText();
//	 	  		System.out.println(text);
//	 	  	 String d11= "Male";
//	 	  	 
//	 	  	 if(text.contains(d11)) {
//	 	  		 WebElement male = driver.findElement(By.xpath("(label[text()=\"Male\"])"));
//	 	  		 boolean displayed1 = male.isDisplayed();
//	 	  		 System.out.println(displayed1);
//	 	  		male.click();
//	 	  		 
//	 	  	 }
//	 	  	 
//	 	  	 else {
//	 	  		 WebElement female = driver.findElement(By.xpath("(label[text()=\"Female\"])"));
//	 	  		 boolean displayed1 = female.isDisplayed();
//	 	  		 System.out.println(displayed1);
//	 	  		female.click();
//	 	  	 }
//	 	  	 
//	 	  	 
//	 	  	}
//	 	  	 
//	 	  	 
//	 	  	 Thread.sleep(1000);
//	 	       WebElement firstname11 = driver.findElement(By.xpath("(input[@placeholder=\"Enter First Name\"])"));
//	 	       fed.moveToElement(firstname11).click().sendKeys("selton").perform();
//	 	       
//	 	       Thread.sleep(1000);
//	 	       WebElement lastname1 = driver.findElement(By.xpath("(input[@placeholder=\"Enter Last Name\"])"));
//	 	       fed.moveToElement(lastname1).click().sendKeys("drog").perform();
//	 	       
	 	       
	 	       Thread.sleep(1000);
	 	       WebElement next11 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/ul/li/button"));
	 	       JavascriptExecutor js14 = (JavascriptExecutor) driver;
	 	       js14.executeScript("arguments[0].click();", next11); 
	 	      
	 	       
	 	       Thread.sleep(2000);//
	 	       WebElement Jobtitle1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[1]/div/div/input"));
	 	       Jobtitle1.click();
	 	       Jobtitle1.sendKeys("trepples"); 
	 	       
	 	       
	 	       Thread.sleep(1000);
	 	       List<WebElement> Phonecode1 = driver.findElements(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/div[1]/div/div[1]/select/option[2]"));
	 	      
	 	       for (WebElement webElement : Phonecode1) {
	 	     	String text = webElement.getText();
	 	  		System.out.println(text);
	 	  		String s111="UK +44";
	 	  		
	 	  	}
	 	       WebElement phonecode1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/div[1]/div/div[1]/select/option[2]"));
	 	  		phonecode1.click();
	 	       
	 	     Thread.sleep(2000);
	 	     WebElement phonecode121 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/div[1]/div/div[2]/input"));
	 	     phonecode121.click();
	 	     phonecode121.sendKeys("12345678924");
	 	     
	 	     Thread.sleep(1000);
	 	     WebElement mail1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	 	     mail1.sendKeys("cambridge@gmail.com");
	 	     
	 	     Thread.sleep(1000);
	 	     WebElement Bio1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/div[3]/div/textarea"));
	 	     Bio1.sendKeys("test area");
	 	     
	 	     
	 	  //   Show in Patient Care Family or  Set As Primary User
	 	    String s111="Show in Patient Care Family";
	 	    String s2131="Set As Primary User";
	 	      
	 	     if(s111.contains("Show in Patient Care Family")) {
	 	     Thread.sleep(1000);
	 	     WebElement checkin11 = driver.findElement(By.xpath("(div[@class=\"col-xl-6 mb-3\"])[2]"));
	 	     checkin11.click();
	 	      }
	 	     else {
	 	     	WebElement checkin21 = driver.findElement(By.xpath("(div[@class=\"col-xl-6 mb-3\"])[3]"));
	 	     	checkin21.click();
	 	     }
	 	     
	 	     Thread.sleep(1000);
	 	    WebElement next21= driver.findElement(By.xpath("(button[text()=\"Next\"])"));
	 	    JavascriptExecutor js211 = (JavascriptExecutor) driver;
	 	    js211.executeScript("arguments[0].click();", next21);  
	 	     
	 	     
	 	    
	 	    Thread.sleep(1000);
	 	    WebElement Grantaccess1 = driver.findElement(By.xpath("(label[text()=\"Grant Access to portal\"])"));
	 	    Grantaccess1.click();
	 	     
	 	    
	 	    List<WebElement> findElements1 = driver.findElements(By.xpath("(div[@class=\"row\"])[3]"));
	 	    String ss11=" Access to RecoveryCOACH Portal ";
	 	    String ss21=" Access to RecoveryCOACH Reports ";
	 	    
	 	     for (WebElement webElement : findElements1) {
	 	  		String text = webElement.getText();
	 	  		System.out.println(text);
	 	  		
	 	  	 
	 	  	}
	 	  //   enabled or not
	 	     Thread.sleep(2000);
	 	     WebElement set11 = driver.findElement(By.xpath("(label[text()=\" Access to RecoveryCOACH Portal \"])"));
	 	  	boolean enabled1 = set11.isEnabled();
	 	  	System.out.println(enabled1);
	 	  	
	 	  	Thread.sleep(2000);
	 	     WebElement set21 = driver.findElement(By.xpath("(label[text()=\" Access to RecoveryCOACH Reports \"])"));
	 	  	boolean enabled21 = set21.isEnabled();
	 	  	System.out.println(enabled21);
	 	  	
	 	  	
//	 	  	validation and click 3rdcheck in
	 	  	if(set11.isEnabled()&set21.isEnabled()) {
	 	  		
	 	  		Thread.sleep(2000);
	 	  		WebElement checkin31 = driver.findElement(By.xpath("(label[text()=\" Access to RecoveryCOACH Onboarding Portal \"])"));
	 	  	    checkin31.click();
	 	  	}
	 	  	Thread.sleep(1000);
	 	  	WebElement save21 = driver.findElement(By.xpath("(input[@type=\"submit\"])"));
	 	  	save21.click(); 
	 	   //*********************
	}

}
