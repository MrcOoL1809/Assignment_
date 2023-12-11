package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

public class Question_07 {

	public static void main(String[] args) {
		String url  = "https://demo.guru99.com/test/newtours/register.php"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		
		WebElement country = driver.findElement(By.name("country"));
		Select countries = new Select(country);
		countries.selectByVisibleText("INDIA");
	}
}


