package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSSD {
	WebDriver driver;

	public AmazonSSD(WebDriver driver) {
		this.driver = driver;
	}

	private By bestSellrSSD = By.xpath("//li//child::a[contains(text(),'External Solid State Drives')]");
	private By SSD=By.xpath("//div[@class='p13n-sc-truncated' and contains(text(),'SanDisk 1TB Extreme Portable SSD')]");

	public WebElement getBestSellerSSD() {
		WebElement bestSellr_SSD = driver.findElement(bestSellrSSD);
		return bestSellr_SSD;
	}

	public String getbestSell_ExternalDiscTitle() {
		String actTitle=driver.getTitle();
		return actTitle;
	}
	
	public WebElement getSSD() {
		WebElement actualProd = driver.findElement(SSD);
		return actualProd;
	}

}
