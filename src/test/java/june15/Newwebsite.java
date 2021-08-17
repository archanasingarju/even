package june15;

import java.awt.RenderingHints.Key;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//driver.get("https://www.saucedemo.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
	Thread.sleep(5000);

	JavascriptExecutor js = (JavascriptExecutor)driver;
	//scroll the screen down
	js.executeScript("window.scrollBy(0,-350)", "");
	//find the element in web page and click 
	WebElement we = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
	js.executeScript("arguments[0].scrollIntoView();", we);
	we.click();
	Thread.sleep(5000);
	//scroll the screen bottom
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
}

}
