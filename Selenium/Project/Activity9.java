package Activities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        // Click on All courses menu button
        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();

        //click on first course
        driver.findElement(By.xpath("(//*[@class='ld-course-list-items row']//div[contains(@class,'ld_course_grid')]//article)[1]")).click();

        // Click one content of course
        driver.findElement(By.xpath("//*[@class='ld-item-title' and contains(text(),'Developing Strategy')]")).click();
        String title= driver.getTitle();
        System.out.println("Current page title:"+title);

        // Click on mark complete
        driver.findElement(By.xpath("//*[contains(text(),'Complete')]")).click();


        driver.quit();
    }
}
