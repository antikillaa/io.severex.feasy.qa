package io.severex.feasy.qa;

import io.severex.feasy.qa.services.service.BaseService;
import io.severex.feasy.qa.services.service.TestrailService;
import org.junit.Test;

import java.text.ParseException;


public class TestChrome {
    BaseService baseService = new BaseService();
    TestrailService testrailService = new TestrailService();

    @Test
    public void openGrin() {
        baseService.setUp();
    }

    @Test
    public void getTestrail() {
        try {
            testrailService.createSuite();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
