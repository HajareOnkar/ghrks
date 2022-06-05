package genericLab;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot 
{
	public void getscreenshot(WebDriver driver, String name) throws IOException
	{
		Date d=new Date();
		String currentdate=d.toString().replaceAll(":","-");
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
