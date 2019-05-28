package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndquit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     driver.get("http://cnn.com");
    //driver.close();
    driver.quit();//not use this one
   
   
 }

}
