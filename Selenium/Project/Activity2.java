package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        String heading= driver.findElement(By.xpath("//*[@class='uagb-ifb-title-wrap']//h1")).getText();
        System.out.println("Page Heading is:"+heading);
        if(heading.equals("Learn from Industry Experts")){
            driver.quit();
        }
    }
}
