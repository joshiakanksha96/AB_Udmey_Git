package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonElectronics_BestSeller {
	WebDriver driver;

	public AmazonElectronics_BestSeller(WebDriver driver) {
		this.driver = driver;
	}

	private By bestSellr_Electronics = By.xpath("//li//child::a[contains(text(),'Electronics')]");

	public WebElement getBestSeller_Electronics() {
		WebElement bestSell_Electronics = driver.findElement(bestSellr_Electronics);
		return bestSell_Electronics;
	}

	public String getbestSell_ElecTitle() {
		String actTitle=driver.getTitle();
		return actTitle;
	}

}
