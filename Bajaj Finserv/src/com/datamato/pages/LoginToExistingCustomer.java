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

public class LoginToExistingCustomer {

	private static AndroidDriver<MobileElement> androidDriver;
	BaseSetup baseSetup = new BaseSetup();

	/**
	 * Constructor is used to initilize driver, it gets value from Super class
	 * known as BaseSetup
	 */
	public LoginToExistingCustomer() throws MalformedURLException {
		androidDriver = baseSetup.getDriver();
	}

	By loginExistingCutomerText = By.xpath("//android.view.View[@text='LOG IN TO ACCESS CUSTOMER SERVICE']");
	By experiaID = By.xpath(
			"//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]");
	By password = By.xpath(
			"//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]]");
	By loginButton = By.xpath("//android.widget.Button[@text='LOGIN']");
	By activeRelation = By.xpath("//*[@text='Active Relations' and @class='android.view.View']");

	/**
	 * @return WebElements from Existing User Login Page
	 */
	public WebElement experiaID() {
		return androidDriver.findElement(experiaID);
	}

	public WebElement password() {
		return androidDriver.findElement(password);
	}

	public WebElement loginButton() {
		return androidDriver.findElement(loginButton);
	}

	public WebElement activeReleation() {
		return androidDriver.findElement(activeRelation);
	}

	/**
	 * This method is used to login into Existing Customer and checked whether
	 * log in is successful or not
	 */
	public String loginToExistingCutomer() {
		experiaID().sendKeys("163961");
		password().sendKeys("Bajaj@123");
		loginButton().click();
		return activeReleation().getText();
	}

}
