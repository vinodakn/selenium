package demo.base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver ;
	public static Properties pro;
	
public baseclass()   {
	FileInputStream file = null;
	try {
		file = new FileInputStream("D:\\Users\\VGSL-SW021\\eclipse-workspace\\demo\\src\\main\\java\\demo\\configuration\\config");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 pro =new Properties();
	
		try {
			pro.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	public static void lunch() {
		String browsername=pro.getProperty("browser");
		if(browsername.equals("chrome")) {	
			WebDriverManager .chromedriver().setup();
			driver =new ChromeDriver();
			
			
	}else if (browsername.equals("fire fox")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	else {
		System.out.println("invalid");
	}
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
}
