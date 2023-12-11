package Selenium_Asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

 public class Question_04 {
	public static void main(String[] args) throws InterruptedException {
	String url  = "https://accounts.google.com"; 
	WebDriver driver =  DriverConnection.getDriver();
	driver.get(url);
	
	
	WebElement email = driver.findElement(By.id("identifierId"));
	email.sendKeys("selenium123@gmail.com");
	 Thread.sleep(2000);
	WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	next.click();
	
	
	Thread.sleep(4000);
	WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
	pass.sendKeys("12345667");
	Thread.sleep(2000);
	WebElement next2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
	next2.click();
	}
}

