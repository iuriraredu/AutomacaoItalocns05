package br.com.iuriraredu.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NovoUsuarioPage {

    public NovoUsuarioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@id='user_lastname']")
    private WebElement inputUserLastName;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement inputUserEmail;

    @FindBy(xpath = "//input[@id='user_address']")
    private WebElement inputUserEndereco;

    @FindBy(xpath = "//input[@id='user_university']")
    private WebElement inputUserUniversidade;

    @FindBy(xpath = "//input[@id='user_profile']")
    private WebElement inputUserProfissao;

    @FindBy(xpath = "//input[@id='user_gender']")
    private WebElement inputUserGenero;

    @FindBy(xpath = "//input[@id='user_age']")
    private WebElement inputUserIdade;

    @FindBy(xpath = "//input[@id='user_age']/ancestor-or-self:: div/following-sibling::div/descendant-or-self:: input")
    private WebElement buttonCriar;

    public WebElement getInputUserName() {
        return inputUserName;
    }

    public WebElement getInputUserLastName() {
        return inputUserLastName;
    }

    public WebElement getInputUserEmail() {
        return inputUserEmail;
    }

    public WebElement getInputUserEndereco() {
        return inputUserEndereco;
    }

    public WebElement getInputUserUniversidade() {
        return inputUserUniversidade;
    }

    public WebElement getInputUserProfissao() {
        return inputUserProfissao;
    }

    public WebElement getInputUserGenero() {
        return inputUserGenero;
    }

    public WebElement getInputUserIdade() {
        return inputUserIdade;
    }

    public WebElement getButtonCriar() {
        return buttonCriar;
    }
}
