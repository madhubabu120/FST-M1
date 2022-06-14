package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        // Click on Contact menu button
        driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();

        // Enter full name
        driver.findElement(By.xpath("//label[contains(text(),'Full Name')]//following-sibling::input")).sendKeys("Madhu Babu");
        // Enter Email
        driver.findElement(By.xpath("//label[contains(text(),'Email')]//following-sibling::input")).sendKeys("madhu@gmail.com");
        // Enter Subject
        driver.findElement(By.xpath("//label[contains(text(),'Subject')]//following-sibling::input")).sendKeys("Selenium-doubt");

        // Enter Message
        driver.findElement(By.xpath("//label[contains(text(),'Message')]//following-sibling::textarea")).sendKeys("General question");

        // Click on send message button
        driver.findElement(By.xpath("//*[@type=\'submit\']")).click();

        //Verify the confirmation message is displayed
        System.out.println("Confirmation message displayed:"+driver.findElement(By.xpath("//*[@id=\'wpforms-confirmation-8\']/p")).isDisplayed());

        driver.quit();
    }
}
