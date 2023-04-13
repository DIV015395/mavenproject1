package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ResourceBundle;


public class drop
{
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setupdrive(String browser,String link)
    {
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        driver.get(link);
        driver.manage().window().maximize();
    }

    /*@Test
    void getitemfrompage() throws InterruptedException{
    ResourceBundle r = ResourceBundle.getBundle("config");
    String username =r.getString("uname");
    String password =r.getString("passo");
    driver.findElement(By.cssSelector("input[name=login]")).sendKeys(username);
    //Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
    //Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[name=commit]")).click();
    //Thread.sleep(1000);
    }*/
    @Test
    void dropdownmethod()throws InterruptedException{

        driver.switchTo().frame("mce_0_ifr");
        WebElement e=driver.findElement(By.id("tinymce"));
        e.clear();
        e.sendKeys("hii my name is vinay");
        Thread.sleep(2000);

    }
    @AfterClass
    void driveclose(){
        driver.close();
    }

}