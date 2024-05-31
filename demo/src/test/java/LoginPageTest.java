import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.base.baseclass;
import demo.pages.homepage;
import demo.pages.loginpage;
import demo.util.utils;

public class LoginPageTest extends baseclass {
	public loginpage page;
	public utils util;
	public String sheetname="sheet1";
	
public LoginPageTest() throws Exception{
	super();
	
	
	}
@BeforeMethod
public void setup() {
	lunch();
	page = new loginpage();
	util = new utils();
}

@DataProvider(name= "getexceldata")
public Object[][] getexceldata(){
	Object[][] data=utils.getexceldata(sheetname);
	
	return data;
	
	
}
@Test(dataProvider ="getexceldata")
public void logintest(String username,String password) throws Exception {
	page.loginvalidation(username,password);
	Thread.sleep(2000);
	
	String exceptedurl ="https://telemedicinephcui.esdinfra.com/#/base/dashboard";
	String actualurl= driver.getCurrentUrl();
	Assert.assertEquals(actualurl, exceptedurl);
}
}
