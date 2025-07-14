package testCasePackage;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.RegistrationPage;
import utility.BaseClass1;
import utility.ExcelUtility;
@Listeners (retryAndTestListeners.Listener.class)

public class TestCase1_AmazonRegistartion extends BaseClass1 {

    
	@DataProvider(name = "RegistrationData")
    public Object[][] getRegData() throws IOException {
        return ExcelUtility.getAmazonLoginExcelData("D:/Java_Project/AmazonMaven/AmazonData/AmazonProject.xlsx", "Registartion");
    }


@Test(dataProvider = "RegistrationData", retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	    public void amazonRegistration(String name, String mobile, String password) {
	       RegistrationPage registrationPage= new RegistrationPage(driver);
	       registrationPage.nameField(name);
	       registrationPage.mobileField(mobile);
	       registrationPage.passwordField(password);
	       registrationPage.clickContinue();

	        SoftAssert sa = new SoftAssert();
	       sa.assertTrue(driver.getTitle().contains("Amazon"), "Title validation failed");
	        sa.assertAll();
	    }

	}

