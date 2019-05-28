package com.class02;
/*
 * TC 1: Amazon Page Title Verification:
 * Open chrome browser
 * Go to “https://www.amazon.com/”
 * Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displaye
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1PageTitleVerification {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();

		if (title.equalsIgnoreCase(
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displaye")) {
			System.out.println("This is the right title");
		} else {
			System.out.println("Sorry this is not the right title");
		}
		
		
	}

}
