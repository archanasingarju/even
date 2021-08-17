package june25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class TestCase_11 extends NewTest{
	

  @Test
  public void f1() {
	 			driver.get("https://www.bigbasket.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='input']")).clear();
				String vegname="tomato";
				driver.findElement(By.xpath("//input[@id='input']")).sendKeys(vegname);
				//Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.ENTER);
				if(driver.findElement(By.xpath("//*[@id=\"deck\"]/div[2]/div/h2/span")).getText().contains(vegname))
				//act.moveToElement(name).click().sendKeys(vegn).contextClick().build().perform();
				{
				System.out.println("Pass");
				}
				else
				{
					System.out.println("fail");
				}
  
  }
  @Test
  public void f2() throws InterruptedException {
	  Actions act = new Actions(driver);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		WebElement name =driver.findElement(By.xpath("//input[@id='input']"));
		String vegn="tomato";
		act.moveToElement(name).click().sendKeys(vegn).doubleClick().build().perform();
		Thread.sleep(5000);
		act.moveToElement(name).click().contextClick().build().perform();
}		
}
 
 


