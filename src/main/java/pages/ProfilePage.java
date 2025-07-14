package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ProfilePage {

	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	  public ProfilePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	@FindBy(id="glow-ingress-line1")
	WebElement assertionDeliverToPooja;

	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement helloPooja;

	@FindBy(xpath="//h1[@class='a-size-medium-plus a-spacing-small']")
	WebElement signIntoAccount;
	
	@FindBy(xpath="//button[text()='Manage Profiles']")
	WebElement manageProfile;

	@FindBy(id="a-popover-header-1")
	WebElement assertionWhoIsShopping;

	@FindBy(xpath="//a[text()='View']")
	WebElement view;

	@FindBy(className="editNameIcon")
	WebElement editNameIcon;

	@FindBy(id="editProfileNameInputId")
	WebElement profileName;

	@FindBy(className="a-button-input")
	WebElement conti1;
/*
	@FindBy(className="chevron")
	WebElement svg;

	@FindBy(xpath="//button[@class='attribute-action']")
	WebElement btn;
*/
		public void assertionDeliverPooja(){
			wait.until(ExpectedConditions.visibilityOf(assertionDeliverToPooja));
			sa.assertEquals(assertionDeliverToPooja.getText(), "Deliver to Pooja", "Executed");
		}
		public void hoverovertopooja(WebDriver driver) {
			Actions a2 = new Actions(driver);
			a2.moveToElement(helloPooja).perform();
		}
		

		public void signIntoAccount() {
			wait.until(ExpectedConditions.visibilityOf(signIntoAccount));
		}
		public void profile() {
			wait.until(ExpectedConditions.elementToBeClickable(manageProfile));
			manageProfile.click();
		}
public void assertWhoShopping() {
	wait.until(ExpectedConditions.visibilityOf(assertionDeliverToPooja));
	sa.assertEquals(assertionWhoIsShopping.getText(), "Who is shopping?", "Executed");
	
		}
public void view() {
	wait.until(ExpectedConditions.elementToBeClickable(view));
	view.click();
}
public void editNameIcon() {
	wait.until(ExpectedConditions.elementToBeClickable(editNameIcon));
	editNameIcon.click();
}
public void profileName() {
	wait.until(ExpectedConditions.elementToBeClickable(profileName));
	profileName.clear();
	profileName.sendKeys("POOJA LAVHALE");
}
public void conti1() {
	wait.until(ExpectedConditions.elementToBeClickable(conti1));
	conti1.click();
	sa.assertEquals(conti1.isEnabled(), true);
	sa.assertAll();

}/*
public void svg() {

	wait.until(ExpectedConditions.elementToBeClickable(svg));
	svg.click();
}
public void btn() {

	wait.until(ExpectedConditions.elementToBeClickable(btn));
	btn.click();
	sa.assertAll();

}*/
	
	
}



