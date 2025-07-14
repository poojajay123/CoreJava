package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginSearchpage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public LoginSearchpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;	
	public void search(String input) {
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys(input);
		sa.assertEquals(searchBox.isDisplayed(), true);
	}

	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	public void searchbutton(){		
		searchbutton.click();
		sa.assertEquals(searchbutton.isEnabled(), true);
	}


	@FindBy(xpath="//div[@data-component-type='s-search-result']")
	List<WebElement> LoginSearchResult;

	@FindBy(xpath="(//img[@class='s-image'])[3]")
	WebElement product3Click;
	public void LoginSearchResult3rdClick() {
      if (!LoginSearchResult.isEmpty()) {
			wait.until(ExpectedConditions.visibilityOfAllElements(LoginSearchResult));
			product3Click.click();
  		sa.assertEquals(driver.getTitle().contains("Buy"), true , "Does not match Assertion");
      }
	}
	@FindBy(name="submit.buy-now")
	WebElement buyNowButton;
	public void buyNowButton(){
		wait.until(ExpectedConditions.elementToBeClickable(buyNowButton));
		buyNowButton.click();
	}
	
	@FindBy(xpath="//a[@href='/cart?ref_=ewc_gtc']")
	WebElement goToCart;
	public void goToCart(){
		wait.until(ExpectedConditions.elementToBeClickable(goToCart));
		goToCart.click();
		sa.assertEquals(goToCart.isEnabled(), true);
	}


		@FindBy(id="a-autoid-5-announce")

	WebElement addToCart5thItem;	
	public void addToCart5thItem() {
		wait.until(ExpectedConditions.visibilityOf(addToCart5thItem));
		addToCart5thItem.click();
		sa.assertEquals(addToCart5thItem.isEnabled(), true);
	}
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;	
	public void addToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addToCart.click();
		sa.assertEquals(addToCart.isEnabled(), true);
		//for (String tab : driver.getWindowHandles()) {
		//      driver.switchTo().window(tab);
	}


	
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement OrderOfYours;
	public void OrderOfYours(WebDriver driver){		
		wait.until(ExpectedConditions.elementToBeClickable(OrderOfYours));
		OrderOfYours.click();
		sa.assertEquals(OrderOfYours.isEnabled(), true);
	}
}

