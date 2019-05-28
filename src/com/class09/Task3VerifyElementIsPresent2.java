package com.class09;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonMethods;

public class Task3VerifyElementIsPresent2 extends CommonMethods {

	public static void main(String[] args) {

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);

		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));

		if (!element.isEnabled()) {
			driver.findElement(By.xpath("//button[text()='Enable']")).click();

			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		}
		if (element.isEnabled()) {
			Actions act = new Actions(driver);

			act.moveToElement(element).click().build().perform();
			act.moveToElement(element).sendKeys("Hello").build().perform();

			driver.findElement(By.xpath("//button[text()='Disable']")).click();

			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enable']")));
		}

		driver.quit();
	}

}
