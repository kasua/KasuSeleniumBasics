package General;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class MouseHoverActions extends CommonMethods {

	public static void main(String[] args) {

		// 1. Mouse hover actions on an element using Actions Class:

		// WebElement ele = Driver.findElement(By.xpath("xpath"));
		// Create object 'action' of an Actions class
		Actions action = new Actions(driver);
		// Mouseover on an element
		// action.moveToElement(ele).perform();

		// 2.Mouse hover actions on a sub-element using Actions Class:

//Main Menu
		WebElement mainMenu = driver.findElement(By.linkText("main_menu_link"));
//Create object 'action' of an Actions class
		Actions actions = new Actions(driver);
//To mouseover on main menu
		actions.moveToElement(mainMenu);

//Sub Menu
		WebElement subMenu = driver.findElement(By.linkText("sub_menu_link"));
//To mouseover on sub menu
		actions.moveToElement(subMenu);
//build() method is used to compile all the actions into a single step 
		actions.click().build().perform();

		// or

//Main Menu
		WebElement mainMenu1 = driver.findElement(By.linkText("main_menu_link"));
//Create object 'action' of an Actions class
		Actions action1 = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
		action1.moveToElement(mainMenu1).moveToElement(driver.findElement(By.linkText("sub_menu_link"))).click().build()
				.perform();

	}

}
