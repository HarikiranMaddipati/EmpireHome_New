package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Testbase.Testbase;

public class staf_att_function extends Testbase{
	@FindBy(xpath="//i[@class='fa fa-id-card']")
	WebElement staff;
	@FindBy(xpath="//a[text()='Staff Attendance']")
	WebElement staffAttd;
	@FindBy(xpath="//input[@name='empCode']")
	WebElement emp ;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[1]/div/form/div/div[2]/div/span/span[1]/span/span[2]/b")
	WebElement drpmonth;
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[7]")
	WebElement selmonth;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[1]/div/form/div/div[3]/div/span/span[1]/span/span[2]/b")
	WebElement dropyer;
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[5]")
	WebElement selyear;
	@FindBy(xpath="//button[@class='btn btn-success btn-block']")
	WebElement search;
	@FindBy(xpath="//input[@type='date']")
	WebElement seldate;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[2]/div/div[2]/form/div[1]/div[4]/div/input")
	WebElement remk;
	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement save;
	public staf_att_function(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void staff() throws Throwable {
		staff.click();
		staffAttd.click();
		emp.sendKeys("EM20221255");
		Thread.sleep(2000);
		drpmonth.click();
		Thread.sleep(2000);
		selmonth.click();
		dropyer.click();
		Thread.sleep(2000);
		selyear.click();
		search.click();
		Thread.sleep(2000);
		seldate.sendKeys("02-06-2023");
		Thread.sleep(2000);
		remk.sendKeys("present");
		save.click();
	}
	
}


