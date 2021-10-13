package UdmeyAutomation_Selenium.SeleniumE2Eproj;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AmazonBestSellerPage;
import pageObject.AmazonCompNAcc_bestSeller;
import pageObject.AmazonElectronics_BestSeller;
import pageObject.AmazonExternalDevices;
import pageObject.AmazonLandingPage;
import pageObject.AmazonProductPage;
import pageObject.AmazonSSD;
import resources.Base_Class;

public class LandingTest extends Base_Class {
	public WebDriver driver;
	AmazonBestSellerPage amaBestsellerObj;
	AmazonLandingPage amazonLandingObj;
	AmazonElectronics_BestSeller amaBestsellerElectro;
	AmazonCompNAcc_bestSeller amaCompnAssObj;
	AmazonExternalDevices amaHardDiscObj;
	AmazonSSD amaSSDObj;
	String ActualProduct = "SanDisk 1TB Extreme Portable SSD";
	AmazonProductPage amaProdPage;
	public static Logger Log = LogManager.getLogger(LandingTest.class.getName());

	@Test(priority = 1)
	public void navigateToAmazone() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
		System.out.println("end of navigateToLandingPage");
		Log.info("end of navigateToLandingPage");
	}

	@Test(priority = 2)
	public void selectBestSeller() {
		amazonLandingObj = new AmazonLandingPage(driver);
		boolean d = amazonLandingObj.chkTabBestSellerVisibility().isDisplayed();
		Assert.assertTrue(d);
		amazonLandingObj.chkTabBestSellerVisibility().click();
	}

	@Test(priority = 3)
	public void verifyTitle() throws IOException {
		amaBestsellerObj = new AmazonBestSellerPage(driver);
		;
		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		String actualTitle = amaBestsellerObj.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 4)
	public void NavigateToBestElectronics() {
		amaBestsellerElectro = new AmazonElectronics_BestSeller(driver);
		amaBestsellerElectro.getBestSeller_Electronics().click();
		assertEquals(amaBestsellerElectro.getbestSell_ElecTitle(),
				"Amazon.in Bestsellers: The most popular items in Electronics");
		System.out.println("reached till Amazon.in Bestsellers: Electronics");
		Log.info("reached till Amazon.in Bestsellers: Electronics");
		
	}

	@Test(priority = 5)
	public void navigateToCompNAcc() {
		amaCompnAssObj = new AmazonCompNAcc_bestSeller(driver);
		amaCompnAssObj.getCompNAcc().click();
		assertEquals(amaCompnAssObj.getTitle(),
				"Amazon.in Bestsellers: The most popular items in Computers & Accessories");
		System.out.println("Reached till Amazon.in Bestsellers: Computers & Accessories");
		Log.info("Reached till Amazon.in Bestsellers: Computers & Accessories");
	}

	@Test(priority = 6)
	public void navigateToExternalHardDisc() {
		amaHardDiscObj = new AmazonExternalDevices(driver);
		amaHardDiscObj.getBestSeller_Electronics().click();
		assertEquals(amaHardDiscObj.getbestSell_ExternalDiscTitle(),
				"Amazon.in Bestsellers: The most popular items in External Devices & Data Storage");
		System.out.println("Reached till Amazon.in Bestsellers: External Devices & Data Storage");
		Log.info("Reached till Amazon.in Bestsellers: External Devices & Data Storage");
	}

	@Test(priority = 7)
	public void navigateToSSD() {
		amaSSDObj = new AmazonSSD(driver);
		amaSSDObj.getBestSellerSSD().click();
		assertEquals(amaSSDObj.getbestSell_ExternalDiscTitle(),
				"Amazon.in Bestsellers: The most popular items in External Solid State Drives123");
		System.out.println("Reached till Amazon.in Bestsellers: SSD");
		Log.info("Reached till Amazon.in Bestsellers: SSD");
	}

	@Test(priority = 8)
	public void selectSSD() {
		amaSSDObj.getSSD().click();
		System.out.println("Reached till product buy page");
		Log.info("Reached till product buy page");
	}

	@Test(priority = 9)
	public void ProductDetails() {
		amaProdPage = new AmazonProductPage(driver);
		String prodPrice=amaProdPage.getProdPrice().getText();
		System.out.println(prodPrice +" is the product price");
		Log.info(prodPrice +" is the product price");
	}
}