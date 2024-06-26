from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support import expected_conditions
service = FirefoxService(GeckoDriverManager().install())
from selenium.webdriver.support.ui import WebDriverWait
with webdriver.Firefox(service=service) as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    wait = WebDriverWait(driver, 10)
    print("Page title is: ", driver.title)
    checkbox = driver.find_element(By.ID, "dynamicCheckbox")
    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")
    checkbox_toggle.click()
    print("Checkbox hidden")
    wait.until(expected_conditions.invisibility_of_element(checkbox))
    checkbox_toggle.click()
    print("Checkbox visible")
    checkbox.click()
    print("Checkbox selected")
