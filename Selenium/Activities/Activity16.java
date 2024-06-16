package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement username= driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        WebElement password= driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//input[starts-with(@class,'email-')]"));
        username.sendKeys("harrypotter");
        password.sendKeys("ronhermionie");
        confirmPassword.sendKeys("ronhermionie");
        email.sendKeys("harry.potter@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        String message=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("success message is :\t"+message);
        driver.quit();
    }
}
