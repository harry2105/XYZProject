package automationTesting.XYZProject.feature1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	
	@Test
	public void googleTest(){
		
		
		/*System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		*/
	/*	System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		*/
		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	
		
		
	}
}
