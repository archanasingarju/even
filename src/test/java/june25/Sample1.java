package june25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	Actions act = new Actions(driver);
	driver.get("https://www.bigbasket.com/");
	driver.manage().window().maximize();
	WebElement name =driver.findElement(By.xpath("//input[@id='input']"));
	
	String vegn ="tomato";
	act.moveToElement(name).click().keyDown(Keys.SHIFT).sendKeys(vegn).build().perform();
	
	
	driver.close();
	
	
	}
	

}
