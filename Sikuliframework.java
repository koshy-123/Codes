package cRET;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.functors.SwitchClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.KeyModifier;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Mouse;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jnr.ffi.Struct.key_t;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Sikuliframework {
 
	WebDriver driver;
	 
	String[][] Rcadmin=null;
		
		@DataProvider(name="Rc")
		public String[][] entry() throws BiffException, IOException{
			Rcadmin=powerhouse();
		System.out.println(Rcadmin);	
			return Rcadmin;
			
		}
		
		public String[][] powerhouse() throws BiffException, IOException {
			FileInputStream file2= new FileInputStream("/home/sudalai/Documents/lastcheck.xls");
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
		public void Beforetest() throws FindFailed, InterruptedException {
			
			Screen s=new Screen();
		//launch the firefox
			Match find = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/firefoxrec.png");
			s.click(find);

//new tab
			Match find2 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/tab.png");
			s.click(find2);
			
			//search in fireox
			Match find3 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/Search.png");
			s.click(find3); 
			s.type("http://192.168.6.100:4040/rcadmin-ui/#/login"+org.sikuli.hotkey.Keys.ENTER);
			
//signin
			Thread.sleep(2000);
			Match find4 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/FirstClick.png");
			s.click(find4);
			
//baseconfig		
			Thread.sleep(2000);
			Match find6 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/Baseconfig.png");find6.click(find6);
//createnew
			Thread.sleep(2000);
			Match find7 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/AssignCreate.png");
			s.click(find7);

		}
		@AfterTest
		public void Aftertestr() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}
		
		
		
		
	@Test(dataProvider="Rc")
	public void TestSikuli(String upload, String specname, String primaryspec, String servline, String descrption, String Name, String procedurename, String surgicallocation, String proceduredesc, String procname, String bodypart, String bodypartdesc, String bodypartsec, String stagename,String stagedesc,  String stager, String instage,String Colorcode, String indescription, String Carecardname, String Carecarddes, String ccname,String typedoc,String doccode, String ccrname,String ccdesc,String secondprofile, String ccsearch, String bulletiname, String bulletindesc, String bullentinsearch,Object bulldoc, String buldoccode, String bullname, String bulldesc,  String thirdprofile, String bullsearch) throws FindFailed, InterruptedException {
		
	
Screen s= new Screen();

Thread.sleep(2000);
Match find = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/uploadpic2.png");
s.click(find);

Thread.sleep(2000);
Match find1=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newsearch.png");
s.click(find1);


Thread.sleep(2000);
Match find2 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/textsearch.png");
s.click(find2);
s.type(upload);

Thread.sleep(2000);
Match find3=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/open.png");
s.click(find3);


Thread.sleep(2000);
Match find4=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/specname.png");
s.click(find4);
s.type(specname);

Thread.sleep(2000);
Match find5=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/primaryspec.png");
s.click(find5);
s.type(primaryspec);

Thread.sleep(1000);
Match find14=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/slidenew.png");
Match find147=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/1sr stage.png");
s.click(find147);

Thread.sleep(1000);
s.type(org.sikuli.script.Key.PAGE_DOWN);

Thread.sleep(2000);
Match find6=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/serveline.png");
s.click(find6);
s.type(servline);

Thread.sleep(2000);
Match find7=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/description.png");
s.click(find7);
s.type(descrption);



Thread.sleep(2000);
Match find8=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/addspec.png");
s.click(find8);



Match find15 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/1stagesearch.png");
	    s.click(find15);
	    s.type(Name);
	    
	    
	     Thread.sleep(2000); 
	     Match find10 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/Arrow.png");
		s.click(find10);


		s.type(org.sikuli.script.Key.PAGE_UP);
		
		
Thread.sleep(1000);
Match find16 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/procedurename.png");
	    s.click(find16);
	    s.type(procedurename);
	    
	    Thread.sleep(1000);
Match find17 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/surgicallocation'.png");
	    s.click(find17);
	    s.type(surgicallocation);
	    
	    Thread.sleep(1000);
Match find18 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/proceduredescription.png");
	    s.click(find18);
	    s.type(proceduredesc);
	    
	    
	    Thread.sleep(2000);
	    Match find19 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/addprocedure.png");
	    s.click();
	    
	    s.type(org.sikuli.script.Key.PAGE_DOWN);
	    
	    Thread.sleep(2000);
	    Match find20 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/1stagesearch.png");
	    s.click(find20);
	    s.type(procname);
	    
	    Thread.sleep(1000);
		 Match find9 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/move1.png");
		Match find21=find9;
		 s.click(find21);
		 
		 
		 Thread.sleep(1000);
		    Match find22 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bodypartname.png");
		    s.click(find22);
		    s.type(bodypart);
		 
		    Thread.sleep(1000);
		    Match find23 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bodydescription.png");
		    s.click(find23);
		    s.type(bodypartdesc);
		    
		    Thread.sleep(2000);
		    Match find24 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/addbodypart.png");
		    s.click(find24);
		    
		    
		    s.type(org.sikuli.script.Key.PAGE_DOWN);
		    
		    
		    Thread.sleep(1000);
		    Match find25 = s.find( "/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/1stagesearch.png");
		    s.click(find25);
		    s.type(bodypartsec);
		    
		    
		    Thread.sleep(1000);
			 Match find26=find9;
			 s.click(find26);
			 
		
			  s.type(org.sikuli.script.Key.PAGE_UP);
			  
			  
			  
			  Thread.sleep(1000);
			    Match find27 = s.find( "/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/stagename.png");
			    s.click(find27);
			    s.type(stagename);
			    
			    
			    Thread.sleep(1000);
			    Match find28 = s.find( "/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newstagedescription.png");
			    s.click(find28);
			    s.type(stagedesc);
			    
			    Thread.sleep(2000);
			    Match find29 = s.find( "/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/addstagebutton.png");
			    s.click(find29);
			    
			    
			    Thread.sleep(2000);
			    s.type(org.sikuli.script.Key.PAGE_DOWN);
			  
			    
			    Thread.sleep(3000);
			    Match find30 = s.find( "/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/halfsearch.png");
			    s.click(find30);
			    s.type(stager);
			    
			    
//			    Thread.sleep(2000);
//			    s.type(org.sikuli.script.Key.PAGE_DOWN);
			    
			    Thread.sleep(1000);
				Match find11 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/pencil2.png");
				Match find31=find11;
				 s.click(find31);
				 
				//addstage			   
				    Thread.sleep(2000);
					Match find311=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newAddstage.png");
					s.click(find311);
					
					
				//	stage name
				Thread.sleep(1000);
				Match find32=	s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newatge.png");
				s.click(find32);
				s.type(instage);
//				//
//				
				//color choosing
				Thread.sleep(1000);
				Match find33=	s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/clickblack.png");
				s.click(find33);
				
				
				Thread.sleep(1000);
				Match find341=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/colorplus.png");
				s.click(find341);
				
				Thread.sleep(1000);
				Match find342=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/colorcode.png");
				s.click(find342);
				s.type("a", KeyModifier.CTRL); 
				s.type(Key.BACKSPACE); 
				s.type(Colorcode);
		
				
				//select
				Thread.sleep(2000);
				Match find35=	s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/select.png");
				s.click(find35);
				
				s.type(org.sikuli.script.Key.PAGE_DOWN);

			
				
				//description
				Thread.sleep(1000);
				Match find207=	s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/stagedescription.png");
				s.click(find207);
				s.type(indescription);
				
				
				//add stage					
				Thread.sleep(2000);
			    Match find36=	s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/addstagebutton.png");
				s.click(find36);
				
				s.type(org.sikuli.script.Key.PAGE_UP);
				Thread.sleep(2000);
			    Match find38= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/backbutton.png");
			    s.click(find38);
			    
				Thread.sleep(2000);
				s.type(org.sikuli.script.Key.PAGE_DOWN);
			    
				//next 
				Thread.sleep(2000);
				Match find37=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/move1.png");
				s.click(find37);
			    				
//				
				
				s.type(org.sikuli.script.Key.PAGE_UP);
				
				Thread.sleep(1000);
				Match find39=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/carecard groupname .png");
			      s.click(find39);
				s.type(Carecardname);
				
				Thread.sleep(1000);
              Match  find40=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/carecarddessc.png");
              s.click(find40);
              s.type(Carecarddes);
              
              Thread.sleep(2000);
              Match  find41=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/addcarecard.png");
              s.click(find41);
                            
              s.type(org.sikuli.script.Key.PAGE_DOWN);
              
              Thread.sleep(2000);
              Match  find42=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/1stagesearch.png");
              s.click(find42);
			  s.type(ccname);
			  		  
			  
			  Thread.sleep(2000);
		         Match find43 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/pencil2.png");
		          s.click(find43);
			  
		  	  
			  Thread.sleep(2000);
			  Match find44=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/createcard.png");
			  s.click(find44);
			  
			  //1
			  
			  Thread.sleep(2000);
			  Match find47= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newSvebar.png");
			  s.click(find47);
			  
			  
			  String s1="Video";
			  String s2="Survey";
			  String s3="Document";
	if(typedoc.contentEquals(s1)) {
		
		Thread.sleep(2000);
		Match find12 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/clickons.png");
	    s.click(find12);
	}
	else if(typedoc.contentEquals(s2)) {
		
	Thread.sleep(2000);
		Match find12 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/set1.png");
	    s.click(find12);
		
	}
	else if(typedoc.contentEquals(s3)) {
		Thread.sleep(2000);
		Match find12 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/set2.png");
	    s.click(find12);
	}
	
	
	
			 			
	  Thread.sleep(1000);
    Match find51=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/doccode.png");
   s.click(find51);
    s.type(doccode);
     
//	  //1
	  
	  
	  
//	  
	  
    Thread.sleep(1000);
    Match  find45=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/ccname.png");
    s.click(find45);
	  s.type(ccrname);
//	  
    Thread.sleep(1000);
    Match  find46=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/ccdesc.png");
    s.click(find46);
	  s.type(ccdesc);
//	  
//	  
	   Thread.sleep(2000);
	   Match find721=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/upload3.png");
	  s.click(find721);
	 // 
	 // 
	 // 
	  Thread.sleep(2000);
	  Match find731=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newsearch.png");
	  s.click(find731);
	 //
	 //
	  Thread.sleep(2000);
	  Match find741 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/textsearch.png");
	  s.click(find741);
	  s.type(secondprofile);
	 //
	   Thread.sleep(2000);
	  Match find751=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/open.png");
	  s.click(find751);
	  
	           
	  
	  
	  
	  
    Thread.sleep(2000);
    Match find52= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/Caredetail.png") ;
    s.click(find52);
    
    
    

    
    
    


    Thread.sleep(2000);
    Match find701=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/caresearch.png");
  s.click(find701);
  s.type(ccsearch);
    
    
//    
    Thread.sleep(2000);
    Match find504=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/viewicon.png");
   s.click(find504);
//    
//    
    Thread.sleep(2000);
    Match find505=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/crossicon.png");
  s.click(find505);
//    
    Thread.sleep(2000);
    Match find53= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/lastbackbutton.png");
    s.click(find53);
    
    
    
   
   Thread.sleep(2000);
    s.type(org.sikuli.hotkey.Keys.PAGE_DOWN);
//  
  if(typedoc.contentEquals(s1)) {
  Thread.sleep(2000);
  Match find121 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newcross.png");
  s.click(find121);
  
  
  Thread.sleep(2000);
  Match find54= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/moveon.png");
  s.click(find54);
  }
  else if(typedoc.contentEquals(s2)){
	  Thread.sleep(2000);
	  Match find54= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/moveon.png");
	  s.click(find54);
  }
  else if(typedoc.contentEquals(s3)) {
	  Thread.sleep(2000);
	  Match find54= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/moveon.png");
	  s.click(find54);
  }
  
  
  
//  
//  Thread.sleep(2000);
//  Match find54= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/moveon.png");
//  s.click(find54);
//	   
  s.type(org.sikuli.hotkey.Keys.PAGE_UP);
//  
  Thread.sleep(1000);
  Match find55=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bulletin groupname.png");
  s.click(find55);
  s.type(bulletiname);
//	
Thread.sleep(1000);
Match  find56=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bulletincarddes.png");
s.click(find56);
s.type(bulletindesc);

//
//
//
//
//
//
//
//
//
//
//
//
//
//
Thread.sleep(2000);
Match  find57=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bulletin.png");
s.click(find57);
//
//
s.type(org.sikuli.hotkey.Keys.PAGE_DOWN);
//
//
 Thread.sleep(2000);
Match find58=  s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/1stagesearch.png");
s.click(find58);
s.type(bullentinsearch);
//  
//
Thread.sleep(2000);
Match find81 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/pencil2.png");
s.click(find81);
//
//
Thread.sleep(2000);
Match find912=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/createbullet.png");
s.click(find912);

//
////2
Thread.sleep(2000);
Match find471= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/downarrow.png");
s.click(find471);
//
//
//
//
	String s11="Video";
   String s21="Survey";
	String s31= "Document";
 if(bulldoc.equals(s11)) {																																																																																																																																																																																																																								
	  Thread.sleep(2000);
	   Match find48=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/clickons.png");
//	   
	  s.click(find48);
////	
 }
//
//
 else if(bulldoc.equals(s21))  {
 	  Thread.sleep(2000);
 	  Match find49=  s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/surveynew.png");
 	s.click(find49);
}
//
else if (bulldoc.equals(s31)){  
	 Thread.sleep(2000);
	 Match find50= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/Realdoc.png");
	 s.click(find50);
//
	 }	
//
//
//
Thread.sleep(2000);
 Match find71=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/doccode.png");
s.click(find71);
 s.type(buldoccode);
// 
//
//
//
 //2
//
  Thread.sleep(2000);
Match find59=  s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bulletinboardname.png");
s.click(find59);
s.type(bullname);
////
Thread.sleep(2000);
Match find60=  s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bulletindesc.png");
s.click(find60);
s.type(bulldesc);
//
//
//
 Thread.sleep(2000);
  Match find72=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/upload3.png");
 s.click(find72);
// 
// 
// 
 Thread.sleep(2000);
 Match find73=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/newsearch.png");
 s.click(find73);
//
//
 Thread.sleep(2000);
 Match find74 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/textsearch.png");
 s.click(find74);
 s.type(thirdprofile);
//
  Thread.sleep(2000);
 Match find75=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/open.png");
 s.click(find75);
 
// 
// Thread.sleep(2000);
// Match find76=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/backbutton.png");
// s.click(find76);
//// 
// 
 Thread.sleep(2000);
 Match find77= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/bulletin.png") ;
 s.click(find77);
//
 
// 
 Thread.sleep(2000);
 Match find5039=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/caresearch.png");
s.click(find5039);
s.type(bullsearch);
 
 
// 
 Thread.sleep(2000);
 Match find5049=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/viewicon.png");
s.click(find5049);
// 
// 
 Thread.sleep(2000);
 Match find5059=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/crossicon.png");
s.click(find5059);
// 
 Thread.sleep(2000);
 Match find539= s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/lastbackbutton.png");
 s.click(find539);	

 
     Thread.sleep(2000);
     Match find120 = s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/spec.png");
         s.click(find120);    
             
	}
	
            	 }
	

	

	
              
              
	

              
			 
			  
			  
			  
			  
             
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
//			  Thread.sleep(2000);
//				Match find32=s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/pencil2.png");
//				 s.click(find32);
//			  
//              
//              
//              
//              
//				
//				
//				
//				
//				Thread.sleep(2000);
//			    Match find37=	s.find("/home/sudalai/eclipse-workspace/Secoder/Sikuli/cRET/src/main/java/cRET/spec.png");
//				s.click(find37);
		    
//		   
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
		
		












	
	
	

