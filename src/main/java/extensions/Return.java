package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Return extends CommonOps {

    public Return() {
        super();
    }

    public List<WebElement> list(WebElement elem, String id) {
        List =  elem.findElements(By.id(id));
        return List;
    }

    public List<WebElement> listOfEvenIndexes(WebElement elem, String id) {
        List<WebElement> tempList =  elem.findElements(By.id(id));
        AtomicInteger i = new AtomicInteger();
        tempList.forEach(e -> {
            if (i.getAndIncrement() % 2 == 0)
                List.add(e);
        });

        return List;
    }

    public List<WebElement> listOfOddIndexes(WebElement elem, String id) {
        List<WebElement> tempList =  elem.findElements(By.id(id));
        AtomicInteger i = new AtomicInteger();
        tempList.forEach(e -> {
            if (i.getAndIncrement() % 2 != 0)
                List.add(e);
        });

        return List;
    }

    public WebElement elementByXpath(WebElement elem, String xpath) {
        return elem.findElement(By.xpath(xpath));
    }

    public WebElement elementById(WebElement elem, String id) {
        return elem.findElement(By.id(id));
    }
}
