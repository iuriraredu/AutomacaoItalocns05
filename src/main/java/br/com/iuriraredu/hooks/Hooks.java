package br.com.iuriraredu.hooks;

import br.com.iuriraredu.settings.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before(value = "@web")
    public void initWebApplication(){
        browserSetUp();
    }

    @After(value = "@web")
    public void finishWebApplication(Scenario scenario){
        browserScreenShot(scenario.getName() + "_(" + scenario.getStatus() + ")");
        browserTearDown();
    }
}
