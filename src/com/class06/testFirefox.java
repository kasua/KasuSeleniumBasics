package com.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/amera/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
	}

}
