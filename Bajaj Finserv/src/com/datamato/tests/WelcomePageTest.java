package com.datamato.tests;
/**
 * @author Datamato
 * @version 1.0
 */
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.core.BaseSetup;
import com.datamato.pages.WelcomePage;

public class WelcomePageTest extends BaseSetup {

	/**
	 *@testcase for validate to HOME PAGE
	 */
	@Test(priority = 0,groups={"welcomePage"})
	public void welcomePageLoad() throws InterruptedException, MalformedURLException {
		WelcomePage welcomePage = new WelcomePage();
		Assert.assertEquals(welcomePage.welcomePageContent(), "Tell us your customer type.", "Welcome page not loaded..!");
	}
	
	/**
	 *@testcase for validate to select EXISTING CUSTOMER
	 */
	@Test(dependsOnMethods = "welcomePageLoad")
	public void selectExistingCustomer() throws InterruptedException, MalformedURLException {
		WelcomePage welcomePage = new WelcomePage();
		Assert.assertEquals(welcomePage.selectExistingCustomer(), true,"Existing Customer page not loaded..!");
	}
}
