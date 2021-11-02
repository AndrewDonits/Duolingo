import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.Basics1_ItalianLearn;
import workFlows.StartPage;

import java.io.IOException;

public class Sanity extends CommonOps {

    @Test
    public void Test01_CheckingNumberOfFragmentsOnStartPage() {
        tests.startPage.checkingNumberOfFragmentsOnStartPage();
    }

    @Test
    public void Test02_HeartsCompare() {
        tests.startPage.compareHeartsToHeartText();
    }

    @Test
    public void Test03_ToolBarHeartsCheck() {
        tests.startPage.toolbarHeartSectionCheck();
    }

    @Test
    public void Test04_ToolBarCheckCrowns() {
        tests.startPage.toolbarCrownsCheck();
    }

    @Test
    public void Test05_FirstLesson() throws IOException {
        tests.basics1_italianLearn.enterFirstLesson();
        tests.basics1_italianLearn.detectChallengeType(4);
    }
}
