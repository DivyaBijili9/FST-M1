package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on the page$")
    public void openPage() {
        //Create Instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the Simple Alert button$")
    public void openSimpleAlert() {
        driver.findElement(By.cssSelector("#simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void openConfirmAlert() {
        driver.findElement(By.cssSelector("#confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void openPromptAlert() {
        driver.findElement(By.cssSelector("#prompt")).click();
    }

    @Then("^Alert opens$")
    public void switchFocus() {
        alert = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readAlert() {
        System.out.println("Alert says: " + alert.getText());
    }

    @And("^Write a custom message in it$")
    public void writeToPrompt() {
        alert.sendKeys("Custom Message");
    }

    @And("^Close the alert$")
    public void closeAlert() {
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closeAlertWithCAncel() {
        alert.dismiss();
    }

    @And("^Close Browser$")
    public void closeBrowser() {
        driver.close();
    }

    public static class LoginSteps {
        WebDriver driver;
        WebDriverWait wait;
        @Given("User is on Login page")
        public void user_is_on_loginPage() {
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver, Duration.ofMinutes(10));
            driver.get("https://v1.training-support.net/selenium/login-form");
        }
        @When("User enters username and password")
        public void user_enters_username_and_password() {
            driver.findElement(By.id("username")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys("password");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }
        @Then("Read the page title and confirmation message")
        public void read_the_page_title_and_confirmation_message(){
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
            String pageTitle = driver.getTitle();
            String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Page title is: " + pageTitle);
            System.out.println("Login message is: " + confirmMessage);
        }
        @And("Close the Browser")
        public void close_the_browser()  {
            driver.close();
        }
    }
}
