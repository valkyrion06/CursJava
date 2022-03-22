package curs8;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {

    public void writePropertiesFile(){
        try {
            OutputStream outputStream= new FileOutputStream("test.properties");
            Properties properties = new Properties();
            properties.setProperty("username","Oana");
            properties.setProperty("password","admin123");
            properties.setProperty("email","oana@oana.com");
            properties.store(outputStream,"Saved test.properties");
            System.out.println(properties);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPropertiesFile (String key){
        try {
            InputStream inputStream = new FileInputStream("test.properties");
            Properties file = new Properties();
            file.load(inputStream);

            String value = file.getProperty(key);
            System.out.println(value);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
