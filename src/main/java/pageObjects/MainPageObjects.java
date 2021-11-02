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

    @AndroidFindBy( id = "homeMessageSecondaryButton")
    public MobileElement homeMessageNoThanksButton;

    @AndroidFindBy( id = "homeMessagePrimaryButton")
    public MobileElement homeMessagePrimaryButton;

    @AndroidFindBy( id = "touch_outside")
    public MobileElement touchOutside;

    @AndroidFindBy( xpath = "//*[@id='skillNode1' and //*[//*[@text='Basics 1']]]")
    public MobileElement basic1_1stExc;

    @AndroidFindBy( id = "levelCrown")
    public MobileElement levelCrown;

    @AndroidFindBy( id = "skillTreeView")
    public MobileElement allExcercises;

    @AndroidFindBy(id = "tipsTextButton")
    public MobileElement tipsButton;

    @AndroidFindBy(id = "sessionButton")
    public MobileElement regularLessonButton;

    @AndroidFindBy(id = "hardModeSessionButton")
    public MobileElement hardLessonButton;



















}
