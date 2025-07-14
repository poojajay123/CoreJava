package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage1;
import pages.LoginSearchpage;
import pages.PaymentPage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)
class TestCase11_Checkout_PaymentMethod_orderReview_Address extends BaseClass {
	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void checkout_PaymentMethod_orderReview_Address() {
		  HomePage homepage=new HomePage(driver);
		  homepage.hoverOverAccountAndList(driver);
		  homepage.signInFromHomePage();
		  
		  LoginPage1 loginpage=new LoginPage1(driver);
		  loginpage.un("ajay.s.kangude@gmail.com");
		  loginpage.cnt();
		  loginpage.pwd("Pranshi@25");
		  loginpage.signinb();
	  
		  LoginSearchpage loginSearchpage = new LoginSearchpage(driver);
		  loginSearchpage.search("Shoes");
		  loginSearchpage.searchbutton();
		  loginSearchpage.LoginSearchResult3rdClick();
		  loginSearchpage.buyNowButton();
		  
		  PaymentPage paymentPage = new PaymentPage(driver);
		  paymentPage.changeAddressLink();
		  paymentPage.ChangeAddress();
		  paymentPage.deliverToAddress();
		  paymentPage.creditCardOption();


		  
	  }
}