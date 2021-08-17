package june10;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextfromtextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("archana.88@gmail.com");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
	
	Thread.sleep(5000);
	
	String email = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
	
	String pw=driver.findElement(By.xpath("//input[@id='passwd']")).getAttribute("value");
	
	System.out.println(email);
	
	System.out.println(pw);
	
}

}
