package com.crm.qa.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.JobSupport;
import com.crm.qa.pages.RejisterPage;
import com.crm.qa.pages.SignUp;
import com.crm.qa.pages.about;
import com.crm.qa.util.Test_util;

public class jobSupportTest extends TestBase {
	SignUp signup;
	HomePage homepage;
	about about;
	RejisterPage Rjpage;
	JobSupport jobs;
	Test_util testut;
	public jobSupportTest() {
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
		jobs=new JobSupport();
		about.clickonAbout();
		Rjpage=new RejisterPage();
		Rjpage.joblink();
}
	@Test
	public void usernameentry() {
		jobs.entry(prop.getProperty("username"),prop.getProperty("mobilenum"),prop.getProperty("emailid"));
		jobs.selectmethod1("python");
		jobs.checkoption();
		jobs.selectmethod2("(GMT-08:00) Tijuana, Baja California");
	}
	@AfterMethod
	public void shutdown1() {
		driver.close();
	}
}
