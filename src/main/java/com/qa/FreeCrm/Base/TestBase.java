package com.qa.FreeCrm.Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
	try {
		FileInputStream ip=new FileInputStream("C:\\Storage\\FreeCrm\\com.qa.FreeCrmTest\\src\\main\\java\\com\\qa\\FreeCrm\\properties\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void initialization(){
		
		String Browser =prop.getProperty("browser");
		System.out.println("Browswe is :" +Browser);
		
		if(Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Storage\\F Drive\\Softwares\\SeleniumPro\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (Browser.equals("FF")){
			System.out.println("No FF browser is set");
			}
		
		String URL=prop.getProperty("url");
         driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}

}
