package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
public class RegistrationPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ap_customer_name")
    WebElement nameField;
    public void nameField(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameField));
		nameField.sendKeys(name);

    }

    @FindBy(id = "ap_phone_number")
    WebElement mobileField;
    public void mobileField(String mobile) {
		wait.until(ExpectedConditions.visibilityOf(mobileField));
		mobileField.sendKeys(mobile);
		sa.assertEquals(mobileField.isEnabled(), true);
    }

    @FindBy(id = "ap_password")
    WebElement passwordField;
    public void passwordField(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys(password);
		sa.assertEquals(passwordField.isEnabled(), true);
    }

    @FindBy(id = "continue")
    WebElement continueBtn;
    public void clickContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
    continueBtn.click();


    }

  
 
}
