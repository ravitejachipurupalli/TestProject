package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHold 
{
	WebDriver driver;
	
	@Test
	public void test()
	{
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		action.clickAndHold(slider).moveByOffset(500, 0).release(slider).build().perform();
		
		driver.quit();
		
	}

}
