package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement 
{
	
	
	
	@Test
	public void actions1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ebay.in/");
		
	
		WebElement move = driver.findElement(By.xpath(".//a[text()=' My eBay']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(move).build().perform();
		
		driver.quit();
		
		
		
	}

}
