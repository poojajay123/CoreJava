package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CartPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="attach-sidesheet-view-cart-button")
	WebElement cartButton;
	@FindBy(id="nav-cart")
	WebElement cartBtn;
	public void cartButton(){		
		try {			
			wait.until(ExpectedConditions.elementToBeClickable(cartButton));
			cartButton.click();
			sa.assertEquals(cartButton.isEnabled(), true);
		}
		catch(Exception e){
			wait.until(ExpectedConditions.elementToBeClickable(cartBtn));
			cartBtn.click();
			sa.assertEquals(cartBtn.isEnabled(), true);
		}

	}

	@FindBy(id="a-autoid-3-announce")
	WebElement addToCart;	
	public void addToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addToCart.click();
		sa.assertEquals(addToCart.isEnabled(), true);
		sa.assertEquals(driver.getTitle(), "Amazon.in : Apple Laptop");
	}
	@FindBy(xpath="//span[@data-a-selector='value' and text()='1']")
	WebElement quantity;	
	public void quantity() {
		wait.until(ExpectedConditions.visibilityOf(quantity));
		sa.assertEquals(quantity.getText().contains("1"), true);
	}
	@FindBy(xpath="(//button[@data-a-selector='increment' and @class='a-declarative'])[1]")
	WebElement increament;	
	public void increament() {
		wait.until(ExpectedConditions.elementToBeClickable(increament));
		increament.click();
		sa.assertEquals(increament.isEnabled(), true);

		}
	@FindBy(xpath="//span[@data-a-selector='value' and text()='2']")
	WebElement quantity1;	
	public void quantity1() {
		wait.until(ExpectedConditions.visibilityOf(quantity1));
		sa.assertEquals(quantity1.getText().contains("2"), true);
	}
	@FindBy(xpath="(//button[@class='a-declarative' and @data-a-selector='increment'])[1]")
	WebElement increament1;	
	public void increament1() {
		wait.until(ExpectedConditions.elementToBeClickable(increament1));
		increament1.click();
		sa.assertEquals(increament1.isEnabled(), true);
		}
	@FindBy(xpath="//span[@data-a-selector='value' and text()='3']")
	WebElement quantity2;	
	public void quantity2() {
		wait.until(ExpectedConditions.visibilityOf(quantity2));
		sa.assertEquals(quantity2.getText().contains("3"), true);
	}
	@FindBy(xpath="(//button[@class='a-declarative' and @data-a-selector='increment'])[1]")
	WebElement increament11;	
	public void increament11() {
		wait.until(ExpectedConditions.elementToBeClickable(increament11));
		increament11.click();
		sa.assertEquals(increament1.isEnabled(), true);
		}
	
	@FindBy(xpath="//span[@data-a-selector='value' and text()='4']")
	WebElement quantity3;	
	public void quantity3() {
		wait.until(ExpectedConditions.visibilityOf(quantity3));
    	sa.assertEquals(quantity3.getText().contains("4"), true);
	}
	@FindBy(xpath="(//button[@class='a-declarative' and @data-a-selector='decrement'])[1]")
	WebElement decreament;	
	public void decreament() {
		wait.until(ExpectedConditions.elementToBeClickable(decreament));
		decreament.click();
		sa.assertEquals(decreament.isEnabled(), true);
	}
	@FindBy(xpath="//span[@data-a-selector='value' and text()='3']")
	WebElement quantity4;	
	public void quantity4() {
		wait.until(ExpectedConditions.visibilityOf(quantity4));
    	sa.assertEquals(quantity4.getText().contains("3"), true);
	}

	@FindBy(xpath="(//button[@class='a-declarative' and @data-a-selector='decrement'])[1]")
	WebElement decreament1;	
	public void decreament1() {
		wait.until(ExpectedConditions.elementToBeClickable(decreament1));
		decreament1.click();
		sa.assertEquals(decreament1.isEnabled(), true);
		}

	@FindBy(xpath="//span[@data-a-selector='value' and text()='2']")
	WebElement quantity5;	
	public void quantity5() {
		wait.until(ExpectedConditions.visibilityOf(quantity5));
		sa.assertEquals(quantity5.getText().contains("2"), true);
		sa.assertAll();	}
	

	
}