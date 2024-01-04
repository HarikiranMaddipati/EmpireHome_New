package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Testbase.Testbase;
import com.qa.pageobject.Login_function;
import com.qa.pageobject.staf_att_function;



public class Testcase_staff01 extends Testbase {
	Login_function log;
    staf_att_function sta;

public Testcase_staff01 (){
	super();
}
@BeforeMethod
public void setup() {
	set();
	
	log=new Login_function(driver);
	sta=new staf_att_function(driver);
	
}
@Test
public void attd() throws Throwable {
	log.valide();
	Thread.sleep(2000);
	sta.staff();
}
}
