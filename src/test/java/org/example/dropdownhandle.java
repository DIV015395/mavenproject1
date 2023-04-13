package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
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


public class dropdownhandle
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

    @Test

    void dropdownmethod(){
        Select select=new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue("1");

    }



/*@AfterClass
void driveclose(){
driver.close();
}*/

}