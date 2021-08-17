package june9;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuittheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.linkText("Sign in")).click();
	driver.quit();
	
	
}
}
