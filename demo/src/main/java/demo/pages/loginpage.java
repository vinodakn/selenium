package demo.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.base.baseclass;

public class loginpage extends baseclass {
	
	
@FindBy(xpath = "//input[@type=\"text\"]")
WebElement un;

@FindBy(xpath="//input[@type=\"password\"]")
WebElement pass;
@FindBy(xpath = "//button[@color=\"primary\"]")
WebElement login;

public loginpage() {
	PageFactory.initElements(driver, this);
	
}
public homepage loginvalidation (String username,String password) {
	un.sendKeys(username);
	pass.sendKeys(password);
	login.click();
	
	return new homepage();
	
}
}
