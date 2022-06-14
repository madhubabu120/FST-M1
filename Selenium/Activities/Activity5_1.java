package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

        public static void main(String[] a) {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/dynamic-controls");

            String title = driver.getTitle();
            System.out.println("Page title : " + title);

            WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
            System.out.println("The checkbox is displayed: " + checkBox.isDisplayed());

            driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();

            System.out.println("The checkbox is displayed: " + checkBox.isDisplayed());


            driver.quit();

        }
}
