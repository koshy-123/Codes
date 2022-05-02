package web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

class OnBoard implements Intellect{

static WebDriver driver;






String[][] Rcadmin=null;
@DataProvider(name="Rc")
public String[][] entry1() throws BiffException, IOException {
	// TODO Auto-generated method stub
	Rcadmin=powerhouse1();
System.out.println(Rcadmin);	
	return Rcadmin;	
}


public String[][] powerhouse1() throws BiffException, IOException {
	// TODO Auto-generated method stub
	FileInputStream file2= new FileInputStream("/home/sudalai/Documents/reelonboard.xls");
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




//@AfterTest	
// public void aftertst() {
// driver.close();
//	 
// }
//


//@AfterTest	
//public void aftertst() {
//driver.close();
//	 
//}
//


@BeforeTest
public void beforetest1() throws InterruptedException {
	// TODO Auto-generated method stub
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

@Test(dataProvider="Rc")
public void Logicompletion1(CharSequence searchbox, CharSequence stagesearch, String surgerystage, CharSequence stagesdayfrom, CharSequence stagesdayto, String caresearch, String carecard,CharSequence surgicsatge, CharSequence SurgicalType, CharSequence AssignedDay, CharSequence OverdueDay, CharSequence ExpirationDay, CharSequence todosearch, CharSequence Assignruletype, CharSequence assignrulecount, CharSequence assigndatetext, CharSequence expiryrule, CharSequence expiryruletext, CharSequence expirydatetext, CharSequence AssignDateResult, CharSequence ExpiryDateResult,  CharSequence Appoinmentsearch, CharSequence AppoinAssignruletype, CharSequence Appoinassignrulecount, CharSequence appoinassigndatetext, CharSequence Appoinexpiryrule, CharSequence Appoinexpiryruletext, CharSequence Appoinexpirydatetext, CharSequence AppoinAssignDateResult, CharSequence AppoinExpiryDateResult,CharSequence pushtoonboard) throws InterruptedException  {
	// TODO Auto-generated method stub
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-workflow/div/div/div[1]/div/div/h2"));
Actions set= new Actions(driver);
set.moveToElement(findElement).click().perform();

Thread.sleep(2000);
WebElement findElement2 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
findElement2.click();
findElement2.sendKeys(searchbox);

Thread.sleep(2000);
WebElement findElement3 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/span[1]/i"));
findElement3.click();

Thread.sleep(2000);
WebElement findElement4 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[1]/div/div/ul/li[1]/a"));
findElement4.click();


Thread.sleep(2000);

WebElement findElement5 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
findElement5.click();
findElement5.sendKeys(stagesearch);


Thread.sleep(2000);
WebElement findElement6 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/a/i"));
findElement6.click();

//Stages

Thread.sleep(2000);
WebElement findElement7 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/dx-select-box/div/div/div[2]/div[2]/div/div"));
findElement7.click();

Thread.sleep(2000);
WebElement findElement8 = driver.findElement(By.xpath(surgerystage));
findElement8.click();
String text = findElement8.getText();
System.out.println(text);


Thread.sleep(2000);
WebElement delete = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div/a/i"));
delete.click();

String s1="SURGERY";
String s2="NO-SURGERY";
String s3="BEFORE-SURGERY";
String s4="AFTER-SURGERY";

   if(s1.equals(text)) {
	   
	   Thread.sleep(2000);
	   WebElement findElement91 = driver.findElement(By.xpath("//*[@id=\"stage_fromdate\"]"));
	WebElement findElement9 = findElement91;
	   findElement9.click();
	   findElement9.sendKeys(stagesdayfrom);
	   
	   Thread.sleep(2000);
	   WebElement findElement10 = findElement91;
	   findElement10.click();
	   findElement10.sendKeys(stagesdayto);
	   
	   
	   Thread.sleep(2000);
	   WebElement findElement11 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/button"));
	   findElement11.click();
	   
	   Thread.sleep(2000);
	   WebElement findElement12 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/button[2]"));
	   
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", findElement12);
	   findElement12.click();
	   
	   
	   
	   
	   
   } 
   else if(s2.equals(text)) {
	   
	   Thread.sleep(2000);
	   WebElement findElement9 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/button"));
	   findElement9.click();
	   
	   Thread.sleep(2000);
	  WebElement findElement101= driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/button[2]"));
	   findElement101.click();
	
   }
   else if(s3.equals(s3)) {
	   
	   Thread.sleep(2000);
	 WebElement findElement102=  driver.findElement(By.xpath("//*[@id=\"stage_fromdate\"]"));
	 findElement102.click();
	 findElement102.clear();
	 findElement102.sendKeys(stagesdayfrom);
	 
	 
	   Thread.sleep(2000);
		 WebElement findElement103=  driver.findElement(By.xpath("//*[@id=\"stage_todate\"]"));
		 findElement103.click();
		 findElement103.clear();
		 findElement103.sendKeys(stagesdayto);
		 

		   Thread.sleep(2000);
		   WebElement findElement104 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/button"));
		   findElement104.click();
		   
		
		   Thread.sleep(2000);
		   WebElement findElement12 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/button[2]"));
		   
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("arguments[0].scrollIntoView();", findElement12);
		   findElement12.click();
	    
	   
   }
   else if(s4.equals(text)) {
	   
	   
	   
	   Thread.sleep(2000);
		 WebElement findElement102=  driver.findElement(By.xpath("//*[@id=\"stage_fromdate\"]"));
		 findElement102.click();
		 findElement102.clear();
		 findElement102.sendKeys(stagesdayfrom);
		 
		 
		   Thread.sleep(2000);
			 WebElement findElement103=  driver.findElement(By.xpath("//*[@id=\"stage_todate\"]"));
			 findElement103.click();
			 findElement103.clear();
			 findElement103.sendKeys(stagesdayto);
			 

			   Thread.sleep(2000);
			   WebElement findElement104 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/button"));
			   findElement104.click();
			   
			
			   Thread.sleep(2000);
			   WebElement findElement12 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/button[2]"));
			   
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        js1.executeScript("arguments[0].scrollIntoView();", findElement12);
			   findElement12.click();
	   
   }

             
  //care card
   
   Thread.sleep(2000);
   WebElement findElement9 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[1]/div/div/ul/li[2]/a"));
   findElement9.click();
   


 
   
   Thread.sleep(2000);
   WebElement find = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
   find.sendKeys(caresearch);
   
   Thread.sleep(2000);
   WebElement findElement11 = driver.findElement(By.xpath(carecard));
   findElement11.click();
   String text2 = findElement11.getText();
   System.out.println(text2);  
   
   


 Thread.sleep(2000);
 WebElement frshsearch=driver.findElement(By.xpath("(//tbody[@role=\"presentation\"])[12]/tr[1]/td[2]"));
 String get1 = frshsearch.getText();
 System.out.println(get1);
   
   if(text2.contains(get1)) {
	   WebElement findElement71 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div/a[1]/i"));
	   findElement71.click();
	   
	  Thread.sleep(2000);
	  WebElement findElement81 = driver.findElement(By.xpath("(//option[text()=\"DOS Based\"])"));
	  findElement81.click();
	  
	  
	  WebElement findElement101 = driver.findElement(By.xpath("(//span[text()=\"Select \"])"));
	  findElement101.click();
	  
	  WebElement findElement121 = driver.findElement(By.xpath("(//input[@name=\"search-text\"])"));
	  findElement121.sendKeys(surgicsatge);
	  
	  Thread.sleep(2000);
	  WebElement findElement131 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/ngx-select-dropdown/div/div/ul[2]"));
	  findElement131.click();
	  
	  Thread.sleep(2000);
	  WebElement findElement141 = driver.findElement(By.xpath("(//input[@placeholder=\"Surgical Type\"])"));
	  findElement141.click();
	  findElement141.sendKeys(SurgicalType);
	  
	  Thread.sleep(2000);
	  WebElement findElement151 = driver.findElement(By.xpath("(//input[@name=\"assigndate\"])"));
	  findElement151.sendKeys(AssignedDay);
	  
	  Thread.sleep(1000);
	  WebElement findElement161 = driver.findElement(By.xpath("(//input[@name=\"overDuedate\"])"));
	  findElement161.sendKeys(OverdueDay);
	  
	  Thread.sleep(2000);
	  WebElement findElement17 = driver.findElement(By.xpath("(//input[@formcontrolname=\"expirationdate\"])"));
	  findElement17.sendKeys(ExpirationDay);
	  
	  Thread.sleep(2000);
	  WebElement findElement181 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("arguments[0].scrollIntoView();", findElement181);
    set.moveToElement(findElement181).click().perform();
	  
    Thread.sleep(2000);
    WebElement findElement19 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/button[2]"));
    findElement19.click();
    
    
    
	    }
   
 WebElement cancelbackup=  driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/button[1]"));
   cancelbackup.click();
//   //bulletin care card
//   WebElement findElement71 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[1]/div/div/ul/li[3]/a"));
//   findElement71.click();
//   
//   Thread.sleep(2000);
//WebElement findElement81 = driver.findElement(By.xpath("(//input[@role=\"textbox\"])[3]"));  
//findElement81.sendKeys(bulletin);
//   
//Thread.sleep(2000);
//WebElement findElement101 = driver.findElement(By.xpath("(//i[@tooltip=\"View\"])"));
//findElement101.click();

//b
//scroll via visible element
   
   Thread.sleep(2000);
 WebElement findElement120=  driver.findElement(By.xpath("(//a[@href=\"#appointments\"])"));
 findElement120.click();
   
   //todo
   
   
   Thread.sleep(2000);
   WebElement findElement10 = driver.findElement(By.xpath("(//a[@href=\"#todos\"])"));
   JavascriptExecutor js1 = (JavascriptExecutor) driver;
   js1.executeScript("arguments[0].scrollIntoView();", findElement10);
   findElement10.click();
   
   
   Thread.sleep(2000);
   WebElement findElement12 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"
   		+ ""));
  set.moveToElement(findElement12).click().sendKeys(todosearch).perform();
  
   
   Thread.sleep(2000);
   WebElement findElement13 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div/a/i"));
   findElement13.click();
   
   //assign rule
   Thread.sleep(2000);
   WebElement findElement14 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
   findElement14.click();
   
   
   Thread.sleep(2000);
   WebElement findElement15 = driver.findElement(By.xpath("(//div[@title=\"Add Condition\"])"));
   findElement15.click();
   
   Thread.sleep(2000);
   WebElement findElement16 = driver.findElement(By.xpath("(//input[@placeholder=\"Rule type\"])"));
   findElement16.click();
   findElement16.sendKeys(Assignruletype);
   
   
   
   
   Thread.sleep(2000);
   WebElement findElement17 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/div[2]/dx-select-box/div[1]/div/div[1]/input"));
   set.moveToElement(findElement17).click().perform();
   
   
   Thread.sleep(2000);
WebElement findElement18 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement18).click().perform();


Thread.sleep(2000);
WebElement findElement19 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
set.moveToElement(findElement19).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(assignrulecount).perform();





////assign date rule
//
Thread.sleep(1000);
WebElement findElement21 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[3]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
set.moveToElement(findElement21).click().perform();


Thread.sleep(2000);
WebElement findElement22=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
set.moveToElement(findElement22).click().perform();

Thread.sleep(2000);
WebElement findElement23 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[3]/div/div[2]/dx-select-box[2]/div/div/div[1]/input"));
set.moveToElement(findElement23).click().perform();

Thread.sleep(2000);
WebElement findElement24=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement24).click().perform();

