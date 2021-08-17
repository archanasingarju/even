package june11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExEnterCAPS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//..WebElement driver;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https:\\www.bigbasket.com");
		Thread.sleep(5000);
		Actions act =new Actions(driver);
	WebElement we =driver.findElement(By.xpath("//input[@id='input']"));
	act.moveToElement(we).click().keyDown(Keys.SHIFT).sendKeys("tomato").build().perform();
	driver.findElement(By.xpath("//input[@id='input']")).clear();
	act.moveToElement(we).click().keyDown(Keys.SHIFT).sendKeys("archana").build().perform();
	
	Thread.sleep(5000);
}
}
