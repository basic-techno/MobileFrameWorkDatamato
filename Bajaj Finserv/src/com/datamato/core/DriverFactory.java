package com.datamato.core;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	private final String appiumPort = "4723";
	private final String serverIp = "0.0.0.0";
	String workingDevice = "d6f08719";
	public static AndroidDriver<MobileElement> driver = null;

	@BeforeClass
	public void setup() throws MalformedURLException {
		android();
	}

	public AndroidDriver<MobileElement> getDriver() {
		return driver;
	}

	public void android() throws MalformedURLException {
		System.out.println("Application Started..");
		System.out.println("Inside initDriver method");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "OnePlus6T");
		capabilities.setCapability("udid", workingDevice);
		capabilities.setCapability("appPackage", "com.BajajServiceApp.VikramUAT");
		capabilities.setCapability("appActivity", ".MainActivity");
		capabilities.setCapability("noReset", true);
		String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

		try {
			System.out.println("Argument to driver object : " + serverUrl);
			driver = new AndroidDriver<MobileElement>(new URL(serverUrl), capabilities);

		} catch (NullPointerException | MalformedURLException ex) {
			throw new RuntimeException("appium driver could not be initialised for device ");
		}

	}
	@BeforeMethod
	 public void beforeTestMethod(Method testMethod){
	    System.out.println("Before Testmethod: " + testMethod.getName());       
	 }
	@AfterMethod
	 public void afterTestMethod(Method testMethod){
	    System.out.println("After Testmethod: " + testMethod.getName());       
	 }

	@AfterClass
	public void tearDown() {
		System.out.println("Closing Application");
		driver.quit();
	}
}
