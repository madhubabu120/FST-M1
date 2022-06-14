package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        String secondPopularCourse= driver.findElement(By.xpath("//*[@class='caption']//h3[contains(text(), 'Email')]")).getText();
        System.out.println("Second most popular course is:"+secondPopularCourse);
        if(secondPopularCourse.equals("Email Marketing Strategies")){
            driver.quit();
        }
    }
}
