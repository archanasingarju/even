package june12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.*;

//import java.awt.List;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class TableHanding {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
		"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		java.util.List<WebElement> getEle = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));

		//int size = getEle.size();
		for(int i=0;i<getEle.size();i++)
		{
		//String name=getEle.get(i).getText();
		System.out.println(getEle.get(i).getText());
		
		}
		//<WebElement> name =driver.findElements(By.xpath("//table[@id='customers'"));
		
		driver.close();
}
}