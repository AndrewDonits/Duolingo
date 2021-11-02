package extensions;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.CommonOps;

public class Click extends CommonOps {

    public Click() {
        super();
    }

    public void on(WebElement elem, String className, String value) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();
            test.pass("Element: [" + manage.variables.getName(elem, className, value) + "], clicked successfully");
        } catch (Exception e) {
            test.fail("Failed to click on element: [" + manage.variables.getName(elem, className, value) + "], See detaild ==> " + e.getMessage());
            Assert.fail();
        }

    }

    public void doubleClick(WebElement elem, String className, String value) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();
            elem.click();
            test.pass("Element: [" + manage.variables.getName(elem, className, value) + "], clicked twice successfully");
        } catch (Exception e) {
            test.fail("Failed to click on element: [" + manage.variables.getName(elem, className, value) + "], See detaild ==> " + e.getMessage());
            Assert.fail();
        }

    }

    public void onParent(WebElement elem, String className, String value) {
        WebElement myElement;
        
        try {
            myElement =
                    driver.findElement(By.xpath("//*[@id='"+elem.getAttribute("id")+"']//parent::android.widget.LinearLayout"));
            driverWait.until(ExpectedConditions.elementToBeClickable(myElement));
            myElement.click();
            test.pass("Element: [" + manage.variables.getName(elem, className, value) + "], clicked successfully");
        } catch (Exception e) {
            test.fail("Failed to click on element: [" + manage.variables.getName(elem, className, value) + "], See detaild ==> " + e.getMessage());
            Assert.fail();
        }

    }
}
