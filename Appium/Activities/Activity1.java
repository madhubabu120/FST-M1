package Activities;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity1 {
        AndroidDriver driver;

        @BeforeClass
        public void setUp() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Device");
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.miui.calculator");
            caps.setCapability("appActivity", ".cal.CalculatorActivity");
            caps.setCapability("noReset", true);

            URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(appServer, caps);
        }

        @Test
        public void add() {

            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();

            driver.findElement(AppiumBy.accessibilityId("multiply")).click();

            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_9_s")).click();

            driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_equal_s")).click();

            String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
            System.out.println(result);
            result = result.replace("= ", "");

            Assert.assertEquals(result, "45");
        }

        @AfterClass
        public void tearDown() {

            driver.quit();
        }
}
