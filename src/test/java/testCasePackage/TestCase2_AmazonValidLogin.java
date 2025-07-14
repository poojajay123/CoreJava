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

	public class TestCase2_AmazonValidLogin extends BaseClass{
		@DataProvider(name = "ValidLoginData")
	    public Object[][] getRegData() throws IOException {
	        return ExcelUtility.getAmazonLoginExcelData("D:/Java_Project/AmazonMaven/AmazonData/AmazonProject.xlsx", "ValidLogin");
	    }
	  @Test(dataProvider = "ValidLoginData", retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	 
	  public void validCredentials(String email, String password) 
	  {
		/*  RegistrationPage register=new RegistrationPage(driver);
		 register.hoveoverAccountAndList1(driver);
		 register.signinfromhomepage();
		 register.un1();
		 register.continuebuttonm();
		 register.createaccount();
		  register.Firstnamemethod();
		  
		 // register.createaccount();
		  register.pwd();
		  register.verifyMobileno();
		 // System.out.println("Please solve the puzzle manually ,then press Enter..");
		  register.creatnewaccountlink();
		  */
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

