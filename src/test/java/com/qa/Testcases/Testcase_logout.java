package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.pages.Login;
//import com.pages.Logout;
import com.qa.Testbase.Testbase;
import com.qa.pageobject.Login_function;
import com.qa.pageobject.logout_function;

public class Testcase_logout extends Testbase{

	logout_function logut;
	Login_function logn;
public Testcase_logout() {
		super();
	}
@BeforeMethod
public void inta() {
	
	set();
	
	 logn =new  Login_function(driver);
	 logut=new logout_function(driver);
}

@Test
public void log() throws Throwable {
	logn.valide();
	Thread.sleep(2000);
	logut.valide();
}
	
	
}
