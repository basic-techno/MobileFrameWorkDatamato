package com.datamato.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.datamato.core.BaseSetup;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PersonalLoan {
	private static AndroidDriver<MobileElement> androidDriver;
	BaseSetup baseSetup = new BaseSetup();

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

	public boolean recommendedOffersPage() {
		recommendedOffertab().click();
		if (recommendedOfferTitle().getText().equals("Recommended Offers")) {
			System.out.println("Open Recommended Offer page susscessfully..");
			return true;
		} else {
			System.out.println("Not opened Recommended offer page");
			return false;
		}
	}

	public boolean personalLoanCalculator() {
		personalLoadCalculatorButton().click();

		if (calculatorDisplayedStringOnApp().getText().equals("Flexi Interest-only Loan EMI Calculator")) {
			System.out.println("Calculator page open successfully..!");
			backButtonOFApp().click();
			System.out.println("Moving to previous page..");
			return true;
		} else {
			System.out.println("Calculator page not open...");
			return false;
		}
	}

	public boolean personalLoanApplyNow() {
		personalLoanApplyNowButton().click();
		if (applyNowDisplayedStringOnApp().getText().equals("Getting Personal Loans couldn’t be quicker!")) {
			System.out.println("Personal Loan Page open successfully..!");
			backButtonOFApp().click();
			System.out.println("Moving to previous page..");
			return true;
		} else {
			System.out.println("Personal Loan Page not open!");
			return false;
		}
	}

	public boolean personalLoanSeeDetails() {
		personalLoanSeeDetailsButton().click();

		if (seeDetailsDisplayedStringOnApp().getText().equals("Personal Loan")) {
			System.out.println("See Details page open successfully..!");
			backButtonOFApp().click();
			System.out.println("Moving to previous page..");
			return true;
		} else {
			System.out.println("See Details page not open...");
			return false;
		}
	}
}
