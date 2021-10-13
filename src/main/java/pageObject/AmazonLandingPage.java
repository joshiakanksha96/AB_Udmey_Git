package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLandingPage {
	WebDriver driver;
	
	public AmazonLandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By bestSellerBtn=By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98']");
	
	public WebElement chkTabBestSellerVisibility() {
		return driver.findElement(bestSellerBtn);
	}
}
