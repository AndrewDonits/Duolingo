package workFlows;

import extensions.Click;
import extensions.Return;
import extensions.Verify;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.Arrays;
import java.util.List;

public class StartPage extends CommonOps {

    public StartPage() {
        super();
    }

    public void checkingNumberOfFragmentsOnStartPage() {
        List<WebElement> circleFragments = manage.returnSome.list(douUi.mainPage.circleFragments, prop.getProperty("circleListId"));
        manage.verify.listSize(circleFragments, prop.getProperty("expectedSizeOfFragmentsOnBigScreen"), prop.getProperty("mainPageClass"), "circleFragments");
    }

    public boolean homeMessageIcon() {
        return manage.verify.isElementPresented(douUi.mainPage.homeMessageIcon,
                prop.getProperty("mainPageClass"), "homeMessageIcon")
                && manage.verify.isElementPresented(douUi.mainPage.homeMessageNoThanksButton,
                prop.getProperty("mainPageClass"), "homeMessageNoThanksButton");
    }

    public void toolbarHeartSectionCheck() {
        if (homeMessageIcon())
            manage.click.on(douUi.mainPage.touchOutside, prop.getProperty("mainPageClass"), "touchOutside");

        manage.click.on(douUi.toolbar.heartsToolBar, prop.getProperty("toolBarClass"), "heartsToolBar");
        manage.verify.elementIsDisplayed(douUi.toolbar.plusCapText, prop.getProperty("toolBarClass"), "plusCapText");
        manage.verify.elementIsDisplayed(douUi.toolbar.gemsImage, prop.getProperty("toolBarClass"), "gemsImage");
        manage.verify.elementIsDisplayed(douUi.toolbar.gemsText, prop.getProperty("toolBarClass"), "gemsText");
        manage.verify.elementIsDisplayed(douUi.toolbar.numberOfHeartsText,
                prop.getProperty("toolBarClass"), "numberOfHeartsText");
        manage.verify.elementIsDisplayed(douUi.toolbar.heartsTimerText,
                prop.getProperty("toolBarClass"), "heartsTimerText");
        manage.verify.elementIsDisplayed(douUi.toolbar.shieldHeartImage,
                prop.getProperty("toolBarClass"), "shieldHeartImage");
        manage.verify.elementIsDisplayed(douUi.toolbar.unlimitedHeartText,
                prop.getProperty("toolBarClass"), "unlimitedHeartText");
        manage.verify.elementIsDisplayed(douUi.toolbar.getPlusText, prop.getProperty("toolBarClass"), "getPlusText");
        manage.verify.elementIsDisplayed(douUi.toolbar.refillHeartImageDisabled,
                prop.getProperty("toolBarClass"), "refillHeartImageDisabled");
        manage.verify.elementIsDisplayed(douUi.toolbar.refillText, prop.getProperty("toolBarClass"), "refillText");
        manage.verify.elementIsDisplayed(douUi.toolbar.gemsPriceRefill,
                prop.getProperty("toolBarClass"), "gemsPriceRefill");
        manage.verify.elementIsDisplayed(douUi.toolbar.gemImageOnRefillSection,
                prop.getProperty("toolBarClass"), "gemImageOnRefillSection");
        manage.verify.elementIsDisplayed(douUi.toolbar.practiceHeartImage,
                prop.getProperty("toolBarClass"), "practiceHeartImage");
        manage.verify.elementIsDisplayed(douUi.toolbar.howMuchToEarn,
                prop.getProperty("toolBarClass"), "howMuchToEarn");
        manage.verify.elementIsDisplayed(douUi.toolbar.practiceText,
                prop.getProperty("toolBarClass"), "practiceText");
    }

