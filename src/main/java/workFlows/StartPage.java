package workFlows;

import extensions.Click;
import extensions.Return;
import extensions.Verify;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;

public class StartPage extends CommonOps {

    public static void checkingNumberOfFragmentsOnStartPage() {
        if (homeMessageIcon())
            Click.on(douUi.mainPage.touchOutside, prop.getProperty("mainPageClass"), "touchOutside");

        List<WebElement> circleFragments = Return.list(douUi.mainPage.circleFragments, prop.getProperty("circleListId"));
        Verify.listSize(circleFragments, prop.getProperty("expectedSizeOfFragmentsOnBigScreen"), prop.getProperty("mainPageClass"), "circleFragments");
    }

    public static boolean homeMessageIcon() {
        return Verify.isElementPresented(douUi.mainPage.homeMessageIcon, prop.getProperty("mainPageClass"), "homeMessageIcon");
    }

    public static void toolbarHeartSectionCheck() {
        if (homeMessageIcon())
            Click.on(douUi.mainPage.touchOutside, prop.getProperty("mainPageClass"), "touchOutside");

        Click.on(douUi.toolbar.heartsToolBar, prop.getProperty("toolBarClass"), "currencyToolBar");
        Verify.elementIsDisplayed(douUi.toolbar.plusCapText,
                prop.getProperty("toolBarClass"), "currencyChestImage");
        Verify.elementIsDisplayed(douUi.toolbar.gemsImage, prop.getProperty("toolBarClass"), "gemsImage");
        Verify.elementIsDisplayed(douUi.toolbar.gemsText, prop.getProperty("toolBarClass"), "gemsText");
        Verify.elementIsDisplayed(douUi.toolbar.numberOfHeartsText,
                prop.getProperty("toolBarClass"), "numberOfHeartsText");
        Verify.elementIsDisplayed(douUi.toolbar.heartsTimerText,
                prop.getProperty("toolBarClass"), "heartsTimerText");
        Verify.elementIsDisplayed(douUi.toolbar.shieldHeartImage,
                prop.getProperty("toolBarClass"), "shieldHeartImage");
        Verify.elementIsDisplayed(douUi.toolbar.unlimitedHeartText,
                prop.getProperty("toolBarClass"), "unlimitedHeartText");
        Verify.elementIsDisplayed(douUi.toolbar.getPlusText, prop.getProperty("toolBarClass"), "getPlusText");
        Verify.elementIsDisplayed(douUi.toolbar.refillHeartImageDisabled,
                prop.getProperty("toolBarClass"), "refillHeartImageDisabled");
        Verify.elementIsDisplayed(douUi.toolbar.refillText, prop.getProperty("toolBarClass"), "refillText");
        Verify.elementIsDisplayed(douUi.toolbar.gemsPriceRefill,
                prop.getProperty("toolBarClass"), "gemsPriceRefill");
        Verify.elementIsDisplayed(douUi.toolbar.gemImageOnRefillSection,
                prop.getProperty("toolBarClass"), "gemImageOnRefillSection");
        Verify.elementIsDisplayed(douUi.toolbar.practiceHeartImage,
                prop.getProperty("toolBarClass"), "practiceHeartImage");
        Verify.elementIsDisplayed(douUi.toolbar.howMuchToEarn, prop.getProperty("toolBarClass"), "howMuchToEarn");
        Verify.elementIsDisplayed(douUi.toolbar.practiceText, prop.getProperty("toolBarClass"), "practiceText");
    }

    public static void toolbarCrownsCheck() {
        if (homeMessageIcon())
            Click.on(douUi.mainPage.touchOutside, prop.getProperty("mainPageClass"), "touchOutside");
        crownsSection();
        progressQuizSection();
    }

    public static void crownsSection() {
        Click.on(douUi.toolbar.crownsToolBar, prop.getProperty("toolBarClass"), "crownsToolBar");
        Verify.textBetweenTwoElements(
                Return.elementById(douUi.toolbar.crownsToolBar, "itemButton"),
                douUi.toolbar.crownsDeepCrownCount,
                prop.getProperty("toolBarClass"),
                prop.getProperty("toolBarClass"),
                "crownsToolBar",
                "crownsDeepCrownCount"
        );
        Verify.elementIsDisplayed(douUi.toolbar.crownsDeepCrownIcon, prop.getProperty("toolBarClass"), "crownsDeepCrownIcon");
        Verify.elementIsDisplayed(douUi.toolbar.crownsDeepTitle, prop.getProperty("toolBarClass"), "crownsDeepTitle");
        Verify.textInElement(
                douUi.toolbar.crownsDeepTitle,
                prop.getProperty("crownsDeepTitle"),
                prop.getProperty("toolBarClass"),
                "crownsDeepTitle"
        );
        Verify.elementIsDisplayed(douUi.toolbar.crownsDeepText, prop.getProperty("toolBarClass"), "crownsDeepText");
        Verify.textInElement(
                douUi.toolbar.crownsDeepText,
                prop.getProperty("crownsDeepText"),
                prop.getProperty("toolBarClass"),
                "crownsDeepText"
        );
    }
    public static void progressQuizSection() {
        Verify.elementIsDisplayed(douUi.toolbar.progressQuizIcon, prop.getProperty("toolBarClass"), "progressQuizIcon");
        Verify.elementIsDisplayed(douUi.toolbar.progressQuizTitle, prop.getProperty("toolBarClass"), "progressQuizTitle");
        Verify.textInElement(
                douUi.toolbar.progressQuizTitle,
                prop.getProperty("progressQuizTitle"),
                prop.getProperty("toolBarClass"),
                "progressQuizTitle"
        );
        Verify.elementIsDisplayed(douUi.toolbar.progressQuizText, prop.getProperty("toolBarClass"), "progressQuizText");
        Verify.textInElement(
                douUi.toolbar.progressQuizText,
                prop.getProperty("progressQuizText"),
                prop.getProperty("toolBarClass"),
                "progressQuizText");
        Verify.elementIsClickable(douUi.toolbar.progressQuizButtonDuoPlus,  prop.getProperty("toolBarClass"), "progressQuizButtonDuoPlus");
        Verify.textInElement(
                douUi.toolbar.progressQuizButtonDuoPlus,
                prop.getProperty("progressQuizButtonDuoPlus"),
                prop.getProperty("toolBarClass"),
                "progressQuizButtonDuoPlus"
        );
        Click.on(douUi.toolbar.progressQuizButtonDuoPlus, prop.getProperty("toolBarClass"), "progressQuizButtonDuoPlus");
        Verify.elementIsDisplayed(douUi.duoPlus.plusLogo, prop.getProperty("duoPlusClass"), "plusLogo");
    }
}
