package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import extensions.Click;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

public class Base {
    public static AndroidDriver<AndroidElement> driver;
    public static WebDriverWait driverWait;
    public static Actions action;
    public static EventFiringWebDriver eventHandler;
    public static List<WebElement> List;
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    public static String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
    public static String staticReportTimeStamp;
    public DesiredCapabilities dc = new DesiredCapabilities();
    public static Properties prop = new Properties();
    public static final String androidRecourceId = "android:id/";
    public static Click click;

    public static final String port = "4723";
}
