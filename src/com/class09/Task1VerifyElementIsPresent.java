package com.class09;

/**
 * TC 1: Verify element is present
 * Open chrome browser
 * Go to “https://the-internet.herokuapp.com/”
 * Click on “Dynamic Loading” link
 * Click on “Example 1...” and click on “Start”
 * Verify element with text “Hello World!” is displayed
 * Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonMethods;

public class Task1VerifyElementIsPresent extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish")));
		
		WebElement finish = driver.findElement(By.cssSelector("div#finish"));
		
		String expected = "Hello World!";
		
		if (finish.isDisplayed()) {
			String present = finish.getText();
			
			if (present.equalsIgnoreCase(expected)) {
				System.out.println("text is present");
			}
		} else {
			System.out.println("text is not present");
		}
		driver.close();
	}
}