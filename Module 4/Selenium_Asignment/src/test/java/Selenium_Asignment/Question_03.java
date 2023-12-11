package Selenium_Asignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_03 {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://testpages.eviltester.com/styled/alerts/alert-test.html"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
  //1. First Alert
//		WebElement AlertButton = driver.findElement(By.id("alertexamples"));
//		AlertButton.click();
//		Alert a1 = driver.switchTo().alert();
//		Thread.sleep(2000);
//		a1.accept();
  // 2. Second Alert
		Thread.sleep(2000);
		WebElement button2 = driver.findElement(By.id("promptexample"));
		button2.click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(2000);
		a2.sendKeys("Hello Selenium");
		Thread.sleep(2000);
		a2.accept();
  // 3. Third Alert
//		Thread.sleep(2000);
//		WebElement button3 = driver.findElement(By.id("confirmexample"));
//		button3.click();
//		Alert a3 = driver.switchTo().alert();
//		Thread.sleep(2000);
//		a3.dismiss();


	}

}
