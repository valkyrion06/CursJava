package curs7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExampleOne {

    public static void main(String[]args){

    //useless catch.
    try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println(numberOne/numberTwo);

    }catch(NullPointerException e){
        System.out.println("Error");

    }

    }
}
