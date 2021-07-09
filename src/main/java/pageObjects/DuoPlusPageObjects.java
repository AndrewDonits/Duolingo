package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import utilities.ManagePages;

public class DuoPlusPageObjects extends ManagePages {

    public DuoPlusPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id =  "plusLogo")
    public MobileElement plusLogo;

    @AndroidFindBy(id =  "benefitDuoImage")
    public MobileElement plusPageDuoAnimation;

    @AndroidFindBy(id =  "salesText")
    public MobileElement plusPageSpiningText;

    @AndroidFindBy(id =  "paginationDots")
    public MobileElement paginationDots;

    @AndroidFindBy(id =  "continueButton")
    public MobileElement plusPageContinueButton;

    @AndroidFindBy(id =  "noThanksButton")
    public MobileElement plusPageNoThanksButton;
}
