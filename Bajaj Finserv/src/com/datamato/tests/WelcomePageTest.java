package com.datamato.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.core.BaseSetup;
import com.datamato.pages.WelcomePage;

public class WelcomePageTest extends BaseSetup{

	@Test()
	public void welcomePageTest() throws Exception {
		WelcomePage welcomePage = new WelcomePage();
		Assert.assertEquals(welcomePage.welcomePageLoad(), true);
	}
}
