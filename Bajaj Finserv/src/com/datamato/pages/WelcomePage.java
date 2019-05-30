package com.datamato.pages;

/**
 * @author Datamato
 * @version 1.0
 */
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.datamato.core.BaseSetup;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WelcomePage {
	private static AndroidDriver<MobileElement> androidDriver;
	BaseSetup baseSetup = new BaseSetup();

	/**
	 * Constructor is used to initilize driver, it gets value from Super class
	 * known as BaseSetup
	 */
	public WelcomePage() throws MalformedURLException {
		androidDriver = baseSetup.getDriver();

	}

	// For Welcome Page
	By newUser = By.xpath("//android.view.View[@index='2']");
	By existingCustomer = By.xpath("//android.view.View[@index='4']");
	By welcomePageText = By.xpath("//android.view.View[@text='Tell us your customer type.']");
	By existingCustomertxt = By.xpath("//android.view.View[@text='Existing Customer']");

	// For Existing Customer login Page
	By loginExistingCutomerText = By.xpath("//android.view.View[@text='LOG IN TO ACCESS CUSTOMER SERVICE']");
	By experiaID = By.xpath(
			"//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]");
	By password = By.xpath(
			"//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]]");
	By loginButton = By.xpath("//android.widget.Button[@text='LOGIN']");

	/**
	 * 
	 * @return WebElements from HomePage and Exisitng Customer login page
	 */
	public WebElement newUser() {
		return androidDriver.findElement(newUser);
	}

	public WebElement existingCustomer() {
		return androidDriver.findElement(existingCustomer);
	}

	public WebElement existingCustomertxt() {
		return androidDriver.findElement(existingCustomertxt);
	}

	public WebElement welcomePageText() {
		return androidDriver.findElement(welcomePageText);
	}

	public WebElement loginExistingCutomerText() {
		return androidDriver.findElement(loginExistingCutomerText);
	}

	public WebElement experiaID() {
		return androidDriver.findElement(experiaID);
	}

	public WebElement password() {
		return androidDriver.findElement(password);
	}

	public WebElement loginButton() {
		return androidDriver.findElement(loginButton);
	}

	/**
	 * This method is used to checked Home Page is loaded or not
	 */
	public String welcomePageContent() throws InterruptedException {
		if (newUser().isEnabled() && existingCustomer().isEnabled()) {
			System.out.println("Welcome page loaded successfully..!");
		}
		return welcomePageText().getText();
	}

	/**
	 * This method is used to select Existing User Tab and checked Login Page is
	 * loaded or not
	 */
	public boolean selectExistingCustomer() throws InterruptedException, MalformedURLException {
		existingCustomer().click();
		Thread.sleep(3000);
		if (experiaID().isDisplayed() && password().isDisplayed()) {
			System.out.println("Existing Customer login page opened successfully..!");
			return true;
		} else {
			return false;
		}
	}
}
