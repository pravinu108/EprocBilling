package com.EprocBilling.Qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PmsProject {
@Test
public void login(){
	System.setProperty("webdriver.firefox.marionette","C:\\Users\\PRAVIN\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://projects.javabykiran.com/Pms/index.php?module=users/login");
	WebElement we1=driver.findElement(By.xpath(".//*[@id='login_form']/div[1]/div/input"));
	we1.sendKeys("admin");
	
	WebElement we2=driver.findElement(By.xpath(".//*[@id='login_form']/div[2]/div/input"));
	we2.sendKeys("pass");
	WebElement we3=driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/button"));
	we3.click();
}	
}
