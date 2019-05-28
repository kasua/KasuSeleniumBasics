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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonMethods;

public class Task2VerifyElementIsPresent extends CommonMethods {

	public static void main(String[] args) {

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);

		driver.findElement(By.linkText("Dynamic Controls")).click();

		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));

		if (ele.isEnabled()) {
			ele.click();
		} else {
			System.out.println("element is NOT enabled");
		}

		ele = driver.findElement(By.xpath("//button[text()='Remove']"));
		ele.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOf(ele));

		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println(text);
		} else {
			System.out.println(" element is Not displayed");
		}

		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();

		wait.until(ExpectedConditions.visibilityOf(ele));

		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println(text);
		} else {
			System.out.println(" element is Not displayed");
		}
		driver.quit();
	}

}
