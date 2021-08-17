package june8;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.Identified;

public class XpathEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	WebDriver driver;
driver = new ChromeDriver();
driver.get("http://automationpractice.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[starts-with(text()='search')]")).sendKeys("T-shirts");
driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Dresses");
driver.findElement(By.xpath("//input[@id='search_query_top'or @id ='search_query']")).sendKeys("Dresses");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("T-Shirts");//basic xpath
driver.findElement(By.className("login")).click();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("degital@gmail.com");
driver.close();

} 

}