Thread.sleep(2000);
WebElement findElement25 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[3]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
Thread.sleep(2000);
set.moveToElement(findElement25).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(assigndatetext).perform();
//
////expiry rule
//
Thread.sleep(2000);
WebElement findElement26 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
set.moveToElement(findElement26).click().perform();

Thread.sleep(2000);
WebElement findElement27=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
set.moveToElement(findElement27).click().perform();


Thread.sleep(2000);
WebElement findElement28 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[2]/input"));
findElement28.sendKeys(expiryrule);

Thread.sleep(2000);
WebElement findElement29 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[2]/dx-select-box[1]/div/div/div[1]/input"));
set.moveToElement(findElement29).click().perform();

Thread.sleep(2000);
WebElement findElement30=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement30).click().perform();


Thread.sleep(2000);
WebElement findElement31 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
set.moveToElement(findElement31).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(expiryruletext).perform();
//

//expiry date result

Thread.sleep(2000);
WebElement findElement32 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
set.moveToElement(findElement32).click().perform();

Thread.sleep(2000);
WebElement findElement33=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
set.moveToElement(findElement33).click().perform();

Thread.sleep(2000);
WebElement findElement34 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/div/div[2]/dx-select-box[2]/div/div/div[1]/input"));
set.moveToElement(findElement34).click().perform();

