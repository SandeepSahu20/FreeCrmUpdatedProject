package com.qa.FreeCrm.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.Base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@class='img-responsive' and @alt='free crm logo']")
	WebElement crmLogo;
	
	@FindBy(xpath="//img[@class='img-responsive' and @alt='free crm logo']")
	WebElement pageTitle;
	
	@FindBy(xpath="//a[@href='https://www.freecrm.com/index.html']")
	WebElement signUpBtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean crmLogoTest(){
		return crmLogo.isDisplayed();
	  }
	public String pageTitleTest(){
		
		return driver.getTitle();
	}
	
	public HomePage loginTest(String un,String pwd){
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
	

}
