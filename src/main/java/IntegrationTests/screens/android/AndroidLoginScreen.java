package IntegrationTests.screens.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import UITestFramework.GenericMethods;


/**
 * contains all the locators present on the login Screen
 */
public class AndroidLoginScreen extends GenericMethods {

	public AndroidLoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Locators on the login screen
	public By enterFampay = By.id("com.fampay.in:id/cta_button");
	public By phoneNumber = By.id("com.fampay.in:id/phone_number_edit_text");
	public By getOTP = By.id("com.fampay.in:id/submit_button");
	public By submitOTP = By.id("com.fampay.in:id/submit_button");
	public By userIcon = By.id("com.fampay.in:id/user_fam_icon");


}

