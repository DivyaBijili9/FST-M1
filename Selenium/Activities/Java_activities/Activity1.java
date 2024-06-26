package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/");
        String main_title= driver.getTitle();
        System.out.println("title of main page is : "+ main_title);
        driver.findElement(By.linkText("About Us")).click();
        String about_us_title= driver.getTitle();
        System.out.println("title of main page is : "+ about_us_title);
        driver.quit();
    }
}