    public void compareHeartsToHeartText() {
        manage.verify.elementIsDisplayed(douUi.toolbar.heartsToolBar,
                prop.getProperty("toolBarClass"), "heartsToolBar");
        String numberOfAvailableHeartsInToolBar = douUi.toolbar.heartsToolBar.getAttribute("content-desc");
        manage.click.on(douUi.toolbar.heartsToolBar,
                prop.getProperty("toolBarClass"), "heartsToolBar");
        manage.verify.elementIsDisplayed(douUi.toolbar.numberOfHeartsText,
                prop.getProperty("toolBarClass"), "numberOfHeartsText");
        String numberOfAvailableHeartsInHeartsSection = douUi.toolbar.numberOfHeartsText.getAttribute("content-desc");
        manage.verify.textBetweenTwoElements(numberOfAvailableHeartsInToolBar, numberOfAvailableHeartsInHeartsSection);
    }

    public void toolbarCrownsCheck() {
        if (homeMessageIcon())
            manage.click.on(douUi.mainPage.touchOutside, prop.getProperty("mainPageClass"), "touchOutside");
        crownsSection();
        progressQuizSection();
    }

    public static void crownsSection() {
        manage.click.on(douUi.toolbar.crownsToolBar, prop.getProperty("toolBarClass"), "crownsToolBar");
        manage.verify.textBetweenTwoElements(
                manage.returnSome.elementById(douUi.toolbar.crownsToolBar, "itemButton"),
                douUi.toolbar.crownsDeepCrownCount,
                prop.getProperty("toolBarClass"),
                prop.getProperty("toolBarClass"),
                "crownsToolBar",
                "crownsDeepCrownCount"
        );
        manage.verify.elementIsDisplayed(douUi.toolbar.crownsDeepCrownIcon, prop.getProperty("toolBarClass"), "crownsDeepCrownIcon");
        manage.verify.elementIsDisplayed(douUi.toolbar.crownsDeepTitle, prop.getProperty("toolBarClass"), "crownsDeepTitle");
        manage.verify.textInElement(
                douUi.toolbar.crownsDeepTitle,
                prop.getProperty("crownsDeepTitle"),
                prop.getProperty("toolBarClass"),
                "crownsDeepTitle"
        );
        manage.verify.elementIsDisplayed(douUi.toolbar.crownsDeepText, prop.getProperty("toolBarClass"), "crownsDeepText");
        manage.verify.textInElement(
                douUi.toolbar.crownsDeepText,
                prop.getProperty("crownsDeepText"),
                prop.getProperty("toolBarClass"),
                "crownsDeepText"
        );
    }
    public static void progressQuizSection() {
        manage.verify.elementIsDisplayed(douUi.toolbar.progressQuizIcon, prop.getProperty("toolBarClass"), "progressQuizIcon");
        manage.verify.elementIsDisplayed(douUi.toolbar.progressQuizTitle, prop.getProperty("toolBarClass"), "progressQuizTitle");
        manage.verify.textInElement(
                douUi.toolbar.progressQuizTitle,
                prop.getProperty("progressQuizTitle"),
                prop.getProperty("toolBarClass"),
                "progressQuizTitle"
        );
        manage.verify.elementIsDisplayed(douUi.toolbar.progressQuizText, prop.getProperty("toolBarClass"), "progressQuizText");
        manage.verify.textInElement(
                douUi.toolbar.progressQuizText,
                prop.getProperty("progressQuizText"),
                prop.getProperty("toolBarClass"),
                "progressQuizText");
        manage.verify.elementIsClickable(douUi.toolbar.progressQuizButtonDuoPlus,  prop.getProperty("toolBarClass"), "progressQuizButtonDuoPlus");
        manage.verify.textInElement(
                douUi.toolbar.progressQuizButtonDuoPlus,
                prop.getProperty("progressQuizButtonDuoPlus"),
                prop.getProperty("toolBarClass"),
                "progressQuizButtonDuoPlus"
        );
        manage.click.on(douUi.toolbar.progressQuizButtonDuoPlus, prop.getProperty("toolBarClass"), "progressQuizButtonDuoPlus");
        manage.verify.elementIsDisplayed(douUi.duoPlus.plusLogo, prop.getProperty("duoPlusClass"), "plusLogo");
    }
}
