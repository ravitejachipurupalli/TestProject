package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop 
{
	
	WebDriver driver;
	
	@Test
	public void test()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath(".//*[@id='draggable']"));
		//WebElement trgt = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		WebElement trgt = driver.findElement(By.xpath(".//*[@id='droppable']"));
		action.dragAndDrop(src, trgt).build().perform();
		
		driver.switchTo().parentFrame();
		
		driver.quit();
		
	}

}
