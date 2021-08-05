package br.com.iuriraredu.stepsDefinitions;

import br.com.iuriraredu.web.actions.HomeActions;
import io.cucumber.java.pt.Dado;

public class HomeStepsDefinitions {

    private HomeActions homeActions;

    public HomeStepsDefinitions() {
        this.homeActions = new HomeActions();
    }

    @Dado("que clico no botao {string}")
    public void queClicoNoBotao(String arg0) {
        this.homeActions.clicarNoBotaoComecarAutomacao();
    }
}

