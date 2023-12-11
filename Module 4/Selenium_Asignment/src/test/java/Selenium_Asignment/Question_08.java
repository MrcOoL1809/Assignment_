package Selenium_Asignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.DriverConnection;

public class Question_08 {
   //1. Mouce Event
	public static void main(String[] args) throws InterruptedException {
//		String url  = "https://www.amazon.in/"; 
//		WebDriver driver =  DriverConnection.getDriver();
//		driver.get(url);	
//		
//		WebElement Fresh = driver.findElement(By.linkText("Fresh"));
//		WebElement Sell = driver.findElement(By.linkText("Sell"));
//
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(Fresh).build().perform();
//		action.moveToElement(Sell).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("Today's Deals")).click();
//		Thread.sleep(2000);
//		driver.close();
		
  // 2. Keybord Event
		String url  = "https://www.google.com/"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
WebElement text = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		
		action.click(text)
			.keyDown(Keys.SHIFT)
			.sendKeys("HP Laptops")
			.keyUp(Keys.SHIFT)
			.pause(Duration.ofSeconds(5))
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		
	}
}