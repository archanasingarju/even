package june27;

import org.testng.annotations.Test;



import testbase.TestBase;

public class LoginToApp extends TestBase{

	@Test
	public void Login() {
		homePageObj.getSignInLink().click();
		
		authPageObj.setLoginEmail("santosh@test.com");
		authPageObj.setLoginPassword("123456");
		authPageObj.getLoginSubmitButton().click();
	}
	
	@Test
	public void search() {
		homePageObj.setSearchTextBox("T-Shirts");
	}
	
	
	@Test
	public void verifyContactUs() {
		homePageObj.getContactUs().click();
	}
	
	@Test
	public void login2() {
		homePageObj.getSignInLink().click();
		
		authPageObj.LoginToApplication("santosh@test.com", "123456");
	}
	
}

