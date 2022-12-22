package IntegrationTests.coreLogic.android;

import logger.Log;

import org.openqa.selenium.WebDriver;


import IntegrationTests.screens.android.AndroidLoginScreen;
import IntegrationTests.coreLogic.base.*;


/**
 * contains all methods to login on android app
 */
public class AndroidLoginCoreLogic extends LoginCoreLogic {
    AndroidLoginScreen androidLoginScreen;

    public AndroidLoginCoreLogic(WebDriver driver) {
        androidLoginScreen = new AndroidLoginScreen(driver);
    }

    /**
     * method to login to android app
     *
     * @param mobileNumber mobile Number to be used for login
     */
    @Override
    public void verifyLoginScenario(String mobileNumber) throws InterruptedException {
        androidLoginScreen.waitForVisibility(androidLoginScreen.enterFampay);
        androidLoginScreen.findElement(androidLoginScreen.enterFampay).click();
        androidLoginScreen.waitForVisibility(androidLoginScreen.phoneNumber);
        androidLoginScreen.findElement(androidLoginScreen.phoneNumber).sendKeys(mobileNumber);
        androidLoginScreen.hideKeyboard();
        androidLoginScreen.waitForVisibility(androidLoginScreen.getOTP);
        androidLoginScreen.findElement(androidLoginScreen.getOTP).click();

        androidLoginScreen.hideKeyboard();

        //	verify if User Icon is displayed
        androidLoginScreen.waitForVisibility(androidLoginScreen.userIcon);
        Log.info("Login Successful");

        androidLoginScreen.findElement(androidLoginScreen.userIcon).click();

        // scroll down twice with each duration of 500 ms
        androidLoginScreen.scrollDown(2, 500);
    }


}

