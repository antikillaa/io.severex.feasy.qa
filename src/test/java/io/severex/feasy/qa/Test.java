package io.severex.feasy.qa;

import io.severex.feasy.qa.services.BaseService;

public class Test {
    BaseService baseService = new BaseService();

    @org.junit.Test
    public void openGrin() {
        baseService.setUp();
    }
}
