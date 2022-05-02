package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.Static;

public class Sevenstages {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
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
//	    
//	    Thread.sleep(3000);
//        WebElement hospitallogo = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-home/div[1]/div[1]/div/div[2]/div/ul/li[1]/div[2]/label/i"));
//        hospitallogo.click();
//        
//        Thread.sleep(3000);
//        WebElement logoinput = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
//        logoinput.sendKeys("/home/sudalai/Pictures/hospital.jpeg");
//        
//        
//        Thread.sleep(4000);
//        WebElement save = driver.findElement(By.xpath("(//button[text()=\"Save\"])[1]"));
//        save.click();
//        
//        
//        Thread.sleep(3000);
//        WebElement facilitylogo = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-home/div[1]/div[1]/div/div[2]/div/ul/li[2]/div[2]/label/i"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//	      js.executeScript("arguments[0].click();", facilitylogo); 
//	      
//	      Thread.sleep(3000);
//	      WebElement faclogoupload = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-home/div[3]/div/div/div[2]/div/div/form/div[1]/div/span/input[2]"));
//	      faclogoupload.sendKeys("/home/sudalai/Pictures/hospital.jpeg");
//	      
//	      
//	      Thread.sleep(3000);
//	      WebElement save2= driver.findElement(By.xpath("(//button[text()=\"Save\"])[2]"));
//	      JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	      js1.executeScript("arguments[0].click();", save2); 
//        
//	    Thread.sleep(3000);
//	    WebElement clientinformation = driver.findElement(By.xpath("(//span[text()=\"Client Information \"])"));
//         clientinformation.click();
//         
////        part 2
//         Thread.sleep(2000);
//         WebElement clientinfoname = driver.findElement(By.xpath("(//input[@id=\"addressOne\"])"));
//         clientinfoname.click();
//         clientinfoname.sendKeys("drordin");
//         
//         
//         Thread.sleep(2000);
//         WebElement clientinfoname2 = driver.findElement(By.xpath("(//input[@id=\"addressTwo\"])"));
//         clientinfoname2.click();
//         clientinfoname2.sendKeys("clobe");
//         
//         Thread.sleep(2000);
//         WebElement city1 = driver.findElement(By.xpath("(//input[@id=\"city\"])"));
//         city1.click();
//         city1.sendKeys("hobers");
//         
//         Thread.sleep(2000);
//         WebElement state = driver.findElement(By.xpath("(//input[@id=\"State\"])"));
//         state.click();
//         state.sendKeys("metric");
//         
//
//	 	 Thread.sleep(2000);
//	 	   JavascriptExecutor js4 = (JavascriptExecutor) driver;
//	 	   js4.executeScript("window.scrollBy(0,500)");
//         
//        
//         
//         Thread.sleep(2000);
//         WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"zip\"]"));
//         Zipcode.click();
//        Zipcode.sendKeys("600063");
//       
//   
//         
//         Thread.sleep(2000);
//         WebElement countrycode = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-clientinformation/div/div/div/div/div/div/div/div/form/div[6]/div/div/div[1]/select/option[2]"));
//         countrycode.click();
//         
//         
//         
//         
//         Thread.sleep(2000);
//         WebElement Phoneno = driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
//         Phoneno.sendKeys("1234567899");
//         
//      
//         
//         Thread.sleep(1000);
//         WebElement carefamily = driver.findElement(By.xpath("(//span[text()=\"Care Family \"])"));
//         carefamily.click();
//         
//         
//         Thread.sleep(1000);
//         WebElement surgeon = driver.findElement(By.xpath("(//a[text()=\"Surgeon \"])"));
//         surgeon.click();
//         
//         Thread.sleep(1000);
//         WebElement ADDNEW = driver.findElement(By.xpath("(//button[text()=\"Add New\"])"));
//         ADDNEW.click();
//         
//         
//         Thread.sleep(2000);
//         WebElement surgeoncheck = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[3]/div[1]/select/option[2]"));         
//         surgeoncheck.click();
//         
//         String s1="Male";
//         if(s1.contains("Male")) {
	    
//         Thread.sleep(2000);
// WebElement Male = driver.findElement(By.xpath("(//label[text()=\"Male\"])"));
// Male.click();
//         }
//         else
//         {
//        	Thread.sleep(2000);
//        	WebElement female = driver.findElement(By.xpath("(//label[text()=\"Female\"])"));
//            female.click();
//         }
//         
//         
//         Thread.sleep(2000);
//         WebElement firstname = driver.findElement(By.xpath("(//input[@id=\"fname\"])"));
//         firstname.click();
//         firstname.sendKeys("dropels");
//         
//         Thread.sleep(2000);
//         WebElement lastname = driver.findElement(By.xpath("(//input[@id=\"lname\"])"));
//         lastname.click();
//         lastname.sendKeys("gebers");
//         
//         
//          
//         Thread.sleep(2000);
//         WebElement npi = driver.findElement(By.xpath("(//input[@placeholder=\"Enter NPI number\"])"));
//         JavascriptExecutor js11 = (JavascriptExecutor) driver;
//         js11.executeScript("arguments[0].scrollIntoView();", npi);
//         npi.sendKeys("12334563");
//         
//         
//         Thread.sleep(2000);
//         WebElement Speciality=driver.findElement(By.xpath("(//input[@placeholder=\"Enter speciality\"])"));
//        Speciality.click();
//         Speciality.sendKeys("porter");
//         
//         Thread.sleep(3000);
//         WebElement next1 = driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
//         next1.click();
//         
////         part2
//         Thread.sleep(2000);
//         WebElement JobTitle = driver.findElement(By.xpath("(//input[@name=\"Title\"])"));
//         JobTitle.click();
//         JobTitle.sendKeys("leters");
//
//         Thread.sleep(2000);
//         WebElement checkbox1 = driver.findElement(By.xpath("(//label[text()=\"Set As Client Workflow\"])"));
//         checkbox1.click();
//         
//         
//         Thread.sleep(2000);
//         WebElement countrycode1 = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div/div[1]/select/option[2]"));
//         countrycode1.click();
//         
//         
//         Thread.sleep(2000);
//         WebElement mail = driver.findElement(By.xpath("(//input[@id=\"email1\"])"));
//         mail.click();
//         mail.sendKeys("doccode123@gmail.com");
//         
//         Thread.sleep(2000);
//         WebElement bio = driver.findElement(By.xpath("(//textarea[@placeholder=\"Enter Biography\"])"));
//         bio.sendKeys("test area");
//         
//         Thread.sleep(2000);
//         WebElement ShowinPatientCareFamily  = driver.findElement(By.xpath("(//label[text()=\"Show in Patient Care Family \"])"));
//         ShowinPatientCareFamily.click();
//         
//         
//         Thread.sleep(2000);
//         WebElement next2=driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
//         fed.moveToElement(next2).click().perform();
//         
//         
//         Thread.sleep(2000);
//         WebElement grantaccess = driver.findElement(By.xpath("(//label[text()=\"Grant Access to portal\"])"));
//         grantaccess.click();
//         
//         Thread.sleep(2000);
//         WebElement Access = driver.findElement(By.xpath("(//label[text()=\" Access to RecoveryCOACH Onboarding Portal \"])"));
//         Access.click();
//         
//         Thread.sleep(2000);
//         WebElement finalsave = driver.findElement(By.xpath("(//input[@value=\"Save\"])"));
//         finalsave.click();
//         
//         
//         
//         
//         Thread.sleep(5000);
//         WebElement carenavigator = driver.findElement(By.xpath("(//a[text()=\"Care Navigator / Coordinator \"])"));
//         carenavigator.click();
//         
//         
//         Thread.sleep(2000);
//         WebElement addnew2=driver.findElement(By.xpath("(//button[text()=\"Add New\"])"));
//         addnew2.click();
//         
//         Thread.sleep(1000);
//         WebElement check2cn = driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[3]/div[1]/select/option[3]"));
//         check2cn.click();
//         
//         
//         String ss2="Male";
//         if(ss2.contains("Male")) {
//         Thread.sleep(2000);
//         WebElement gender=driver.findElement(By.xpath("(//label[text()=\"Male\"])"));
//         gender.click();
//         }
//         else {
//        	 Thread.sleep(1000);
//        	 WebElement female=driver.findElement(By.xpath("(//label[text()=\"Female\"])"));
//              female.click();
//         }
//          Thread.sleep(2000);
//          WebElement fname=driver.findElement(By.xpath("(//input[@id=\"fname\"])"));
//          fname.click();
//          fname.sendKeys("gill");
//         
//          Thread.sleep(2000);
//          WebElement lastname2=driver.findElement(By.xpath("(//input[@id=\"lname\"])"));
//          lastname2.click();
//          lastname2.sendKeys("jiverd");
//          
//          Thread.sleep(2000);
//          WebElement nextcn=driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
//          JavascriptExecutor js112 = (JavascriptExecutor) driver;
//          js112.executeScript("arguments[0].scrollIntoView();", nextcn);
//          nextcn.click();
//          
//          
//          
//          
//         
//        
//         Thread.sleep(3000);
//         WebElement Jobtitle2 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Job Title\"])"));
//         Jobtitle2.click();
//         Jobtitle2.sendKeys("fillip");
//         
//         Thread.sleep(2000);
//        WebElement  countrycode2=driver.findElement(By.xpath("/html/body/modal-container/div/div/div/div[2]/div/form/div/div/div[2]/div[1]/div/div[1]/select/option[2]"));         
//         countrycode2.click();
//         
//         
//         Thread.sleep(2000);
//        WebElement phoneno2= driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
//        phoneno2.click();
//        phoneno2.sendKeys("1234567899");
//        
//        
//        Thread.sleep(2000);
//        WebElement email2=driver.findElement(By.xpath("(//input[@id=\"email\"])"));
//        email2.click();
//        email2.sendKeys("codes@gmail.com");
//        
//        Thread.sleep(2000);
//       WebElement bio2= driver.findElement(By.xpath("(//textarea[@placeholder=\"Enter Biography\"])"));
//        bio2.sendKeys("test area");
//        
//        Thread.sleep(2000);
//        WebElement check2=driver.findElement(By.xpath("(//label[text()=\"Show in Patient Care Family \"])"));
//        check2.click();
//        
//        
//        Thread.sleep(1000);
//       WebElement check3= driver.findElement(By.xpath("(//label[text()=\"Set As Primary User\"])"));
//        check3.click();
//       
//       Thread.sleep(1000);
//       WebElement next3= driver.findElement(By.xpath("(//button[text()=\"Next\"])"));
//       next3.click();
//       
//       
//       Thread.sleep(2000);
//     WebElement grantaccess2=  driver.findElement(By.xpath("(//label[text()=\"Grant Access to portal\"])"));
//     grantaccess2.click();
//     
//     Thread.sleep(2000);
//    WebElement permission2= driver.findElement(By.xpath("(//label[text()=\" Access to RecoveryCOACH Onboarding Portal \"])"));
//       permission2.click();
//       
//       Thread.sleep(2000);
//     WebElement save3=  driver.findElement(By.xpath("(//input[@value=\"Save\"])"));
//       save3.click();
//       
//       
//        Thread.sleep(3000);
//         WebElement MytoDo = driver.findElement(By.xpath("(//span[text()=\"My To-Do's \"])"));
//         MytoDo.click();
//         
//         Thread.sleep(3000);
//         WebElement clientconfig = driver.findElement(By.xpath("(//span[text()=\"Client Configuration\"])"));
//         clientconfig.click();
//         
//         Thread.sleep(1000);
//         WebElement Inpatient  = driver.findElement(By.xpath("(//tr[@role=\"row\"])/th"));
//         Inpatient.click();
//         String text2 = Inpatient.getText();
//          System.out.println(text2);         
//         
//         
//         if(text2.contains("crapers")) {
//        	 WebElement on = driver.findElement(By.xpath("(//label[text()=\"On\"])"));
//             on.click();
//         }
//         else {
//        	 WebElement off = driver.findElement(By.xpath("(//label[text()=\"Off\"])"));
//             off.click();
//         }
//         
//         
//         Thread.sleep(3000);
//         WebElement userconfig = driver.findElement(By.xpath("(//span[text()=\"User Configuration\"])"));
//         userconfig.click();
//         
//         
//        
//         
//         Thread.sleep(2000);
//         WebElement general = driver.findElement(By.xpath("(//span[text()=\"General Configuration \"])"));
//         general.click();
//         
         Thread.sleep(2000);
         WebElement Activities = driver.findElement(By.xpath("(//span[text()=\"Activities \"])"));
         Activities.click();
         
         
         
