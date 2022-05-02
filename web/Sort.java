package web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sort {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.leafground.com/pages/sorttable.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	

	//old
    List<WebElement> findElements = driver.findElements(By.xpath("(//table[@id=\"table_id\"])/tbody/tr/td[2]"));

    
    String[] str4=new String[findElements.size()];
  
    
for(int i=0;i<findElements.size();i++) {
str4[i]= findElements.get(i).getText();
	System.out.println(str4[i]);
	
}

System.out.println();	
	
	
Thread.sleep(2000);
WebElement findElement1 = driver.findElement(By.xpath("(//th[text()=\"Name\"])"));
findElement1.click();

Thread.sleep(2000);
List<WebElement> findElements2 = findElement1.findElements(By.xpath("(//td[@class=\"sorting_1\"])"));

String[] str=new String[findElements2.size()];

for(int i=0;i<findElements2.size();i++) {
	str[i]=findElements2.get(i).getText();
	System.out.println(str[i]);
}

System.out.println();

if(str4.equals(str)) {
	System.out.println("done");
}
else {
	System.out.println("failed");
}



//boolean function= true;
//outer:
//for(int i=0;i<str.length;i++) {
//	
//	for(int j=i+1;j<i;j++) {
//		int len=str[j].compareTo(str[i]);
//		if(!(len>0)) {
//			System.out.println("data in the table is not sorted::"+str[j]+"::::"+str[i]);
//			function=false;
//			break outer;
//		}
//		else {
//			System.out.println("data in the table is sorted::"+str[j]+":::"+str[i]);
//		}
//	
//		
//	}
//}


}
}
