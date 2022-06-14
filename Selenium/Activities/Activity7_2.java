package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();

            driver.get("https://www.training-support.net/selenium/dynamic-attributes");
            String pageTitle = driver.getTitle();
            System.out.println("Page title:"+pageTitle);
            driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Madhubabu");
            driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("madhub");
            driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("madhub");
            driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("madhubabu@yahoo.com");

            driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Login message: " + loginMessage);

            driver.quit();

        }
}
