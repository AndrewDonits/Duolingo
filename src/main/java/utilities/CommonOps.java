package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.xml.sax.SAXException;
import workFlows.PreLogin;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

//import org.sikuli.script.Screen;

public class CommonOps extends Base {

    public static DuoUi douUi;

    /***************************** Main Methods *******************************/

    @BeforeClass
    public void beforeClass() throws IOException, SAXException, ParserConfigurationException {
        instanceReports();
        loadPropertiesFile();
    }

    @BeforeMethod
    public void beforeMethod(Method method) throws MalformedURLException {
        initReportsTest(method.getName().split("_")[1], method.getName().split("_")[0]);
        initDriver(prop.getProperty("EmulatorUUID"), prop.getProperty("EmulatorAppPackage"), prop.getProperty("EmulatorAppActivity"));
        driverWait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        douUi = new DuoUi(driver);
        try {
            driverWait.until(ExpectedConditions.visibilityOf(douUi.preLogin.duoOwlAnimation));
            PreLogin.elementsVerification();
            PreLogin.login(false);
        } catch (Exception e) {
            System.out.println("Couldn't find owl animation in pre-login, see details: " + e.getMessage());
        }
        action = new Actions(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @AfterClass
    public void afterClass() {
        finalizeReport();
    }

    /******************************** Initiation ********************************/

    public void initDriver(String UDID, String AppPackage, String AppActivity) throws MalformedURLException {
        dc.setCapability(MobileCapabilityType.UDID, UDID);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, AppPackage);
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AppActivity);
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
//        driver.resetApp();
        dc.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, true);
//        driver.installApp(prop.getProperty("EmulatorAppPath"));
    }

    /******************************** Reports ***********************************/

    public void instanceReports() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("C:/Users/andon/IdeaProjects/Duolingo/src/Reports/"
                + "Execution_"
                + timeStamp
                + "/" + "doulingoSanity"
                + ".html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Doulingo Report");
    }

    public static void initReportsTest(String testName, String testDescription) {
        test = extent.createTest(testName, testDescription)
        .assignAuthor("Andrew Donits")
        .assignCategory("Sanity")
        .assignDevice("Mobile samsung galaxy s20 ultra");
    }

    public static void finalizeReport() {
        extent.flush();
        //extent.close();
    }

    public static void finalizeReportsTest() {
        //extent.endTest(test);
    }


    public static String SSReport(WebDriver driver, String imageName) throws IOException {
        String SSPath = prop.getProperty("ReportsImagePath") + imageName +".jpeg";
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File(SSPath));
        Files.copy(scrFile.toPath(), new File(SSPath).toPath());
        return scrFile.getName();
    }


    /*********************************Other**************************************/

    public static void loadPropertiesFile() {

        File file = new File("C:/Users/andon/IdeaProjects/Duolingo/src/main/Configuration/properties.properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        } catch (FileNotFoundException e) {
            test.log(Status.FAIL, "Couldn't load properties file, see exception ==> " + e.getMessage());
        } catch (IOException e) {
            test.log(Status.FAIL, "Couldn't load properties file, see exception ==> " + e.getMessage());
        }
    }
}
