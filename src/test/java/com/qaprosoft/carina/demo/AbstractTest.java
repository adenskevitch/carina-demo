package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.service.ConfigService;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractTest implements IAbstractTest {

    @BeforeSuite
    public void beforeSuite() {
        ConfigService.initInstance();
    }
}
