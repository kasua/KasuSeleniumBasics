package com.class10;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class TC1UserAppFormFill extends CommonMethods {
	/*
	 *  TC 1: Users Application Form Fill *
	 *  1. Open chrome browser *
	 *  2. Go to  �http://uitestpractice.com/� *
	 *  3. Click on �Forms� link * 
	 *  4. Fill out the entire form
	 *  * 5. Close the browser
	 *   MUST USE Functions: *
	 *   
	 */ 
	
	public static void main(String[] args) throws InterruptedException {
		String url = "http://uitestpractice.com";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Form")).click();
		
		//login
				driver.findElement(By.id("firstname")).sendKeys("kasu");
				driver.findElement(By.id("lastname")).sendKeys("Amera");
				//driver.findElement(By.name("optradio")).click();
				
		
		List<WebElement> radioList = driver.findElements(By.cssSelector("label[class='radio-inline']"));
		
		checkRadioButton(radioList, "Married");
		
		
		checkCheckBoxes(driver.findElements(By.cssSelector("label.checkbox-inline")), "Dancing");
		
		checkCheckBoxes(driver.findElements(By.cssSelector("label.checkbox-inline")), "Reading");
		
		selectValueFromDD(driver.findElement(By.cssSelector("select#sel1")), "Canada");
		
		driver.findElement(By.id("datepicker")).click();
		
		selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-month")), "Oct");
		selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-year")), "2019");
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement e : dates) {
			if (e.getText().equals("5")) {
				e.click();
				break;
			}
		}
		sendKeys(driver.findElement(By.id("phonenumber")), "7031234567");
		sendKeys(driver.findElement(By.id("username")), "syntaxTest");
		sendKeys(driver.findElement(By.id("email")), "test123@gmail.com");
		
		sendKeys(driver.findElement(By.cssSelector("textarea.form-control")), "Hello World, Nice to meet you");
		sendKeys(driver.findElement(By.id("pwd")), "12345");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

 }

	
