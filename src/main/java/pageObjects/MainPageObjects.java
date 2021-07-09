package pageObjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import utilities.ManagePages;

public class MainPageObjects extends ManagePages {
    public MainPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy( id = "skillTreeView")
    public MobileElement circleFragments;

    @AndroidFindBy( id = "homeCalloutContainer")
    public MobileElement frameMessage;

    @AndroidFindBy( id = "homeMessageIcon")
    public MobileElement homeMessageIcon;

    @AndroidFindBy( id = "homeMessageTitle")
    public MobileElement homeMessageTitle;

    @AndroidFindBy( id = "homeMessageText")
    public MobileElement homeMessageText;

    @AndroidFindBy( id = "homeMessagePrimaryButton")
    public MobileElement homeMessagePrimaryButton;

    @AndroidFindBy( id = "touch_outside")
    public MobileElement touchOutside;













}