Thread.sleep(2000);
WebElement findElement35=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement35).click().perform();


Thread.sleep(2000);
WebElement findElement36 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
set.moveToElement(findElement36).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(expirydatetext).perform();
//


//Assign Date Result

Thread.sleep(2000);
WebElement findElement20 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[6]/input"));
JavascriptExecutor js11 = (JavascriptExecutor) driver;
js11.executeScript("arguments[0].scrollIntoView();", findElement20);
set.moveToElement(findElement20).click().sendKeys(AssignDateResult).perform();

//Expiry date result

Thread.sleep(2000);
WebElement findElement37 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[7]/input"));
JavascriptExecutor js2 = (JavascriptExecutor) driver;
js2.executeScript("arguments[0].scrollIntoView();", findElement20);
set.moveToElement(findElement37).click().sendKeys(ExpiryDateResult).perform();

//add
WebElement findElement38 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[8]/button"));
findElement38.click();

//save all
WebElement findElement39 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/button[2]"));
findElement39.click();










//cancel
WebElement findElement201=driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div/form/button[1]"));
JavascriptExecutor js25 = (JavascriptExecutor) driver;
js25.executeScript("arguments[0].scrollIntoView();", findElement201);
set.moveToElement(findElement201).click().perform();


//Appoinment 
Thread.sleep(2000);
WebElement Appoinment =driver.findElement(By.xpath("(//a[text()=\" Appointments \"])"));
Appoinment.click();

