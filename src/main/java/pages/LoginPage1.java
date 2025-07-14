package pages;


	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

	public class LoginPage1 {
		WebDriver driver;
		SoftAssert sa = new SoftAssert();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		  public LoginPage1(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }

	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountlist;
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement Signin;


		@FindBy(id="ap_email_login")
		  WebElement usernameField;
		
		@FindBy(id="continue")
		  WebElement continbutton;
		
		@FindBy(xpath="//input[@type='password']")
		  WebElement passwordField;
		
		@FindBy(id="signInSubmit")
		WebElement signinbutton;

		@FindBy(xpath="(//div[@class='a-alert-content'])[1]")
		WebElement errormsg;
		
		public void hoveoverAccountAndList(WebDriver driver) {

			Actions a1=new Actions(driver);
			a1.moveToElement(accountlist).perform();
			
		}
		public void signinfromhomepage() {
			Signin.click();
		}

		public void un(String email) 
		{
			//wait.until(ExpectedConditions.visibilityOf(usernameField));
			usernameField.sendKeys(email);
			sa.assertEquals(usernameField.isDisplayed(), true);
		}
		public void cnt() 
		{
			wait.until(ExpectedConditions.elementToBeClickable(continbutton));
			continbutton.click();
			//sa.assertEquals(continbutton.isEnabled(), true);
		}
		public void pwd(String password) 
		{
			//wait.until(ExpectedConditions.visibilityOf(passwordField));
			passwordField.sendKeys(password);
			sa.assertEquals(passwordField.isDisplayed(), true);

			
		}
		public void signinb() 
		{
			wait.until(ExpectedConditions.elementToBeClickable(signinbutton));
			signinbutton.click();
			
		}
		public void errmsg() 
		{
			wait.until(ExpectedConditions.visibilityOf(errormsg));
			sa.assertEquals(errormsg.getText(), "Your password is incorrect", "not successful");
			sa.assertAll();
		}
	
		
	  
	}

