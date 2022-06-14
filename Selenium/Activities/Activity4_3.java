package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

        public static void main(String[] args) {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/target-practice");

            String pageTitle = driver.getTitle();
            System.out.println("Page title:"+pageTitle);

            String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
            System.out.println("Third header text : " + thirdHeader);

            String fifthHeaderColour = driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getCssValue("color");
            System.out.println("Fifth header colour is: " + fifthHeaderColour);

            String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
            System.out.println("Violet button class is: " + violetButtonClasses);

            String greyButt = driver.findElement(By.xpath("//button[contains(text(),'Grey')]")).getText();
            System.out.println("The grey button text: " + greyButt);


            driver.quit();

        }
}
