
package june17;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com");
	WebElement women =driver.findElement(By.xpath("//a[@title='Women']"));
	
	//Actions act = new Actions(driver);
	driver.findElement(By.xpath("//a[@title='Women']")).sendKeys(Keys.ARROW_RIGHT);
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@title='Women']")).sendKeys(Keys.ARROW_RIGHT);
	//driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).sendKeys(Keys.ENTER);
		
	
	
	
	
	}

}
