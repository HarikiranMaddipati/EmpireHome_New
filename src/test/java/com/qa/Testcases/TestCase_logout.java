package com.qa.Testcases;

import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Testbase.Testbase;
import com.qa.pageobject.LOgout_functionality;
import com.qa.pageobject.Login_function;

public class TestCase_logout extends Testbase {
	
	Login_function lav;
	LOgout_functionality logt;
	
	public TestCase_logout() {
		
		super();
		
	}
	@BeforeMethod
	public void inta1() {
		
		set();
		
		 lav=new  Login_function(driver);
		 logt=new LOgout_functionality();
		 
		
		
	}
	@Test
	public void log1() throws Throwable {
		lav.valide();
		logt.la();
	}
	

}
