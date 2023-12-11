package Selenium_Asignment;

import org.openqa.selenium.WebDriver;

import Util.DriverConnection;

public class Practice {

		public static void main(String[] args) throws InterruptedException {
			String url  = "https://www.facebook.com/"; 
			WebDriver driver =  DriverConnection.getDriver();
			driver.get(url);

	}

}
