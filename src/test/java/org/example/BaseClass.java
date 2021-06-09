package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
    WebDriver driver;

    @BeforeTest

    public void tenderAdmin() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\chromedriver.exe");
        driver = new ChromeDriver();


        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("https://cityadmin.abmdemo.me/super-admin/dashboard");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//div[@class='G-input-group']/input")).sendKeys("super03@gmail.com");
        driver.findElement(By.xpath("//div[@class='G-input-group G-password-input']/input")).sendKeys("Password1/");
        driver.findElement(By.xpath("//button[@class='G-btn']")).click();

    }
}