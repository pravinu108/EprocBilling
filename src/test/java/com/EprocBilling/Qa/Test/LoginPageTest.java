package com.EprocBilling.Qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EprocBilling.Qa.base.TestBase;
import com.EprocBilling.Qa.page.LoginPage;

public class LoginPageTest extends TestBase {
LoginPage loginPage;

@BeforeMethod
public void setUp(){
	initialization();
	loginPage=new LoginPage();
	
}
@Test
public void verifyUserNamePlaceholder(){
	String Actual_Placeholder=loginPage.usernamePlaceholder();
	Assert.assertEquals(Actual_Placeholder, "User name");
	
}
@Test
public void verifyPasswordPlaceholder(){
	String Actual_Placeholder=loginPage.passwordPlaceholder();
	Assert.assertEquals(Actual_Placeholder, "Password");
}
	@Test
	public void verifyWrongCredintialErrorMsg(){
		String Actual_errorMsg=loginPage.errorMsg();
		Assert.assertEquals(Actual_errorMsg, "incorrect password");
	}

@AfterMethod
public void tearDown(){
	driver.quit();
}
}
