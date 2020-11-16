package automationTesting.XYZProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
public static final By link_OnlineBL= By.linkText("ONLINE BANKING LOGIN");
public static final By link_Personal= By.linkText("PERSONAL");
public static final By link_SmallBusiness= By.linkText("SMALL BUSINESS");
public static final By link_InsideALtoroMutual= By.linkText("INSIDE ALTORO MUTUAL");
public static final By text_UserName=By.id("uid");
public static final By text_Password=By.id("passw");
public static final By btn_Login=By.name("btnSubmit");

public LoginPage(WebDriver driver){
	this.driver=driver;
	
}

public void setUserName(String userName){
	driver.findElement(text_UserName).sendKeys(userName);
}



public void setPassword(String password){
	driver.findElement(text_Password).sendKeys(password);
}


public void click_Login(){
	driver.findElement(btn_Login).click();
	
}

}
