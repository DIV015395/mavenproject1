package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters
{
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","Url"})
    public void googletest(String browser, String Url)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https://www.saucedemo.com/");

    }
    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");

    }
    @AfterClass
    public void submit()
    {
        driver.findElement(By.cssSelector("input#login-button")).click();
    }
}

