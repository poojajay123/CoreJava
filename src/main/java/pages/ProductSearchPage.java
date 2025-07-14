package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ProductSearchPage {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
    public ProductSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }   
    
	@FindBy(name="s")
	WebElement filterSearchPrice;
	public void filterSearchPrice(){	
		wait.until(ExpectedConditions.visibilityOf(filterSearchPrice));
		Select s = new Select(filterSearchPrice);
		s.selectByVisibleText("Price: Low to High");
		sa.assertEquals(filterSearchPrice.isEnabled(), true);
	}

	@FindBy(xpath="//span[@class='a-size-base a-color-base' and text()='Puma']")
	WebElement pumaCheckbox;
	public void pumaCheckbox(){	
		wait.until(ExpectedConditions.elementToBeClickable(pumaCheckbox));
		pumaCheckbox.click();
		//sa.assertEquals(driver.getTitle().contains("Amazon.in: Shoes - 256097"), "Amazon.in: Shoes - 256097", "not contain 'Amazon.in: Shoes - 256097'");
	}
	
	@FindBy(xpath="//span[contains(@class,'a-size-base') and contains(text(), 'Puma')]")
	WebElement pumaCheckboxselected;
	public void pumaCheckboxselected(){	
		wait.until(ExpectedConditions.visibilityOf(pumaCheckboxselected));
		sa.assertEquals(pumaCheckboxselected.isDisplayed(), true, "puma");
	}

	@FindBy(xpath="//span[@class='a-size-base a-color-base' and text()='4']")
	WebElement shoesSize;
	public void shoesSize(){		
		wait.until(ExpectedConditions.elementToBeClickable(shoesSize));
		shoesSize.click();
	}
	
	@FindBy(xpath="(//span[contains(@class,'a-size-base') and contains(text(), '4')])[1]")
	WebElement shoesizeSelected;
	public void shoesizeSelected(){
		wait.until(ExpectedConditions.visibilityOf(shoesizeSelected));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 500)");		
		sa.assertEquals(shoesizeSelected.isDisplayed(), true);
	}
	
	@FindBy(xpath="//span[@class='a-size-small a-color-base' and text()='& Up']")
	WebElement starRating;
	public void starRating(){		
		wait.until(ExpectedConditions.elementToBeClickable(starRating));
		starRating.click();
	}
	
	@FindBy(xpath="//span[contains(@class,'a-size-base') and contains(text(), 'Puma')]")
	WebElement starRatingSelected;
	public void starRatingSelected(){		
		wait.until(ExpectedConditions.visibilityOf(starRatingSelected));
		starRatingSelected.click();
		sa.assertEquals(starRatingSelected.isDisplayed(), true);
	}
	
	@FindBy(xpath="//span[@class='a-size-base a-color-base' and text()='25% Off or more']")
	WebElement discount ;
	public void discount(){		
		wait.until(ExpectedConditions.elementToBeClickable(discount));
		discount.click();
	}
	
	@FindBy(xpath="//span[contains(@class,'a-size-base') and contains(text(), '25% Off or more')]")
	WebElement discountSelected;
	public void discountSelected(){		
		wait.until(ExpectedConditions.elementToBeClickable(discountSelected));
		discountSelected.click();
		sa.assertEquals(discountSelected.isDisplayed(), true);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 1000)");
	}
	
	@FindBy(xpath="//span[text()='Natural Rubber']")
	WebElement material;
	public void material(){		
		wait.until(ExpectedConditions.elementToBeClickable(material));
		material.click();
		//sa.assertEquals(driver.getTitle().contains("Natural Rubber"), "Natural Rubber", "Natural Rubber");

	}
	
	@FindBy(xpath="//span[text()='Lace-Up']")
	WebElement lace;
	public void lace(){		
		wait.until(ExpectedConditions.elementToBeClickable(lace));
		lace.click();
		//sa.assertEquals(driver.getTitle().contains("Lace-Up"), "Lace-Up", "Not contains Lace-Up");
		sa.assertAll();

	}

}
	
	
	

	
	
	

	


