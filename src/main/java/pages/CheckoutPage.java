package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CheckoutPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceedCheckout;
	public void proceedCheckout(){		
		wait.until(ExpectedConditions.elementToBeClickable(proceedCheckout));
		proceedCheckout.click();
		sa.assertEquals(proceedCheckout.isEnabled(), true);
	}
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedToRetailCheckout;
	public void proceedToRetailCheckout(){		
		wait.until(ExpectedConditions.elementToBeClickable(proceedToRetailCheckout));
		proceedToRetailCheckout.click();
		sa.assertEquals(proceedToRetailCheckout.isEnabled(), true);
	}
}
