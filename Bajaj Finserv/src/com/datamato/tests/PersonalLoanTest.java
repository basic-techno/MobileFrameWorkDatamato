package com.datamato.tests;
/**
 * @author Datamato
 * @version 1.0
 */
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.pages.PersonalLoan;

public class PersonalLoanTest {
	
	/**
	 *@testcase for validate to RECOMMENDED Offers Page 
	 */
	@Test(priority = 0,dependsOnGroups={"loginExistingCustomer"},groups={"personalLoan"})
	public void openRecommendedOffersPage() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.recommendedOffersPage(), "Recommended Offers",
				"Recommended offer page not opened properly...!");
	}

	/**
	 *@testcase for validate to CALCULATOR Page 
	 */
	@Test(dependsOnMethods = "openRecommendedOffersPage", priority = 1,groups={"personalLoan"})
	public void personalLoanCalculator() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.personalLoanCalculator(), "Flexi Interest-only Loan EMI Calculator",
				"Calculator page not opened properly...!");
	}

	/**
	 *@testcase for validate to APPLY NOW Page 
	 */
	@Test(dependsOnMethods = "openRecommendedOffersPage", priority = 2,groups={"personalLoan"})
	public void PersonalLoanApplyNow() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.personalLoanApplyNow(), "Getting Personal Loans couldn’t be quicker!",
				"Personal Loan Page not open properly...!");
	}

	/**
	 *@testcase for validate to SEE DETAILS Page 
	 */
	@Test(dependsOnMethods = "openRecommendedOffersPage", priority = 3,groups={"personalLoan"})
	public void personalLoanSeeDetails() throws InterruptedException, MalformedURLException {
		PersonalLoan personalLoan = new PersonalLoan();
		Assert.assertEquals(personalLoan.personalLoanSeeDetails(), "Personal Loan",
				"See Details page not open properly...");
	}
}
