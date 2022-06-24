package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RejisterPage extends TestBase{
	@FindBy(xpath="//*[contains(text(),'Featured Courses')]")
	WebElement title;
	@FindBy(xpath="(//a[contains(text(),'Job Support')])[1]")
	WebElement jobsupportlink;
public RejisterPage() {
	PageFactory.initElements(driver,this);
}
public boolean vidateatitle() {
return	title.isDisplayed();
}
public JobSupport joblink() {
	jobsupportlink.click();
	return  new JobSupport();
}
}

