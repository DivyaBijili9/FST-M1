from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support import expected_conditions as EC
service = FirefoxService(GeckoDriverManager().install())
from selenium.webdriver.support.ui import WebDriverWait
service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:
    wait = WebDriverWait(driver, 10)
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("Page title is: ", driver.title)
    username = driver.find_element(By.XPATH, "//input[contains(@class, '-username')]")
    password = driver.find_element(By.XPATH, "//input[contains(@class, '-password')]")
    confirm_password = driver.find_element(By.XPATH, "//label[contains(text(), 'Confirm Password')]//following::input")
    email = driver.find_element(By.XPATH, "//input[contains(@class, 'email-')]")
    username.send_keys("Deku")
    password.send_keys("PlusUltra!")
    confirm_password.send_keys("PlusUltra!")
    email.send_keys("deku@ua.edu")
    driver.find_element(By.XPATH, "//button[text()='Sign Up']").click()
    wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation")))
    message = driver.find_element(By.ID, "action-confirmation").text
    print("Success message: ", message)