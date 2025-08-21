import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

# 웹브라우저 설치, 옵션
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=Options())
# 로그인 페이지 접속
driver.get("https://www.saucedemo.com/")
# 아이디
driver.find_element(By.CSS_SELECTOR, "#user-name").send_keys("standard_user")
# 암호
driver.find_element(By.CSS_SELECTOR, "#password").send_keys("secret_sauce")
# 버튼 클릭
driver.find_element(By.CSS_SELECTOR, "input[type='submit']").click()

# 시간지연 : 1초
time.sleep(1)
# 로그인 후 첫 페이지에서 나오는 모든 상품명 : 상품설명 출력
name = driver.find_elements(By.CSS_SELECTOR, ".inventory_item_name ")
desc = driver.find_elements(By.CSS_SELECTOR, ".inventory_item_desc ")


for i in range(len(desc)):
    outtext1 = name[i].text
    outtext2 = desc[i].text
    print(outtext1+ " : "+outtext2)