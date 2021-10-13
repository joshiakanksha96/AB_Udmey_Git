package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonExternalDevices {
	WebDriver driver;

	public AmazonExternalDevices(WebDriver driver) {
		this.driver = driver;
	}

	private By bestSellr_ExternalDevices = By.xpath("//li//child::a[contains(text(),'External Devices & Data Storage')]");

	public WebElement getBestSeller_Electronics() {
		WebElement bestSell_ExternalDevices = driver.findElement(bestSellr_ExternalDevices);
		return bestSell_ExternalDevices;
	}

	public String getbestSell_ExternalDiscTitle() {
		String actTitle=driver.getTitle();
		return actTitle;
	}

}
