package june10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextfromwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Archana\\eclipse-workspace\\seleniumjune\\drivers\\chromedriver.exe");
		WebDriver driver;
	driver = new ChromeDriver();
	//get method
	driver.get("http://automationpractice.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	// get tittle
	
	String name ="Automation Practice Website";
	String name1 =driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).getText();
	System.out.println(name1);	

	//div[@id='editorial_block_center']/h1
	
	if(name.equals(name1)) {
		
		System.out.println("getting tewxt from webpage:Pass");
	}
	else {
		System.out.println("getting tewxt from webpage:fail");
	}
	String hname=driver.findElement(By.xpath("(//div[@class='type-text']/h3)[1]")).getText();
	System.out.println(hname);
	
	//(//div[@class='type-text']/h3)[1]
	
	
	}
	}


