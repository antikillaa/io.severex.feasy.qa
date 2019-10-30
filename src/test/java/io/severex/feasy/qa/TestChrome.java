package io.severex.feasy.qa;

import io.severex.feasy.qa.services.BaseService;
import org.junit.Test;


public class TestChrome {
    BaseService baseService = new BaseService();

    @Test
    public void openGrin() {
        baseService.setUp();
    }
}
