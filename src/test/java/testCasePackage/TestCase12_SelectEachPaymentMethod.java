package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage1;
import pages.LoginSearchpage;
import pages.PaymentPage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase12_SelectEachPaymentMethod extends BaseClass {
	@Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	public void selectEachPaymentMethod() {
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
		  loginSearchpage.buyNowButton();
		  
		  PaymentPage paymentPage = new PaymentPage(driver);
		  paymentPage.amzonPayBalance();
		  paymentPage.creditCardOption();
		  //paymentPage.amzonPayBalanceEnterCode();
		  //paymentPage.amzonPayBalanceApply();
		 // paymentPage.BankOptionBOM();
		  paymentPage.netBankingOption();
		  paymentPage.upiOption();
			 // paymentPage.emiOption();
		  paymentPage.codOption();
}
}