         Thread.sleep(1000);
         JavascriptExecutor js41 = (JavascriptExecutor) driver;
    		 js41.executeScript("window.scrollBy(0,500)");
        
    		 
         Thread.sleep(2000);
         WebElement doc1 = driver.findElement(By.xpath("(//span[text()=\"Document\"])"));
        
         doc1.click();
         
         Thread.sleep(2000);
         WebElement search=driver.findElement(By.xpath("(//input[@role=\"textbox\"])[2]"));
         search.click();
         search.sendKeys("hecmg");
         
         Thread.sleep(2000);
         WebElement turnonoff= driver.findElement(By.xpath("(//label[text()=\"On"
         		+ "\"])"));
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js1.executeScript("arguments[0].scrollIntoView();", turnonoff);
         Thread.sleep(1000);
         turnonoff.click();
        
        
         
         
        
         Thread.sleep(2000);
        WebElement view= driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div[2]/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div/a[2]/i"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", view);
      Thread.sleep(1000);
        view.click();
       
        
        Thread.sleep(2000);
        WebElement viewclose=driver.findElement(By.xpath("(//span[text()=\"×\"])[4]"));
        JavascriptExecutor js21 = (JavascriptExecutor) driver;
        js21.executeScript("arguments[0].scrollIntoView();",viewclose);
        Thread.sleep(1000);
        viewclose.click();
        
        
        
        Thread.sleep(2000);
         WebElement bulletinboard = driver.findElement(By.xpath("(//a[@id=\"1\"])[2]"));
     bulletinboard.click();
     
       
       Thread.sleep(2000);
       WebElement bulletinturnonoff=driver.findElement(By.xpath("(//label[@for=\"yes1\"])"));
       bulletinturnonoff.click();
       
       Thread.sleep(2000);
       WebElement bulletsearch=driver.findElement(By.xpath("(//input[@role=\"textbox\"])"));
       JavascriptExecutor js212 = (JavascriptExecutor) driver;
       js212.executeScript("arguments[0].scrollIntoView();",bulletsearch);
         bulletsearch.sendKeys("mercton");
         
         Thread.sleep(2000);
         WebElement bulletinname = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div/div/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/p/span"));
            
         String text = bulletinname.getText();
         System.out.println(text);
         
         if(text.contains("mercton")) {
        	 Thread.sleep(3000);
        	  WebElement on = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div/div/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/span/div[1]/label"));
              on.click();
        	 
        
         }
         else {
        	
        	 WebElement off = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div/div/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/span/div[2]/label"));
             off.click();   
         }
         
         
         Thread.sleep(2000);
       WebElement view2= driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-activityboard/div/div/div/div/div/div/ngb-tabset/div/div/div/div/ngb-tabset/div/div/div[2]/div/div/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div/a[2]/i"));
       JavascriptExecutor js213 = (JavascriptExecutor) driver;
       js213.executeScript("arguments[0].scrollIntoView();",view2);
       Thread.sleep(1000);
       view2.click();
       
       Thread.sleep(3000);
       WebElement lastclose= driver.findElement(By.xpath("(//span[text()=\"×\"])[4]"));
       lastclose.click();
        
        Thread.sleep(2000);
         WebElement config = driver.findElement(By.xpath("(//span[text()=\"Config \"])"));
         config.click();
         
         Thread.sleep(2000);
         WebElement editconfig = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-user/div[1]/app-careplan/div/div/app-baseconfig/div/div/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/div/i"));
         editconfig.click();
         
         Thread.sleep(2000);
         WebElement back = driver.findElement(By.xpath("(//button[text()=\"Back\"])"));
         back.click();
        
         
         
         
         
         
         
         
      
         
         
         
	}

}
