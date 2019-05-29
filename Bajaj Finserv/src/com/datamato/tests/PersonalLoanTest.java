package com.datamato.tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.pages.PersonalLoan;

public class PersonalLoanTest {

	@Test(priority = 0)
	public void openRecommendedOffersPage() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.recommendedOffersPage(), true);
	}
	
	@Test(dependsOnMethods="openRecommendedOffersPage", priority=1)
	public void personalLoanCalculator() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.personalLoanCalculator(), true);
	}
	
	@Test(dependsOnMethods="openRecommendedOffersPage", priority=2)
	public void PersonalLoanApplyNow() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.personalLoanApplyNow(), true);
	}
	
	@Test(dependsOnMethods="openRecommendedOffersPage", priority=2)
	public void personalLoanSeeDetails() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.personalLoanSeeDetails(), true);
	}
}
