package Junit_Assignment.Junit;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

import Util.DriverConnection;

public class Question_17 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		String url = "https://www.facebook.com"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		Thread.sleep(3000);
	}
	
	
		@Parameters({"Username" , "Password"})
	@Test
	public void FBlogin(String username,String password) throws InterruptedException{
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(username);
			Thread.sleep(2000);
			
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys(password);
			
			System.out.println("Logging in with username : " + username + "and Password : " + password);
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.name("login"));
			login.click();
		}
}


//xmal

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test1">
//	  <parameter name="username" value="8155887857"/>
//	  <parameter name="password" value="19972312@"/>
//	  <classes>
//		  <class name="assignment.Q17"></class>
//		  </classes>
//		  </test> 
//		   <test thread-count="5" name="Test2">
//			  <parameter name="username" value="hello@gmail.com"/>
//			  <parameter name="password" value="hello123"/>
//			  <classes>
//				  <class name="assignment.Q17"></class>
//			  </classes>
//		  </test>
//		   <test thread-count="5" name="Test3">
//			  <parameter name="username" value="hello123@yahoo.com"/>
//			  <parameter name="password" value="hello@123"/>
//			  <classes>
//				  <class name="assignment.Q17"></class>
//			  </classes>
//		  </test><!-- Test -->
//		</suite> <!-- Suite -->

