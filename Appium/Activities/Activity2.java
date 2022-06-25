package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {
        WebDriverWait wait;
        AndroidDriver driver = null;

        @BeforeClass
        public void setup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Device");
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.android.chrome");
            caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            caps.setCapability("noReset", true);

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        @Test
        public void testSearchAppium() {
            driver.get("https://www.training-support.net/");

            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("About Us")));

            String pageTitle = driver
                    .findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']"))
                    .getText();
            System.out.println("Title on Homepage: " + pageTitle);

            WebElement aboutButton = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='About Us']"));
            aboutButton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    AppiumBy.xpath("//android.widget.TextView[@text='About Us']")
            ));

            String newPageTitle = driver
                    .findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']"))
                    .getText();
            System.out.println("Title on new page: " + newPageTitle);

            Assert.assertEquals(pageTitle, "Training Support");
            Assert.assertEquals(newPageTitle, "About Us");
        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }
}
