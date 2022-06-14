package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        String boxTitle= driver.findElement(By.xpath("//*[@class='uagb-ifb-title-wrap']//h3[contains(text(), 'Actionable Training')]")).getText();
        System.out.println("first box title is:"+boxTitle);
        if(boxTitle.equals("Actionable Training")){
            driver.quit();
        }
    }
}
