package com.datamato.tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.core.BaseSetup;
import com.datamato.pages.WelcomePage;

public class WelcomePageTest extends BaseSetup {

	@Test(priority = 0)
	public void welcomePageLoad() throws InterruptedException, MalformedURLException {
		WelcomePage welcomePage = new WelcomePage();
		Assert.assertEquals(welcomePage.welcomePageLoad(), true);
	}

	@Test(dependsOnMethods = "welcomePageLoad")
	public void selectExistingCustomer() throws InterruptedException, MalformedURLException {
		WelcomePage welcomePage = new WelcomePage();
		Assert.assertEquals(welcomePage.selectExistingCustomer(), true);
	}

}
