/* package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class Handling_of_Dropdown
{
    @Test
    public void googletest()
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        //open https://www.opencart.com/index.php?route=account/register
        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement element = driver.findElement(By.id("input-country"));

        Select dropdown = new Select (element);
//dropdown.selectByVisibleText("Hong Kong");
//dropdown.selectByValue("98");
        dropdown.selectByIndex (3);

        if(dropdown.isMultiple()==true)
        {
            System.out.println("Drop down is multiple");
        }
        else
        {
            System.out.println("Drop down is not multiple");
        }


    }

}



 */
