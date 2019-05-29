package com.datamato.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.datamato.core.BaseSetup;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginToExistingCustomer {

	private static AndroidDriver<MobileElement> androidDriver;
	BaseSetup baseSetup = new BaseSetup();
	
	public LoginToExistingCustomer() throws MalformedURLException {
		androidDriver = baseSetup.getDriver();

	}
	
	By loginExistingCutomerText = By.xpath("//android.view.View[@text='LOG IN TO ACCESS CUSTOMER SERVICE']");
	By experiaID = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]");
	By password = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]]");
	By loginButton = By.xpath("//android.widget.Button[@text='LOGIN']");
	By activeRelation = By.xpath("//*[@text='Active Relations' and @class='android.view.View']");
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
	public boolean loginToExistingCutomer(){		
		experiaID().sendKeys("163961");
		password().sendKeys("Bajaj@123");	
		loginButton().click();
		if(activeReleation().getText().equals("Active Relations")){
			System.out.println("Login Successfully..!");
			return true;
		}
		else{
			System.out.println("Login failed..!");
			return false;
		}
		
	}

	
}
