package com.crm.qa.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.JobSupport;
import com.crm.qa.pages.RejisterPage;
import com.crm.qa.pages.SignUp;
import com.crm.qa.pages.about;

public class RejisterPageTest extends TestBase {
	SignUp signup;
	HomePage homepage;
	about about;
	RejisterPage Rjpage;
	JobSupport jobs;
	public RejisterPageTest() {
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
}
	@Test
	public void titleofpage() {
		Rjpage.vidateatitle();
	}
	@Test
	public void joblinkclick() {
		jobs= Rjpage.joblink();
	}
	@AfterMethod
	public void shutdown() {
		driver.close();
	}
	
}