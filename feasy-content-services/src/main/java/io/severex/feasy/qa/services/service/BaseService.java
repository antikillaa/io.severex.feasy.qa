package io.severex.feasy.qa.services.service;

import io.severex.feasy.qa.services.appmanager.ApplicationManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.BrowserType;

public class BaseService {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public void setUp() {
        String browser = BrowserType.FIREFOX;
        app.init(browser);
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }
}
