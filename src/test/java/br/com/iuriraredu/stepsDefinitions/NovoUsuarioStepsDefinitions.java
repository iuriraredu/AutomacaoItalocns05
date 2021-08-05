package br.com.iuriraredu.stepsDefinitions;

import br.com.iuriraredu.web.actions.NovoUsuarioActions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class NovoUsuarioStepsDefinitions {

    private NovoUsuarioActions novoUsuarioActions;

    public NovoUsuarioStepsDefinitions() {
        this.novoUsuarioActions = new NovoUsuarioActions();
    }
    @E("^preencho os campos com dados validos$")
    public void preenchoOsCamposComDadosValidos(){
        this.novoUsuarioActions.preencherDados();
    }

    @Quando("clico em {string}")
    public void clicoEm(String arg0) {
        this.novoUsuarioActions.clicarNoBotaoCriar();
    }
}

