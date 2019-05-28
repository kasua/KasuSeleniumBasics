package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("http://google.com");// open the brower.
		 * System.out.println(driver.getTitle()); String title= driver.getTitle();
		 * if(title.equalsIgnoreCase("google")) {
		 * System.out.println("This is the right title"); } else { System.out
		 * .println("Sorry this is not the title");
		 *  }
		 */

		driver.get("http://facebook.com");// open the browser.
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This is the right title");
		} else {
			System.out.println("Sorry this is not the title");
		}
	}
}