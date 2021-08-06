package br.com.iuriraredu.hooks;

import br.com.iuriraredu.settings.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    private int cont;

    @Before(value = "@web")
    public void initWebApplication(){
        browserSetUp();
        cont = 0;
    }

    @AfterStep(value = "@web")
    public void reportScreenShot(Scenario scenario){
        cont++;
        browserScreenShot(scenario.getName() + "_Step" + cont);
    }

    @After(value = "@web")
    public void finishWebApplication(){
        browserTearDown();
    }
}
