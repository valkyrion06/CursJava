package curs2.homework1;

import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Please enter the test result:");
        result = scanner.nextInt();

        if(result <= 65){
            System.out.println("You failed, try again");
        } else {
            System.out.println("Congratulation, you passed!");
        }
    }




}
