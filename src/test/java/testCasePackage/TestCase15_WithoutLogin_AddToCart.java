package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase15_WithoutLogin_AddToCart extends BaseClass {

	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void withoutLogin_AddToCart() {

		  HomePage homepage = new HomePage(driver);
		  homepage.search("Apple Laptop");
		  homepage.searchbutton();
		  homepage.listAppleLaptopandClick3rdProduct();
		  
		  CartPage cartPage = new CartPage(driver);
		  cartPage.cartButton();
}
}