package com.datamato.tests;
/**
 * @author Datamato
 * @version 1.0
 */
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamato.pages.PocketInsurance;

public class PocketInsuranceTest {
	
	/**
	 *@testcase for validate to POCKET INSURANCE and validate SEE DETAILS Page 
	 */
	@Test(priority = 0,dependsOnGroups={"personalLoan"})
	public void scrollToPocketInsuranceAndClickOnSeeDetailsButton() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.scrollToPocketInsurance(), "TYPES OF INSURANCE","Pocket Insurance page not open properly..!");
	}
	
	/**
	 *@testcase for validate to TRAVEL Button from POCKET INSURANCE
	 */
	@Test(dependsOnMethods="scrollToPocketInsuranceAndClickOnSeeDetailsButton",priority=1,dependsOnGroups={"personalLoan"})
	public void pocketInsuranceClickTravel() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceClickTravel(),"Travel","Travel page not opened properly..!");
	}
	
	/**
	 *@testcase for validate to BROCHURE Button from TRAVEL Section
	 */
	@Test(dependsOnMethods="pocketInsuranceClickTravel",priority=2,dependsOnGroups={"personalLoan"})
	public void pocketInsuranceTravelBrochure() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceTravelBrochure(), "atm-assault-robbery.pdf","atm-assault-robbery.pdf not opened properly..!");
	}
	
	/**
	 *@testcase for validate to KNOW MORE Button from TRAVEL Section
	 */
	@Test(dependsOnMethods="pocketInsuranceClickTravel",priority=3,dependsOnGroups={"personalLoan"})
	public void pocketInsuranceTravelKnowMore() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceTravelKnowMore(), "Prompt services for a worry-free pilgrimage","PocketInsurance know more page not opened from PILGRIMAGE COVER Tab.");
	}
	
	/**
	 *@testcase for validate to APPLY NOW Button from TRAVEL Section
	 */
	@Test(dependsOnMethods="pocketInsuranceClickTravel",priority=4,dependsOnGroups={"personalLoan"})
	public void pocketInsuranceTravelApplyNow() throws InterruptedException, MalformedURLException {
		PocketInsurance pocketInsurance = new PocketInsurance();
		Assert.assertEquals(pocketInsurance.pocketInsuranceTravelApplyNow(), "Pilgrimage Holiday Insurance- Application Form","PocketInsurance Apply Now  Button not found from PILGRIMAGE COVER Tab.");
	}
}
