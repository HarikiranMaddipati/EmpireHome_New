package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Testbase.Testbase;
import com.qa.pageobject.Login_function;
import com.qa.pageobject.loan_function;
import com.qa.pageobject.logout_function;

//import com.pages.Loan;
//import com.pages.Login;
//import com.pages.Logout;

public class Testcase_loan extends Testbase{

	
	logout_function logut;
	loan_function loan;
	Login_function logn;
public Testcase_loan() {
		super();
	}
@BeforeMethod
public void inta() {
	
	set();
	
	 logn =new  Login_function(driver);
	 loan= new loan_function(driver);
	 logut=new logout_function(driver);
}

@Test
public void log() throws Throwable {
	logn.valide();
	Thread.sleep(2000);
	loan.stafloan();
	Thread.sleep(2000);
	logut.valide();
}
	
	
}
