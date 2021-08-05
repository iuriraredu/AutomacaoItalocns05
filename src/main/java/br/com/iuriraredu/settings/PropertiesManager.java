package br.com.iuriraredu.settings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesManager {
    static Properties properties = new Properties();

    public static String getPropertiesValue (String key) {
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/application.properties");
            properties.load(inputStream);
        } catch (Exception e){
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static void setPropertiesValue(String key, String value){
        try {
            OutputStream outputStream = new FileOutputStream("src/main/resources/application.properties");
            properties.setProperty(key, value);
            properties.store(outputStream, null);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
