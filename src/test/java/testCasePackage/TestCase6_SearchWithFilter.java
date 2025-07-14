package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductSearchPage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase6_SearchWithFilter extends BaseClass {

	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void searchWithFilter () {
		  HomePage homepage = new HomePage(driver);
		  homepage.search("Shoes");
		  homepage.searchbutton();
		  
		  ProductSearchPage productSearchPage = new ProductSearchPage(driver);
		  productSearchPage.filterSearchPrice();
		  productSearchPage.shoesSize();
		 
		  
}
}