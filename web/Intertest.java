package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intertest implements Test{

	public void rc() {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.myrecoverycoach.com/rc-ui/#/login");
	}

	public void rcadmin() {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://192.168.6.100:4040/rcadmin-ui/#/login");
	}
	public static void main(String[] args) {
		Intertest in= new Intertest();
		in.rc();
		in.rcadmin();
		
	}

	

}
