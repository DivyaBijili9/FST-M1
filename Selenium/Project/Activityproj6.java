package ProjectCRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activityproj6 {
    WebDriver driver;

    @BeforeClass

    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    @Test
    public void method() throws InterruptedException {
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        Thread.sleep(2000);
        driver.findElement(By.id("bigbutton")).click();
        String Tabname = driver.findElement(By.id("grouptab_3")).getText();
        driver.findElement(By.id("grouptab_3")).click();
        System.out.println(Tabname);

    }

    @AfterClass
    public void cleanup() {
        driver.quit();
    }

}
