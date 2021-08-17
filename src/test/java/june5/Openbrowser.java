package june5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
WebDriver driver;
driver = new ChromeDriver();
driver.get("http://automationpractice.com");
driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
driver.manage().window().maximize();

} 

}
