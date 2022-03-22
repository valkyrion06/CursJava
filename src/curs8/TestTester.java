package curs8;

public class TestTester {

    public static void main (String[]args){
        Tester t1 = new Tester("23");
        Tester t2 = new Tester(24.6);
        Tester t3 = new Tester(23);

        t1.printAge();
        t2.printAge();
        t3.printAge();


    }

}
