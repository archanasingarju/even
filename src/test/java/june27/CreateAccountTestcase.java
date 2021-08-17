package june27;

import org.testng.annotations.Test;

import testbase.TestBase;

public class CreateAccountTestcase extends TestBase {

	@Test
	public void createAccount() {
		homePageObj.getSignInLink().click();
		
		authPageObj.setCreateAccountEmail("digitalcutlet2@gmail.com");
		authPageObj.getCreateAccountSubmitButton().click();
	}
	
	
}
