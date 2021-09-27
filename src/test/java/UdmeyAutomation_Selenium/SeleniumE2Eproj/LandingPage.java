package UdmeyAutomation_Selenium.SeleniumE2Eproj;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AmazonLandingPage;
import resources.Base_Class;

public class LandingPage extends Base_Class {
	public WebDriver driver;
	
	
@Test
public void navigateToLandingPage() throws IOException {
	driver=initializeDriver();
	System.out.println("end of navigateToLandingPage");
}

@Test
public void varifyBestSellerTab() {
	AmazonLandingPage amazonLandingObj = new AmazonLandingPage(driver);
	boolean d =amazonLandingObj.chkTabBestSellerVisibility().isDisplayed();
	Assert.assertTrue(d);
	System.out.println("element is displayed");
}
}
