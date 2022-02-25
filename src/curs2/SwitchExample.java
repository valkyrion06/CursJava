package curs2;

import java.util.Scanner;

public class SwitchExample {

    public static void main (String[] args){

        System.out.println("Enter the grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        switch(grade){
            case "A":
                System.out.println("Great");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("You can do better");
                break;
            default:
                System.out.println("Grade not recognised");
                break;
        }



    }


}
