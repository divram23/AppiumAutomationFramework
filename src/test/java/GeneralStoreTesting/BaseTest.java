package GeneralStoreTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    //public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

    public static AndroidDriver<AndroidElement>  driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {

            File appDir = new File("src");
            File app = new File(appDir, "General-Store.apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "DivyaTest");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      }
    }


