package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class DuoUi {

    public MainPageObjects mainPage;
    public PreLoginPageObjects preLogin;
    public LoginPageObjects loginPage;
    public ToolBarPageObjects toolbar;
    public DuoPlusPageObjects duoPlus;

    DuoUi(WebDriver driver) {
        this.mainPage = new MainPageObjects(driver);
        this.preLogin = new PreLoginPageObjects(driver);
        this.loginPage = new LoginPageObjects(driver);
        this.toolbar = new ToolBarPageObjects(driver);
        this.duoPlus = new DuoPlusPageObjects(driver);
    }
}
