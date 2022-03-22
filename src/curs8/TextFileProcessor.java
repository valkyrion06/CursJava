package curs8;

import com.sun.nio.sctp.SctpChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {

    public void writeToFile(String text){
        try{
            FileWriter writer = new FileWriter("filename.txt");
            writer.write(text+"\n");
            writer.close();
            System.out.println("Text Written.");

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Failed.");

        }

    }

    public void readFile(){
        File file = new File("filename.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file to be read.");
            e.printStackTrace();
        }
    }

    public void addToFile(){
        try {
            FileWriter writer = new FileWriter("filename.txt",true);
            writer.write("New Line."+"\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("No file to read.");
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        File file = new File("filename.txt");
        file.delete();
        System.out.println("Delete file " + file.getName() + ".");
    }

}
