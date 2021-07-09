package extensions;

import org.openqa.selenium.WebElement;
import pageObjects.*;
import utilities.CommonOps;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Variables extends CommonOps {

    public static String myElementName;
    public static String[] myElementsNames;
    public static Field[] fld;
    public static int counter = 0;
    public static String myElementNameCommaSeparated;

    public static String getName(WebElement elem, String className, String name) {
        if (className.toLowerCase().contains("mainpage")) {
            fld = MainPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                if (field.getName().contains(name)) {
                    myElementName = field.getName();
                }
                ;
            }
        } else if (className.toLowerCase().contains("prelogin")) {
            fld = PreLoginPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                if (field.getName().contains(name)) {
                    myElementName = field.getName();
                }
                ;
            }
        } else if (className.toLowerCase().contains("loginpage")) {
            fld = LoginPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                if (field.getName().contains(name)) {
                    myElementName = field.getName();
                }
                ;
            }
        } else if (className.toLowerCase().contains("toolbar")) {
            fld = ToolBarPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                if (field.getName().contains(name)) {
                    myElementName = field.getName();
                }
                ;
            }
        } else if (className.toLowerCase().contains("duoplus")) {
            fld = DuoPlusPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                if (field.getName().contains(name)) {
                    myElementName = field.getName();
                }
                ;
            }
        }
        return myElementName;
    }

    public static String getNames(List<WebElement> elemList, String className, String[] names) {

        if (className.toLowerCase().contains("profileweb")) {
            fld = MainPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                for (String name : names) {
                    if (field.getName().contains(name)) {
                        myElementsNames[counter] = name;
                        counter++;
                    }
                    ;
                }
            }
        }
        List<String> values = new ArrayList<String>();
        for (String data : myElementsNames) {
            if (data != null) {
                values.add(data);
            }
        }
        myElementsNames = values.toArray(new String[values.size()]);
        myElementNameCommaSeparated = String.join(", ", myElementsNames);
        return myElementNameCommaSeparated;
    }

}

