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

public class TestCase_22 extends NewTest {
	
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
  
  @Test
  public void f4() {
	  	//Actions act1 = new Actions(driver);
	  Actions act = new Actions(driver);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		WebElement name =driver.findElement(By.xpath("//input[@id='input']"));
		String vegn ="tomato";
	
		act.moveToElement(name).click().keyDown(Keys.SHIFT).sendKeys(vegn).build().perform();
		driver.findElement(By.xpath("//input[@id='input']")).clear();
}

  }


