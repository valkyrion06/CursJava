package curs8;

public class GenericExample {

    public static void main (String[]args){
        GenericExample obj = new GenericExample();
        obj.printDetails("String");
        obj.printDetails(123);
        obj.printDetails('c');

    }

    public <T> void printDetails(T obj){
        System.out.println("Object is: " + obj);
        System.out.println("The type is: "+ obj.getClass().getName());

    }



}
