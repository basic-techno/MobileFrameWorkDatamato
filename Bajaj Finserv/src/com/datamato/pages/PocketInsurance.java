package com.datamato.pages;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.datamato.core.BaseSetup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class PocketInsurance {

	private static AndroidDriver<MobileElement> androidDriver;
	BaseSetup baseSetup = new BaseSetup();

	private int i = 1;

	public PocketInsurance() throws MalformedURLException {
		androidDriver = baseSetup.getDriver();
	}

	public void scrollDownDown() {
		i++;
		Dimension dimention = androidDriver.manage().window().getSize();

		Double scrollHeightStart = dimention.getHeight() * 0.5;
		int scrollStart = scrollHeightStart.intValue();

		Double scrollHeightEnd = dimention.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();

		new TouchAction<>(androidDriver).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}

	public List<MobileElement> getItemWebView() throws InterruptedException {
		return (List<MobileElement>) androidDriver.findElements(By.xpath(
				"((((//*[@id='tabpanel-t0-3']/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*/*[@text='SEE DETAILS'])[10]"));
		
		//return (List<MobileElement>) pocketInsuranceSeeDetailsButton();
	}

	public void scrollTillWebView() throws InterruptedException {
		while (getItemWebView().size() == 1) {
			if (i < 8)
				scrollDownDown();
			else
				break;
		}

		if (i >= 8)// getItemWebView().size() > 1
		{
			getItemWebView().get(0).click();
		}
		Thread.sleep(4000);
	}


	By pocketInsuranceSeeDetailsButton = By.xpath("((((//*[@id='tabpanel-t0-3']/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[2]/*/*[@text='SEE DETAILS'])[10]");
	
	By seeDetailsTypeOfInsuranceOnApp = By.xpath("//*[@text='TYPES OF INSURANCE']");
	
	By pocketInsuranceClickTravelButton = By.xpath("//*[@class='android.view.View' and ./*[@class='android.widget.Image'] and ./*[@text='Travel']]");
	
	By verifyWeCameInTravelText= By.xpath("//*[@text='Travel' and @class='android.view.View']");
	
	By pocketInsuranceTravelBrochureButton = By.xpath("//*[@text='BROCHURE' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='PILGRIMAGE COVER']]]]");

	By verifyWeCameBrochureTitle= By.xpath("//*[@text='atm-assault-robbery.pdf']");
	
	By broucherPdfBackButton = By.xpath("//*[@contentDescription='Navigate up']");
	
	By pocketInsuranceTravelKnowMoreButton = By.xpath("//*[@text='KNOW MORE' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='PILGRIMAGE COVER']]]]");
	
	By pocketInsuranceTravelKnowMoreValidateText = By.xpath("//*[@text='Prompt services for a worry-free pilgrimage']");
	
	By pocketInsuranceTravelKnowMoreBackButton = By.xpath("//*[@text='arrow back']");
	
	By pocketInsuranceTravelApplyNowButton = By.xpath("(((//*[@id='tabpanel-t0-3']/*[@class='android.view.View'])[2]/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]])[2]/*/*[@text='APPLY NOW'])[1]");
	
	By pocketInsuranceTravelApplyNowButtonValidateText = By.xpath("//*[@text='Pilgrimage Holiday Insurance- Application Form']");
	
	By pocketInsuranceTravelApplyNowCloseButton = By.xpath("//*[@contentDescription='close button']");
	
	public WebElement seeDetailsTypeOfInsuranceOnApp() {
		return androidDriver.findElement(seeDetailsTypeOfInsuranceOnApp);
	}
	
	public WebElement pocketInsuranceSeeDetailsButton() {
		return androidDriver.findElement(pocketInsuranceSeeDetailsButton);
	}
	
	public WebElement pocketInsuranceClickTravelButton() {
		return androidDriver.findElement(pocketInsuranceClickTravelButton);
	}
	
	public WebElement verifyWeCameInTravelText() {
		return androidDriver.findElement(verifyWeCameInTravelText);
	}
	
	public WebElement pocketInsuranceTravelBrochureButton() {
		return androidDriver.findElement(pocketInsuranceTravelBrochureButton);
	}
	
	
	public WebElement verifyWeCameBrochureTitle() {
		return androidDriver.findElement(verifyWeCameBrochureTitle);
	}
	
	public WebElement broucherPdfBackButton() {
		return androidDriver.findElement(broucherPdfBackButton);
	}
	
	public WebElement pocketInsuranceTravelKnowMoreButton() {
		return androidDriver.findElement(pocketInsuranceTravelKnowMoreButton);
	}
	
	public WebElement pocketInsuranceTravelKnowMoreValidateText() {
		return androidDriver.findElement(pocketInsuranceTravelKnowMoreValidateText);
	}
	
	public WebElement pocketInsuranceTravelKnowMoreBackButton() {
		return androidDriver.findElement(pocketInsuranceTravelKnowMoreBackButton);
	}
	
	public WebElement pocketInsuranceTravelApplyNowButton() {
		return androidDriver.findElement(pocketInsuranceTravelApplyNowButton);
	}
	
	public WebElement pocketInsuranceTravelApplyNowButtonValidateText() {
		return androidDriver.findElement(pocketInsuranceTravelApplyNowButtonValidateText);
	}
	
	
	public WebElement pocketInsuranceTravelApplyNowCloseButton() {
		return androidDriver.findElement(pocketInsuranceTravelApplyNowCloseButton);
	}
	
	
	
	public boolean scrollToPocketInsurance() throws InterruptedException{
		scrollTillWebView();
		if(seeDetailsTypeOfInsuranceOnApp().getText().equals("TYPES OF INSURANCE")){
			System.out.println("Pocket Insurance page open successfully...! ");
			return true;
		}else{
			System.out.println("Pocket Insurance page not open");
			return false;		
		}
	}
	
	public boolean pocketInsuranceClickTravel(){
		pocketInsuranceClickTravelButton().click();
		
		if(verifyWeCameInTravelText().getText().equals("Travel")){
			System.out.println("Travel Page open Successfully");
			return true;
		}else{
			System.out.println("Travel page not opened..");
			return false;
		}
		
	}
	
	public boolean pocketInsuranceTravelBrochure(){
		pocketInsuranceTravelBrochureButton().click();
		if(verifyWeCameBrochureTitle().getText().equals("atm-assault-robbery.pdf")){
			System.out.println("atm-assault-robbery.pdf open successfully...!");
			broucherPdfBackButton().click();
			System.out.println("Moving to back from PDF...");
			return true;
			
		}
		else{
			System.out.println("atm-assault-robbery.pdf not open");
			return false;
		}
	}
	
	
	public boolean pocketInsuranceTravelKnowMore(){
		pocketInsuranceTravelKnowMoreButton().click();
		if(pocketInsuranceTravelKnowMoreValidateText().getText().equals("Prompt services for a worry-free pilgrimage")){
			System.out.println("PocketInsurance know more page opens successfully from PILGRIMAGE COVER Tab..");
			pocketInsuranceTravelKnowMoreBackButton().click();
			System.out.println("Moving to back from PILGRIMAGE COVER know more page...");
			return true;
		}
		else{
			System.out.println("PocketInsurance know more page not opened from PILGRIMAGE COVER Tab..");
			return false;
		}
	}
	
	public boolean pocketInsuranceTravelApplyNow(){
		pocketInsuranceTravelApplyNowButton().click();
		if(pocketInsuranceTravelApplyNowButtonValidateText().getText().equals("Pilgrimage Holiday Insurance- Application Form")){
			System.out.println("PocketInsurance Apply Now more page opens successfully from PILGRIMAGE COVER Tab..");
			pocketInsuranceTravelApplyNowCloseButton().click();
			System.out.println("Closing from Applu now from PILGRIMAGE COVER Tab");
			return true;
		}else{
			System.out.println("PocketInsurance Apply Now  Button not found from PILGRIMAGE COVER Tab..");
			return false;
		}
		
	}
	
}
