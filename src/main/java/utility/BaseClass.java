package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;	
	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		//driver = new ChromeDriver();
		//driver = new EdgeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		//driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https://www.amazon.in/&openid.identity=http://specs.openid.net/auth/2.0/identifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http://specs.openid.net/auth/2.0/identifier_select&openid.ns=http://specs.openid.net/auth/2.0");
	}
@Parameters("browser")
@BeforeMethod
public void launch(@Optional("Edge") String nameOfBrowser) 
{
	if(nameOfBrowser.equalsIgnoreCase("CHROME")) {
		driver = new ChromeDriver();
	}
	if(nameOfBrowser.equalsIgnoreCase("EDGE")) {
		driver = new EdgeDriver();
	}
	if(nameOfBrowser.equalsIgnoreCase("FIREFOX")) {
		driver = new FirefoxDriver();
	}

/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
*/}
}