package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class JobSupport extends TestBase{
@FindBy(xpath="//input[@name='username']")
WebElement username;
@FindBy(xpath="//input[@name='mobileno']")
WebElement mobilenum;
@FindBy(xpath="(//input[@id='email'])[1]")
WebElement emailid;
@FindBy(xpath="//select[@id='programming-language']")
WebElement selectopt;
@FindBy(xpath="(//input[@id='sharing'])[1]")
WebElement checkopt;
@FindBy(xpath="//select[@id='timezone']")
WebElement selectopt2;
public JobSupport() {
	PageFactory.initElements(driver,this);
}
public void entry(String un,String num,String em) {
 username.sendKeys(un);
 mobilenum.sendKeys(num);
 emailid.sendKeys(em);
 
}

public   void selectmethod1(String value) {
	Select s=new Select(selectopt);
	
	s.selectByVisibleText(value);
	
}
public void checkoption() {
	checkopt.click();
}
public   void selectmethod2(String value) {
	Select s=new Select(selectopt2);
	s.selectByVisibleText(value);
}


	


	
}	



