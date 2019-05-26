package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.core.BaseSetup;
import com.datamato.pages.WelcomePage;

public class WelcomePageTest extends BaseSetup {

	@Test()
	public void openAppTest() throws Exception {
		WelcomePage welcomePage = new WelcomePage();
	//	welcomePage.welcomePageLoad();
		welcomePage.displayText();
	}
}
