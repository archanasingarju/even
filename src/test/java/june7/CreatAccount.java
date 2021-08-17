package june7;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.Identified;

public class CreatAccount{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
	WebDriver driver;
driver = new ChromeDriver();
driver.get("http://automationpractice.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("T-Shirts");
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.id("email_create")).sendKeys("kashyap.bhavaraju21@gmail.com");
driver.findElement(By.id("SubmitCreate")).click();
driver.findElement(By.id("id_gender2")).click();
driver.findElement(By.id("customer_firstname")).sendKeys("shiva");
driver.findElement(By.id("customer_lastname")).sendKeys("sai");
driver.findElement(By.id("email")).sendKeys("");
driver.findElement(By.id("passwd")).sendKeys("123456");
driver.findElement(By.id("days")).sendKeys("1");
driver.findElement(By.id("months")).sendKeys("December");
driver.findElement(By.id("years")).sendKeys("2021");
driver.findElement(By.id("firstname")).sendKeys("shiva");
driver.findElement(By.id("lastname")).sendKeys("sai");
driver.findElement(By.id("company")).sendKeys("SclinSoft");
driver.findElement(By.id("address1")).sendKeys("F.No:401,Shivasakthi app,Hyd..");
driver.findElement(By.id("address2")).sendKeys("3-515-4,Pedana,AP");
driver.findElement(By.id("city")).sendKeys("Indian");
driver.findElement(By.id("id_state")).sendKeys("newjersy");
driver.findElement(By.id("postcode")).sendKeys("00000");
driver.findElement(By.id("id_country")).sendKeys("India");
driver.findElement(By.id("other")).sendKeys("This is my new Selenium Project");
driver.findElement(By.id("phone")).sendKeys("08672248293");
driver.findElement(By.id("phone_mobile")).sendKeys("7799397171");
driver.findElement(By.id("alias")).sendKeys("Himayath Nagar");
driver.findElement(By.id("submitAccount")).click();

	} 

}