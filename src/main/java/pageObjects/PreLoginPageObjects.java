package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.ManagePages;

import static utilities.Base.androidRecourceId;

public class PreLoginPageObjects extends ManagePages {

    public PreLoginPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy( id = "duoAnimation")
    public MobileElement duoOwlAnimation;

    @AndroidFindBy( id = "logo")
    public MobileElement logoTitle;

    @FindBy(how = How.XPATH ,using=("//*[@text='Learn a language for free. Forever.']"))
    public MobileElement missionText;

    @AndroidFindBy( id = "introFlowNewUserButton")
    public MobileElement newAccountButton;

    @AndroidFindBy( id = "introFlowLoginButton")
    public MobileElement LoginButton;

    @AndroidFindBy(id = "credential_picker_layout")
    public MobileElement googleAuthAlertTitle;

    @AndroidFindBy(xpath = "//*[@text='andonits5@gmail.com']")
    public MobileElement googleFirstCredential;

    @AndroidFindBy(id = androidRecourceId + "message")
    public MobileElement googleAuthAlertMessage;

    @AndroidFindBy(id = androidRecourceId + "button2")
    public MobileElement googleAuthAlertNoButton;

    @AndroidFindBy(id = androidRecourceId + "button1")
    public MobileElement googleAuthAlertYesButton;

}
