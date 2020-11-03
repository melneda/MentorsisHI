package utils;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class ConfigReader {

    private static Properties configFile;
    static {
        try {
            //To acces config properties
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            //initialize properties object
            configFile = new Properties();
            //load configuration.properties file
            configFile.load(fileInputStream);
            //close input stream
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Failed to load properties file!");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }
}


