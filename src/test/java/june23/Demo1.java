package june23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo1 {
  @Test
  public void fox() {
	  
	  System.out.println("iam from fox");

  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("iam from beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("iam from afterMethod");
  }

}
