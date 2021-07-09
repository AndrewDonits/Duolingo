package extensions;

import org.openqa.selenium.WebDriver;
import utilities.CommonOps;

import java.io.IOException;

public class Log extends CommonOps {

    public static void to(String logType, String value) {
        switch (logType.toLowerCase()) {
            case "info":
                test.info(value);
        }
    }

    public static void toWithScreenShot(WebDriver driver, String logType, String value, String imageName)
            throws IOException {
        switch (logType.toLowerCase()) {
            case "info":
                test.info(value + test.addScreenCaptureFromPath(SSReport(driver, imageName)));
        }
    }
}
