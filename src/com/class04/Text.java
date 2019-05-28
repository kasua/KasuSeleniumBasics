package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// finding username using contains
		
		driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("standerd_user");
		
		//finding password using start-with
		driver.findElement(By.xpath("//input[start-with(@id,'pass')]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[start-with(@class,'btn')]")).click();
		
	}

}
