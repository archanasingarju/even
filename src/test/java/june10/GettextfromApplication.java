package june10;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextfromApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		WebDriver driver;
	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email_create")).sendKeys("digitalcutlet2@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	driver.findElement(By.id("id_gender1")).click();
	boolean b =driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).isSelected();
	
	if(b==true) {
		System.out.println("selected Mr");
	}
	else {
		System.out.println("selected Mrs");
	}
	driver.findElement(By.id("customer_firstname")).sendKeys("Shiva");
	driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
	driver.findElement(By.id("passwd")).sendKeys("Shiva@1");
	driver.findElement(By.id("days")).sendKeys("1");
	driver.findElement(By.xpath("//div[@id ='uniform-newsletter']")).click();
	driver.findElement(By.xpath("//div[@id ='uniform-newsletter']")).click();
	
	boolean check =driver.findElement(By.xpath("//div[@id ='uniform-newsletter']")).isSelected();
	
	if(check == true) {
		System.out.println("check box selected");
	}
	else
	{
	System.out.println("check not box selected ");
	}
}
	}


