package io.severex.feasy.qa.services.service;

import com.codepine.api.testrail.TestRail;
import com.codepine.api.testrail.model.Run;
import io.severex.feasy.qa.services.config.TestrailConfig;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestrailService {
    private final static String endPoint = TestrailConfig.ENDPOINT;
    private final static String username = TestrailConfig.USERNAME;
    private final static String password = TestrailConfig.PASSWORD;
    private final static int PROJECT_ID = TestrailConfig.PROJECT_ID;
    public static Run run = new Run();
    private static TestRail testRail;

    public TestRail createTestRailInstance() {
        if (testRail == null) {
            testRail = TestRail.builder(endPoint, username, password).build();
        }
        return testRail;
    }

    public void createSuite() throws ParseException {
        testRail = createTestRailInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyy kk mm s");
        Date date = new Date();
        String dateString = format.format(date);
        String runName = "Automation " + dateString;
        try {
            run = testRail.runs().add(PROJECT_ID, run.setName(runName).setIncludeAll(true)).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
