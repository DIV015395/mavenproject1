package org.example;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

public class xpathlogin
{
    ChromeDriver driver;
    @BeforeClass
    public void googletest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

    }
    @Test
    public void login()
    {
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();

    }
}

