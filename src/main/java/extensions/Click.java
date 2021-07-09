package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.CommonOps;

import static org.testng.Assert.assertTrue;

public class Click extends CommonOps {

    public static void on(WebElement elem, String className, String value) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();
            test.pass("Element: [" + Variables.getName(elem, className, value) + "], clicked successfully");
        } catch (Exception e) {
            test.fail("Faild to click on element: [" + Variables.getName(elem, className, value) + "], See detaild ==> " + e.getMessage());
            Assert.fail();
        }

    }

    public static void doubleClick(WebElement elem, String className, String value) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();
            elem.click();
            test.pass("Element: [" + Variables.getName(elem, className, value) + "], clicked twice successfully");
        } catch (Exception e) {
            test.fail("Faild to click on element: [" + Variables.getName(elem, className, value) + "], See detaild ==> " + e.getMessage());
            Assert.fail();
        }

    }
}
