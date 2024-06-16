package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity19 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String title= driver.getTitle();
        System.out.println("title of the page is:\n"+title);
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();
        Alert a=driver.switchTo().alert();
        System.out.println("text of the confirm alert is:\n"+a.getText());
        a.accept();
        confirm.click();
        a.dismiss();
        driver.close();
    }
}
