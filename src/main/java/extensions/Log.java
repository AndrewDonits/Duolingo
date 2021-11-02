package extensions;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.Assert;
import utilities.CommonOps;
import utilities.Status;

import java.io.IOException;

public class Log extends CommonOps {

    public Log() {
        super();
    }


    public void to(String value, Status statusType, String imageName) throws IOException {
        switch (statusType) {
            case INFO:
                test.info(value);
                break;
            case FAIL:
                test.fail(value + test.addScreenCaptureFromPath(SSReport(imageName)));
                Assert.fail();
                break;
            case PASS:
                test.pass(value);
                break;
            case WARNING:
                test.warning(value);
                break;
            default:
                break;
        }
    }


    public void toWithScreenShot(String logType, String value, String imageName)
            throws IOException {
        switch (logType.toLowerCase()) {
            case "info":
                test.info(value, MediaEntityBuilder.createScreenCaptureFromPath(SSReport(imageName)).build());
        }
    }
}
