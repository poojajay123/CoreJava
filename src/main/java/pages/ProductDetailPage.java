package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ProductDetailPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	@FindBy(id="productTitle")
	WebElement productTitle;
	public void productTitle(){		
		wait.until(ExpectedConditions.visibilityOf(productTitle));
		sa.assertEquals(productTitle.isDisplayed(), true);	
	}

	@FindBy(id="acrCustomerReviewText")
	WebElement productRating;
	public void productRating(){		
		wait.until(ExpectedConditions.visibilityOf(productRating));
		sa.assertEquals(productRating.isDisplayed(), true);	
	}

	@FindBy(className="a-price-whole")
	WebElement productPrice;
	public void productPrice(){		
		wait.until(ExpectedConditions.visibilityOf(productPrice));
		sa.assertEquals(productPrice.isDisplayed(), true);	
	}

	@FindBy(className="a-size-base")
	WebElement productOffer;
	public void productOffer(){		
		wait.until(ExpectedConditions.visibilityOf(productOffer));
		sa.assertEquals(productOffer.isDisplayed(), true);	
	}

	@FindBy(xpath="//span[@data-csa-c-action='clipPromotion']")
	WebElement coupon;	
	public void coupon(){	
		try {
	if (coupon.isDisplayed()) {
		System.out.println("Coupon is displayed: " + coupon.getText());
		sa.assertTrue(true, "Coupon is displayed.");
		coupon.click();
	}
		}
 catch (Exception e) {
	System.out.println("Coupon not available for this order.");
	sa.assertTrue(false, "Coupon not found.");
}
}}
