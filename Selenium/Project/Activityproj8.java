package ProjectCRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Activityproj8 {

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
        driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.id("grouptab_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        Thread.sleep(2000);
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr"));
        int count = 0;
        for (int i = 0; i < rows.size(); i++) {
            if (i % 2 != 0 && count <= 4) {
                String name = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[" + i + "]/td[3]/b")).getText();
                System.out.println(name);
                count += 1;

            }

        }
    }
    @AfterClass
    public void cleanup() {
        driver.quit();
    }

}