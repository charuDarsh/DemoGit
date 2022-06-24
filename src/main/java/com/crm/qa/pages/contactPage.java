package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class contactPage extends TestBase {
	@FindBy(xpath="//input[@id='username']")
	WebElement yourname;
	@FindBy(xpath="//input[@id='mobileno']")
	WebElement yourmobileno;
	@FindBy(xpath="//input[@id='country']")
	WebElement yourcountry;
	@FindBy(xpath="//input[@id='email']")
	WebElement youremail;
	@FindBy(xpath="//select[@id='subject']")
	WebElement selectbox;
	@FindBy(xpath="//*[@id='message']")
	WebElement yourMessage;
	@FindBy(xpath="(//*[text()='Send Message'])[2]")
	WebElement sendMessage;
	public contactPage() {
		PageFactory.initElements(driver,this);
	}
	public void entriesdata(String fname,String mobno,String country,String yemail,String Value,String Message) {
		yourname.sendKeys(fname);
		yourmobileno.sendKeys(mobno);
		yourcountry.sendKeys(country);
		youremail.sendKeys(yemail);
		Select select=new Select(selectbox);
		select.selectByValue(Value);
		yourMessage.sendKeys(Message);
		sendMessage.click();
	}
}

