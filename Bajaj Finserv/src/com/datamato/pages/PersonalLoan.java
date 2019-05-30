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

public class PersonalLoan {
	private static AndroidDriver<MobileElement> androidDriver;
	BaseSetup baseSetup = new BaseSetup();

	/**
	 * Constructor is used to initilize driver, it gets value from Super class
	 * known as BaseSetup
	 */
	public PersonalLoan() throws MalformedURLException {
		androidDriver = baseSetup.getDriver();
	}

	By recommendedOffertab = By.xpath("//*[@text='rec offers-outline Recommended']");
	By recommendedOfferTitle = By.xpath("//*[@text='Recommended Offers' and @class='android.view.View']");

	By personalLoadCalculatorButton = By.xpath(
			"((((//*[@id='tabpanel-t0-3']/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*/*[@text='CALCULATORS'])[1]");
	By calculatorDisplayedStringOnApp = By.xpath(
			"//*[@text='Flexi Interest-only Loan EMI Calculator' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@text='Home']]]");

	By personalLoanApplyNowButton = By.xpath(
			"((((//*[@id='tabpanel-t0-3']/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*/*[@text='APPLY NOW'])[1]");
	By applyNowDisplayedStringOnApp = By.xpath("//*[@text='Getting Personal Loans couldn’t be quicker!']");

	By personalLoanSeeDetailsButton = By.xpath(
			"((((//*[@id='tabpanel-t0-3']/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*/*[@text='SEE DETAILS'])[1]");
	By seeDetailsDisplayedStringOnApp = By.xpath(
			"//*[@text='Personal Loan' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='Home']]]");

	By backButtonOFApp = By.xpath("//*[@contentDescription='close button']");

	/**
	 * @return WebElements from PersonalLoan Page
	 */
	public WebElement recommendedOffertab() {
		return androidDriver.findElement(recommendedOffertab);
	}

	public WebElement recommendedOfferTitle() {
		return androidDriver.findElement(recommendedOfferTitle);
	}

	public WebElement personalLoadCalculatorButton() {
		return androidDriver.findElement(personalLoadCalculatorButton);
	}

	public WebElement calculatorDisplayedStringOnApp() {
		return androidDriver.findElement(calculatorDisplayedStringOnApp);
	}

	public WebElement personalLoanApplyNowButton() {
		return androidDriver.findElement(personalLoanApplyNowButton);
	}

	public WebElement applyNowDisplayedStringOnApp() {
		return androidDriver.findElement(applyNowDisplayedStringOnApp);
	}

	public WebElement backButtonOFApp() {
		return androidDriver.findElement(backButtonOFApp);
	}

	public WebElement personalLoanSeeDetailsButton() {
		return androidDriver.findElement(personalLoanSeeDetailsButton);
	}

	public WebElement seeDetailsDisplayedStringOnApp() {
		return androidDriver.findElement(seeDetailsDisplayedStringOnApp);
	}

	/**
	 * This method is used to click on Recommended Tab and checked whether the
	 * required page is open or not
	 */
	public String recommendedOffersPage() {
		recommendedOffertab().click();
		System.out.println("Open Recommended Offer page successfully..");
		return recommendedOfferTitle().getText();
	}

	/**
	 * This method is used to click on Calculator Button from Personal Loan
	 * section and checked whether the required page is open or not
	 */
	public String personalLoanCalculator() throws InterruptedException {
		personalLoadCalculatorButton().click();
		Thread.sleep(2000);
		System.out.println("Calculator page open successfully..!");
		String calculatorDisplayText = calculatorDisplayedStringOnApp().getText();
		System.out.println("Moving to previous page..");
		backButtonOFApp().click();
		return calculatorDisplayText;
	}

	/**
	 * This method is used to click on Appy Now Button from Personal Loan
	 * section and checked whether the required page is open or not
	 */
	public String personalLoanApplyNow() throws InterruptedException {
		personalLoanApplyNowButton().click();
		Thread.sleep(2000);
		System.out.println("Personal Loan Page open successfully..!");
		String result = applyNowDisplayedStringOnApp().getText();
		System.out.println("Moving to previous page..");
		backButtonOFApp().click();
		return result;
	}

	/**
	 * This method is used to click on See Details Button from Personal Loan
	 * section and checked whether the required page is open or not
	 */
	public String personalLoanSeeDetails() throws InterruptedException {
		personalLoanSeeDetailsButton().click();
		Thread.sleep(2000);
		String result = seeDetailsDisplayedStringOnApp().getText();
		System.out.println("See Details page open successfully..!");
		System.out.println("Moving to previous page..");
		backButtonOFApp().click();
		return result;
	}
}
