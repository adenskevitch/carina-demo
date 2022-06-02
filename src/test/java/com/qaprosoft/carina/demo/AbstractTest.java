package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.demo.service.ConfigService;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractTest {

    @BeforeSuite
    public void beforeSuite() {
        ConfigService.initInstance();
    }
}
