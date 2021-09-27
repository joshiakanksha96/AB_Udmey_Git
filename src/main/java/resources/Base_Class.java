package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public WebDriver driver;
	String projLocation;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException{
		prop = new Properties();
		projLocation = System.getProperty("user.dir");
		System.out.println(projLocation);
		FileInputStream fis = new FileInputStream(projLocation+"\\src\\main\\java\\resources\\testData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		//System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\NewEclipseWorkSpace\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			String webSiteLink = prop.getProperty("URL");
			driver.get(webSiteLink);;
		}
		else if (browserName.equals("firefox")){
			//code for firefox initialization
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
