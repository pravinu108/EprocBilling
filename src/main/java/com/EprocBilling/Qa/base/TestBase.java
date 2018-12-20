package com.EprocBilling.Qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;





public class TestBase {
public static Properties prop;
public static WebDriver driver;
public static EventFiringWebDriver e_driver;

public TestBase() {
	prop=new Properties();
	FileInputStream fi;
	try {
		fi = new FileInputStream("E:\\jbk\\WorkSpace\\EprocBilling\\src\\main\\java\\com\\EprocBilling\\Qa\\config\\config.properties");
		prop.load(fi);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public static void initialization(){
	String browserName=prop.getProperty("Browser");
	if(browserName.equals("firefox")){
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\PRAVIN\\geckodriver.exe");
	driver=new FirefoxDriver();
	
	}else{
		System.setProperty("webdriver.chrome.driver", "E:\\jbk\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	e_driver=new EventFiringWebDriver(driver);
	
	driver=e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("URL"));
}




}