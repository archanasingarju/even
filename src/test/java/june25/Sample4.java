package june25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		String vegn="tomato";

		driver.findElement(By.xpath("//input[@id='input']")).sendKeys(vegn);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.ENTER);
		if(driver.findElement(By.xpath("//*[@id=\"deck\"]/div[2]/div/h2/span")).getText().contains(vegn))
		//act.moveToElement(name).click().sendKeys(vegn).contextClick().build().perform();
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
