
package testbase1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excel.ExcelReader;
import june28_Log4j2.LogTest;
import listener.EventListener;
import pages1.Signpage;


public class TestBase1 {
	
public  static WebDriver driver;
protected Signpage signpobj;
public Logger log = LogManager.getLogger(LogTest.class.getName());

public static ExtentReports extent;
public static ExtentTest logger;

public Properties prop;
public FileInputStream fis;
public static ExcelReader excelReader;
 @BeforeMethod (groups = { "login", "regration", "smoke", "search", "contactus"})
 public void beforeTest() throws IOException {
	 
	  //System.setProperty("webdriver.chrome.driver", 
			 // "C:\\Users\\Kashyap\\Desktop\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");


prop = new Properties();
fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.Properties");



//load the file using below command
prop.load(fis);
if(prop.getProperty("browser").equals("chrome")) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kashyap\\Desktop\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
}
else if(prop.getProperty("browser").equals("edge")) {
	System.setProperty("webdriver.edge.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\msedgedriver.exe");
	driver = new EdgeDriver();
}
else if(prop.getProperty("browser").equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
}
else {
	System.out.println("no browser is supported here");
	System.exit(0);
}

//driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get(prop.getProperty("URL"));
//driver.get("http://automationpractice.com/");
driver.manage().window().maximize();
//class file which we created in above step
EventListener ecapture = new EventListener(); 
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);
		//pass 'eventHandler' as argument to all the objects of the classes instead of 'driver'.
		//ex:
		//homePageObj = new HomePage(eventHandler);
		signpobj = new Signpage(eventHandler);
		//provide the excelsheet path
		excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\excel\\InputDataForTestCases.xlsx");

  }

  @AfterMethod (groups = { "login", "regration", "smoke", "search", "contactus"})

  public void afterTest() {
	  
	  extent.endTest(logger);
		extent.flush();
	 // driver.close();

  }
  @BeforeTest (groups = { "login", "regration", "smoke", "search", "contactus"})
  public void testbefore() {
  	extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
  	extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
  }

  @AfterTest (groups = { "login", "regration", "smoke", "search", "contactus"})
  public void testafter() {
  	 
  	extent.close();
  }

}
