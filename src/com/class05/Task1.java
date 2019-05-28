package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: Swag Labs Positive login:
 * Open chrome browserGo to “https://www.saucedemo.com/
 * ”Enter valid username and valid password and
 *  click loginVerify robot icon is displayed
 *  Verify “Products” text is available next to the robot icon
 */
public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		String userName = "standard_user";
		String password = "secret_sauce";

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");

		WebElement userNameTxt = driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]"));

		userNameTxt.clear();
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(1000);

		// storing password text box inside variable
		WebElement pwdTxt = driver.findElement(By.xpath("//input[starts-with(@id,'password')]"));
		pwdTxt.clear();
		pwdTxt.sendKeys("secret_sauce");

		// click on the Login btn
		driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();

		boolean isDisplayed = driver.findElement(By.cssSelector("div.peek")).isDisplayed();

		if (isDisplayed) {
			System.out.println("WebOrder  Robot logo is displayed");
		} else {
			System.out.println("WebOrder Robot logo is NOT displayed");
		}
		boolean isdisplayed = driver.findElement(By.cssSelector("div.product_label")).isDisplayed();
		if (isdisplayed) {
			System.out.println("WebOrder TExt is displayed");
		} else {
			System.out.println("WebOrder Text is NOT displayed");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1VerifyElementIsPresent {

	public static void main(String[] args) {

		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		//login to the application
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
		//logo verification
		boolean logo=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		
		if (logo) {
			System.out.println("Robot logo is displayed");
		}else {
			System.out.println("Robot logo is NOT displayed");
		}
		//verify product text
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="Products";
		
		if (displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+productText);
		}else {
			System.out.println("Element is NOT displayed OR textis NOT="+productText);
		}
		
		
	}
}
*/

