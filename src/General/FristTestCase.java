package General;

/*
  Scenario to Automate

Launch the Firefox browser
Open website “www.Store.DemoQA.com”
Print a Message to display that the website is opened successfully
Wait for 5 Seconds
Close the Browser
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FristTestCase {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/amera/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.Store.Demoqa.com");

		// Wait for 5 Sec
		Thread.sleep(5000);

		// Close the driver
		driver.quit();
	}
}
