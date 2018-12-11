package com.qa.FreeCrm.LoginPageTest;

import static org.testng.Assert.assertTrue;

import com.qa.FreeCrm.Base.TestBase;
import com.qa.FreeCrm.Pages.LoginPage;
import com.qa.FreeCrm.Pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginPageTest extends TestBase {
	
	 LoginPage loginPage;
	 HomePage homePage;
	public LoginPageTest(){
		//super();
	}
	
	@BeforeTest
	public void BeforeTest(){
		initialization();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		System.out.println("test run starts");
		String title=loginPage.pageTitleTest();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	
	@Test(priority=2)
	public void crmLogTest(){
	    boolean flag=loginPage.crmLogoTest();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginPageTest(){
		
		homePage=loginPage.loginTest(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@AfterTest
	public void AfterTest(){
		driver.quit();
		
	}
	

}
