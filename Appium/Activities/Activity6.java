package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity6 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Device");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.dialer");
        caps.setCapability("appActivity", ".extensions.GoogleDialtactsActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(appServer, caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void addContact() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.dialer:id/contact_name")));
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/contact_name")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='First name']")));

        // Find the first name, last name, and phone number fields
        WebElement firstName = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']"));
        WebElement surName = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Surname']"));
        WebElement phoneNumber = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']"));

        firstName.sendKeys("Madhu");
        surName.sendKeys("Babu");
        phoneNumber.sendKeys("8328397604");

        driver.findElement(AppiumBy.id("com.google.android.contacts:id/toolbar_button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.google.android.dialer:id/contact_name")));

        // Assertion
        WebElement mobileCard = driver.findElement(AppiumBy.id("com.google.android.dialer:id/contact_name"));
        Assert.assertTrue(mobileCard.isDisplayed());

        String contactName = driver.findElement(AppiumBy.id("com.google.android.dialer:id/contact_name")).getText();
        Assert.assertEquals(contactName, "Madhu Babu");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
