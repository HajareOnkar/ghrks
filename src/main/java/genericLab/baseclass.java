package genericLab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseclass
{
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		
	}
	@AfterMethod
	public void close(ITestResult result ) throws IOException
	{
		int status = result.getStatus();
		String name = result.getName();
		
		if (status==2)
		{
			screenshot ss=new screenshot();
			ss.getscreenshot(driver, name);
			
		}
		driver.quit();
	}

}

