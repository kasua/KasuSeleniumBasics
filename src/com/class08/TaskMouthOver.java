package com.class08;
 
/*Task1VerifyElementIsPresent for MouthOver
 * Navigate to https://www.toolsqa.com 
 *  Hover over the Tutorial menu
 *  Click on Software Testing Tutorial 
 *  Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class TaskMouthOver extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[@class='menu-text']"));
		Actions action= new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
