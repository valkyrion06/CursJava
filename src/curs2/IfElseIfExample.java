package curs2;

import java.util.Scanner;

public class IfElseIfExample {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int punctaj = scanner.nextInt();
        char grade;

        if(punctaj < 60){
            grade = 'E';
            System.out.println(grade);
        } else if (punctaj <= 70){
            grade = 'D';
            System.out.println(grade <= 80);
        } else if (punctaj <= 80){
            grade = 'C';
            System.out.println(grade);
        }else if (punctaj <= 90){
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println(grade);


}
}
