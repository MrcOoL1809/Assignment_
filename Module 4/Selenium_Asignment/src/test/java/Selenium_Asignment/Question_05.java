package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_05 {

	public static void main(String[] args) throws InterruptedException {
			String url  = "https://demo.guru99.com/test/radio.html"; 
			WebDriver driver =  DriverConnection.getDriver();
			driver.get(url);
			
		WebElement radioButton = driver.findElement(By.id("vfb-7-1"));
		radioButton.click();
		
		Thread.sleep(2000);
		WebElement radioButton2 = driver.findElement(By.id("vfb-7-2"));
		radioButton2.click();
		
		Thread.sleep(2000);
		WebElement radioButton3 = driver.findElement(By.id("vfb-7-3"));
		radioButton3.click();
		
		
	}

}
