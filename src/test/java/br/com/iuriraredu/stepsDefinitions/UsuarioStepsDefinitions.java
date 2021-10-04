package br.com.iuriraredu.stepsDefinitions;

import br.com.iuriraredu.web.actions.UsuarioActions;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.assertEquals;

public class UsuarioStepsDefinitions {

    private UsuarioActions usuarioActions;

    public UsuarioStepsDefinitions() {
        this.usuarioActions = new UsuarioActions();
    }

    @Entao("sou redirecionado para pagina com a mensagem {string}")
    public void souRedirecionadoParaPaginaComAMensagem(String arg0){
        assertEquals(arg0, this.usuarioActions.pegarMensagemDeCadastradoComSucesso());
    }
}

