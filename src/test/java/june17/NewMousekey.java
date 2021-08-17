package june17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMousekey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
		driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).sendKeys(Keys.DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).sendKeys(Keys.RIGHT);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).sendKeys(Keys.RIGHT);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]")).sendKeys(Keys.ENTER);
	}

}
