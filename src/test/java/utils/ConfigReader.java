package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    static {
        String path="configuration.properties";
        try {
            //FileInputStream will open the file
            FileInputStream inputStream=new FileInputStream(path);
            properties=new Properties();
            //load method will store every value from properties file to the Properties object
            properties.load(inputStream);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public static String getProperty(String key){
       return properties.getProperty(key);
    }
}
