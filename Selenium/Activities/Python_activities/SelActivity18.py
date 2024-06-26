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
# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
from selenium.webdriver.support.ui import Select
# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:

    driver.get("https://v1.training-support.net/selenium/selects")
    print("Page title is: ", driver.title)
    multiselect_list = driver.find_element(By.ID, "multi-select")
    multiselect = Select(multiselect_list)
    multiselect.select_by_visible_text("Javascript")
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)

    # Select the 4th, 5th and 6th options using the index.
    for x in range(4, 6):
        multiselect.select_by_index(x)
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)

    multiselect.select_by_value("node")
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)
    multiselect.deselect_by_index(7)
    for option in multiselect.all_selected_options:
        print("Options selected are: ", option.text)