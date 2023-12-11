package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_06 {

	public static void main(String[] args) {
		String url  = "https://www.facebook.com"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("0000000000");
		
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234567");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
					
		WebElement fblogo = driver.findElement(By.xpath("//*[@id=\"mount_0_0_SF\"]/div/div[1]/div/div[2]/div[1]/a"));
		fblogo.clear();


	}

}
