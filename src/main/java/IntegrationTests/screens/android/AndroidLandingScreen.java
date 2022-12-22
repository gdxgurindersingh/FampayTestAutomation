package IntegrationTests.screens.android;

import UITestFramework.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login Screen
 */
public class AndroidLandingScreen extends GenericMethods {

	public AndroidLandingScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Locators on the login screen
	public By backButton = By.id("com.fampay.in:id/btn_back");



}

