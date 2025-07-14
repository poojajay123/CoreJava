package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductOrderPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	public ProductOrderPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="a-native-dropdown")
	WebElement selectYear;	
	public void selectYearfFromOrder() {
		wait.until(ExpectedConditions.visibilityOf(selectYear));
        Select s = new Select(selectYear);
		s.selectByVisibleText("2023");
		sa.assertEquals(selectYear.isSelected(), true);
	}

	@FindBy(xpath="//div[@class='yohtmlc-product-title']")
	List<WebElement> products;	
	public void products() {
		wait.until(ExpectedConditions.visibilityOfAllElements(products));
		Assert.assertTrue(products.size() > 0, "No products found in order history");
		products.get(2).click();
	}

	@FindBy(linkText="Write a product review")
	List<WebElement> writeReviewLinks;	
	public void writeReviewLinks() {
		if (writeReviewLinks.size() > 0) {
			writeReviewLinks.get(0).click();
		} else {
			Assert.fail("Review option not available for this product");
		}
	}
	@FindBy(xpath="//img[@alt='select to rate item five star.']")
	WebElement fiveStar;	
	public void fiveStar() {
		wait.until(ExpectedConditions.visibilityOf(fiveStar));
		fiveStar.click();
		sa.assertEquals(fiveStar.isDisplayed(), true);
	}

	@FindBy(name="reviewText")
	WebElement reviewText;	
	public void reviewText() {
		wait.until(ExpectedConditions.visibilityOf(reviewText));
		reviewText.sendKeys("Excellent Product!");
		sa.assertEquals(reviewText.isDisplayed(), true);
	}

	@FindBy(name="reviewTitle")
	WebElement reviewTitle;	
	public void reviewTitle() {
		wait.until(ExpectedConditions.visibilityOf(reviewTitle));
		reviewTitle.sendKeys("Product was delivered on time and the quality was great!");
		sa.assertEquals(reviewTitle.isDisplayed(), true);
	}
	@FindBy(className="a-button-input")
	WebElement submitReview;	
	public void submitReview(WebDriver driver) {
		wait.until(ExpectedConditions.elementToBeClickable(submitReview));
		submitReview.click();
		Assert.assertTrue(driver.getPageSource().contains("Review Submitted"), "Review might not have been submitted");
	}
}
