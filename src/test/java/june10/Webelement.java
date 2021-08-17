package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	WebDriver driver;
	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com");
	
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("//a[@class='login']")).click();
	
	WebElement SingLink= driver.findElement(By.xpath("//a[@class='login']"));
	SingLink.click();
	//System.out.println(SingLink.getText());
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("archana.88@gmail.com");
	
}
}
