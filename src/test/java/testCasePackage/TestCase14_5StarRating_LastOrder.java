package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage1;
import pages.LoginSearchpage;
import pages.ProductOrderPage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase14_5StarRating_LastOrder extends BaseClass {
	
		//WebDriver driver;
	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void StarRating_LastOrder() 
	  {
	 HomePage homepage=new HomePage(driver);
	  homepage.hoverOverAccountAndList(driver);
	  homepage.signInFromHomePage();
	  
	  LoginPage1 loginpage=new LoginPage1(driver);
	  loginpage.un("ajay.s.kangude@gmail.com");
	  loginpage.cnt();
	  loginpage.pwd("Pranshi@25");
	  loginpage.signinb();
	  
	  LoginSearchpage loginSearchPage = new LoginSearchpage(driver);
	  loginSearchPage.OrderOfYours(driver);
	  
	  ProductOrderPage productOrderPage = new ProductOrderPage(driver);
	  productOrderPage.selectYearfFromOrder();
	  productOrderPage.products();
	  productOrderPage.writeReviewLinks();
	  productOrderPage.fiveStar();
	  productOrderPage.reviewText();
	  productOrderPage.reviewTitle();
	  productOrderPage.submitReview(driver);
	  
	  
	  
	  }
}
