package br.com.iuriraredu.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public static void browserSetUp(){
        if (webDriver != null) webDriver.quit();

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
        wait = new WebDriverWait(webDriver, 15);
    }

    public static void browserTearDown(){
        webDriver.close();
    }

    public static void browserScreenShot(){
        File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("test-output/Screenshot/" +
                    new SimpleDateFormat("yyyy-MM-dd-hhmmss").
                            format(new Timestamp(System.currentTimeMillis())) + "_print.png"));
        } catch (Exception e){
            System.out.println("Houveram problemas ao copiar o arquivo para pasta!\n"+e.getMessage());
        }
    }
}
