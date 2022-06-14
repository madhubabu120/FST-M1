package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String k[]){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title= driver.getTitle();
        System.out.println("web page title is : "+title);

        String idText= driver.findElement(By.id("about-link")).getText();
        System.out.println("Element text using id: "+idText);

        String classNameText= driver.findElement(By.className("green")).getText();
        System.out.println("Element text using className: "+classNameText);

        String cssSelectorText= driver.findElement(By.cssSelector("#about-link")).getText();
        System.out.println("Element text using cssSeletor: "+cssSelectorText);

        String linkLocatorText= driver.findElement(By.linkText("About Us")).getText();
        System.out.println("Element text using likedText: "+linkLocatorText);

        driver.quit();
    }
}
