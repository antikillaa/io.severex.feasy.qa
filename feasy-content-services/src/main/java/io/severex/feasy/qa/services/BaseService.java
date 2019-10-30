package io.severex.feasy.qa.services;

import io.severex.feasy.qa.services.appmanager.ApplicationManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.BrowserType;

public class BaseService {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public void setUp() {
        app.init();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }
}
