package curs8;

public class TestPropertiesFile {

    public static void main(String[]args){
        PropertiesFileProcessor propertiesFileProcessor = new PropertiesFileProcessor();

        propertiesFileProcessor.writePropertiesFile();
        propertiesFileProcessor.readPropertiesFile("username");
        propertiesFileProcessor.readPropertiesFile("password");
    }

}
