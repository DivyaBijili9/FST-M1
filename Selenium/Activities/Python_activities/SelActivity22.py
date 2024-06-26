from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support import expected_conditions as EC
service = FirefoxService(GeckoDriverManager().install())
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support.ui import Select
# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Initialize wait object
    wait = WebDriverWait(driver, 10)

    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/popups")
    # Print the title of the page
    print("Page title is: ", driver.title)
    signin_button = driver.find_element(By.CLASS_NAME, "orange")
    ActionChains(driver).move_to_element(signin_button).perform()
    tooltip_text = signin_button.get_attribute("data-tooltip")
    print("Button tooltip text: ", tooltip_text)
    signin_button.click()
    username = driver.find_element(By.ID, "username")
    password = driver.find_element(By.ID, "password")
    username.send_keys("admin")
    password.send_keys("password")
    driver.find_element(By.XPATH, "/html/body/div[4]/div/div[2]/div/div/button").click()
    message = driver.find_element(By.ID, "action-confirmation")
    print("Confirmation message: ", message.text)