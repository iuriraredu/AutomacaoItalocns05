package br.com.iuriraredu.stepsDefinitions;

import br.com.iuriraredu.web.actions.TreinamentoActions;
import io.cucumber.java.pt.Dado;

public class TreinamentoStepsDefinitions {

    private TreinamentoActions treinamentoActions;

    public TreinamentoStepsDefinitions() {
        this.treinamentoActions = new TreinamentoActions();
    }
    @Dado("que navego ate o formulario de criar novo usuario")
    public void queNavegoAteOFormularioDeCriarNovoUsuario() {
        this.treinamentoActions.clicarNoLinkFormulario();
        this.treinamentoActions.clicarNoLinkCriarUsuario();
    }
}

