package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Testbase.Testbase;

public class Login_function extends Testbase{

	@FindBy(xpath="//input[@type='text']")
	WebElement usar;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement psd;
	
	@FindBy(xpath="//button[.='Login']")
	WebElement lgn;
	
	public Login_function(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void valide() {
		usar.sendKeys(props.getProperty("username"));
		psd.sendKeys(props.getProperty("password"));
		lgn.click();
	}
}
