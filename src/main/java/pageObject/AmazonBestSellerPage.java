package pageObject;

import org.openqa.selenium.WebDriver;

public class AmazonBestSellerPage {
	WebDriver driver;
	
	public AmazonBestSellerPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageTitle() {
		String actualbestSellerTittle=driver.getTitle();
		System.out.println(actualbestSellerTittle);
		return actualbestSellerTittle;
	}

}
