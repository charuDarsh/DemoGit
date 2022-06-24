package com.crm.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.RejisterPage;
import com.crm.qa.pages.SignUp;
import com.crm.qa.pages.about;

public class aboutTest extends TestBase {
	SignUp signup;
	HomePage homepage;
	about about;
	RejisterPage Rjpage;
	public aboutTest() {
		super();	
	}
	@BeforeMethod
	public void setup() throws IOException {
		intalization();
		signup=new SignUp();
		signup.loginI();	
		homepage=signup.login(prop.getProperty("email"),prop.getProperty("password"));
		homepage=new HomePage();
		homepage.serchtext("java");
		homepage.serchClick();
		about = new about();
		Rjpage=new RejisterPage();
	}
	@Test(priority=1)
	public void validatecoursename() {
	about.courseName1();
	Assert.assertTrue(true);	
	}
	@Test(priority=2)
	public void validatecoursename2() {
		about.courseName2();
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void nextPage() {
		Rjpage=	about.clickonAbout();
	}
	@AfterMethod
	public void turndown() {
		driver.close();;
	}
}
