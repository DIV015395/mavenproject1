package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class linkcountTest
{
    @Test
    public void googletest()
    {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//launch web page https://www.calculator.net/

        driver.get("https://www.calculator.net/");

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        System.out.println("Total links on webpage:" + linkElements.size());

        for (WebElement el:linkElements)
        {
            System.out.println(el.getText());
         }
         driver.close();
    }
}
