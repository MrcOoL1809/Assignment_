package Selenium_Asignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_10 {

	public static void main(String[] args) {
		String url  = "https://demo.guru99.com/test/web-table-element.php"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
}
