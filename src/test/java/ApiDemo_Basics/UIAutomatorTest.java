package ApiDemo_Basics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UIAutomatorTest extends BaseClass {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver= capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Locate an Element
        // SYNTAX: driver.findElementByAndroidUIAutomator("attribute("value")")
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        //  Validate clickable feature for all options
        //  SYNTAX: driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

    }
}
