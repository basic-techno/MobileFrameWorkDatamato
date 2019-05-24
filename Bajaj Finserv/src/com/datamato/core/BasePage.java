package com.datamato.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BasePage extends DriverFactory {
	protected AppiumDriver<MobileElement> driver = null;

	public BasePage() {
		this.driver = super.getDriver();
	}
}
