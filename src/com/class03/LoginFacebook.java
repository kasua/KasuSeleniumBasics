package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	/*
	 * TC 1: Facebook login:Open chrome browserGo to
	 * “https://www.facebook.com/”Enter valid username and valid password and click
	 * loginUser successfully logged in
	 */

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.facebook.com");
      driver.findElement(By.id("email")).sendKeys("akasahun1@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("gGl123456");
      driver.findElement(By.partialLinkText("forgot")).click();
      
      driver.findElement(By.id("u_0_2")).click();//we do not use with the number---->it will keep changing.
      Thread.sleep(3000);
      driver.close();
	}
      
	}


