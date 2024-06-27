package Activities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
public class ActionsExample {
    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/");
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @Test
    public void swipeTest() {

        Dimension dims = driver.manage().window().getSize();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));
        Point start = new Point((int)(dims.width*0.35), (int)(dims.height*0.5));
        Point end = new Point((int)(dims.width*0.5), (int)(dims.height*0.5));
        // Perform swipe on slider
        ActionsBase.doSwipe(driver, start, end, 250);

        // Get text on page and assert
        String volumeLevel = driver.findElement(By.xpath("//android.widget.SeekBar[@resource-id = 'slider']/preceding-sibling::android.view.View")).getText();
        Assert.assertEquals(volumeLevel, "Volume Level: 50%");
    }

    @AfterClass
    public void afterClass() {
        // Close the browser
        driver.quit();
    }
}

