package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity7 {
public static void main(String[] args) {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.get("https://v1.training-support.net/selenium/drag-drop");
    String title = driver.getTitle();
    System.out.println("Title of the page is :\t" + title);
    Actions obj = new Actions(driver);
    driver.findElement(By.id("draggable")).click();
    WebElement fromEle =driver.findElement(By.id("draggable"));
    WebElement toEle1 =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    obj.dragAndDrop(fromEle,toEle1).perform();
    obj.release().build().perform();
    String Drop1test=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
    if (Drop1test.equals("Dropped!")){
    System.out.println("The is dropped in dropbox1");
    }
    WebElement toEle2 =driver.findElement(By.id("dropzone2"));
    obj.dragAndDrop(fromEle,toEle2).perform();
    obj.release().build().perform();
    String Drop2test=toEle2.findElement(By.tagName("p")).getText();
    if (Drop2test.equals("Dropped!")){
        System.out.println("The is dropped in dropbox2");
    }
    driver.close();

}
}
