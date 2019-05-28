package com.class03;
/*
 * TC 2: Mercury Tours Registration:
 * Open chrome browserGo to “http://newtours.demoaut.com/”Click on Register Link
 * Fill out all required infoClick SubmitUser successfully registere
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Relative xpath
		// registration

		driver.navigate().to("http://newtours.demoaut.com/");
		//driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.xpath("//td[@class='mouseOut']")).click();
		driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kasu");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Amera");
		driver.findElement(By.xpath("//input[@name='phone' ]")).sendKeys("1190319031903");
		driver.findElement(By.xpath("//input[@name='userName' and @id='userName' ]")).sendKeys("Kasu Amera");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("main Street");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Addis Abeba");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Addis");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1903");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("united states");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		


		/*driver.findElement(By.linkText("User Information"));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kasu Amera");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1903");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1903");
		driver.findElement(By.xpath("//input[@name='login' ]")).click();
        */
	}

}
