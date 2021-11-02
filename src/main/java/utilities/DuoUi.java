package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pageObjects.*;

public class DuoUi {

    public MainPageObjects mainPage;
    public PreLoginPageObjects preLogin;
    public LoginPageObjects loginPage;
    public ToolBarPageObjects toolbar;
    public DuoPlusPageObjects duoPlus;
    public LessonsPageObjects lessons;

    DuoUi(WebDriver driver) {
        this.mainPage = new MainPageObjects(driver);
        this.preLogin = new PreLoginPageObjects(driver);
        this.loginPage = new LoginPageObjects(driver);
        this.toolbar = new ToolBarPageObjects(driver);
        this.duoPlus = new DuoPlusPageObjects(driver);
        this.lessons = new LessonsPageObjects(driver);
    }
}
