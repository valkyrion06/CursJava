package curs4;

public class MethodOverload {

    public static void main (String[]args){
        MethodOverload methodOverload = new MethodOverload();

        System.out.println(methodOverload.multiply(2,3));
        System.out.println(methodOverload.multiply(2.5,2));


    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public double multiply (double num1, double num2){
        return num1 * num2;
    }

}
