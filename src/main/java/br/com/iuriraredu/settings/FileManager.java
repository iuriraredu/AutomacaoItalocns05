package br.com.iuriraredu.settings;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileManager {

    protected static void takeScreamShot(String nomeDoArquivo, WebDriver webDriver) throws IOException {
        File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("test-output/Screenshot/" + nomeDoArquivo + ".png"));
    }

    protected static InputStream readPropertiesFile() throws FileNotFoundException {
        return new FileInputStream("src/main/resources/application.properties");
    }

    protected static OutputStream writePropertiesFile() throws FileNotFoundException {
        return new FileOutputStream("src/main/resources/application.properties");
    }
}
