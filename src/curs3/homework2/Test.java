package curs3.homework2;

public class Test {

    public static void main(String [] args){
        Qualification testPass = new Qualification("Java",4,"Afternoon");
        Qualification testFailed = new Qualification("Python", 3,"Morning");

        System.out.println("First teacher:");
        testPass.verify();

        System.out.println("Second teacher:");
        testFailed.verify();
    }

}
