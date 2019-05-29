package com.datamato.tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.datamato.pages.LoginToExistingCustomer;

public class LoginToExistingCustomerTest {
	@Test(priority = 0)
	public void loginToExisitngCustomer() throws InterruptedException, MalformedURLException {
		LoginToExistingCustomer login = new LoginToExistingCustomer();
		login.loginToExistingCutomer();
	}
}
