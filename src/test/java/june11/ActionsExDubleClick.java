package june11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExDubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//..WebElement driver;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https:\\www.bigbasket.com");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
	WebElement we =driver.findElement(By.xpath("//input[@id='input']"));
	//double click on the text
	act.moveToElement(we).click().sendKeys("tomato").doubleClick().build().perform();
	//right click on the webpage
	Thread.sleep(5000);
	act.moveToElement(we).click().contextClick().build().perform();
}
}
