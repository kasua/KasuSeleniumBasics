package com.class03;
/*
 * TC 1: Facebook login:Open chrome browserGo to
 * “https://www.facebook.com/”Enter valid username and valid password and click
 * loginUser successfully logged in,
 * xpath System.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkXpath1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		// Absolute xpath.
		
        //driver.findElement("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input[@type='email'])).sendKeys("akasahun1@gmail.com");
		
		
		//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@type='text']")).sendKeys("gGl123456");
		
		//driver.findElement(By.xpath("html/body/div/div[2]/div[3]/div/div/div/div/div[8]div/form/div/div[12]div[13]/div/button[@type='submit']")).click();
		 
		//Thread.sleep(2000);
	    // driver.close();
		
		//Relative xpath
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akasahun1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gGl123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.close();
		
	}

}
