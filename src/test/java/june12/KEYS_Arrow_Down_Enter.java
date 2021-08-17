package june12;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KEYS_Arrow_Down_Enter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colgate");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
		
		if(driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText().contains("colgate")) {
		System.out.println("PASS");
		} else {
		System.out.println("FAIL");
		}
	}
	
}
