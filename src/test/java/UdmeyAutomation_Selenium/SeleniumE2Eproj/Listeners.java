package UdmeyAutomation_Selenium.SeleniumE2Eproj;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base_Class;

public class Listeners extends Base_Class implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On test Start");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test successfull");
	}

	public void onTestFailure(ITestResult result) {
		WebDriver drive=null;
		// Capture Name of the test which got failed
		String FailedTestName = result.getMethod().getMethodName();
		// capture the driver object life of the methose/test that got failed
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			getScreenShotPath(FailedTestName,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
