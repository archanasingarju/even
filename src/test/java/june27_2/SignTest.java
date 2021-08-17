package june27_2;

import static org.testng.Assert.assertEquals;


import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import testbase1.TestBase1;

public class SignTest extends TestBase1 {
	
	@Test (groups = { "login", "regration" })	

	public void Login1() {
	
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");

		signpobj.getSignInLink().click();
		logger.log(LogStatus.INFO,"Click on the Sign Button");
	signpobj.getSignInLink().click();
	logger.log(LogStatus.INFO,"Entered Email and password");

	signpobj.setEmail("archana.s56@gmail.com");
	signpobj.setEmail(prop.getProperty("Username"));
		signpobj.setPass(prop.getProperty("Password"));
		signpobj.setPass("123456");
		logger.log(LogStatus.PASS,"Loged into the page");
		signpobj.getLogin().click();
	
}

	@Parameters({"username","password"})
	@Test  (groups = { "login", "regration" })	

	public void login2(String uname, String pword) {
		signpobj.getSignInLink().click();
		
		signpobj.setEmail(uname);
		signpobj.setPass(pword);
		signpobj.getLogin().click();
		
	}
	
	 @Test (groups = { "regration", "login" })	

	public void login3UsingExcel() {
		signpobj.getSignInLink().click();
		
	String username = excelReader.getCellData("login_app", "UserName", 2);
		String password = excelReader.getCellData("login_app", "PassWord", 2);
	System.out.println("excel username is : " + username);
	System.out.println("excel password is : " + password);
	
signpobj.setEmail(username);
		signpobj.setPass(password);
	signpobj.getLogin().click();
	
	signpobj.getSignout().click();
	
	}
	 @Test (groups = { "login", "regration", "smoke"})	

	public void login4() throws InterruptedException {
		String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
	logger = extent.startTest(TestcaseId, "Test is Started");
	
	logger.log(LogStatus.INFO, "Clicking on the Sign-in link");
	
		signpobj.getSignInLink().click();
		
		int rowcount = excelReader.getRowCount("login_app");
		
		for(int i=2; i<=rowcount; i++) {
			String username = excelReader.getCellData("login_app", "UserName", i);
			String password = excelReader.getCellData("login_app", "PassWord", i);
			System.out.println("excel username is : " + username);
			System.out.println("excel password is : " + password);
			
			signpobj.setEmail(username);
			signpobj.setPass(password);
			signpobj.getLogin().click();
		String name =	signpobj.getPageheading().getText();
		String text="MY ACCOUNT";
			//Assert.assertEquals("MY ACCOUNT", name);
		if(text.equals(name))
		{
			logger.log(LogStatus.PASS, "TestCasePass");
			org.testng.Assert.assertEquals(name, text);
		}
		else
		{
			logger.log(LogStatus.FAIL, "TestCaseFAIL");
			org.testng.Assert.assertEquals(name, text);
		
		}
			signpobj.getSignout().click();
		}
	}
	
	 @Test (groups = { "login", "regration", "smoke" })	

	public void login5() throws InterruptedException {
	String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
	logger = extent.startTest(TestcaseId, "Test is Started");

	logger.log(LogStatus.INFO, "Clicking on the Sign-in link");

	signpobj.getSignInLink().click();

	String username = excelReader.getCellData("login_app", "UserName", 2);
	String password = excelReader.getCellData("login_app", "PassWord", 2);
	System.out.println("excel username is : " + username);
	System.out.println("excel password is : " + password);
	
	signpobj.setEmail(username);
	signpobj.setPass(password);
	signpobj.getLogin().click();
	
	String pageHeading = "MY ACCOUNT";
	
	String webPageHeading = signpobj.getPageheading().getText();
	
		if(pageHeading.equals(webPageHeading)) {
			logger.log(LogStatus.PASS, "Testcase PASS");
		
		org.testng.Assert.assertEquals(pageHeading, webPageHeading);
		} else {
			logger.log(LogStatus.FAIL, "Testcase Fail");
		org.testng.Assert.assertEquals(pageHeading, webPageHeading);
		}

	}

	 @Test (groups = { "contactus", "regration" })	

	public void contactus() {
	String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
	logger = extent.startTest(TestcaseId, "Test is Started");

	logger.log(LogStatus.INFO, "Clicking on the Sign-in link");

	signpobj.getSignInLink().click();
	
	signpobj.getContactUs().click();
	
}
	
	@Test (groups = { "Search", "regration" })	

	public void search() {
	String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
	logger = extent.startTest(TestcaseId, "Test is Started");

	logger.log(LogStatus.INFO, "Clicking on the Sign-in link");

	signpobj.getSignInLink().click();
	
	signpobj.getSearchTextBox().sendKeys("T-Shirt");
	
}

}