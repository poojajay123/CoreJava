package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PaymentPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Change') and contains(@href,'address')]")
	WebElement ChangeAddressLink;
	public void changeAddressLink(){
		//wait.until(ExpectedConditions.elementToBeClickable(ChangeAddressLink));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ChangeAddressLink);
		sa.assertEquals(ChangeAddressLink.isEnabled(), true);
	}
	@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[5]")
	WebElement ChangeAddress;
	public void ChangeAddress(){
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("location.reload()");
		//wait.until(ExpectedConditions.elementToBeClickable(ChangeAddress));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ChangeAddress);
		//driver.navigate().refresh();
		//ChangeAddress.click();
		sa.assertEquals(ChangeAddress.isEnabled(), true);
	}
	@FindBy(xpath="(//span[@class='a-button-text'])[2]")
	WebElement deliverToAddress;
	public void deliverToAddress(){	
		//wait.until(ExpectedConditions.elementToBeClickable(deliverToAddress));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true):", deliverToAddress);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", deliverToAddress);
		sa.assertEquals(deliverToAddress.isEnabled(), true);
	}
	//input[@name='ppw-instrumentRowSelection'][1]
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement amzonPayBalance;
	public void amzonPayBalance(){		
		wait.until(ExpectedConditions.elementToBeClickable(amzonPayBalance));
		amzonPayBalance.click();
		sa.assertEquals(amzonPayBalance.isEnabled(), true);
	}

	@FindBy(xpath="//input[@name='ppw-claimCode']")
	WebElement amzonPayBalanceEnterCode;
	public void amzonPayBalanceEnterCode(){		
		wait.until(ExpectedConditions.visibilityOf(amzonPayBalanceEnterCode));
		amzonPayBalanceEnterCode.sendKeys("123445");
		sa.assertEquals(amzonPayBalanceEnterCode.isEnabled(), true);
	}

	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
	WebElement amzonPayBalanceApply;
	public void amzonPayBalanceApply(){		
		wait.until(ExpectedConditions.elementToBeClickable(amzonPayBalanceApply));
		amzonPayBalanceApply.click();
		sa.assertEquals(amzonPayBalanceApply.isEnabled(), true);
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement creditCardOption;
	public void creditCardOption(){		
		wait.until(ExpectedConditions.elementToBeClickable(creditCardOption));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", creditCardOption);	
		sa.assertEquals(creditCardOption.isEnabled(), true);
	}

	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netBankingOption;
	public void netBankingOption(){		
		wait.until(ExpectedConditions.elementToBeClickable(netBankingOption));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", netBankingOption);		
		sa.assertEquals(netBankingOption.isEnabled(), true);
	}
	@FindBy(xpath="//span[text()='Choose an Option']")
	WebElement bankingOptionselect;
	public void bankingOptionselect(){		
		wait.until(ExpectedConditions.elementToBeClickable(bankingOptionselect));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", bankingOptionselect);		
		sa.assertEquals(bankingOptionselect.isEnabled(), true);
	}
	@FindBy(xpath="//ul/li/a[text()='Bank of Maharashtra']")
	WebElement BankOptionBOM;
	public void BankOptionBOM(){		
		wait.until(ExpectedConditions.elementToBeClickable(BankOptionBOM));
		BankOptionBOM.click();
		sa.assertEquals(BankOptionBOM.isEnabled(), true);
	}
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement upiOption;
	public void upiOption(){		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", upiOption);		
		sa.assertEquals(upiOption.isEnabled(), true);
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement emiOption;
	public void emiOption(){		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", emiOption);		
		sa.assertEquals(emiOption.isEnabled(), true);
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement codOption;
	public void codOption(){	
		//wait.until(ExpectedConditions.elementToBeClickable(codOption));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", codOption);
		sa.assertEquals(codOption.isEnabled(), true);
		sa.assertAll();
	}
}