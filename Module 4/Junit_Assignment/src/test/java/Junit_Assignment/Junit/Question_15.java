package Junit_Assignment.Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.DriverConnection;

public class Question_15 {
	@Test
	public void loginFB() throws InterruptedException {
		
	WebDriver driver = new DriverConnection().getDriver();
	driver.get("https://www.facebook.com/");
		
	driver.findElement(By.id("email")).sendKeys("9090909090");
	
	driver.findElement(By.id("pass")).sendKeys("12345678");
	
    driver.findElement(By.name("login")).click();
		
	Thread.sleep(3000);
		
	}
}

// xmal

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="assignment.Q15"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->


