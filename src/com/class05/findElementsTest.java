package com.class05;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsTest {

	private static Object webElement;

	public static void main(String[] args) throws Exception {

		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("http://www.store.demoqa.com");

		// Sleep for 5 seconds
		Thread.sleep(5000);

		// Find the checkbox or radio button element by its name.
		List list = driver.findElements(By.name("checkbox"));

		// Get the number of checkboxes available.
		int count = list.size();

		// Now, iterate the loop from first checkbox to last checkbox.
		for (int i = 0; i < count; i++) {

			// Store the checkbox name to the string variable, using 'Value'
			// attribute

			String sValue = ((WebElement) list.get(i)).getAttribute("value");

			// Select the checkbox if its value is the same that you want.
			if (sValue.equalsIgnoreCase("checkbox")) {

				((WebElement) list.get(i)).click();

				// This statement will get you out of the for loop.
				break;
			}

		}
	}
}