Thread.sleep(2000);
WebElement Appoinsearch=driver.findElement(By.xpath("(//input[@role=\"textbox\"])[6]"));
Appoinsearch.sendKeys(Appoinmentsearch);

Thread.sleep(2000);
WebElement searchclick=driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/dx-data-grid/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div/a/i"));
searchclick.click();

//assign rule
Thread.sleep(1000);
WebElement findElement141 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[1]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
findElement141.click();


Thread.sleep(2000);
WebElement findElement151 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
findElement151.click();

Thread.sleep(2000);
WebElement findElement161 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[1]/div/div[2]/input"));
findElement161.click();
findElement161.sendKeys(AppoinAssignruletype);




Thread.sleep(2000);
WebElement findElement171 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[1]/div/div[2]/dx-select-box[1]/div/div/div[1]/input"));
set.moveToElement(findElement171).click().perform();


Thread.sleep(2000);
WebElement findElement181 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement181).click().perform();


Thread.sleep(2000);
WebElement findElement191= driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
set.moveToElement(findElement191).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Appoinassignrulecount).perform();





////assign date rule
//
Thread.sleep(1000);
WebElement findElement211 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[3]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
set.moveToElement(findElement211).click().perform();


Thread.sleep(2000);
WebElement findElement221=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
set.moveToElement(findElement221).click().perform();

