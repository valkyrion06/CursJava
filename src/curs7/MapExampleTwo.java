package curs7;

import java.util.HashMap;
import java.util.Map;

public class MapExampleTwo {

    public static void main (String[] args){
        Map<Integer,String > map = new HashMap<>();
        map.put(1, "Red");
        map.put(43,"Black");
        map.put(200,"White");
        map.put(300,"White");
        map.put(200,"Green");

        System.out.println(map);

        Map<Integer,String > mapTwo = new HashMap<>();
        mapTwo.put(23, "Yellow");
        mapTwo.put(4,"Purple");

        System.out.println(mapTwo);

        map.putAll(mapTwo);
        System.out.println(map);


    }

}
