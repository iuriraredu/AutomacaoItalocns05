package br.com.iuriraredu.web.actions;

import br.com.iuriraredu.settings.BaseTest;
import br.com.iuriraredu.web.pages.UsuarioPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UsuarioActions extends BaseTest {
    private UsuarioPage usuarioPage;

    public UsuarioActions() {
        this.usuarioPage = new UsuarioPage(webDriver);
    }

    public String pegarMensagemDeCadastradoComSucesso() {
        WebElement mensagemCadastradoComSucesso = this.usuarioPage.getMensagemCadastradoComSucesso();
        wait.until(ExpectedConditions.visibilityOf(mensagemCadastradoComSucesso));
        return mensagemCadastradoComSucesso.getText();
    }
}
