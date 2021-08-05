package br.com.iuriraredu.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsuarioPage {
    public UsuarioPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//p[@id='notice']")
    private WebElement mensagemCadastradoComSucesso;

    public WebElement getMensagemCadastradoComSucesso() {
        return mensagemCadastradoComSucesso;
    }
}
