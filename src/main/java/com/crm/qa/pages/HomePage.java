package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
@FindBy(xpath="//img[@class='course-box-image']")
WebElement course;
@FindBy(xpath="//input[@id='search-courses']")
WebElement search;
@FindBy(xpath="//button[@id='search-course-button']")
WebElement searchicon;
public HomePage()throws IOException{
	PageFactory.initElements(driver,this);
}
public boolean validateCourseName() {
return  course.isDisplayed();

}
public void serchtext(String ja) {
	 search.sendKeys(ja);
}
public void serchClick() {
	searchicon.click();
}
}
