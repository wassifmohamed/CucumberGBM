package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

  static   Properties prop;

    public static Properties readProperties()
    {
        try {
            FileInputStream file= new FileInputStream("C:\\Users\\wassi\\IdeaProjects\\CucumberBatch15\\src\\test\\resources\\Config\\config.properties");
            prop = new Properties();
            prop.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
          return prop;
    }

    public static String  getPropertyValue(String  propKey)
    {
      return  prop.getProperty(propKey);
    }

}
