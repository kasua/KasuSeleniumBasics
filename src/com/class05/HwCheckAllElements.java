package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: Tools QA check all elements
 * Open chrome browser 
 * Go to “https://www.toolsqa.com/automation-practice-form/”
 * Fill out:
 * First Name
 * Last Name
 * Check that sex radio buttons are enabled and select “Male”
 * Check all Years of Experience radio buttons are clickable
 * Date
 * Select both checkboxes for profession
 * Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected 
 * Quit browser
 */

public class HwCheckAllElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize window
				
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		
		WebElement userNameText=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		userNameText.clear();
		userNameText.sendKeys("Kasu");
		Thread.sleep(1000);
		
		WebElement lastNameText=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		userNameText.clear();
		userNameText.sendKeys("Amera");
		Thread.sleep(1000);
		
		WebElement maleRadio = driver.findElement(By.id("sex-0"));
	}

}
