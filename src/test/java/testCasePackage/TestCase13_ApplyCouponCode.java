package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage1;
import pages.LoginSearchpage;
import pages.ProductDetailPage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase13_ApplyCouponCode extends BaseClass{
	@Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	public void ApplyCouponCode() {
		HomePage homepage=new HomePage(driver);
		homepage.hoverOverAccountAndList(driver);
		homepage.signInFromHomePage();

		LoginPage1 loginpage=new LoginPage1(driver);
		loginpage.un("9970353200");
		loginpage.cnt();
		loginpage.pwd("Poojajay@15");
		loginpage.signinb();

		LoginSearchpage loginSearchpage = new LoginSearchpage(driver);
		loginSearchpage.search("Shoes");
		loginSearchpage.searchbutton();
		loginSearchpage.LoginSearchResult3rdClick();
		
		ProductDetailPage productDetailPage = new ProductDetailPage(driver);
		productDetailPage.coupon();
	}
}
