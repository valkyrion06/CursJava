package curs6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main (String[] args){

        List<String> stringList = new ArrayList<>();
        stringList.add("Oana");
        stringList.add("Ioana");
        stringList.add("Ion");
        stringList.add("Maria");

        System.out.println(stringList.size());
        //System.out.println(stringList.get(0));


        for(String name: stringList){
            System.out.println(name);
        }

        System.out.println();

        stringList.add(0,"Alex");
        System.out.println(stringList.size());

        for(String name: stringList){
            System.out.println(name);
        }

        System.out.println();

        stringList.remove(0);
        stringList.remove("Maria");

        for(String name: stringList){
            System.out.println(name);
        }

        System.out.println();

        stringList.clear();
        for(String name: stringList){
            System.out.println(name);
        }


        System.out.println();

        stringList.add("Oana");
        stringList.add("Ioana");
        stringList.add("Ion");
        stringList.add("Maria");


    }

}
