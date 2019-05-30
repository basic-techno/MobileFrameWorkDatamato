package com.datamato.tests;
/**
 * @author Datamato
 * @version 1.0
 */
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.pages.LoginToExistingCustomer;

public class LoginToExistingCustomerTest {
	/**
	 *@testcase for validate to existing customer 
	 */
	@Test(priority = 0,dependsOnGroups={"welcomePage"},groups={"loginExistingCustomer"})
	public void loginToExisitngCustomer() throws InterruptedException, MalformedURLException {
		LoginToExistingCustomer login = new LoginToExistingCustomer();
		Assert.assertEquals(login.loginToExistingCutomer(), "Active Relations", "Login failed..!");
	}
}
