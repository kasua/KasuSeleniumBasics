package com.class10;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;


public class GPTC2TableHeaderAndRowsVerification extends CommonMethods{ 
	
	/* TC 1: Table headers and rows veriﬁcation
	 * 1. Open chrome browser
	 * 2. Go to “https://jqueryui.com/”
	 * 3. Click on “Datepicker”     
	 * 4. Select August 10 of 2019
     * 5. Verify date “08/10/2019” has been entered succesfully 
     * 6. Close browser     
     * 
     */   
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://jqueryui.com/";
		String ExpectedDay = "10";
		String Expectedmonth = "August";
		String Expectedyear = "2019"; 
		String ExpectedDate = "08/10/2019";
		
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Datepicker")).click();
		
		//convert view to frame
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); 
		//driver.findElement(By.cssSelector("input#datepicker")).click(); 
		
		while(!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().equals(Expectedmonth)) { 
			driver.findElement(By.cssSelector("a[title='Next']")).click();
			} 
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement e:dates) {
			if(e.getText().equals(ExpectedDay)){
				e.click();
				break;
				}
			}       
		WebElement date = driver.findElement(By.cssSelector("input#datepicker"));
		if(date.isDisplayed()) {
			if(date.getAttribute("value").equals(ExpectedDate)) {
}        }
		Thread.sleep(5000);
		driver.quit();
		}
	}
  
