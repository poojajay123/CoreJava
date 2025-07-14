package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HomePage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountAndList;

	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement signin;
	
	public void hoverOverAccountAndList(WebDriver driver)
	{	
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountAndList).build().perform();
	}
	
	public void signInFromHomePage() {
		signin.click();
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
	List<WebElement> listOfShoes;
	public void listOfShoesandClick1stProduct() {
      if (!listOfShoes.isEmpty()) {
			wait.until(ExpectedConditions.visibilityOfAllElements(listOfShoes));

          WebElement firstProduct = listOfShoes.get(5).findElement(By.xpath("(//img[@class='s-image'])[1]"));
          firstProduct.click();
  		sa.assertEquals(driver.getTitle().contains("Buy"), true , "Does not match Assertion");
      }
	}
	
	@FindBy(xpath="//div[@data-component-type='s-search-result']")
	List<WebElement> listAppleLaptop;
	public void listAppleLaptopandClick3rdProduct() {
      if (!listAppleLaptop.isEmpty()) {
			wait.until(ExpectedConditions.visibilityOfAllElements(listAppleLaptop));

          WebElement firstProduct = listAppleLaptop.get(5).findElement(By.xpath("(//img[@class='s-image'])[3]"));
          firstProduct.click();
  		sa.assertEquals(driver.getTitle().contains("Buy"), true , "Does not match Assertion");
      }
	}
	
	
      @FindBy(xpath="add-to-cart-button")
  	WebElement addToCart;	
  	public void addToCart() {
  		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
  		addToCart.click();
		sa.assertEquals(addToCart.isEnabled(), true);
  		sa.assertAll();
  	
	}}

	
	



	




