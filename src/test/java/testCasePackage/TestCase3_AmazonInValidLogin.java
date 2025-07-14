package testCasePackage;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage1;
import utility.BaseClass;
import utility.ExcelUtility;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase3_AmazonInValidLogin extends BaseClass{
	@DataProvider(name = "InvalidLoginData")
    public Object[][] getRegData() throws IOException {
        return ExcelUtility.getAmazonLoginExcelData("D:/Java_Project/AmazonMaven/AmazonData/AmazonProject.xlsx", "InvalidLogin");
    }
	
	
	  @Test(dataProvider = "InvalidLoginData", retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	public static void amazonInvalidLogin(String email, String password) {

		  HomePage homepage=new HomePage(driver);
		  homepage.hoverOverAccountAndList(driver);
		  homepage.signInFromHomePage();
		  
		  LoginPage1 loginpage=new LoginPage1(driver);
		  loginpage.un(email);
		  loginpage.cnt();
		  loginpage.pwd(password);
		  loginpage.signinb();
		  
	}

}
