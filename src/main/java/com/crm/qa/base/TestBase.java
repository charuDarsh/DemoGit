package com.crm.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.crm.qa.util.Test_util;
import com.crm.qa.util.WebEventListners;

 
public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	private static EventFiringWebDriver e_driver;
	public static WebEventListners eventListener;
	public TestBase()  {
	try { prop =new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Anuj Singhal\\Selenium\\udemy-workspace\\FreeCRMTest\\src\\main\\java\\ccom\\crm\\qa\\configur\\cofig.properties");
	prop.load(fis);
}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();	
	}	
	}
	public static void intalization() {
	String Browsername=	prop.getProperty("browser");
	if(Browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuj Singhal\\Selenium\\drivers\\chromedriver_win32 (7)\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if (Browsername.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Anuj Singhal\\Selenium\\drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		System.out.println("browsername firefox able to finout");
		
	}
	else if(Browsername.equals("IE")) {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\Anuj Singhal\\Selenium\\drivers\\msedgedriver.exe");
		 driver=new EdgeDriver();
		System.out.println("browsername edge able to finout");
		
	}
	e_driver = new EventFiringWebDriver(driver);
	eventListener = new WebEventListners();
	e_driver.register(eventListener);
	driver = e_driver;
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Test_util.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_util.implicitly_Wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}	
}
