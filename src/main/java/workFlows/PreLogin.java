package workFlows;

import utilities.CommonOps;

public class PreLogin extends CommonOps {


    public PreLogin() {

    }

    public void elementsVerification() {
        //manage.verify.elementIsDisplayed(douUi.preLogin.duoOwlAnimation, prop.getProperty("preLoginClass"), "duoOwlAnimation");
        //manage.verify.elementIsDisplayed(douUi.preLogin.missionText, prop.getProperty("preLoginClass"), "missionText");
        manage.verify.elementIsDisplayed(douUi.preLogin.logoTitle, prop.getProperty("preLoginClass"), "logoTitle");
    }

    public void login(boolean googleAuth) {
        manage.verify.elementIsDisplayed(douUi.preLogin.LoginButton, prop.getProperty("preLoginClass"), "LoginButton");
        manage.click.on(douUi.preLogin.LoginButton, prop.getProperty("preLoginClass"), "LoginButton");
        if (googleAuth)
            manage.click.on(douUi.preLogin.googleFirstCredential, prop.getProperty("preLoginClass"), "googleFirstCredential");
        else {
            manage.update.text(douUi.loginPage.usernameField, prop.getProperty("loginEmail"), prop.getProperty("loginClass"), "usernameField");
            manage.update.text(douUi.loginPage.passwordField, prop.getProperty("password"), prop.getProperty("loginClass"), "passwordField");
            manage.click.on(douUi.loginPage.signInButton, prop.getProperty("loginClass"), "signInButton");
            if (tests.startPage.homeMessageIcon())
                manage.click.on(douUi.mainPage.homeMessageNoThanksButton, prop.getProperty("mainPageClass"), "homeMessageNoThanksButton");
            manage.verify.elementIsDisplayed(douUi.mainPage.circleFragments, prop.getProperty("mainPageClass"), "circleFragments");
        }
    }
}
