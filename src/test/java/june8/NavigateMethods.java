package june8;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		WebDriver driver;
	driver = new ChromeDriver();
	//get method
	driver.get("http://automationpractice.com");
	
	//driver.navigate("http://automationpractice.com");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	// get tittle
	
	String WebPageTittle = driver.getTitle();
	System.out.println("The Web Page Title is "+WebPageTittle);
	
	String WebPageURL = driver.getCurrentUrl();
	System.out.println("WebPageURL"+WebPageURL);
	
	//String sourcecode= driver.getPageSource();
	//System.out.println("Sourse Code:"+sourcecode);
	driver.findElement(By.linkText("Sign in")).click();
	
	driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
	driver.findElement(By.name("submit_search")).click();
	
	String textn =driver.findElement(By.xpath("//span[@class='lighter']")).getText();
	System.out.println("Text Name:"+textn);
	//navigate methods
}

}
