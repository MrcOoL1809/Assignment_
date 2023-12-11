package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_001 {
	public static void main(String[] args) {
		String url = "https://www.amazon.in"; ;
				WebDriver driver =  DriverConnection.getDriver();
				driver.get(url);
		WebElement BS = driver.findElement(By.linkText("Best Sellers"));
		BS.click();
		}
}
