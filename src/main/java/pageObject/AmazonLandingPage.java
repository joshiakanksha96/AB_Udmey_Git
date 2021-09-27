package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLandingPage {
	WebDriver driver;
	
	public AmazonLandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By todaysDeals=By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']");
	
	public WebElement chkTabBestSellerVisibility() {
		return driver.findElement(todaysDeals);
	}
}
