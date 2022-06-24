package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUp extends TestBase {


@FindBy(xpath="//div[@class='pull-left logo-outer']//img")
private WebElement logoimg;
@FindBy(xpath="//a[@class='theme-btn register-btn']")
 private WebElement login1;
@FindBy(xpath="//input[@type='email']")
 private WebElement email;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(xpath="//input[@type='submit']")
private WebElement loginhome;
@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
private WebElement Morelink;
@FindBy(xpath="(//ul[@class='dropdown-menu']//li[3]//a)[1]")
private WebElement contactlink;

public SignUp() throws IOException {
	PageFactory.initElements(driver,this);
}
public boolean loimg() {
	return logoimg.isDisplayed();
	
}
public void loginI() {
	login1.click();
}
public HomePage login(String em,String pw) throws IOException  {
	
		 email.sendKeys(em);
		 password.sendKeys(pw);
		 loginhome.click();
		 return  new HomePage();
}	 
	public contactPage actionOnContactPage() {
		Actions a=new Actions(driver);
		a.moveToElement(Morelink).build().perform();
		contactlink.click();
		return new contactPage();
	}

	
}



