package GeneralStoreTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {

    @Test
        public void validateFillFormDetailsForShopping()
    {
        //AndroidDriver<AndroidElement> driver = capabilities();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
    }
}
