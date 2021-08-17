package june25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTest {
 public RemoteWebDriver driver;
 
 @BeforeMethod
 public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		//driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
	
  }

  @AfterMethod

  public void afterTest() {
	  driver.close();

  }

}
