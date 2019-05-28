package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationParaBank {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.firstName")).sendKeys("bob");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("tom");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("4010 Ridge Top Rd");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22030");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("70334933261");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("ka");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
