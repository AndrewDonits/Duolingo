package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import utilities.ManagePages;

public class ToolBarPageObjects extends ManagePages {

    public ToolBarPageObjects(WebDriver driver) {
        super(driver);
    }

    /************ Heart Section *************/
    @AndroidFindBy(id =  "menuCurrency")
    public MobileElement heartsToolBar;

    @AndroidFindBy(id =  "plusCapText")
    public MobileElement plusCapText;

    @AndroidFindBy(id = "gemsImage")
    public MobileElement gemsImage;

    @AndroidFindBy(id = "gemsText")
    public MobileElement gemsText;

    @AndroidFindBy(id =  "numberHeartsText")
    public MobileElement numberOfHeartsText;

    @AndroidFindBy(id =  "heartsTimerText")
    public MobileElement heartsTimerText;

    @AndroidFindBy(id =  "shieldHeartImage")
    public MobileElement shieldHeartImage;

    @AndroidFindBy(id =  "unlimitedTests")
    public MobileElement unlimitedHeartText;

    @AndroidFindBy(id =  "getPlusText")
    public MobileElement getPlusText;

    @AndroidFindBy(id =  "refillHeartImageDisabled")
    public MobileElement refillHeartImageDisabled;

    @AndroidFindBy(id =  "refillText")
    public MobileElement refillText;

    @AndroidFindBy(id =  "gemsPriceRefill")
    public MobileElement gemsPriceRefill;

    @AndroidFindBy(id =  "gemImage")
    public MobileElement gemImageOnRefillSection;

    @AndroidFindBy(id =  "practiceHeartImage")
    public MobileElement practiceHeartImage;

    @AndroidFindBy(id =  "earnText")
    public MobileElement howMuchToEarn;

    @AndroidFindBy(id =  "practiceText")
    public MobileElement practiceText;

    /************ Crowns *************/
    @AndroidFindBy(id =  "menuCrowns")
    public MobileElement crownsToolBar;

    @AndroidFindBy(id =  "drawerCrownsCount")
    public MobileElement crownsDeepCrownCount;

    @AndroidFindBy(id =  "crowns")
    public MobileElement crownsDeepTitle;

    @AndroidFindBy(id =  "crowns_message")
    public MobileElement crownsDeepText;

    @AndroidFindBy(id =  "drawerCrownIcon")
    public MobileElement crownsDeepCrownIcon;

    @AndroidFindBy(id =  "progressQuizIcon")
    public MobileElement progressQuizIcon;

    @AndroidFindBy(id =  "progressQuizTitle")
    public MobileElement progressQuizTitle;

    @AndroidFindBy(id =  "progressQuizMessage")
    public MobileElement progressQuizText;

    @AndroidFindBy(id =  "progressQuizButtonWithPlus")
    public MobileElement progressQuizButtonDuoPlus;


    /************ Streak *************/
    @AndroidFindBy(id =  "menuStreak")
    public MobileElement streakToolBar;

    @AndroidFindBy(id =  "streakFlameView")
    public MobileElement streakFlameImage;

    @AndroidFindBy(id =  "streakLabel")
    public MobileElement streakNumber;

    @AndroidFindBy(id =  "streakTitle")
    public MobileElement streakTitle;

    @AndroidFindBy(id =  "streakDescription")
    public MobileElement streakDescription;

    // Find with this Id locator ==> dayOfWeekFlame0-6
    @AndroidFindBy(id =  "streakHistoryView")
    public MobileElement streakHistory;

    @AndroidFindBy(id =  "dailyGoalChest")
    public MobileElement streakDailyGoalChest;

    @AndroidFindBy(id =  "oneLessonStreakDailyGoalText")
    public MobileElement streakDailyGoalText;

    @AndroidFindBy(id =  "dailyGoalXpFractionText")
    public MobileElement streakDailyGoalFraction;

    @AndroidFindBy(id =  "dailyGoalProgress")
    public MobileElement streakDailyGoalProgressBar;

    @AndroidFindBy(id =  "editDailyGoalOneLessonStreakDrawer")
    public MobileElement streakDailyGoalEditButton;




    /************ Language *************/
    @AndroidFindBy(id =  "menuLanguage")
    public MobileElement languageToolBar;
}
