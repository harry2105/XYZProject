package automationTesting.XYZProject.feature1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automationTesting.XYZProject.pom.LoginPage;
import automationTesting.XYZProject.utility.InitializeDriver;

public class LoginTest {
	
	@Test
	public void loginTest(){
		InitializeDriver id=new InitializeDriver();
		WebDriver driver=id.getDriver();
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("jsmith");
		lp.setPassword("Demo1234");
		lp.click_Login();
		
		
	}

}
