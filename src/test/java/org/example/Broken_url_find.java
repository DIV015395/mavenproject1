package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.Routable;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Broken_url_find {
    public static <HttpURL> void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();
//wait 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//open url
        driver.get("http://www.deadlinkcity.com/");
//find hyperlinks
        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        int resCode = 200;

        int brokenlinkcnt = 0;

        for (WebElement element : linklist) {

            String url = element.getAttribute("href");

            try {
                URL urlLink = new URL(url);
                HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();

                resCode = huc.getResponseCode();

                if (resCode >= 400)
                {

                    System.out.print(url + "Broken link" +'\n');

                    brokenlinkcnt++;
                }
            }
            catch (MalformedURLException e)
            {

            }
            catch (Exception e)
            {

            }
            System.out.print("total Boken link " + brokenlinkcnt);


        }
    }
}
