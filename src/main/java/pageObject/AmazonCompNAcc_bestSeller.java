package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonCompNAcc_bestSeller {

	WebDriver driver;
	
	public AmazonCompNAcc_bestSeller(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private By CompNAcc = By.xpath("//li//child::a[contains(text(),'Computers & Accessories')]");
	
	public WebElement getCompNAcc() {
		WebElement CompNAccElem=driver.findElement(CompNAcc);
		return CompNAccElem;
	}
	
	public String getTitle() {
		String actTitle=driver.getTitle();
		return actTitle;
	}
}

