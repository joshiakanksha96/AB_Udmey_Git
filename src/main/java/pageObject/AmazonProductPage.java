package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonProductPage {
	WebDriver driver;

	public AmazonProductPage(WebDriver driver) {
		this.driver = driver;
	}

	private By buyNow = By.id("buy-now-button");
	private By ProdPrice = By.id("priceblock_dealprice");
	
	public WebElement getBuyNowButton() {
		WebElement bestSellr_SSD = driver.findElement(buyNow);
		return bestSellr_SSD;
	}

	public String getProdPageTitle() {
		String actTitle=driver.getTitle();
		return actTitle;
	}
	
	public WebElement getProdPrice() {
		return driver.findElement(ProdPrice);
	}
}
