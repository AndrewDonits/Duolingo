package extensions;

import org.openqa.selenium.WebElement;
import utilities.CommonOps;

public class Update extends CommonOps {

    public Update() {
        super();
    }

    public void text(WebElement elem, String value, String className, String name) {
        try {
            elem.sendKeys(value);
            test.pass( "Updated element: [" + manage.variables.getName(elem, className, name)
                    + "] ,with the following text successfully: [" + value + "]"
            );
        } catch (Exception e) {
            test.fail("Couldn't update element: [" + manage.variables.getName(elem, className, name)
                    + "], with the following text: [" + value + "], See details ==> " + e.getMessage()
            );
        }
    }
}
