package br.com.iuriraredu.web.actions;

import br.com.iuriraredu.settings.BaseTest;
import br.com.iuriraredu.web.pages.NovoUsuarioPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NovoUsuarioActions extends BaseTest {
    private NovoUsuarioPage novoUsuarioPage;

    public NovoUsuarioActions() {
        this.novoUsuarioPage = new NovoUsuarioPage(webDriver);
    }

    public void preencherDados() {
        wait.until(ExpectedConditions.visibilityOf(this.novoUsuarioPage.getButtonCriar()));
        this.novoUsuarioPage.getInputUserName().sendKeys("Mariah");
        this.novoUsuarioPage.getInputUserLastName().sendKeys("Carey");
        this.novoUsuarioPage.getInputUserEmail().sendKeys("mariahcarey@epic.com");
        this.novoUsuarioPage.getInputUserEndereco().sendKeys("Huntington, NYC, US");
        this.novoUsuarioPage.getInputUserUniversidade().sendKeys("FATEC São Paulo");
        this.novoUsuarioPage.getInputUserProfissao().sendKeys("Cantora");
        this.novoUsuarioPage.getInputUserGenero().sendKeys("Feminino");
        this.novoUsuarioPage.getInputUserIdade().sendKeys("51");
    }

    public void clicarNoBotaoCriar() {
        this.novoUsuarioPage.getButtonCriar().click();
    }
}
