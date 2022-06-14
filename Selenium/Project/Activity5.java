package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
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
        driver.quit();
    }
}
