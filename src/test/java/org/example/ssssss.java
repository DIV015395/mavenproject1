package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ssssss {
    @Test
    public void channelopen1() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("MS Financial Advisor");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
//        String curr = driver.getWindowHandle();
//        driver.switchTo().window("curr");
        driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'M.S Financial Advisor')]")).click();

    }
}
