package com.class08;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class ImplicitWaitPractical extends CommonMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome", "");
		
	    driver.findElement(By.id(""));
	}

}
