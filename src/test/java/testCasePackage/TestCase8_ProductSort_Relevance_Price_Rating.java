package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductSearchPage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase8_ProductSort_Relevance_Price_Rating extends BaseClass {

	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void productSort_Relevance_Price_Rating () {
	  HomePage homepage = new HomePage(driver);
	  homepage.search("Shoes");
	  homepage.searchbutton();
	  
	  ProductSearchPage productSearchPage = new ProductSearchPage(driver);
	  productSearchPage.filterSearchPrice();
	  productSearchPage.pumaCheckbox();
	  productSearchPage.pumaCheckboxselected();
	  productSearchPage.shoesSize();
	  productSearchPage.shoesizeSelected();
	  productSearchPage.starRating();
	  productSearchPage.starRatingSelected();
	  productSearchPage.discount();
	  productSearchPage.discountSelected();
	  productSearchPage.material();
	  productSearchPage.lace();
	  
	  }
}
