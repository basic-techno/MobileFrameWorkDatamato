package com.datamato.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.datamato.core.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage extends BasePage {
	
	@SuppressWarnings("unused")
	private AndroidDriver<MobileElement> driver;
	
	public WelcomePage() {
	}

	public WelcomePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*@CacheLookup
	@AndroidFindBy(xpath= "//android.view.View[@index='2']")*/
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@index='2']")
	public WebElement newUser;

	/*@CacheLookup
	@AndroidFindBy(xpath= "//android.view.View[@index='4']")*/
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@index='4']")
	public WebElement existingCustomer;

	/*@CacheLookup
	@AndroidFindBy(xpath="//android.view.View[@text='Existing Customer']")*/
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@text='Existing Customer']")
	public WebElement existingCustomertxt;

	/*@CacheLookup
	@AndroidFindBy(xpath="//android.view.View[@text='Welcome To Bajaj Finserv']")*/
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@text='Welcome To Bajaj Finserv']")
	public WebElement welcomeText;

	public boolean isDisplayed() {
		return newUser.isDisplayed();
	}

	public boolean welcomePageLoad() {
		if (existingCustomer.isDisplayed() && existingCustomertxt.isDisplayed() && welcomeText.isDisplayed()
				&& newUser.isDisplayed()) {
			Assert.assertTrue(true, "App open Successfully..!");
			return true;
		} else {
			System.out.println("App is not loaded..!");
			Assert.assertTrue(false, "App is not loaded..!");
			return false;
		}
		
	}
}
