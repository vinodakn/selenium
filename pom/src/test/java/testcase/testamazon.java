package testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.amazon;

public class testamazon {
	WebDriver driver;
	@BeforeMethod
	public void start() {
		WebDriverManager .chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		
	}
	@Test
	public void search() {
		amazon amz=new amazon(driver);
		amz.ground("harphone");
	}
@AfterMethod
public void fin() {
	driver.close();
	
}
}
