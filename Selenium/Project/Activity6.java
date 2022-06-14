package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        // Click on My account menu button
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        String title= driver.getTitle();
        System.out.println("Current page title:"+title);
        if(title.contains("My Account")){
            System.out.println("Yes, we are on My account page");
        }

        // Click on Login button
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        // Enter username and password in respective fields
        driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id=\'user_pass\']")).sendKeys("pa$$w0rd");
        // Click on login page
        driver.findElement(By.xpath("//*[@id=\'wp-submit\']")).click();

        // Check the account usename is 'root' from the right top corner

        driver.findElement(By.xpath("(//span[contains(text(),'root') and @class='display-name'])[1]")).isDisplayed();


        driver.quit();
    }

}
