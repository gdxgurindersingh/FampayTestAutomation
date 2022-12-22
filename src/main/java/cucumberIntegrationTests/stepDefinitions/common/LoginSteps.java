package cucumberIntegrationTests.stepDefinitions.common;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.android.AndroidLoginScreen;
import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginSteps {
    AndroidLoginScreen androidLoginScreen;
    IOSLoginScreen iosLoginScreen;
    WebDriver driver;
    String userName;
    String password;
    Properties configFileObject;
    BaseSteps baseStepsContext;



    public LoginSteps(BaseSteps baseSteps) {
        baseStepsContext = baseSteps;
        driver = baseStepsContext.driver;
        androidLoginScreen = baseStepsContext.androidLoginScreen;
        iosLoginScreen = baseStepsContext.iosLoginScreen;
        configFileObject = CreateSessionCucumber.localeConfigProp;
    }



    @And("user has \"([^\"]*)\" mobile number")
    public void usernameAndPasswordIs(String credentialsValidations) {
        if(credentialsValidations.equalsIgnoreCase("valid")){
            userName = configFileObject.getProperty("mobileNumber");
        }
        else{
            //send out invalid number
        }
    }




}
