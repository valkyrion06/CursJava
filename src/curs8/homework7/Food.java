package curs8.homework7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Food {

    public static void main (String[] args){
        Food food = new Food();
        food.writeProperties();
        food.getProperties();
        Map<Object, Object> hashMap = new HashMap<>();
        hashMap.putAll(food.getProperties());
        Scanner scanner = new Scanner(System.in);
        String vegetable;
        do{
            System.out.println("What vegetable would you like to buy? ");
            vegetable = scanner.nextLine();
            if(!hashMap.containsKey(vegetable)){
                System.out.println("We don't sell this vegetable. Please choose another.");
            }else {
                System.out.println("Vegetable chosen has " + hashMap.get(vegetable) +" calories");
            }
        }while(!hashMap.containsKey(vegetable));


    }

    public void writeProperties(){
        try {
            OutputStream outputStream= new FileOutputStream("food.properties");
            Properties properties = new Properties();
            properties.setProperty("morcov","58");
            properties.setProperty("rosie","32");
            properties.setProperty("castravete","21");
            properties.store(outputStream,"Saved food.properties");
            //System.out.println(properties);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  /*  public String readPropertyValue(String key) {
        try {
            InputStream inputStream = new FileInputStream("food.properties");
            Properties file = new Properties();
            file.load(inputStream);

            String value = file.getProperty(key);
            return value;

            //System.out.println(value);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    } */

    public Map<Object, Object> getProperties(){

        try {
            InputStream inputStream = new FileInputStream("food.properties");
            Properties file = new Properties();
            file.load(inputStream);
            Map<Object, Object> hashMap = new HashMap<>();

            file.forEach((key, value) -> hashMap.put(key,value));



            return hashMap;

            //System.out.println(value);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
