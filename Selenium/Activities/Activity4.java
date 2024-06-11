package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        String title=driver.getTitle();
        System.out.println("Title of the page is :\t"+title);
        String h3= driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("Header3 of the page is :\t"+h3);
        String h5= driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println("Colour of the header5 is :\t"+h5);
        String buttonClass=driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(buttonClass);
        String greyButtonText=driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println("The text of grey button is:\t"+greyButtonText);
        driver.close();

    }
}
