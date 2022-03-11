package curs6;

import java.util.ArrayList;
import java.util.List;

public class ListTesters {

    public static void main (String[] args){
        Tester testerOne = new Tester("Oana", 25, "QA");
        Tester testerTwo = new Tester("Maria", 24,"HR");
        Tester testerThree = new Tester("Gabi", 21, "RD");

        List<Tester> testerList = new ArrayList<>();

        testerList.add(testerOne);
        testerList.add(testerTwo);
        testerList.add(testerThree);

        System.out.println(testerList.get(0).name);
        System.out.println();

        for(Tester tester: testerList){
            System.out.println(tester.name + " " + tester.age + " " + tester.department);
        }

        System.out.println();

        System.out.println(testerList.get(0).returnSomething());


    }

}
