package com.datamato.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.datamato.core.BaseSetup;

public class WelcomePage {

	BaseSetup baseSetup;

	private WebElement newUser;
	private WebElement existingCustomer;
	private WebElement welcomeText;
	private WebElement existingCustomertxt;

	public WelcomePage() throws MalformedURLException {
		baseSetup = new BaseSetup();
		newUser = baseSetup.getDriver().findElement(By.xpath("//android.view.View[@index='2']"));
		existingCustomer = baseSetup.getDriver().findElement(By.xpath("//android.view.View[@index='2']"));
		welcomeText = baseSetup.getDriver()
				.findElement(By.xpath("//android.view.View[@text='Welcome To Bajaj Finserv']"));
		existingCustomertxt = baseSetup.getDriver()
				.findElement(By.xpath("//android.view.View[@text='Existing Customer']"));
	}

	public boolean welcomePageLoad() {
		if (existingCustomer.isDisplayed() && existingCustomertxt.isDisplayed() && welcomeText.isDisplayed()
				&& newUser.isDisplayed()) {
			System.out.println("Welcome page loaded successfully....!");
			return true;
		} else {
			System.out.println("Welcome page not loaded successfully...!");
			return false;
		}
	}
}