Thread.sleep(2000);
WebElement findElement231 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[3]/div/div[2]/dx-select-box[1]/div/div/div[1]/input"));
set.moveToElement(findElement231).click().perform();

Thread.sleep(2000);
WebElement findElement241=driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[3]/div/div[2]/dx-select-box[2]/div/div/div[1]/input"));
set.moveToElement(findElement241).click().perform();

Thread.sleep(2000);
WebElement findElement251 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[3]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));

Thread.sleep(2000);
set.moveToElement(findElement251).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(appoinassigndatetext).perform();

//expiry rule

//
Thread.sleep(1000);
WebElement findElement261 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
set.moveToElement(findElement261).click().perform();

Thread.sleep(1000);
WebElement findElement271=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
set.moveToElement(findElement271).click().perform();


Thread.sleep(1000);
WebElement findElement281 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div[2]/input"));
findElement281.sendKeys(Appoinexpiryrule);

Thread.sleep(1000);
WebElement findElement291 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div[2]/dx-select-box[1]/div/div/div[1]/input"));
set.moveToElement(findElement291).click().perform();

Thread.sleep(1000);
WebElement findElement301=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement301).click().perform();


Thread.sleep(1000);
WebElement findElement311 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
set.moveToElement(findElement311).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Appoinexpiryruletext).perform();
//

//expiry date result

Thread.sleep(1000);
WebElement findElement321 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[4]/div/div/dx-drop-down-button/div/div/div/div/i[1]"));
set.moveToElement(findElement321).click().perform();

Thread.sleep(1000);
WebElement findElement331=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div"));
set.moveToElement(findElement331).click().perform();

Thread.sleep(1000);
WebElement findElement341 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[4]/div/div[2]/dx-select-box[2]/div[1]/div/div[1]/input"));
set.moveToElement(findElement341).click().perform();

Thread.sleep(1000);
WebElement findElement351=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div"));
set.moveToElement(findElement351).click().perform();


Thread.sleep(1000);
WebElement findElement361 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[4]/div/div[2]/div/div/dx-number-box/div/div[1]/input"));
set.moveToElement(findElement361).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Appoinexpirydatetext).perform();
//


//Assign Date Result

Thread.sleep(3000);
WebElement findElement200 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[6]/input"));
JavascriptExecutor js111 = (JavascriptExecutor) driver;
js111.executeScript("arguments[0].scrollIntoView();", findElement200);
findElement200.click();
findElement200.sendKeys(AppoinAssignDateResult);

//Expiry date result

Thread.sleep(3000);
WebElement findElement371 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[7]/input"));
JavascriptExecutor js21 = (JavascriptExecutor) driver;
js21.executeScript("arguments[0].scrollIntoView();", findElement371);
findElement371.click();
findElement200.sendKeys(AppoinExpiryDateResult);

//add
Thread.sleep(1000);
WebElement findElement381 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[8]/button"));
findElement381.click();

//save all
Thread.sleep(1000);
WebElement findElement391 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/button[2]"));
findElement391.click();

//cancel
Thread.sleep(2000);
WebElement cancel=driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[2]/div[2]/div/div/div/div[6]/div[2]/div/div/div/div/div/div/div/form/button[1]"));
cancel.click();
//
Thread.sleep(3000);

WebElement findElement40 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-view-workflow-details/div/div/div/div[1]/div[4]/button"));

set.moveToElement(findElement40).click().perform();


Thread.sleep(1000);
WebElement findElement41 = driver.findElement(By.xpath("/html/body/app-layout1/div/div/div/app-basemaster/div/div[2]/div/div/div/dx-data-grid/div/div[4]/div/div/div[3]/div/div/div/div/div[1]/input"));
findElement41.click();
findElement41.sendKeys(pushtoonboard);
}





}