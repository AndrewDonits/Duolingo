package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.Base;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Verify extends Base {

    public static void textInElement(WebElement elem, String expectedValue, String className, String name) {
        try {
            assertEquals(elem.getText(), expectedValue);
            test.pass(
                    "Element: ["
                        + Variables.getName(elem, className, name)
                        + "], Has the following text: ["
                        + expectedValue
                        + "]"
            );
        } catch (Exception e) {
            test.fail(
                    "Failed to find the following text: ["
                        + expectedValue
                        + "], inside element: ["
                        + Variables.getName(elem, className, name)
                        +"]"
            );
            Assert.fail();
        }
    }


    public static void textBetweenTwoElements(
            WebElement elem1,
            WebElement elem2,
            String className1,
            String className2,
            String name1,
            String name2
    ) {
        try {
            assertEquals(elem1.getText(), elem2.getText());
            test.pass(
                    "Element: [" + Variables.getName(elem1, className1, name1)
                            + "] with the text: ["
                            + elem1.getText()
                            +"], is identical to the text inside the element: ["
                            + Variables.getName(elem2, className2, name2)
                            + "]"
            );
        } catch (Exception e) {
            test.fail(
                    "Failed to compare text between element: ["
                            + Variables.getName(elem1, className1, name1)
                            + "], to element: ["
                            + Variables.getName(elem2, className2, name2)
                            + "], See details ==> " + e.getMessage()
            );
            Assert.fail();
        }
    }

    public static void elementIsDisplayed(WebElement elem, String className, String name) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(elem));
            test.pass("Element: [" + Variables.getName(elem, className, name) + "] was found successfully");
        } catch (Exception e) {
            test.fail("Element: [" + Variables.getName(elem, className, name) + "] wasn't found," +
                            " See details ==> " + e.getMessage());
            Assert.fail();
        }

    }

    public static boolean isElementPresented(WebElement elem, String className, String name) {
        boolean isPresented = false;
        try {
            driverWait.until(ExpectedConditions.visibilityOf(elem));
            test.pass("Element: [" + Variables.getName(elem, className, name) + "] was found successfully");
            isPresented = true;
        } catch (Exception e) {
            test.info("Element: [" + Variables.getName(elem, className, name) + "] wasn't found," +
                        " See details ==> " + e.getMessage());
        }

        return isPresented;
    }

    public static void listSize(List<WebElement> list, String size, String className, String name) {
        try {
            assertEquals(list.size(), Integer.parseInt(size));
            test.pass("This size of the list is correct, the size is: [" + size
                            + "], in the list: [" + Variables.getName(list.get(0), className, name) + "]");
        } catch (Exception e) {
            test.fail(
                    "This size of the list isn't correct, the real size is: [" + list.size() + "], "
                            + "but expected to be: [" + size + "], "
                            + "in the list: [" + Variables.getName(list.get(0), className, name) + "]" +
                            ", See details ==> " + e.getMessage());
            Assert.fail();
        }
    }

    public static void elementIsClickable(WebElement elem, String className, String name) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem));
            test.pass("Element: [" + Variables.getName(elem, className, name)
                    + "] was found successfully and it's clickable");
        } catch (Exception e) {
            test.fail( "Element: [" + Variables.getName(elem, className, name) + "] wasn't found," +
                            " See details ==> " + e.getMessage());
            Assert.fail();
        }
    }
}
