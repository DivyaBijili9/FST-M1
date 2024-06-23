package ProjectCRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activityproj4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        Thread.sleep(2000);
        driver.findElement(By.id("bigbutton")).click();
        String Verify_text="SUITECRM DASHBOARD";
        WebElement Verify=driver.findElement(By.xpath("//*[@id=\"tab0\"]"));
        if(Verify.isDisplayed()){
            System.out.println("We are in Homepage");
        }
        driver.close();
    }
}
