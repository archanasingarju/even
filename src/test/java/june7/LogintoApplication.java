package june7;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	WebDriver driver;
driver = new ChromeDriver();
driver.get("http://automationpractice.com");
driver.manage().window().maximize();
driver.findElement(By.linkText("Sign in")).click();
//driver.findElement(By.name("submit_search")).click();
driver.findElement(By.id("email")).sendKeys("santosh@test.com");
driver.findElement(By.id("passwd")).sendKeys("123456");
driver.findElement(By.id("SubmitLogin")).click();
} 

}