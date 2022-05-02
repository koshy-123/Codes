package web;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

interface Interconnect2 {
	String[][] entry3() throws BiffException, IOException;
	String[][] powerhouse3() throws BiffException, IOException;
	 void beforetest3() throws InterruptedException;
	 void Config2();
	
}
