package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
        public static void main(String[] args) {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/simple-form");

            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);

            WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

            firstName.sendKeys("Madhu Babu");
            lastName.sendKeys("Konduri");

            driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("mschowdary@yahoo.com");
            driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("8328397604");

            driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("This is my message");

            driver.findElement(By.xpath("//input[@value='submit']")).click();

            driver.quit();
        }

}
