package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest extends BaseClass {
    @Test
    public void first(){

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\chromedriver.exe");
        //ChromeDriver driver=new ChromeDriver();
     WebDriverWait wait=new WebDriverWait(driver,15);


        //driver.manage().window().maximize();
        //driver.get("https://mc.yandex.ru/webvisor/71186425?wmode=0&wv-part=65&wv-hit=945721159&page-url=https%3A%2F%2Falfapharm.abmdemo.me%2F&rn=320454214&wv-type=5&browser-info=gdpr%3A14%3Aet%3A1619531598%3Aw%3A400x242%3Av%3A503%3Az%3A240%3Ai%3A20210427175318%3Au%3A16178859921036746407%3Avf%3A5gv0p5rfuji4o8hq%3Awe%3A1%3Ati%3A2%3Ast%3A1619531598");
   driver.get("https://alfapharm.abmdemo.me");
        driver.manage().window().maximize();
        try {Thread.sleep(8000);} catch (InterruptedException e) {e.printStackTrace();}
        //driver.findElement(By.xpath("//input[@placeholder='Որոնել']")).sendKeys(Keys.F12);
    }

}
