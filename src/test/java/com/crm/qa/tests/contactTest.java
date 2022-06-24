package com.crm.qa.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignUp;
import com.crm.qa.pages.contactPage;
import com.crm.qa.util.Test_util;

public class contactTest extends TestBase{
	SignUp signup;
	HomePage homepage;
	contactPage conpage;
	Test_util testutil;
	public contactTest() {
		super();
	}
@BeforeMethod
public void intaiSetup() throws IOException {
	intalization();
	signup=new SignUp();
	conpage=new contactPage();
	signup.actionOnContactPage();
	testutil=new Test_util();
}
@DataProvider
public Object[][] getDataExcelSheet() throws IOException {
	testutil=new Test_util();
	Object data [][]=testutil.getdatas("contacts");
	return data;
}
@Test(priority=1 ,dataProvider="getDataExcelSheet")
public void dataexcel(String fname,String mobno,String country,String yemail,String Value,String Message) {
	//conpage.entriesdata("tom","5275577899","India","charu.singhal84@gamil","Online Courses","good");
	conpage.entriesdata(fname,mobno,country,yemail,Value,Message);
}
@AfterMethod
public void turndown() {
	driver.close();
}

}
