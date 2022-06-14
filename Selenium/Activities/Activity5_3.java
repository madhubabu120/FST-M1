package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] a) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Web page title : " + title);

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='dynamicText']"));
        System.out.println("The checkbox is displayed: " + checkBox.isEnabled());

        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();

        System.out.println("The checkbox is displayed: " + checkBox.isEnabled());


        driver.quit();
    }
}
