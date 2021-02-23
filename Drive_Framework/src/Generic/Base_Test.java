package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
public class Base_Test implements Framework_constants
{ 
	public WebDriver driver;
	@BeforeMethod
	public void oppenappl()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public void closeappl()
	{
		driver.quit();
	}

}
