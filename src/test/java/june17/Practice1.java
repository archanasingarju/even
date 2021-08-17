package june17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https:\\www.bigbasket.com");
	
	WebElement name= driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
	
	Actions act =  new  Actions(driver);
	act.moveToElement(name).sendKeys(Keys.DOWN);
	act.moveToElement(name).sendKeys(Keys.DOWN).build().perform();
	if(name.isDisplayed() && name.isEnabled())
	{
		driver.findElement(By.xpath("(//a[text()='Bakery, Cakes & Dairy'])[2]")).click();
		System.out.println("Available in the webpage");
	}
	else
	{
	System.out.println("Not Available in the webpage");	
	}
	
	}

}
