package com.class10;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class TableHeaderAndRowsVerif extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Table headers and rows verification 
		 * Open chrome browser 
		 * Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx” 
		 * Login to the application 
		 * 
		 * Verify customer “Susan McLaren” is present in the table
		 * 
		 * Click on customer details 
		 * Update customers last name 
		 * Verify updated customers name is displayed in table 
		 * Close browser
		 */

		String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);

		// login to the application
		
		//driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");//input & id value
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");//id value
		//driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		//driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		// size of rows
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@id,'ctl00_MainContent')]/tbody/tr"));
		System.out.println(row.size());
          //size of columns
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@id,'ctl00_MainContent')]/tbody/tr[1]/th"));
		System.out.println(col.size());
		
		//Verify customer “Susan McLaren” is present in the table.
		
		String name = "Susan McLaren ";
		
		for (int i = 1; i <= row.size(); i++) {
			String text = driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[" + i + "]"))
					.getText();
			if (text.contains(name)) {
				System.out.println("Present");
			}
		}
		Thread.sleep(3000);
		driver.close();
	}
}