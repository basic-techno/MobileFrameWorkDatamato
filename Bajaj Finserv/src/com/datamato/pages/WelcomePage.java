package com.datamato.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.datamato.core.Driver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage extends Driver {

	PageObjects welcomepageObjects;

	public WelcomePage() throws MalformedURLException {
		super();
		welcomepageObjects = new PageObjects();
		PageFactory.initElements(new AppiumFieldDecorator(driver), welcomepageObjects);
	}

	public void displayText() {
		String str = welcomepageObjects.welcomeText.getText();
		System.out.println(str);
	}

	public boolean welcomePageLoad() {
		if (welcomepageObjects.existingCustomer.isDisplayed() && welcomepageObjects.existingCustomertxt.isDisplayed()
				&& welcomepageObjects.welcomeText.isDisplayed() && welcomepageObjects.newUser.isDisplayed()) {
			Assert.assertTrue(true, "App open Successfully..!");
			return true;
		} else {
			System.out.println("App is not loaded..!");
			Assert.assertTrue(false, "App is not loaded..!");
			return false;
		}
	}

	class PageObjects {

		@FindBy(xpath = "//android.view.View[@index='2']")
		@CacheLookup
		public WebElement newUser;

		@FindBy(xpath = "//android.view.View[@index='4']")
		@CacheLookup
		public WebElement existingCustomer;

		@FindBy(xpath = "//android.view.View[@text='Existing Customer']")
		@CacheLookup
		public WebElement existingCustomertxt;

		@FindBy(xpath = "//android.view.View[@text='Welcome To Bajaj Finserv']")
		@CacheLookup
		public WebElement welcomeText;
	}
}
