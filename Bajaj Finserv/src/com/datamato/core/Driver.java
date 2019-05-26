package com.datamato.core;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Driver extends BaseSetup {
	protected  AndroidDriver<MobileElement> driver;

	public Driver() throws MalformedURLException {
		this.driver = super.getDriver();
	}
}
