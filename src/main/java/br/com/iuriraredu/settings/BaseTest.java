package br.com.iuriraredu.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;

public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    protected static void browserSetUp(){
        String browser = PropertiesManager.getPropertiesValue("browser");

        if (browser.contains("Chrome")){
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }

        if(browser.contains("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }

        if(browser.contains("Edge")){
            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();
        }

        webDriver.manage().window().maximize();
        webDriver.get(PropertiesManager.getPropertiesValue("URLQA"));
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
    }

    protected static void browserTearDown(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    protected static void browserScreenShot(String nomeCenario){
        String dataEHora = new SimpleDateFormat("yyyy-MM-dd/hhmmss").format(new Timestamp(System.currentTimeMillis()));
        try{
            FileManager.takeScreamShot(dataEHora + nomeCenario, webDriver);
        } catch (Exception e){
            System.out.println("Houveram problemas ao copiar o arquivo para pasta!\n" + e.getMessage());
        }
    }
}
