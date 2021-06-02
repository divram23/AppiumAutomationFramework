package GeneralStoreTesting;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {

    @Test
             public void verifyScrollAndSelectProduct(){

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Argentina\").instance(0))"));
        driver.findElement(By.xpath("//*[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

        int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for(int i=0;i<count;i++)
        {
            String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if(text.equalsIgnoreCase("Jordan 6 Rings"))
            {
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
                break;
            }
        }

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        String lastpageText=    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals("Jordan 6 Rings", lastpageText);
    }
}
