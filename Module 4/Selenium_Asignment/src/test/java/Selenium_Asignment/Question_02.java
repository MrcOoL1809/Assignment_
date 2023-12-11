package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

public class Question_02 {

	public static void main(String[] args) {
		String url = "https://testpages.eviltester.com/styled/basic-html-form-test.html;"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		WebElement dropdown = driver.findElement(By.name("dropdown"));
		Select Fromdropdown = new Select(dropdown);
		
		Fromdropdown.selectByValue("dd1");
	}

}
