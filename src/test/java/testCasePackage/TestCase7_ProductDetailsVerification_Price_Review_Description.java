package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailPage;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase7_ProductDetailsVerification_Price_Review_Description extends utility.BaseClass{

	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
		public void productDetailsVerification_Price_Review_Description(){	

		  HomePage homepage = new HomePage(driver);
		  homepage.search("Shoes");
		  homepage.searchbutton();
		  homepage.listOfShoesandClick1stProduct();
		  
		  ProductDetailPage productDetailPage = new ProductDetailPage(driver);
		  productDetailPage.productTitle();
		  productDetailPage.productRating();
		  productDetailPage.productPrice();
		  productDetailPage.productOffer();
		  
		  
		}
}
