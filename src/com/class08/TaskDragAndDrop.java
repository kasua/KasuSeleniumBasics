package com.class08;
/*
 * task
 * Ahead to https://jqueryui.com/droppable/
 * handle the frame
 * drag and dropc
 * close browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class TaskDragAndDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.cssSelector("demo-description"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		
		driver.close();

	}

	}


