package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/javascript-alerts");
            String title = driver.getTitle();
            System.out.println("Page title : " + title);
            driver.findElement(By.cssSelector("button#confirm")).click();

            Alert confirmAlert = driver.switchTo().alert();

            String alertText = confirmAlert.getText();
            System.out.println("Alert text is: " + alertText);

            confirmAlert.accept();

            //Close the browser with Cancel
            //confirmAlert.dismiss();

            driver.quit();
        }
}
