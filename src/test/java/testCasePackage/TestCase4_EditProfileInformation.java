package testCasePackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage1;
import pages.ProfilePage;
import utility.BaseClass;
@Listeners (retryAndTestListeners.TestListener.class)

public class TestCase4_EditProfileInformation extends BaseClass{
	
	  @Test(retryAnalyzer = retryAndTestListeners.RetryAnalyzer.class)
	  public void editProfileInformation() {

		  HomePage homepage=new HomePage(driver);
		  homepage.hoverOverAccountAndList(driver);
		  homepage.signInFromHomePage();
		  
		  LoginPage1 loginpage=new LoginPage1(driver);
		  loginpage.un("9970353200");
		  loginpage.cnt();
		  loginpage.pwd("Poojajay@15");
		  loginpage.signinb();
		  
		  ProfilePage profilepage = new ProfilePage(driver);	
		  profilepage.assertionDeliverPooja();
		  profilepage.hoverovertopooja(driver);
		  profilepage.profile();
		  profilepage.assertWhoShopping();
		  profilepage.view();
		  profilepage.editNameIcon();
		  profilepage.profileName();
		  profilepage.conti1();
		 // profilepage.svg();
		 // profilepage.btn();		    
	  }
}
