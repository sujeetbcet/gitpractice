package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class DemoTest {
	WebDriver driver;
  @Test
  public void SampleTest() {
	  System.out.println("This is TestMethod");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println(" Executing AfterMethod");
	  Thread.sleep(10000);
	  driver.close();
  }
}
