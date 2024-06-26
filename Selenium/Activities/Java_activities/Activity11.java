package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.get("https://v1.training-support.net/selenium/dynamic-controls");
    System.out.println("Home page title: " + driver.getTitle());
    WebElement checkbox = driver.findElement(By.className("willDisappear"));
    WebElement checkboxToggle = driver.findElement(By.name("toggled"));
    if(checkboxToggle.isSelected())
        System.out.println("The checkbox is selected");
    else
        System.out.println("The checkbox is not selected ,click to select it");
    checkboxToggle.click();
        if(checkboxToggle.isSelected())
            System.out.println("The checkbox is selected");
        else
            System.out.println("The checkbox is selected ,click to select it");
        driver.close();
}
}
