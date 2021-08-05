package br.com.iuriraredu.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreinamentoPage {
    public TreinamentoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Formulário']")
    private WebElement linkFormulario;

    @FindBy(xpath = "//a[text()='Criar Usuários']")
    private WebElement linkCriarUsuario;

    @FindBy(xpath = "//a[text()='Lista de Usuários']")
    private WebElement linkListaDeUsuario;

    @FindBy(xpath = "//a[text()='Busca de elementos']")
    private WebElement linkBuscaDeElementos;

    @FindBy(xpath = "//a[text()='Links']")
    private WebElement linkDeLinks;

    @FindBy(xpath = "//a[text()='Inputs e TextField']")
    private WebElement linkDeInputs;

    @FindBy(xpath = "//a[text()='Botões']")
    private WebElement linkDeBotoes;

    public WebElement getLinkFormulario() {
        return linkFormulario;
    }

    public WebElement getLinkCriarUsuario() {
        return linkCriarUsuario;
    }

    public WebElement getLinkListaDeUsuario() {
        return linkListaDeUsuario;
    }

    public WebElement getLinkBuscaDeElementos() {
        return linkBuscaDeElementos;
    }

    public WebElement getLinkDeLinks() {
        return linkDeLinks;
    }

    public WebElement getLinkDeInputs() {
        return linkDeInputs;
    }

    public WebElement getLinkDeBotoes() {
        return linkDeBotoes;
    }
}
