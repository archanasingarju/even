package testbase;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.AuthenticationPage;
import pages.Homepage;

public class TestBase {
	
	public static WebDriver driver;
	protected Homepage homePageObj;
	protected AuthenticationPage authPageObj;
	
	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");	
		
		homePageObj = new Homepage(driver);
		authPageObj = new AuthenticationPage(driver);
		
	}
	
	@AfterMethod
	public void afterTest() {
		//driver.close();
	}
	
	
}
