package com.class06;

/*
 * TC 1: JavaScript alert text verification
 * Open chrome browser
 * Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html” 
 * Verify
 * alert box with text “I am an alert box!” is present
 * confirm box with text “Press a button!” is present
 * prompt box with text “Please enter your name” is present
 *  Quit browser
 */
  import org.openqa.selenium.Alert;
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertTxtVerify {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(3000);
        
		driver.findElement(By.cssSelector("button[class$='-default']")).click();
		Alert alertBox = driver.switchTo().alert();

		String expectedStr = "I am an alert box!";
		
		if (alertBox.getText().equals(expectedStr)) {
			System.out.println(expectedStr + " is present, TC is passed");
		 } else {
			System.out.println(expectedStr + " is NOT present, TC is NOT passed");
		  }
		
		 alertBox.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[class$='btn btn-default btn-lg']")).click();
		Alert confirmBox = driver.switchTo().alert();
		
		expectedStr = "Press a button!";
		if (confirmBox.getText().equals(expectedStr)) {
			System.out.println(expectedStr + " is present, TC is passed");
		} else {
			System.out.println(expectedStr + " is NOT present, TC is NOT passed");
		}
		
		confirmBox.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Click for Prompt Box')]")).click();
		Alert promptBox = driver.switchTo().alert();
		
		expectedStr = "Please enter your name";
		if (promptBox.getText().equals(expectedStr)) {
			System.out.println(expectedStr + " is present, TC is passed");
		} else {
			System.out.println(expectedStr + " is NOT present, TC is NOT passed");
		}
		
		promptBox.accept();
		Thread.sleep(3000);
		driver.close();
	}
}
