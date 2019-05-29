package com.datamato.tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.pages.PocketInsurance;

public class PocketInsuranceTest {
	@Test(priority = 0)
	public void scrollToPocketInsuranceAndClickOnSeeDetailsButton() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.scrollToPocketInsurance(), true);
	}
	
	@Test(dependsOnMethods="scrollToPocketInsuranceAndClickOnSeeDetailsButton",priority=1)
	public void pocketInsuranceClickTravel() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceClickTravel(), true);
	}
	@Test(dependsOnMethods="pocketInsuranceClickTravel",priority=2)
	public void pocketInsuranceTravelBrochure() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceTravelBrochure(), true);
	}
	
	@Test(dependsOnMethods="pocketInsuranceClickTravel",priority=3)
	public void pocketInsuranceTravelKnowMore() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceTravelKnowMore(), true);
	}
	
	@Test(dependsOnMethods="pocketInsuranceClickTravel",priority=4)
	public void pocketInsuranceTravelApplyNow() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceTravelApplyNow(), true);
	}
}
