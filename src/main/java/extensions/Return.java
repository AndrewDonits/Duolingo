package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;

public class Return extends CommonOps {

    public static List<WebElement> list(WebElement elem, String id) {
        List =  elem.findElements(By.id(id));
        return List;
    }

    public static WebElement elementByXpath(WebElement elem, String xpath) {
        return elem.findElement(By.xpath(xpath));
    }

    public static WebElement elementById(WebElement elem, String id) {
        return elem.findElement(By.id(id));
    }
}
