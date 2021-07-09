import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.StartPage;

import java.io.IOException;

public class Sanity extends CommonOps {

    @Test
    public void Test01_CheckingNumberOfFragmentsOnStartPage() {
        StartPage.checkingNumberOfFragmentsOnStartPage();
    }

    @Test
    public void Test02_ToolBarHeartsCheck() {
        StartPage.toolbarHeartSectionCheck();
    }

    @Test
    public void Test03_ToolBarCheckCrowns() throws IOException {
        StartPage.toolbarCrownsCheck();
    }
}
