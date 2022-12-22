package IntegrationTests.coreLogic.iOS;

import org.openqa.selenium.WebDriver;
import IntegrationTests.screens.iOS.IOSLoginScreen;
import IntegrationTests.coreLogic.base.*;



/**
 * contains method to login on iOS app
 */
public class IOSLoginCoreLogic extends LoginCoreLogic{
    IOSLoginScreen iosLoginScreen;

    public IOSLoginCoreLogic(WebDriver driver){
        iosLoginScreen = new IOSLoginScreen(driver);
    }

    /**
     * method to verify login scenario on iOS app
     * @param mobileNumber mobile Number to be used for login
     */
    @Override
    public void verifyLoginScenario(String mobileNumber)
            throws InterruptedException {

        // write the flow as per your app (similar to AndroidLoginhelper). Below is the appium code of iOS app


    }



}

