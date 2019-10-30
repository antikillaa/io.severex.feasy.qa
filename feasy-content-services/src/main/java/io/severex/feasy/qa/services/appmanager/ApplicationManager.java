package io.severex.feasy.qa.services.appmanager;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ApplicationManager {
    private static String driverPath = null;
    public WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    private String browser;
    private String env;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            driverPath = FilenameUtils.separatorsToSystem("C:\\Users\\potato\\IdeaProjects\\feasy\\io.severex.feasy.qa\\src\\test\\resources\\webdriver\\win\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", ApplicationManager.driverPath);
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driverPath = FilenameUtils.separatorsToSystem("webdriver//geckodriver");
            System.setProperty("webdriver.gecko.driver", ApplicationManager.driverPath);
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
        driver.manage().timeouts().setScriptTimeout(100, SECONDS);

        if (env != null) {
            driver.get("https://" + env + "grinfer.com/");
        } else {
            driver.get("https://grinfer.com/");
        }

    }


    public void stop() {
        driver.quit();
    }
}
