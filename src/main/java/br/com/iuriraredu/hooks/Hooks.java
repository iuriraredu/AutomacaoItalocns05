package br.com.iuriraredu.hooks;

import br.com.iuriraredu.settings.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before(value = "@web")
    public void initWebApplication(){
        browserSetUp();
    }

    @AfterStep(value = "@web")
    public void reportScreenShot(){
        browserScreenShot();
    }

    @After(value = "@web")
    public void finishWebApplication(){
        browserTearDown();
    }
}
