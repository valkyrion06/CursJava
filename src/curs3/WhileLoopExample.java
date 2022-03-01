package curs3;

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Please enter a number:");
        number = scanner.nextInt();
        scanner.close();

        System.out.println("For Loop example:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        System.out.println("While Loop example:");
        int x = 1;
        while(x <= 10){
            System.out.println(number + " * " + x + " = " + number * x);
            x++;
        }



    }

}
