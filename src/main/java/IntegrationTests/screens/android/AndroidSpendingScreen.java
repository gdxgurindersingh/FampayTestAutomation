package IntegrationTests.screens.android;

import UITestFramework.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login Screen
 */
public class AndroidSpendingScreen extends GenericMethods {

	public AndroidSpendingScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Locators on the login screen
	public By moneyTab = By.id("com.fampay.in:id/tv_money");
	public By famcoinTab = By.id("com.fampay.in:id/tv_famcoin");

}

