package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Testbase.Testbase;
import com.qa.pageobject.Login_function;

//import qa.com.pageobjects222.login_function222;

public class Testcase_login extends Testbase{

	Login_function lav;
	public Testcase_login() {
		super();
		
	}
	
	@BeforeMethod
	public void inta() {
		
		set();
		
		 lav=new  Login_function(driver);
		 
	}
	
	@Test
	public void log() {
		lav.valide();
	}
}
