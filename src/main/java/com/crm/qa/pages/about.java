package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class about extends TestBase {
	@FindBy(xpath="//div[contains(text(),'Learn Postman for API Automation')]")
     WebElement text1;
	@FindBy(xpath="//div[contains(text(),'JavaScript SDET- Automation Testing')]")
	WebElement text2;
	@FindBy(xpath="(//a[@class='fedora-navbar-link navbar-link'])[7]")
	WebElement about;
	
	public about() {
		PageFactory.initElements(driver,this);
	}
	public boolean courseName1() {
		return text1.isDisplayed();
	}
	public boolean courseName2() {
		return text2.isDisplayed();
	}
	public RejisterPage clickonAbout() {
		 about.click();
		 return new RejisterPage();
	}
	
	
}
