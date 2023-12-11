package Selenium_Asignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_09 {

	public static void main(String[] args) throws InterruptedException {
		String url  = "http://demo.guru99.com/test/delete_customer.php"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		WebElement custID = driver.findElement(By.name("cusid"));
		custID.sendKeys("123");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
		Thread.sleep(2000);
		
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		
		driver.close();
	}

}
