package curs8;

public class TextFileProcessorTest {

    public static void main (String[]args){
        TextFileProcessor processor = new TextFileProcessor();
        processor.writeToFile("File of the text.");
        processor.readFile();
        processor.addToFile();
        processor.readFile();
        processor.deleteFile();


    }

}
