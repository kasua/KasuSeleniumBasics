/*package com.class08;

/*
 * Task1VerifyElementIsPresent Two
 * Ahead to http://uitestpractice.com/Students/Index
 * Click on the Actions
 * Handle the drag and drop
 * Close the browser
 */
/*import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class Tasktwo extends FirstCommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		FirstCommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		driver.findElement(By.xpath("//button[text()='Click Me !']")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement doubleClickDemo = driver.findElement(By.xpath("//button[text()='Double Click Me !']"));

		Actions action = new Actions(driver);

		action.doubleClick(doubleClickDemo).perform();
		Thread.sleep(2000);

		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
*/
package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class Task2DragAndDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Task1VerifyElementIsPresent Two Ahead to http://uitestpractice.com/Students/Index 
		 * Click on the Actions
		 *  Handle the drag and drop 
		 *  Close the browser
		 */
		setUpDriver("Chrome", "http://uitestpractice.com/Students/Index");

		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drag).perform();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
