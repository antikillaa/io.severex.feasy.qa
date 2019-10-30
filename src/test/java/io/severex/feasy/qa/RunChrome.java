package io.severex.feasy.qa;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RunChrome {
    WebDriver driver = new ChromeDriver();

    @Test
    public void openDriver() {
        driver.get("https://google.com");
    }
}
