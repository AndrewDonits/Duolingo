package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import utilities.ManagePages;

public class LoginPageObjects extends ManagePages {
    public LoginPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy( id = "credentials_picker_title")
    public MobileElement googleSmartLockTitle;

    @AndroidFindBy( id = "credential_picker_options")
    public MobileElement emailList;

    @AndroidFindBy( id = "cancel")
    public MobileElement nothingOfTheseOptionsButton;

    @AndroidFindBy( id = "quit")
    public MobileElement xButton;

    @AndroidFindBy( id = "actionBarTitle")
    public MobileElement loginPageTitle;

    @AndroidFindBy( id = "loginView")
    public MobileElement usernameField;

    @AndroidFindBy( id = "passwordView")
    public MobileElement passwordField;

    @AndroidFindBy( id = "signinButton")
    public MobileElement signInButton;

    @AndroidFindBy( id = "forgotPassword")
    public MobileElement forgotPasswordButton;

    @AndroidFindBy( id = "googleButton")
    public MobileElement googleButton;

    @AndroidFindBy( id = "facebookButton")
    public MobileElement facebookButton;

    @AndroidFindBy( id = "termsAndPrivacy")
    public MobileElement termsAndPrivacyText;






}
