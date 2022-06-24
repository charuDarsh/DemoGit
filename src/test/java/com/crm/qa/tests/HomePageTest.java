package com.crm.qa.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignUp;

public class HomePageTest extends TestBase {
	SignUp signup;
	HomePage homepage;
	public HomePageTest() {
		super();
	}
@BeforeMethod
public void Setup1() throws IOException, InterruptedException {
	intalization();
	signup=new SignUp();
	//homepage =new HomePage();
	signup.loginI();	
	homepage=signup.login(prop.getProperty("email"),prop.getProperty("password"));
	
	}
@Test(priority=1)
public void cousename() {
	homepage.validateCourseName();
}
@Test(priority=2)
public void validateserch() {
	homepage.serchtext("java");
}
@Test(priority=3)
public void serchicon() {
	homepage.serchtext("java");
	homepage.serchClick();
	
}
@AfterMethod
public void shutdown() {
	driver.close();
}
//(//a[@class='fedora-navbar-link navbar-link'])[7]
////div[contains(text(),'Learn Postman for API Automation')]

}
