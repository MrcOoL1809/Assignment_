package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
		public static WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin Bhai\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
}
