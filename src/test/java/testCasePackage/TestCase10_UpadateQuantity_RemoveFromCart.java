package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase10_UpadateQuantity_RemoveFromCart extends BaseClass {

	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void upadateQuantity_RemoveFromCart() {
		  HomePage homepage = new HomePage(driver);
		  homepage.search("Apple Laptop");
		  homepage.searchbutton();
		  
		  CartPage cartpage = new CartPage(driver);
		  cartpage.addToCart();
		  cartpage.quantity();
		  cartpage.increament();
		  cartpage.quantity1();
		  cartpage.increament1();
		  cartpage.quantity2();
		  cartpage.increament11();
		  cartpage.quantity3();
		  cartpage.decreament();
		  cartpage.quantity4();
		  cartpage.decreament1();
		  cartpage.quantity5();
		  
	  }
}
