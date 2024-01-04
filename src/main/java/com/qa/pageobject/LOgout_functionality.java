package com.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Testbase.Testbase;

public class LOgout_functionality extends Testbase{
	
	@FindBy(xpath="//img[@alt='user']")
	WebElement log;
	
	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	WebElement sign;
	
	public LOgout_functionality() {
		PageFactory.initElements(driver, this);
	}
	
	
    public  void  la() throws Throwable {
		
		Thread.sleep(3000);
		log.click();
		sign.click();
		
    }

}
