package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_01 {

	public static void main(String[] args) {
		String url = "https://www.facebook.com"; ;
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		WebElement FP = driver.findElement(By.partialLinkText("Forgotten password?"));
		FP.click();
	}

}
