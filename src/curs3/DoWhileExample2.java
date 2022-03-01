package curs3;

import java.util.Scanner;

public class DoWhileExample2 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int number;


        do{
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            System.out.println(number * 10);
        }while (number!=0);
    }

}
