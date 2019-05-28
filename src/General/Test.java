package General;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	/*
	 * Launch the chromeDriver browser
	 * Open website “www.Store.DemoQA.com”
	 * Print a Message to display that the website is opened successfully
	 * Wait for 5 Seconds
	 * Close the Browser
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		
        Thread.sleep(5000);
        
        driver.close();
	}

}
