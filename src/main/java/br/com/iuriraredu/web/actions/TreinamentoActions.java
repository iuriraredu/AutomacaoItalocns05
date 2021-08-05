package br.com.iuriraredu.web.actions;

import br.com.iuriraredu.settings.BaseTest;
import br.com.iuriraredu.web.pages.TreinamentoPage;

public class TreinamentoActions extends BaseTest {
    private TreinamentoPage treinamentoPage;

    public TreinamentoActions() {
        this.treinamentoPage = new TreinamentoPage(webDriver);
    }

    public void clicarNoLinkFormulario(){
        this.treinamentoPage.getLinkFormulario().click();
    }

    public void clicarNoLinkCriarUsuario(){
        this.treinamentoPage.getLinkCriarUsuario().click();
    }
}
