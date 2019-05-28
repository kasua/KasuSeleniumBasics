package com.class04;
/*
 * TC 1: Mercury Tours Registration:
 * Open chrome browserGo to “http://newtours.demoaut.com/”
 * Click on Register Link
 * Fill out all required info
 * Click SubmitUser successfully registered
 * 
 * css=tag[attribute=’value’]
 * 
 * css=tag.classcss=tag^='value']    
 *  for starts withcss=tag$='value']    
 *   for ends withcss=tag*='value']     
 *   for contains
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("a[href*='yregis']")).click();
		driver.findElement(By.cssSelector("input[name^='f']")).sendKeys("john");
		driver.findElement(By.cssSelector("input[name^='las']")).sendKeys("Doe");
		driver.findElement(By.cssSelector("input[name$='ne']")).sendKeys("911");
		driver.findElement(By.cssSelector("input[id*='erNa']")).sendKeys("test123@gmail.com");
		driver.findElement(By.cssSelector("input[name$='ss1']")).sendKeys("123 main street");
		driver.findElement(By.cssSelector("input[name$='ity']")).sendKeys("Ashburn");
		driver.findElement(By.cssSelector("input[name^='sta']")).sendKeys("VA");
		driver.findElement(By.cssSelector("input[name*='alCo']")).sendKeys("00000");
		driver.findElement(By.cssSelector("input[id*='ail']")).sendKeys("test123");
		
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name*='onfirm']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name^='regis']")).click();
		driver.close();
		
		//By instructor
		
		/*driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("bob");
		driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("tom");
		driver.findElement(By.cssSelector("input#email")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='register']")).click();
        */
			
	}
}
