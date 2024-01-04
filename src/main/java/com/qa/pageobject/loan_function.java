package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loan_function {

	
	@FindBy(xpath="//li[@class='treeview'][3]")
	WebElement straf;
	
	@FindBy(xpath="//a[text()='Loans & Advances']")
	WebElement loan;
	
	@FindBy(xpath="/html/body/div[3]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/a")////a[@class='btn btn-add']
	WebElement button;
	
//	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div[2]/form/div/div[1]/div/span/span[1]/span/span[2]/b")
//	WebElement arrow;
	
//	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[2]")
//	WebElement name;
	
	@FindBy(xpath="//input[@type='number'][1]")
	WebElement amount;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div[2]/form/div/div[4]/div/input")
	WebElement months;
	
	@FindBy(xpath="//input[@placeholder='Enter Remarks']")
	WebElement remark;
	
	@FindBy(xpath="//button[text()=' Save']")
	WebElement save;
	
	@FindBy(xpath="//button[@class='swal-button swal-button--yes']")
	WebElement give;
	
	public loan_function(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void stafloan() throws Throwable {
		
		straf.click();
		loan.click();
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
//		arrow.click();
//		Thread.sleep(2000);
//		name.sendKeys("siva reddy");
//		Thread.sleep(2000);
		amount.sendKeys("1000");
		//Thread.sleep(2000);
		months.sendKeys("5");
		Thread.sleep(2000);
		remark.sendKeys("hi");
		Thread.sleep(2000);
		save.click();
		give.click();
			}
	
}
