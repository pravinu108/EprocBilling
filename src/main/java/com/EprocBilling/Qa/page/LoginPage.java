package com.EprocBilling.Qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EprocBilling.Qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy (xpath="//*[@id='login_box']/form/div/input[2]")
	WebElement username;
	@FindBy(xpath=".//*[@id='login_box']/form/div/input[3]")
	WebElement password;
	@FindBy(xpath=".//*[@id='login_box']/form/div/input[4]")
	WebElement loginBtn;
	@FindBy(xpath=".//*[@id='demo_text']/font/b")
	WebElement errorMsg;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		}
	
	public String usernamePlaceholder(){
		return username.getAttribute("placeholder");
	}
	public String passwordPlaceholder(){
		return password.getAttribute("placeholder");
		}
	public String title(){
		return driver.getTitle();
	}
	public String errorMsg(){
		return errorMsg.getText();
	}
	public void login(String Username,String Password){
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginBtn.click();
		
	}
}
