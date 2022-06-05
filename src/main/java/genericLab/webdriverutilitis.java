package genericLab;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webdriverutilitis 
{
	public void dropdown(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	
	
	
	public void Scroollbar(WebDriver driver, int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	
	
	}
	
	public void frame(WebDriver driver, String index)
	{
		driver.switchTo().frame(index);
		
	}
	
	public void backtoframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
		
	}
	
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
	}
	public void mousehover(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	public void draganddrop(WebDriver driver, WebElement ele, WebElement ele1, WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2);
		
	}
	
	public void alert(WebDriver driver)
	{
		Alert al = driver.switchTo().alert();
		
		al.accept();
	}
	
	public void newwindow(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for (String c: child) 
		{
			driver.switchTo().window(c);
			
		}
	}
	
    

}
