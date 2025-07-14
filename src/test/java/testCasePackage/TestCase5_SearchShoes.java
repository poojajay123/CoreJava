package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase5_SearchShoes extends BaseClass {

	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void searchShoes() {
		  HomePage homepage = new HomePage(driver);
		  homepage.search("Shoes");
		  homepage.searchbutton();
		  }
	  /*{
	  try {
		ScreenshotUtil.CaptureScreenshot(driver, "TestFailure");
	} catch (IOException e) {
		e.printStackTrace();
}*/
}