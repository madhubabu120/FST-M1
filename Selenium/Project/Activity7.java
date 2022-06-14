package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        // Click on All courses menu button
        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        String title= driver.getTitle();
        System.out.println("Current page title:"+title);
        List<WebElement> list= driver.findElements(By.xpath("//*[@class='ld-course-list-items row']//div[contains(@class,'ld_course_grid')]//article"));
        System.out.println("No of courses are displayed on webpage is:"+list.size());
        driver.quit();
    }
}
