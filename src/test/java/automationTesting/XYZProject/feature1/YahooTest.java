package automationTesting.XYZProject.feature1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import automationTesting.XYZProject.utility.InitializeDriver;

public class YahooTest {

	
	@Test
	public void googleTest(){
		
		
		InitializeDriver id=new InitializeDriver();
		WebDriver driver= id.getDriver();
		driver.get("https://www.yahoo.com/");
		
		
		
	}
}
