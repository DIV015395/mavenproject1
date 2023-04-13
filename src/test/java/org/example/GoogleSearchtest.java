package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchtest
{
    @Test
    public void googletest()
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //first day of salenium testing by simple mainer
        driver.get("https://www.saucedemo.com/");
        //Using saucedemo website
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        String currentwind = driver.getWindowHandle();

        //Question no 1 - ham driver.getWindowHandle(); kiyu kar rhe hai

        System.out.println("this is string "+currentwind);

        driver.switchTo().window(currentwind);
        driver.close();

    }
}

