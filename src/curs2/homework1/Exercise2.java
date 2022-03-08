package curs2.homework1;

import java.util.Scanner;

public class Exercise2 {

    public static void main (String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        if(age < 18){
            System.out.println("You're a minor.");
        } else if (age >65) {
            System.out.println("You're a senior.");
        } else if(age<0){
            System.out.println("You're not even born yet.");
        }else {
            System.out.println("You're an adult.");
        }
    }

}
