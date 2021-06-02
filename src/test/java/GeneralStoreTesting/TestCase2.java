package GeneralStoreTesting;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {

    //public static void main(String[] args) throws MalformedURLException {

    @Test
            public void verifyToastMessageErrorValidationForm(){

        driver.findElement(By.xpath("//*[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Argentina\").instance(0))"));
        //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));

        driver.findElement(By.xpath("//*[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        //name attribute for toast messages will have content
        String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
        System.out.println(toastMessage);

        Assert.assertEquals("Please enter your name", toastMessage);//Actual validation
    }
}
