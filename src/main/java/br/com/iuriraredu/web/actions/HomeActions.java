package br.com.iuriraredu.web.actions;

import br.com.iuriraredu.settings.BaseTest;
import br.com.iuriraredu.web.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeActions extends BaseTest {

    private HomePage homePage;

    public HomeActions() {
        this.homePage = new HomePage(webDriver);
    }

    public void clicarNoBotaoComecarAutomacao(){
        WebElement botaoComecarAutomacao = this.homePage.getBotaoComecarAutomacao();
        wait.until(ExpectedConditions.elementToBeClickable(botaoComecarAutomacao));
        botaoComecarAutomacao.click();
    }
}
