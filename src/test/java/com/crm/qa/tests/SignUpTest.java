package com.crm.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignUp;

public class SignUpTest extends TestBase {
	SignUp signup;
	HomePage homepage;
	//super()will define base class constructor call all properties
public SignUpTest() throws IOException {
	super();
}
@BeforeMethod
public void setup() throws IOException {
	intalization();
	 signup=new SignUp();
}
@Test(priority=1)
public void validatePageLogo() {
Boolean logo=	signup.loimg();
	Assert.assertTrue(logo);
}
@Test(priority=2)
public void logininitate() {
	signup.loginI();
}
@Test(priority=3)
public void loginPage() throws IOException {
	signup.loginI();
homepage=signup.login(prop.getProperty("email"),prop.getProperty("password"));
}

@AfterMethod
public void turnclose() {
	driver.close();
}
}
