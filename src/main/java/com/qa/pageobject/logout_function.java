package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_function {

	
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement img;
	
	@FindBy(xpath="//a[@class='dropdown-item'][2]")
	WebElement log;
	
	public logout_function(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void valide() throws Throwable{
		img.click();
		Thread.sleep(2000);
		log.click();
	
	}
	
}
