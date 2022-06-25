package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
        // Declare Android driver
        AndroidDriver driver;

        @BeforeClass
        public void beforeClass() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Device");
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.miui.calculator");
            caps.setCapability("appActivity", ".cal.CalculatorActivity");
            caps.setCapability("noReset", true);

            URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AndroidDriver(appServer, caps);
        }

        @Test
        public void add() {
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
            driver.findElement(AppiumBy.accessibilityId("plus")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_9_s")).click();
            // Perform Calculation
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_equal_s")).click();

            String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
            System.out.println(result);
            result = result.replace("= ", "");
            Assert.assertEquals(result, "14");
        }

        @Test
        public void subtract() {
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_1_s")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
            driver.findElement(AppiumBy.accessibilityId("minus")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();

            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_equal_s")).click();

            String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
            System.out.println(result);
            result = result.replace("= ", "");
            Assert.assertEquals(result, "5");
        }

        @Test
        public void multiply() {
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
            driver.findElement(AppiumBy.accessibilityId("multiply")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_1_s")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();

            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_equal_s")).click();
            String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
            System.out.println(result);
            result = result.replace("= ", "");
            Assert.assertEquals(result, "500");
        }

        @Test
        public void divide() {
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
            driver.findElement(AppiumBy.accessibilityId("divide")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_2_s")).click();
            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_equal_s")).click();

            String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
            System.out.println(result);
            result = result.replace("= ", "");
            Assert.assertEquals(result, "25");
        }

        @AfterClass
        public void afterClass() {
            driver.quit();
        }
}
