package retryAndTestListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.BaseClass1;
import utility.ScreenshotUtil;

public class Listener extends BaseClass1 implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
			String ScreenshotName = result.getName();
			try {
				ScreenshotUtil.CaptureScreenshot(driver, ScreenshotName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		System.out.println("FAILED: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("PASSED: " + result.getName());
	}
}

