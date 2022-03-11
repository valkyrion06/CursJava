package curs6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

    public static void main (String[] args){
        List<String> stringList = new ArrayList<>(Arrays.asList("Red","Black","Yellow","Brown"));
        System.out.println(stringList.size());
        for(String colours: stringList){
            System.out.println(colours);
        }

        System.out.println();
        stringList.subList(1,3).clear();
        for(String colours: stringList){
            System.out.println(colours);
        }

        String element = "Brown";
        if(stringList.contains(element)){
            System.out.println(element + " exists");
        } else {
            System.out.println(element + " doesnt' exists");
        }

        System.out.println();
        stringList.set(0,"Yellow");
        for(String colours: stringList){
            System.out.println(colours);
        }

        stringList.add("Oana");
        stringList.add("Ioana");
        stringList.add("Ion");
        stringList.add("Maria");
        System.out.println();

        System.out.println(stringList.size());

        System.out.println();

        Iterator<String> iterator = stringList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }


}
