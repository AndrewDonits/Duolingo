package workFlows;

import extensions.Click;
import extensions.Update;
import extensions.Verify;
import utilities.CommonOps;

public class PreLogin extends CommonOps {

    public static void elementsVerification() {
        Verify.elementIsDisplayed(douUi.preLogin.duoOwlAnimation, prop.getProperty("preLoginClass"), "duoOwlAnimation");
        Verify.elementIsDisplayed(douUi.preLogin.missionText, prop.getProperty("preLoginClass"), "missionText");
        Verify.elementIsDisplayed(douUi.preLogin.logoTitle, prop.getProperty("preLoginClass"), "logoTitle");
    }

    public static void login(boolean googleAuth) {
        Verify.elementIsDisplayed(douUi.preLogin.LoginButton, prop.getProperty("preLoginClass"), "LoginButton");
        Click.on(douUi.preLogin.LoginButton, prop.getProperty("preLoginClass"), "LoginButton");
        if (googleAuth)
            Click.on(douUi.preLogin.googleFirstCredential, prop.getProperty("preLoginClass"), "googleFirstCredential");
        else {
            Update.text(douUi.loginPage.usernameField, prop.getProperty("loginEmail"), prop.getProperty("loginClass"), "usernameField");
            Update.text(douUi.loginPage.passwordField, prop.getProperty("password"), prop.getProperty("loginClass"), "passwordField");
            Click.on(douUi.loginPage.signInButton, prop.getProperty("loginClass"), "signInButton");
            Verify.elementIsDisplayed(douUi.mainPage.circleFragments, prop.getProperty("mainPageClass"), "circleFragments");
        }
    }
}
