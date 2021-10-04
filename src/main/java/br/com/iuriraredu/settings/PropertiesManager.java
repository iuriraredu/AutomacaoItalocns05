package br.com.iuriraredu.settings;

import java.util.Properties;

public class PropertiesManager {

    static Properties properties = new Properties();

    public static String getPropertiesValue (String key) {
        try {
            properties.load(FileManager.readPropertiesFile());
        } catch (Exception e){
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static void setPropertiesValue(String key, String value){
        properties.setProperty(key, value);
        try {
            properties.store(FileManager.writePropertiesFile(), null);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
