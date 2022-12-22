package IntegrationTests.screens.iOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UITestFramework.GenericMethods;


/**
 * contains all the locators present on the login screen of iOS app.
 */
public class IOSLoginScreen extends GenericMethods {

    public IOSLoginScreen(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    // Locators on the login screen of your iOS app should be placed here.
    public By phoneNumberTextField = By.xpath("//.....");

}


