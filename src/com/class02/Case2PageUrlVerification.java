package com.class02;
/*
 * TC 2: Syntax Page URL Verification:
 * Open chrome browser
 * Navigate to “https://www.syntaxtechs.com/”
 * Navigate to “https://www.google.com/”
 * Navigate back to Syntax Technologies Page
 * Refresh current page
 * Verify url contains “Syntax”
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2PageUrlVerification {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.navigate().to("https://syntaxtechs.com/");
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    
	    driver.navigate().to("https://google.com"); 
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	   
	    driver.navigate().back(); 
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    
	    driver.navigate().refresh(); 
	    
	    String url= "https://syntaxtechs.com//";    
	   
	    if (url.contains("syntax")) { 
	    	System.out.println("Correct"); 
	    	} 
	    else 
	    {  
	    	System.out.println("incorrcect");
	    	} 
	    driver.close();
	    }
	}


