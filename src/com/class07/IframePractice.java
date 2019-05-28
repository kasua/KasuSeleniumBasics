package com.class07;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class IframePractice extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframeHandling[name='iframe_a']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
		
		driver.switchTo().defaultContent();
		
		boolean Switch =driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
		
		if(Switch==true) {
			driver.close();	
		}
		
	}

  }
