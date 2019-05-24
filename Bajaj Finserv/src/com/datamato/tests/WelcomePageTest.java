package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.core.DriverFactory;
import com.datamato.pages.WelcomePage;

public class WelcomePageTest extends DriverFactory{
	
	//private AndroidDriver<MobileElement> driver;
	@Test(priority=0, enabled = true, description = "WelcomePage")
	public void openAppTest() throws Exception {
		WelcomePage welcomePage = new WelcomePage();
		welcomePage.welcomePageLoad();
	}
}
