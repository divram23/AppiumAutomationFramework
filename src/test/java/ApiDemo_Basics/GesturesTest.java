package ApiDemo_Basics;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class GesturesTest extends BaseClass {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        //Tap or Touch an Object
        TouchAction t =new TouchAction(driver);
        WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(tapOptions().withElement(element(expandList))).perform();
        //t.tap(tapOptions().withElement(element(expandList)).withPosition(positionOption));

        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

        //Long Press an Object
        WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();

        //Thread.sleep(2000);
        System.out.println(driver.findElementById("android:id/title").isDisplayed());

    }

}
