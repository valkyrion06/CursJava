package curs7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args){

        Set<String> set = new HashSet<>();

        System.out.println(set.isEmpty());
        set.add("Red");

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println();

        set.add("Green");
        set.add("Yellow");
        set.add("Brown");

        System.out.println(set);
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for(String z: set){
            System.out.println(z);
        }
        System.out.println();

        System.out.println(set.contains("Purple"));
        System.out.println(set.contains("Yellow"));

        System.out.println();

        set.clear();
        System.out.println(set);
    }

}
